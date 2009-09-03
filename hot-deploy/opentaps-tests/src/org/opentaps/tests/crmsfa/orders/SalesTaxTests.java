/*
 * Copyright (c) 2006 - 2009 Open Source Strategies, Inc.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the Honest Public License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Honest Public License for more details.
 *
 * You should have received a copy of the Honest Public License
 * along with this program; if not, write to Funambol,
 * 643 Bair Island Road, Suite 305 - Redwood City, CA 94063, USA
 */

package org.opentaps.tests.crmsfa.orders;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.ofbiz.base.util.Debug;
import org.ofbiz.base.util.GeneralException;
import org.ofbiz.base.util.UtilMisc;
import org.ofbiz.entity.GenericValue;
import org.ofbiz.entity.util.EntityUtil;
import org.ofbiz.order.order.OrderReadHelper;
import org.opentaps.common.domain.order.OrderSpecification;
import org.opentaps.common.order.SalesOrderFactory;
import org.opentaps.domain.order.Order;
import org.opentaps.domain.order.OrderItem;
import org.opentaps.domain.order.OrderRepositoryInterface;

/**
 * Order Sales Tax related unit tests.
 */
public class SalesTaxTests extends OrderTestCase {

    private static final String MODULE = SalesTaxTests.class.getName();

    private GenericValue admin;
    private GenericValue DemoCSR;
    private GenericValue ca1;
    private GenericValue ca2;
    private GenericValue Product1;
    private GenericValue Product2;
    private static String organizationPartyId = "Company";
    private static final String productStoreId = "9000";
    private static final String productId1 = "GZ-1005";
    private static final String productId2 = "WG-5569";
    private static final String facilityId = "WebStoreWarehouse";
    private OrderSpecification specification;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        admin = delegator.findByPrimaryKeyCache("UserLogin", UtilMisc.toMap("userLoginId", "admin"));
        ca1 = delegator.findByPrimaryKey("Party", UtilMisc.toMap("partyId", "ca1"));
        ca2 = delegator.findByPrimaryKey("Party", UtilMisc.toMap("partyId", "ca2"));
        DemoCSR = delegator.findByPrimaryKey("UserLogin", UtilMisc.toMap("userLoginId", "DemoCSR"));
        Product1 = delegator.findByPrimaryKey("Product", UtilMisc.toMap("productId", productId1));
        Product2 = delegator.findByPrimaryKey("Product", UtilMisc.toMap("productId", productId2));
        // set a default User
        User = DemoCSR;

        specification = new OrderSpecification();

        assertNotNull("admin not null", admin);
        assertNotNull("ca1 not null", ca1);
        assertNotNull("ca2 not null", ca2);
        assertNotNull("DemoCSR not null", DemoCSR);
        assertNotNull("Product1 not null", Product1);
        assertNotNull("Product2 not null", Product2);
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        admin = null;
        ca1 = null;
        ca2 = null;
        DemoCSR = null;
        User = null;
        Product1 = null;
        Product2 = null;
    }

    /**
     * Verify tax applied on an Order.
     * Checks for each order item that there is a tax adjustment with the given taxId and it's amount is correct according to the given percentage.
     *
     * @param orderId the order to check
     * @param taxId the primaryGeoId of the tax adjustments
     * @param percentage the expected tax percentage
     * @throws GeneralException in an error occurs
     */
    @SuppressWarnings("unchecked")
    public void assertTaxOrder(String orderId, String taxId, BigDecimal percentage) throws GeneralException {

        List<GenericValue> orderItems = delegator.findByAnd("OrderItem", UtilMisc.toMap("orderId", orderId));
        assertNotNull("There is no order item in the order " + orderId + ".", orderItems);
        List<GenericValue> orderAdjustments = delegator.findByAnd("OrderAdjustment", UtilMisc.toMap("orderId", orderId));
        assertNotNull("There is no order adjustment in the order " + orderId + ".", orderAdjustments);
        for (GenericValue orderItem : orderItems) {
            List<GenericValue> orderItemAdjustments = OrderReadHelper.getOrderItemAdjustmentList(orderItem, orderAdjustments);
            assertNotNull("There is no order item adjustment in the order " + orderId + " for the order item " + orderItem.getString("orderItemSeqId") + ".", orderItemAdjustments);

            GenericValue calatax = EntityUtil.getFirst(EntityUtil.filterByAnd(orderItemAdjustments, UtilMisc.toMap("primaryGeoId", taxId)));
            assertNotNull("There is no " + taxId + " order item adjustment in the order " + orderId + " for the order item " + orderItem.getString("orderItemSeqId") + ".", calatax);

            // expected tax amount, the percent divide has the same scaling as in the tax service
            BigDecimal amount = specification.taxCalculationRounding(orderItem.getBigDecimal("unitPrice").multiply(orderItem.getBigDecimal("quantity")).multiply(percentage).divide(new BigDecimal("100"), 3, BigDecimal.ROUND_CEILING));

            assertEquals("The tax calculation for order " + orderId + " and order item " + orderItem.getString("orderItemSeqId") + " is wrong.", calatax.getBigDecimal("amount"), amount);
        }
    }

    /**
     * Verify tax applied on a Return.
     * Checks for each order item that there is a tax adjustment with the given taxId and it's amount is correct according to the given percentage.
     *
     * @param returnId the return to check
     * @param taxId the primaryGeoId of the tax adjustments
     * @param percentage the expected tax percentage
     * @throws GeneralException in an error occurs
     */
    public void assertTaxReturn(String returnId, String taxId, BigDecimal percentage) throws GeneralException {

        List<GenericValue> returnAdjustments = delegator.findByAnd("ReturnAdjustment", UtilMisc.toMap("returnId", returnId, "primaryGeoId", taxId));
        assertNotNull("There is no return adjustment in the return " + returnId + " for tax " + taxId + ".", returnAdjustments);
        for (GenericValue returnAdjustment : returnAdjustments) {
            GenericValue returnItem = delegator.findByPrimaryKey("ReturnItem", UtilMisc.toMap("returnId", returnId, "returnItemSeqId", returnAdjustment.getString("returnItemSeqId")));

            BigDecimal amount = returnItem.getBigDecimal("returnPrice").multiply(returnItem.getBigDecimal("returnQuantity")).multiply(percentage).divide(new BigDecimal("100"), DECIMALS, ROUNDING);
            assertEquals("The tax calculate for return " + returnId + " and return item " + returnItem.getString("returnItemSeqId") + " is wrong.", returnAdjustment.getBigDecimal("amount"), amount);
        }
    }

    /**
     * State and County Sales Tax Tests: these tests will verify state and county taxes
     * The particular product, payment, shipping methods don't really matter as much for this test.
     *
     *
     * 1.  Create a sales order for productStoreId=9000, partyId=ca1, address=ca1address1
     * 2.  Verify each order item from #1 has a tax of 6.25% of order item for taxAuthGeoId=CA and 1% of order item for taxAuthGeoId=CA-LA
     * 3.  Create a sales order for productStoreId=9000, partyId=ca1, address=ca1address2
     * 4.  Verify each order item from #3 has a tax of 6.25% of order item for taxAuthGeoId=CA and 0.125% of order item for taxAuthGeoId=CA-SOLANO
     * 5.  Create a sales order for productStoreId=9000, partyId=ca2, address=ca2address1
     * 6.  Verify each order item from #5 has a tax of 0 for taxAuthGeoId=CA and 0 for taxAuthGeoId=CA-LA
     * 7.  Create a sales order for productStoreId=9000, partyId=ca2, address=ca2address2
     * 8.  Verify each order item from #7 has a tax of 0 for taxAuthGeoId=CA and 0 for taxAuthGeoId=CA-SOLANO
     * 9.  Create a sales order for productStoreId=9000, partyId=ca1, address=ca1address1
     * 10.  Use testShipOrder to ship all 5 sales orders (#1, #3, #5, #7, #9)
     * 11.  Create a return for all items on sales order #9 and accept the return
     * 12.  Verify that the return item from #11 has a ReturnAdjustment of sales tax of 6.25% of item for taxAuthGeoId=CA and 1% for taxAuthGeoId=CA-LA
     * @throws GeneralException in an error occurs
     */
    @SuppressWarnings("unchecked")
    public void testCATaxApplication() throws GeneralException {

        /*
         * 1.  Create a sales order for productStoreId=9000, partyId=ca1, address=ca1address1
         */
        Map<GenericValue, BigDecimal> order = new HashMap<GenericValue, BigDecimal>();
        order.put(Product1, new BigDecimal("1.0"));
        order.put(Product2, new BigDecimal("4.0"));
        User = DemoCSR;
        SalesOrderFactory salesOrder1 = testCreatesSalesOrder(order, ca1, productStoreId, "EXT_OFFLINE", "ca1address1");

        /*
         * 2.  Verify each order item from #1 has a tax of 6.25% of order total for taxAuthGeoId=CA and 1% of order item for taxAuthGeoId=CA-LA
         */
        assertTaxOrder(salesOrder1.getOrderId(), "CA", new BigDecimal("6.25"));
        assertTaxOrder(salesOrder1.getOrderId(), "CA-LA", new BigDecimal("1"));

        /*
         * 3.  Create a sales order for productStoreId=9000, partyId=ca1, address=ca1address2
         */
        order = new HashMap<GenericValue, BigDecimal>();
        order.put(Product1, new BigDecimal("1.0"));
        order.put(Product2, new BigDecimal("4.0"));
        User = DemoCSR;
        SalesOrderFactory salesOrder3 = testCreatesSalesOrder(order, ca1, productStoreId, "EXT_OFFLINE", "ca1address2");

        /*
         * 4.  Verify each order item from #3 has a tax of 6.25% of order total for taxAuthGeoId=CA and 0.125% of order item for taxAuthGeoId=CA-SOLANO
         */
        assertTaxOrder(salesOrder3.getOrderId(), "CA", new BigDecimal("6.25"));
        assertTaxOrder(salesOrder3.getOrderId(), "CA-SOLANO", new BigDecimal("0.125"));

        /*
         * 5.  Create a sales order for productStoreId=9000, partyId=ca2, address=ca2address1
         */
        order = new HashMap<GenericValue, BigDecimal>();
        order.put(Product1, new BigDecimal("1.0"));
        order.put(Product2, new BigDecimal("4.0"));
        User = DemoCSR;
        SalesOrderFactory salesOrder5 = testCreatesSalesOrder(order, ca2, productStoreId, "EXT_OFFLINE", "ca2address1");

        /*
         * 6.  Verify each order item from #5 has a tax of 0 for taxAuthGeoId=CA and 0 for taxAuthGeoId=CA-LA
         */
        assertTaxOrder(salesOrder5.getOrderId(), "CA", BigDecimal.ZERO);
        assertTaxOrder(salesOrder5.getOrderId(), "CA-LA", BigDecimal.ZERO);

        /*
         * 7.  Create a sales order for productStoreId=9000, partyId=ca2, address=ca2address2
         */
        order = new HashMap<GenericValue, BigDecimal>();
        order.put(Product1, new BigDecimal("1.0"));
        order.put(Product2, new BigDecimal("4.0"));
        User = DemoCSR;
        SalesOrderFactory salesOrder7 = testCreatesSalesOrder(order, ca2, productStoreId, "EXT_OFFLINE", "ca2address2");

        /*
         * 8.  Verify each order item from #7 has a tax of 0 for taxAuthGeoId=CA and 0 for taxAuthGeoId=CA-SOLANO
         */
        assertTaxOrder(salesOrder7.getOrderId(), "CA", BigDecimal.ZERO);
        assertTaxOrder(salesOrder7.getOrderId(), "CA-SOLANO", BigDecimal.ZERO);

        /*
         * 9.  Create a sales order for productStoreId=9000, partyId=ca1, address=ca1address1
         */
        order = new HashMap<GenericValue, BigDecimal>();
        order.put(Product1, new BigDecimal("1.0"));
        order.put(Product2, new BigDecimal("4.0"));
        User = DemoCSR;
        SalesOrderFactory salesOrder9 = testCreatesSalesOrder(order, ca1, productStoreId, "EXT_OFFLINE", "ca1address1");

        /*
         * 10.  Use testShipOrder to ship all 5 sales orders (#1, #3, #5, #7, #9)
         */
        Map input = UtilMisc.toMap("userLogin", admin);
        input.put("facilityId", facilityId);
        input.put("orderId", salesOrder1.getOrderId());
        runAndAssertServiceSuccess("testShipOrder", input);
        input = UtilMisc.toMap("userLogin", admin);
        input.put("facilityId", facilityId);
        input.put("orderId", salesOrder3.getOrderId());
        runAndAssertServiceSuccess("testShipOrder", input);
        input = UtilMisc.toMap("userLogin", admin);
        input.put("facilityId", facilityId);
        input.put("orderId", salesOrder5.getOrderId());
        runAndAssertServiceSuccess("testShipOrder", input);
        input = UtilMisc.toMap("userLogin", admin);
        input.put("facilityId", facilityId);
        input.put("orderId", salesOrder7.getOrderId());
        runAndAssertServiceSuccess("testShipOrder", input);
        input = UtilMisc.toMap("userLogin", admin);
        input.put("facilityId", facilityId);
        input.put("orderId", salesOrder9.getOrderId());
        runAndAssertServiceSuccess("testShipOrder", input);

        /*
         * 11.  Create a return for all items on sales order #9 and accept the return
         */
        input = UtilMisc.toMap("userLogin", admin);
        input.put("orderId", salesOrder9.getOrderId());
        Map<String, Object> output = runAndAssertServiceSuccess("crmsfa.createReturnFromOrder", input);
        String returnId = (String) output.get("returnId");

        List<GenericValue> orderItems = delegator.findByAnd("OrderItem", UtilMisc.toMap("orderId", salesOrder9.getOrderId()));
        assertNotNull("There is no order item in the order " + salesOrder9.getOrderId() + ".", orderItems);
        List<GenericValue> returnItemTypes = delegator.findByAnd("ReturnItemTypeMap", UtilMisc.toMap("returnHeaderTypeId", "CUSTOMER_RETURN"));
        Map returnItemTypeMap = new HashMap<String, String>();
        for (GenericValue returnItemType : returnItemTypes) {
                returnItemTypeMap.put(returnItemType.getString("returnItemMapKey"), returnItemType.getString("returnItemTypeId"));
        }

        for (GenericValue orderItem : orderItems) {
            input = UtilMisc.toMap("userLogin", admin);
            input.put("returnId", returnId);
            input.put("returnItemTypeId", (returnItemTypeMap.get(orderItem.getString("orderItemTypeId")) != null ? returnItemTypeMap.get(orderItem.getString("orderItemTypeId")) : ""));
            input.put("orderId", salesOrder9.getOrderId());
            input.put("orderItemSeqId", orderItem.getString("orderItemSeqId"));
            input.put("description", orderItem.getString("itemDescription"));
            input.put("productId", orderItem.getString("productId"));
            input.put("returnQuantity", orderItem.getBigDecimal("quantity"));
            input.put("returnPrice", orderItem.getBigDecimal("unitPrice"));
            input.put("returnReasonId", "RTN_NOT_WANT");
            input.put("returnTypeId", "RTN_REFUND");
            runAndAssertServiceSuccess("createReturnItemOrAdjustment", input);
        }

        input = UtilMisc.toMap("userLogin", admin);
        input.put("returnId", returnId);
        runAndAssertServiceSuccess("crmsfa.acceptReturn", input);

        /*
         * 12.  Verify that the return item from #11 has a ReturnAdjustment of sales tax of 6.25% of item for taxAuthGeoId=CA and 1% for taxAuthGeoId=CA-LA
         */
        assertTaxReturn(returnId, "CA", new BigDecimal("6.25"));
        assertTaxReturn(returnId, "CA-LA", new BigDecimal("1.0"));

    }

    /**
     * Tests that the sales taxes are correct after updating and canceling order items.
     * Remainder on tax calculation:
     *  - tax authority rate when applied to an item sub total rounds ROUND_CEILING to 3 decimals, this is hard coded in TaxAuthorityServices.getTaxAdjustments and may lead to confusion
     *  - item taxes for each tax authority are rounded HALF_UP to 3 decimals, this is according to the order specifications
     *  - item tax totals are rounded HALF_UP to 2 decimals, this is according to the order specifications
     * @throws GeneralException if an error occurs
     */
    public void testTaxesAfterOrderUpdate() throws GeneralException {
        // Create two test products
        GenericValue testProduct1 = createTestProduct("testTaxesAfterOrderUpdate Product 1", admin);
        String productId1 = testProduct1.getString("productId");
        assignDefaultPrice(testProduct1, new BigDecimal("10.0"), admin);

        GenericValue testProduct2 = createTestProduct("testTaxesAfterOrderUpdate Product 2", admin);
        String productId2 = testProduct2.getString("productId");
        assignDefaultPrice(testProduct2, new BigDecimal("75.0"), admin);

        // create an order of 5 product1 and 3 product2
        Map<GenericValue, BigDecimal> orderItems = new HashMap<GenericValue, BigDecimal>();
        orderItems.put(testProduct1, new BigDecimal("5.0"));
        orderItems.put(testProduct2, new BigDecimal("3.0"));
        User = DemoCSR;
        SalesOrderFactory salesOrder = testCreatesSalesOrder(orderItems, ca1, productStoreId, "EXT_OFFLINE", "ca1address1");
        String orderId = salesOrder.getOrderId();
        Debug.logInfo("testTaxesAfterOrderUpdate created order [" + orderId + "]", MODULE);
        OrderRepositoryInterface repository = getOrderRepository(admin);
        Order order = repository.getOrderById(salesOrder.getOrderId());

        // find the order items
        OrderItem orderItem1 = null;
        OrderItem orderItem2 = null;
        for (OrderItem item : order.getOrderItems()) {
            if (productId1.equals(item.getProductId())) {
                orderItem1 = item;
            } else if (productId2.equals(item.getProductId())) {
                orderItem2 = item;
            }
        }
        assertNotNull("Did not find order item 1 in order [" + orderId + "]", orderItem1);
        assertNotNull("Did not find order item 2 in order [" + orderId + "]", orderItem2);

        // update order with same values, this is a hack to have all the promotions, taxes, shipping charges calculated
        Map<String, Object> callCtxt = new HashMap<String, Object>();
        callCtxt.put("userLogin", User);
        callCtxt.put("orderId", orderId);
        callCtxt.put("itemQtyMap", UtilMisc.toMap(orderItem1.getOrderItemSeqId() + ":00001", "5.0", orderItem2.getOrderItemSeqId() + ":00001", "3.0"));
        callCtxt.put("itemPriceMap", UtilMisc.toMap(orderItem1.getOrderItemSeqId(), "10.00", orderItem2.getOrderItemSeqId(), "75.00"));
        callCtxt.put("overridePriceMap", new HashMap<String, Object>());
        runAndAssertServiceSuccess("opentaps.updateOrderItems", callCtxt);

        // verify the details
        // Note: _NA_ taxes only applies to items with unit price > 25.00, so it only applies to order item 2.
        Debug.logInfo("testTaxesAfterOrderUpdate: step 1 order total [" + order.getTotal() + "], adjustments total [" + order.getOtherAdjustmentsAmount() + "], tax amount [" + order.getTaxAmount() + "], shipping [" + order.getShippingAmount() + "], items [" + order.getItemsSubTotal() + "]", MODULE);
        // Order items sub total should be:
        //  5 x product1 = 50.0
        //  3 x product2 = 225.0
        //  = 275.00
        assertEquals("Order [" + orderId + "] item 1 sub total incorrect.", orderItem1.getSubTotal(), new BigDecimal("50.00"));
        assertEquals("Order [" + orderId + "] item 2 sub total incorrect.", orderItem2.getSubTotal(), new BigDecimal("225.00"));
        assertEquals("Order [" + orderId + "] items sub total incorrect.", order.getItemsSubTotal(), new BigDecimal("275.00"));
        // Shipping amount for the STANDARD _NA_ shipping method is 20% of the order
        //  20 % of 275.00 = 55.00
        assertEquals("Order [" + orderId + "] shipping amount incorrect.", order.getShippingAmount(), new BigDecimal("55.00"));
        // 10% off promotion: 275.00 x 0.1 = 27.50
        assertEquals("Order [" + orderId + "] 10 % off promotion incorrect.", order.getOtherAdjustmentsAmount(), new BigDecimal("-27.50"));
        // Tax amount should be:
        //      1 + 6.25 % of 50.00  = 0.500 + 3.125 = 3.625 ~ 3.63
        //  1 + 1 + 6.25 % of 225.00 = 2.250 + 2.250 + 14.063 = 18.563 ~ 18.56
        //  1 % of 55.00 = 0.55 (note: only the CA-LA CA_BOE tax authority taxes shipping)
        //  1 % of -27.50 promotion = -0.275 ~ -0.27 (note: only the CA-LA CA_BOE tax authority taxes promotion)
        // = 22.4675 ~ 22.47
        assertEquals("Order [" + orderId + "] item 1 taxes incorrect.", orderItem1.getTaxAmount(), new BigDecimal("3.63"));
        assertEquals("Order [" + orderId + "] item 2 taxes incorrect.", orderItem2.getTaxAmount(), new BigDecimal("18.56"));
        assertEquals("Order [" + orderId + "] tax incorrect.", order.getTaxAmount(), new BigDecimal("22.47"));

        // other item adjustments
        assertEquals("Order [" + orderId + "] item 1 other adjustments incorrect.", orderItem1.getOtherAdjustmentsAmount(), new BigDecimal("0.00"));
        assertEquals("Order [" + orderId + "] item 2 other adjustments incorrect.", orderItem2.getOtherAdjustmentsAmount(), new BigDecimal("0.00"));

        // update order:
        // 7 x product1 and 9 product2
        // change product1 unit price to 25.99 so that _NA_ taxes should now apply
        // set product2 price to 69.99
        callCtxt = new HashMap<String, Object>();
        callCtxt.put("userLogin", User);
        callCtxt.put("orderId", orderId);
        callCtxt.put("itemQtyMap", UtilMisc.toMap(orderItem1.getOrderItemSeqId() + ":00001", "7.0", orderItem2.getOrderItemSeqId() + ":00001", "9.0"));
        callCtxt.put("itemPriceMap", UtilMisc.toMap(orderItem1.getOrderItemSeqId(), "25.99", orderItem2.getOrderItemSeqId(), "69.99"));
        callCtxt.put("overridePriceMap", UtilMisc.toMap(orderItem1.getOrderItemSeqId(), "25.99", orderItem2.getOrderItemSeqId(), "69.99"));
        runAndAssertServiceSuccess("opentaps.updateOrderItems", callCtxt);

        // reload entities
        order = repository.getOrderById(salesOrder.getOrderId());
        orderItem1 = order.getOrderItem(orderItem1.getOrderItemSeqId());
        orderItem2 = order.getOrderItem(orderItem2.getOrderItemSeqId());

        // verify the details
        Debug.logInfo("testTaxesAfterOrderUpdate: step 2 order total [" + order.getTotal() + "], adjustments total [" + order.getOtherAdjustmentsAmount() + "], tax amount [" + order.getTaxAmount() + "], shipping [" + order.getShippingAmount() + "], items [" + order.getItemsSubTotal() + "]", MODULE);
        // Order items sub total should be:
        //  7 x 25.99 = 181.93
        //  9 x 69.99 = 629.91
        //  = 811.84
        assertEquals("Order [" + orderId + "] item 1 sub total incorrect.", orderItem1.getSubTotal(), new BigDecimal("181.93"));
        assertEquals("Order [" + orderId + "] item 2 sub total incorrect.", orderItem2.getSubTotal(), new BigDecimal("629.91"));
        assertEquals("Order [" + orderId + "] items sub total incorrect.", order.getItemsSubTotal(), new BigDecimal("811.84"));
        // Shipping amount for the STANDARD _NA_ shipping method is 20% of the order
        //  20 % of 811.84 = 162.368
        assertEquals("Order [" + orderId + "] shipping amount incorrect.", order.getShippingAmount(), new BigDecimal("162.37"));
        // 10% off promotion: 811.84 x 0.1 = 81.18
        assertEquals("Order [" + orderId + "] 10 % off promotion incorrect.", order.getOtherAdjustmentsAmount(), new BigDecimal("-81.18"));
        // Tax amount should be: [Note the rate applied rounding to CEILING instead of HALF-UP]
        //  1 + 1 + 6.25 % of 181.93 = 1.820 + 1.820 + 11.371 = 15.011 ~ 15.01
        //  1 + 1 + 6.25 % of 629.91 = 6.300 + 6.300 + 39.370 = 51.970 ~ 51.97
        //  1 % of 162.368 = 1.624 ~ 1.62 (note: only the CA-LA CA_BOE tax authority taxes shipping)
        //  1 % of -81.18 promotion = -0.8118 ~ -0.81 (note: only the CA-LA CA_BOE tax authority taxes promotion)
        // = 67.79
        assertEquals("Order [" + orderId + "] item 1 taxes incorrect.", orderItem1.getTaxAmount(), new BigDecimal("15.01"));
        assertEquals("Order [" + orderId + "] item 2 taxes incorrect.", orderItem2.getTaxAmount(), new BigDecimal("51.97"));
        assertEquals("Order [" + orderId + "] tax incorrect.", order.getTaxAmount(), new BigDecimal("67.79"));

        // other item adjustments
        assertEquals("Order [" + orderId + "] item 1 other adjustments incorrect.", orderItem1.getOtherAdjustmentsAmount(), new BigDecimal("0.00"));
        assertEquals("Order [" + orderId + "] item 2 other adjustments incorrect.", orderItem2.getOtherAdjustmentsAmount(), new BigDecimal("0.00"));

        // cancel 8 x product2
        callCtxt = new HashMap<String, Object>();
        callCtxt.put("userLogin", User);
        callCtxt.put("orderId", orderId);
        callCtxt.put("orderItemSeqId", orderItem2.getOrderItemSeqId());
        callCtxt.put("shipGroupSeqId", "00001");
        callCtxt.put("cancelQuantity", new BigDecimal("8.0"));
        runAndAssertServiceSuccess("cancelOrderItem", callCtxt);

        // reload entities
        order = repository.getOrderById(salesOrder.getOrderId());
        orderItem1 = order.getOrderItem(orderItem1.getOrderItemSeqId());
        orderItem2 = order.getOrderItem(orderItem2.getOrderItemSeqId());

        // verify the details
        Debug.logInfo("testTaxesAfterOrderUpdate: step 3 order total [" + order.getTotal() + "], adjustments total [" + order.getOtherAdjustmentsAmount() + "], tax amount [" + order.getTaxAmount() + "], shipping [" + order.getShippingAmount() + "], items [" + order.getItemsSubTotal() + "]", MODULE);
        // Order items sub total should be:
        //  7 x 25.99 = 181.93
        //  1 x 69.99 = 69.99
        //  = 251.92
        assertEquals("Order [" + orderId + "] item 1 sub total incorrect.", orderItem1.getSubTotal(), new BigDecimal("181.93"));
        assertEquals("Order [" + orderId + "] item 2 sub total incorrect.", orderItem2.getSubTotal(), new BigDecimal("69.99"));
        assertEquals("Order [" + orderId + "] items sub total incorrect.", order.getItemsSubTotal(), new BigDecimal("251.92"));
        // Shipping amount for the STANDARD _NA_ shipping method is 20% of the order
        //  20 % of 251.92 = 50.38
        assertEquals("Order [" + orderId + "] shipping amount incorrect.", order.getShippingAmount(), new BigDecimal("50.38"));
        // 10% off promotion: 251.92 x 0.1 = 2.52
        assertEquals("Order [" + orderId + "] 10 % off promotion incorrect.", order.getOtherAdjustmentsAmount(), new BigDecimal("-2.52"));
        // Tax amount should be:
        // Note the rate applied rounding to CEILING instead of HALF-UP here
        //  the second item tax would have been 5.77 otherwise, as the 6.25 % would give 4.374
        //
        //  1 + 1 + 6.25 % of 181.93 = 1.820 + 1.820 + 11.371 = 15.011 ~ 15.01
        //  1 + 1 + 6.25 % of 69.99  = 0.700 + 0.700 + 4.375  = 5.775 ~ 5.78
        //  1 % of 50.38 = 0.504 ~ 0.50 (note: only the CA-LA CA_BOE tax authority taxes shipping)
        //  1 % of -2.52 promotion = -0.0252 ~ -0.03 (note: only the CA-LA CA_BOE tax authority taxes promotion)
        // = 21.26
        assertEquals("Order [" + orderId + "] item 1 taxes incorrect.", orderItem1.getTaxAmount(), new BigDecimal("15.01"));
        assertEquals("Order [" + orderId + "] item 2 taxes incorrect.", orderItem2.getTaxAmount(), new BigDecimal("5.78"));
        assertEquals("Order [" + orderId + "] tax incorrect.", order.getTaxAmount(), new BigDecimal("21.26"));

        // other item adjustments
        assertEquals("Order [" + orderId + "] item 1 other adjustments incorrect.", orderItem1.getOtherAdjustmentsAmount(), new BigDecimal("0.00"));
        assertEquals("Order [" + orderId + "] item 2 other adjustments incorrect.", orderItem2.getOtherAdjustmentsAmount(), new BigDecimal("0.00"));

        // add 10 new order items of another test product
        GenericValue testProduct3 = createTestProduct("testTaxesAfterOrderUpdate Product 3", admin);
        String productId3 = testProduct3.getString("productId");
        assignDefaultPrice(testProduct3, new BigDecimal("15.66"), admin);

        callCtxt = new HashMap<String, Object>();
        callCtxt.put("userLogin", admin);
        callCtxt.put("orderId", orderId);
        callCtxt.put("productId", productId3);
        callCtxt.put("quantity", new BigDecimal("10.0"));
        callCtxt.put("shipGroupSeqId", "00001");
        callCtxt.put("prodCatalogId", productStoreId);
        callCtxt.put("recalcOrder", "Y");
        runAndAssertServiceSuccess("opentaps.appendOrderItem", callCtxt);

        // reload entities
        order = repository.getOrderById(salesOrder.getOrderId());
        // find the order items
        orderItem1 = null;
        orderItem2 = null;
        OrderItem orderItem3 = null;
        for (OrderItem item : order.getOrderItems()) {
            if (productId1.equals(item.getProductId())) {
                orderItem1 = item;
            } else if (productId2.equals(item.getProductId())) {
                orderItem2 = item;
            } else if (productId3.equals(item.getProductId())) {
                orderItem3 = item;
            }
        }
        assertNotNull("Did not find order item 1 in order [" + orderId + "]", orderItem1);
        assertNotNull("Did not find order item 2 in order [" + orderId + "]", orderItem2);
        assertNotNull("Did not find order item 3 in order [" + orderId + "]", orderItem3);

        // verify the details
        Debug.logInfo("testTaxesAfterOrderUpdate: step 4 order total [" + order.getTotal() + "], adjustments total [" + order.getOtherAdjustmentsAmount() + "], tax amount [" + order.getTaxAmount() + "], shipping [" + order.getShippingAmount() + "], items [" + order.getItemsSubTotal() + "]", MODULE);
        // Order items sub total should be:
        //  7  x 25.99 = 181.93
        //  1  x 69.99 =  69.99
        //  10 x 15.66 = 156.60
        //  = 408.52
        assertEquals("Order [" + orderId + "] item 1 sub total incorrect.", orderItem1.getSubTotal(), new BigDecimal("181.93"));
        assertEquals("Order [" + orderId + "] item 2 sub total incorrect.", orderItem2.getSubTotal(), new BigDecimal("69.99"));
        assertEquals("Order [" + orderId + "] item 3 sub total incorrect.", orderItem3.getSubTotal(), new BigDecimal("156.60"));
        assertEquals("Order [" + orderId + "] items sub total incorrect.", order.getItemsSubTotal(), new BigDecimal("408.52"));
        // Shipping amount for the STANDARD _NA_ shipping method is 20% of the order
        //  20 % of 408.52 = 81.70
        assertEquals("Order [" + orderId + "] shipping amount incorrect.", order.getShippingAmount(), new BigDecimal("81.70"));
        // 10% off promotion: 408.52 x 0.1 = 4.09
        assertEquals("Order [" + orderId + "] 10 % off promotion incorrect.", order.getOtherAdjustmentsAmount(), new BigDecimal("-4.09"));
        // Tax amount should be:
        //  1 + 1 + 6.25 % of 181.93 = 1.820 + 1.820 + 11.371 = 15.011 ~ 15.01
        //  1 + 1 + 6.25 % of 69.99  = 0.700 + 0.700 + 4.375  = 5.775 ~ 5.78
        //  1 + 6.25 % of 156.60 = 11.354 ~ 11.35
        //  1 % of 81.70 = 0.82 (note: only the CA-LA CA_BOE tax authority taxes shipping)
        //  1 % of -4.09 promotion = -0.0409 ~ -0.04 (note: only the CA-LA CA_BOE tax authority taxes promotion)
        // = 32.92
        assertEquals("Order [" + orderId + "] item 1 taxes incorrect.", orderItem1.getTaxAmount(), new BigDecimal("15.01"));
        assertEquals("Order [" + orderId + "] item 2 taxes incorrect.", orderItem2.getTaxAmount(), new BigDecimal("5.78"));
        assertEquals("Order [" + orderId + "] item 3 taxes incorrect.", orderItem3.getTaxAmount(), new BigDecimal("11.35"));
        assertEquals("Order [" + orderId + "] tax incorrect.", order.getTaxAmount(), new BigDecimal("32.92"));

        // update order with:
        // - product1 unit price below the 25 limit, and quantity to 5
        // - product2 quantity to 0 to cancel them
        // - product3 unit price to above 25, and quantity to 1
        callCtxt = new HashMap<String, Object>();
        callCtxt.put("userLogin", User);
        callCtxt.put("orderId", orderId);
        callCtxt.put("itemQtyMap", UtilMisc.toMap(orderItem1.getOrderItemSeqId() + ":00001", "5.0",
                                                  orderItem2.getOrderItemSeqId() + ":00001", "0.0",
                                                  orderItem3.getOrderItemSeqId() + ":00001", "1.0"));
        callCtxt.put("itemPriceMap", UtilMisc.toMap(orderItem1.getOrderItemSeqId(), "15.88",
                                                    orderItem2.getOrderItemSeqId(), "25.99",
                                                    orderItem3.getOrderItemSeqId(), "75.77"));
        callCtxt.put("overridePriceMap", UtilMisc.toMap(orderItem1.getOrderItemSeqId(), "15.88",
                                                        orderItem2.getOrderItemSeqId(), "25.99",
                                                        orderItem3.getOrderItemSeqId(), "75.77"));
        runAndAssertServiceSuccess("opentaps.updateOrderItems", callCtxt);

        // reload entities
        order = repository.getOrderById(salesOrder.getOrderId());
        // find the order items
        orderItem1 = null;
        orderItem2 = null;
        orderItem3 = null;
        for (OrderItem item : order.getOrderItems()) {
            if (productId1.equals(item.getProductId())) {
                orderItem1 = item;
            } else if (productId2.equals(item.getProductId())) {
                orderItem2 = item;
            } else if (productId3.equals(item.getProductId())) {
                orderItem3 = item;
            }
        }
        assertNotNull("Did not find order item 1 in order [" + orderId + "]", orderItem1);
        assertNotNull("Did not find order item 2 in order [" + orderId + "]", orderItem2);
        assertNotNull("Did not find order item 3 in order [" + orderId + "]", orderItem3);

        // verify the details
        Debug.logInfo("testTaxesAfterOrderUpdate: step 5 order total [" + order.getTotal() + "], adjustments total [" + order.getOtherAdjustmentsAmount() + "], tax amount [" + order.getTaxAmount() + "], shipping [" + order.getShippingAmount() + "], items [" + order.getItemsSubTotal() + "]", MODULE);
        // Order items sub total should be:
        //  5 x 15.88 = 79.40
        //  1 x 75.77 = 75.77
        //  = 155.17
        assertEquals("Order [" + orderId + "] item 1 sub total incorrect.", orderItem1.getSubTotal(), new BigDecimal("79.40"));
        assertEquals("Order [" + orderId + "] item 2 sub total incorrect.", orderItem2.getSubTotal(), new BigDecimal("0"));
        assertEquals("Order [" + orderId + "] item 3 sub total incorrect.", orderItem3.getSubTotal(), new BigDecimal("75.77"));
        assertEquals("Order [" + orderId + "] items sub total incorrect.", order.getItemsSubTotal(), new BigDecimal("155.17"));
        // Shipping amount for the STANDARD _NA_ shipping method is 20% of the order
        //  20 % of 155.17 = 31.034
        assertEquals("Order [" + orderId + "] shipping amount incorrect.", order.getShippingAmount(), new BigDecimal("31.03"));
        // 10% off promotion: 155.17 x 0.1 = 15.52
        assertEquals("Order [" + orderId + "] 10 % off promotion incorrect.", order.getOtherAdjustmentsAmount(), new BigDecimal("-15.52"));
        // Tax amount should be:
        //  1 + 6.25 % of 79.40 = 0.794 + 4.963 = 5.757 ~ 5.76
        //  1 + 1 + 6.25 % of 75.77 = 0.758 + 0.758 + 4.736 = 6.252 ~ 6.25
        //  1 % of 31.03 = 0.31 (note: only the CA-LA CA_BOE tax authority taxes shipping)
        //  1 % of -15.52 promotion = -0.1552 ~ -0.16 (note: only the CA-LA CA_BOE tax authority taxes promotion)
        // = 12.16
        assertEquals("Order [" + orderId + "] item 1 taxes incorrect.", orderItem1.getTaxAmount(), new BigDecimal("5.76"));
        assertEquals("Order [" + orderId + "] item 2 taxes incorrect.", orderItem2.getTaxAmount(), new BigDecimal("0"));
        assertEquals("Order [" + orderId + "] item 3 taxes incorrect.", orderItem3.getTaxAmount(), new BigDecimal("6.25"));
        assertEquals("Order [" + orderId + "] tax incorrect.", order.getTaxAmount(), new BigDecimal("12.16"));

    }
}
