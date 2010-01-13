package org.opentaps.base.entities;

/*
 * Copyright (c) 2008 - 2009 Open Source Strategies, Inc.
 *
 * Opentaps is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Opentaps is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Opentaps.  If not, see <http://www.gnu.org/licenses/>.
 */

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE DATA MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javolution.util.FastMap;

import org.opentaps.foundation.entity.Entity;
import org.opentaps.foundation.entity.EntityFieldInterface;
import org.opentaps.foundation.repository.RepositoryException;
import org.opentaps.foundation.repository.RepositoryInterface;
import javax.persistence.*;
import org.hibernate.search.annotations.*;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity OrderReportView.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectOrderReportViews", query="SELECT OS.DESCRIPTION AS \"description\",OH.ORDER_ID AS \"orderId\",OH.ORDER_TYPE_ID AS \"orderTypeId\",OH.ORDER_DATE AS \"orderDate\",OS.DESCRIPTION AS \"description\",PMT.DESCRIPTION AS \"description\",OH.VISIT_ID AS \"visitId\",OH.CURRENCY_UOM AS \"currencyUom\",OH.ORIGIN_FACILITY_ID AS \"originFacilityId\",OH.WEB_SITE_ID AS \"webSiteId\",OH.GRAND_TOTAL AS \"grandTotal\",OI.PRODUCT_ID AS \"productId\",OI.ITEM_DESCRIPTION AS \"itemDescription\",OIS.DESCRIPTION AS \"description\",OI.QUANTITY AS \"quantity\",OI.UNIT_PRICE AS \"unitPrice\" FROM ORDER_HEADER OH LEFT JOIN ORDER_PAYMENT_PREFERENCE OPP ON OH.ORDER_ID = OPP.ORDER_ID LEFT JOIN PAYMENT_METHOD_TYPE PMT ON OPP.PAYMENT_METHOD_TYPE_ID = PMT.PAYMENT_METHOD_TYPE_ID INNER JOIN STATUS_ITEM OS ON OH.STATUS_ID = OS.STATUS_ID INNER JOIN ORDER_ITEM OI ON OH.ORDER_ID = OI.ORDER_ID INNER JOIN STATUS_ITEM OIS ON OI.STATUS_ID = OIS.STATUS_ID", resultSetMapping="OrderReportViewMapping")
@SqlResultSetMapping(name="OrderReportViewMapping", entities={
@EntityResult(entityClass=OrderReportView.class, fields = {
@FieldResult(name="groupName", column="groupName")
,@FieldResult(name="orderId", column="orderId")
,@FieldResult(name="orderTypeId", column="orderTypeId")
,@FieldResult(name="orderDate", column="orderDate")
,@FieldResult(name="orderStatus", column="orderStatus")
,@FieldResult(name="paymentMethod", column="paymentMethod")
,@FieldResult(name="visitId", column="visitId")
,@FieldResult(name="currencyUom", column="currencyUom")
,@FieldResult(name="originFacilityId", column="originFacilityId")
,@FieldResult(name="webSiteId", column="webSiteId")
,@FieldResult(name="grandTotal", column="grandTotal")
,@FieldResult(name="productId", column="productId")
,@FieldResult(name="itemDescription", column="itemDescription")
,@FieldResult(name="itemStatus", column="itemStatus")
,@FieldResult(name="quantity", column="quantity")
,@FieldResult(name="unitPrice", column="unitPrice")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class OrderReportView extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("groupName", "OS.DESCRIPTION");
        fields.put("orderId", "OH.ORDER_ID");
        fields.put("orderTypeId", "OH.ORDER_TYPE_ID");
        fields.put("orderDate", "OH.ORDER_DATE");
        fields.put("orderStatus", "OS.DESCRIPTION");
        fields.put("paymentMethod", "PMT.DESCRIPTION");
        fields.put("visitId", "OH.VISIT_ID");
        fields.put("currencyUom", "OH.CURRENCY_UOM");
        fields.put("originFacilityId", "OH.ORIGIN_FACILITY_ID");
        fields.put("webSiteId", "OH.WEB_SITE_ID");
        fields.put("grandTotal", "OH.GRAND_TOTAL");
        fields.put("productId", "OI.PRODUCT_ID");
        fields.put("itemDescription", "OI.ITEM_DESCRIPTION");
        fields.put("itemStatus", "OIS.DESCRIPTION");
        fields.put("quantity", "OI.QUANTITY");
        fields.put("unitPrice", "OI.UNIT_PRICE");
fieldMapColumns.put("OrderReportView", fields);
}
  public static enum Fields implements EntityFieldInterface<OrderReportView> {
    groupName("groupName"),
    orderId("orderId"),
    orderTypeId("orderTypeId"),
    orderDate("orderDate"),
    orderStatus("orderStatus"),
    paymentMethod("paymentMethod"),
    visitId("visitId"),
    currencyUom("currencyUom"),
    originFacilityId("originFacilityId"),
    webSiteId("webSiteId"),
    grandTotal("grandTotal"),
    productId("productId"),
    itemDescription("itemDescription"),
    itemStatus("itemStatus"),
    quantity("quantity"),
    unitPrice("unitPrice");
    protected final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private String groupName;
    @Id
   private String orderId;
    
   private String orderTypeId;
    
   private Timestamp orderDate;
    
   private String orderStatus;
    
   private String paymentMethod;
    
   private String visitId;
    
   private String currencyUom;
    
   private String originFacilityId;
    
   private String webSiteId;
    
   private BigDecimal grandTotal;
    
   private String productId;
    
   private String itemDescription;
    
   private String itemStatus;
    
   private BigDecimal quantity;
    
   private BigDecimal unitPrice;

  /**
   * Default constructor.
   */
  public OrderReportView() {
      super();
      this.baseEntityName = "OrderReportView";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("orderId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("groupName");this.allFieldsNames.add("orderId");this.allFieldsNames.add("orderTypeId");this.allFieldsNames.add("orderDate");this.allFieldsNames.add("orderStatus");this.allFieldsNames.add("paymentMethod");this.allFieldsNames.add("visitId");this.allFieldsNames.add("currencyUom");this.allFieldsNames.add("originFacilityId");this.allFieldsNames.add("webSiteId");this.allFieldsNames.add("grandTotal");this.allFieldsNames.add("productId");this.allFieldsNames.add("itemDescription");this.allFieldsNames.add("itemStatus");this.allFieldsNames.add("quantity");this.allFieldsNames.add("unitPrice");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public OrderReportView(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param groupName the groupName to set
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    /**
     * Auto generated value setter.
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    /**
     * Auto generated value setter.
     * @param orderTypeId the orderTypeId to set
     */
    public void setOrderTypeId(String orderTypeId) {
        this.orderTypeId = orderTypeId;
    }
    /**
     * Auto generated value setter.
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }
    /**
     * Auto generated value setter.
     * @param orderStatus the orderStatus to set
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    /**
     * Auto generated value setter.
     * @param paymentMethod the paymentMethod to set
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    /**
     * Auto generated value setter.
     * @param visitId the visitId to set
     */
    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }
    /**
     * Auto generated value setter.
     * @param currencyUom the currencyUom to set
     */
    public void setCurrencyUom(String currencyUom) {
        this.currencyUom = currencyUom;
    }
    /**
     * Auto generated value setter.
     * @param originFacilityId the originFacilityId to set
     */
    public void setOriginFacilityId(String originFacilityId) {
        this.originFacilityId = originFacilityId;
    }
    /**
     * Auto generated value setter.
     * @param webSiteId the webSiteId to set
     */
    public void setWebSiteId(String webSiteId) {
        this.webSiteId = webSiteId;
    }
    /**
     * Auto generated value setter.
     * @param grandTotal the grandTotal to set
     */
    public void setGrandTotal(BigDecimal grandTotal) {
        this.grandTotal = grandTotal;
    }
    /**
     * Auto generated value setter.
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }
    /**
     * Auto generated value setter.
     * @param itemDescription the itemDescription to set
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
    /**
     * Auto generated value setter.
     * @param itemStatus the itemStatus to set
     */
    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }
    /**
     * Auto generated value setter.
     * @param quantity the quantity to set
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
    /**
     * Auto generated value setter.
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGroupName() {
        return this.groupName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderId() {
        return this.orderId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderTypeId() {
        return this.orderTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getOrderDate() {
        return this.orderDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderStatus() {
        return this.orderStatus;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaymentMethod() {
        return this.paymentMethod;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getVisitId() {
        return this.visitId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCurrencyUom() {
        return this.currencyUom;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOriginFacilityId() {
        return this.originFacilityId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWebSiteId() {
        return this.webSiteId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getGrandTotal() {
        return this.grandTotal;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductId() {
        return this.productId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getItemDescription() {
        return this.itemDescription;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getItemStatus() {
        return this.itemStatus;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantity() {
        return this.quantity;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getUnitPrice() {
        return this.unitPrice;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setGroupName((String) mapValue.get("groupName"));
        setOrderId((String) mapValue.get("orderId"));
        setOrderTypeId((String) mapValue.get("orderTypeId"));
        setOrderDate((Timestamp) mapValue.get("orderDate"));
        setOrderStatus((String) mapValue.get("orderStatus"));
        setPaymentMethod((String) mapValue.get("paymentMethod"));
        setVisitId((String) mapValue.get("visitId"));
        setCurrencyUom((String) mapValue.get("currencyUom"));
        setOriginFacilityId((String) mapValue.get("originFacilityId"));
        setWebSiteId((String) mapValue.get("webSiteId"));
        setGrandTotal(convertToBigDecimal(mapValue.get("grandTotal")));
        setProductId((String) mapValue.get("productId"));
        setItemDescription((String) mapValue.get("itemDescription"));
        setItemStatus((String) mapValue.get("itemStatus"));
        setQuantity(convertToBigDecimal(mapValue.get("quantity")));
        setUnitPrice(convertToBigDecimal(mapValue.get("unitPrice")));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("groupName", getGroupName());
        mapValue.put("orderId", getOrderId());
        mapValue.put("orderTypeId", getOrderTypeId());
        mapValue.put("orderDate", getOrderDate());
        mapValue.put("orderStatus", getOrderStatus());
        mapValue.put("paymentMethod", getPaymentMethod());
        mapValue.put("visitId", getVisitId());
        mapValue.put("currencyUom", getCurrencyUom());
        mapValue.put("originFacilityId", getOriginFacilityId());
        mapValue.put("webSiteId", getWebSiteId());
        mapValue.put("grandTotal", getGrandTotal());
        mapValue.put("productId", getProductId());
        mapValue.put("itemDescription", getItemDescription());
        mapValue.put("itemStatus", getItemStatus());
        mapValue.put("quantity", getQuantity());
        mapValue.put("unitPrice", getUnitPrice());
        return mapValue;
    }


}
