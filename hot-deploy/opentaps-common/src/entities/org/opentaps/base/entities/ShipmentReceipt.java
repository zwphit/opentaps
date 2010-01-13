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
 * Auto generated base entity ShipmentReceipt.
 */
@javax.persistence.Entity
@Table(name="SHIPMENT_RECEIPT")
public class ShipmentReceipt extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("receiptId", "RECEIPT_ID");
        fields.put("inventoryItemId", "INVENTORY_ITEM_ID");
        fields.put("productId", "PRODUCT_ID");
        fields.put("shipmentId", "SHIPMENT_ID");
        fields.put("shipmentPackageSeqId", "SHIPMENT_PACKAGE_SEQ_ID");
        fields.put("orderId", "ORDER_ID");
        fields.put("orderItemSeqId", "ORDER_ITEM_SEQ_ID");
        fields.put("returnId", "RETURN_ID");
        fields.put("returnItemSeqId", "RETURN_ITEM_SEQ_ID");
        fields.put("rejectionId", "REJECTION_ID");
        fields.put("receivedByUserLoginId", "RECEIVED_BY_USER_LOGIN_ID");
        fields.put("datetimeReceived", "DATETIME_RECEIVED");
        fields.put("itemDescription", "ITEM_DESCRIPTION");
        fields.put("quantityAccepted", "QUANTITY_ACCEPTED");
        fields.put("quantityRejected", "QUANTITY_REJECTED");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ShipmentReceipt", fields);
}
  public static enum Fields implements EntityFieldInterface<ShipmentReceipt> {
    receiptId("receiptId"),
    inventoryItemId("inventoryItemId"),
    productId("productId"),
    shipmentId("shipmentId"),
    shipmentPackageSeqId("shipmentPackageSeqId"),
    orderId("orderId"),
    orderItemSeqId("orderItemSeqId"),
    returnId("returnId"),
    returnItemSeqId("returnItemSeqId"),
    rejectionId("rejectionId"),
    receivedByUserLoginId("receivedByUserLoginId"),
    datetimeReceived("datetimeReceived"),
    itemDescription("itemDescription"),
    quantityAccepted("quantityAccepted"),
    quantityRejected("quantityRejected"),
    lastUpdatedStamp("lastUpdatedStamp"),
    lastUpdatedTxStamp("lastUpdatedTxStamp"),
    createdStamp("createdStamp"),
    createdTxStamp("createdTxStamp");
    protected final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

   @org.hibernate.annotations.GenericGenerator(name="ShipmentReceipt_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="ShipmentReceipt_GEN")
   @Id
   @Column(name="RECEIPT_ID")
   protected String receiptId;
   @Column(name="INVENTORY_ITEM_ID")
   protected String inventoryItemId;
   @Column(name="PRODUCT_ID")
   protected String productId;
   @Column(name="SHIPMENT_ID")
   protected String shipmentId;
   @Column(name="SHIPMENT_PACKAGE_SEQ_ID")
   protected String shipmentPackageSeqId;
   @Column(name="ORDER_ID")
   protected String orderId;
   @Column(name="ORDER_ITEM_SEQ_ID")
   protected String orderItemSeqId;
   @Column(name="RETURN_ID")
   protected String returnId;
   @Column(name="RETURN_ITEM_SEQ_ID")
   protected String returnItemSeqId;
   @Column(name="REJECTION_ID")
   protected String rejectionId;
   @Column(name="RECEIVED_BY_USER_LOGIN_ID")
   protected String receivedByUserLoginId;
   @Column(name="DATETIME_RECEIVED")
   protected Timestamp datetimeReceived;
   @Column(name="ITEM_DESCRIPTION")
   protected String itemDescription;
   @Column(name="QUANTITY_ACCEPTED")
   protected BigDecimal quantityAccepted;
   @Column(name="QUANTITY_REJECTED")
   protected BigDecimal quantityRejected;
   @Column(name="LAST_UPDATED_STAMP")
   protected Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   protected Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   protected Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   protected Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="INVENTORY_ITEM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected InventoryItem inventoryItem = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected Product product = null;
   private transient ShipmentPackage shipmentPackage = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ORDER_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected OrderHeader orderHeader = null;
   private transient OrderItem orderItem = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="REJECTION_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected RejectionReason rejectionReason = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="RECEIVED_BY_USER_LOGIN_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected UserLogin userLogin = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SHIPMENT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected Shipment shipment = null;
   private transient ReturnItem returnItem = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="RECEIPT_ID")
   
   protected List<AcctgTrans> acctgTranses = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="RECEIPT_ID")
   
   protected List<InventoryItemDetail> inventoryItemDetails = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="SHIPMENT_RECEIPT_ID")
   
   protected List<OrderItemBilling> orderItemBillings = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="SHIPMENT_RECEIPT_ID")
   
   protected List<ReturnItemBilling> returnItemBillings = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="shipmentReceipt", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="RECEIPT_ID")
   
   protected List<ShipmentReceiptRole> shipmentReceiptRoles = null;

  /**
   * Default constructor.
   */
  public ShipmentReceipt() {
      super();
      this.baseEntityName = "ShipmentReceipt";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("receiptId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("receiptId");this.allFieldsNames.add("inventoryItemId");this.allFieldsNames.add("productId");this.allFieldsNames.add("shipmentId");this.allFieldsNames.add("shipmentPackageSeqId");this.allFieldsNames.add("orderId");this.allFieldsNames.add("orderItemSeqId");this.allFieldsNames.add("returnId");this.allFieldsNames.add("returnItemSeqId");this.allFieldsNames.add("rejectionId");this.allFieldsNames.add("receivedByUserLoginId");this.allFieldsNames.add("datetimeReceived");this.allFieldsNames.add("itemDescription");this.allFieldsNames.add("quantityAccepted");this.allFieldsNames.add("quantityRejected");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ShipmentReceipt(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param receiptId the receiptId to set
     */
    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }
    /**
     * Auto generated value setter.
     * @param inventoryItemId the inventoryItemId to set
     */
    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
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
     * @param shipmentId the shipmentId to set
     */
    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }
    /**
     * Auto generated value setter.
     * @param shipmentPackageSeqId the shipmentPackageSeqId to set
     */
    public void setShipmentPackageSeqId(String shipmentPackageSeqId) {
        this.shipmentPackageSeqId = shipmentPackageSeqId;
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
     * @param orderItemSeqId the orderItemSeqId to set
     */
    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
    /**
     * Auto generated value setter.
     * @param returnId the returnId to set
     */
    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }
    /**
     * Auto generated value setter.
     * @param returnItemSeqId the returnItemSeqId to set
     */
    public void setReturnItemSeqId(String returnItemSeqId) {
        this.returnItemSeqId = returnItemSeqId;
    }
    /**
     * Auto generated value setter.
     * @param rejectionId the rejectionId to set
     */
    public void setRejectionId(String rejectionId) {
        this.rejectionId = rejectionId;
    }
    /**
     * Auto generated value setter.
     * @param receivedByUserLoginId the receivedByUserLoginId to set
     */
    public void setReceivedByUserLoginId(String receivedByUserLoginId) {
        this.receivedByUserLoginId = receivedByUserLoginId;
    }
    /**
     * Auto generated value setter.
     * @param datetimeReceived the datetimeReceived to set
     */
    public void setDatetimeReceived(Timestamp datetimeReceived) {
        this.datetimeReceived = datetimeReceived;
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
     * @param quantityAccepted the quantityAccepted to set
     */
    public void setQuantityAccepted(BigDecimal quantityAccepted) {
        this.quantityAccepted = quantityAccepted;
    }
    /**
     * Auto generated value setter.
     * @param quantityRejected the quantityRejected to set
     */
    public void setQuantityRejected(BigDecimal quantityRejected) {
        this.quantityRejected = quantityRejected;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedStamp the lastUpdatedStamp to set
     */
    public void setLastUpdatedStamp(Timestamp lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedTxStamp the lastUpdatedTxStamp to set
     */
    public void setLastUpdatedTxStamp(Timestamp lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdStamp the createdStamp to set
     */
    public void setCreatedStamp(Timestamp createdStamp) {
        this.createdStamp = createdStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdTxStamp the createdTxStamp to set
     */
    public void setCreatedTxStamp(Timestamp createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReceiptId() {
        return this.receiptId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInventoryItemId() {
        return this.inventoryItemId;
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
    public String getShipmentId() {
        return this.shipmentId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShipmentPackageSeqId() {
        return this.shipmentPackageSeqId;
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
    public String getOrderItemSeqId() {
        return this.orderItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReturnId() {
        return this.returnId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReturnItemSeqId() {
        return this.returnItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRejectionId() {
        return this.rejectionId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReceivedByUserLoginId() {
        return this.receivedByUserLoginId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getDatetimeReceived() {
        return this.datetimeReceived;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantityAccepted() {
        return this.quantityAccepted;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantityRejected() {
        return this.quantityRejected;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedStamp() {
        return this.lastUpdatedStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedTxStamp() {
        return this.lastUpdatedTxStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedStamp() {
        return this.createdStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedTxStamp() {
        return this.createdTxStamp;
    }

    /**
     * Auto generated method that gets the related <code>InventoryItem</code> by the relation named <code>InventoryItem</code>.
     * @return the <code>InventoryItem</code>
     * @throws RepositoryException if an error occurs
     */
    public InventoryItem getInventoryItem() throws RepositoryException {
        if (this.inventoryItem == null) {
            this.inventoryItem = getRelatedOne(InventoryItem.class, "InventoryItem");
        }
        return this.inventoryItem;
    }
    /**
     * Auto generated method that gets the related <code>Product</code> by the relation named <code>Product</code>.
     * @return the <code>Product</code>
     * @throws RepositoryException if an error occurs
     */
    public Product getProduct() throws RepositoryException {
        if (this.product == null) {
            this.product = getRelatedOne(Product.class, "Product");
        }
        return this.product;
    }
    /**
     * Auto generated method that gets the related <code>ShipmentPackage</code> by the relation named <code>ShipmentPackage</code>.
     * @return the <code>ShipmentPackage</code>
     * @throws RepositoryException if an error occurs
     */
    public ShipmentPackage getShipmentPackage() throws RepositoryException {
        if (this.shipmentPackage == null) {
            this.shipmentPackage = getRelatedOne(ShipmentPackage.class, "ShipmentPackage");
        }
        return this.shipmentPackage;
    }
    /**
     * Auto generated method that gets the related <code>OrderHeader</code> by the relation named <code>OrderHeader</code>.
     * @return the <code>OrderHeader</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderHeader getOrderHeader() throws RepositoryException {
        if (this.orderHeader == null) {
            this.orderHeader = getRelatedOne(OrderHeader.class, "OrderHeader");
        }
        return this.orderHeader;
    }
    /**
     * Auto generated method that gets the related <code>OrderItem</code> by the relation named <code>OrderItem</code>.
     * @return the <code>OrderItem</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderItem getOrderItem() throws RepositoryException {
        if (this.orderItem == null) {
            this.orderItem = getRelatedOne(OrderItem.class, "OrderItem");
        }
        return this.orderItem;
    }
    /**
     * Auto generated method that gets the related <code>RejectionReason</code> by the relation named <code>RejectionReason</code>.
     * @return the <code>RejectionReason</code>
     * @throws RepositoryException if an error occurs
     */
    public RejectionReason getRejectionReason() throws RepositoryException {
        if (this.rejectionReason == null) {
            this.rejectionReason = getRelatedOne(RejectionReason.class, "RejectionReason");
        }
        return this.rejectionReason;
    }
    /**
     * Auto generated method that gets the related <code>UserLogin</code> by the relation named <code>UserLogin</code>.
     * @return the <code>UserLogin</code>
     * @throws RepositoryException if an error occurs
     */
    public UserLogin getUserLogin() throws RepositoryException {
        if (this.userLogin == null) {
            this.userLogin = getRelatedOne(UserLogin.class, "UserLogin");
        }
        return this.userLogin;
    }
    /**
     * Auto generated method that gets the related <code>Shipment</code> by the relation named <code>Shipment</code>.
     * @return the <code>Shipment</code>
     * @throws RepositoryException if an error occurs
     */
    public Shipment getShipment() throws RepositoryException {
        if (this.shipment == null) {
            this.shipment = getRelatedOne(Shipment.class, "Shipment");
        }
        return this.shipment;
    }
    /**
     * Auto generated method that gets the related <code>ReturnItem</code> by the relation named <code>ReturnItem</code>.
     * @return the <code>ReturnItem</code>
     * @throws RepositoryException if an error occurs
     */
    public ReturnItem getReturnItem() throws RepositoryException {
        if (this.returnItem == null) {
            this.returnItem = getRelatedOne(ReturnItem.class, "ReturnItem");
        }
        return this.returnItem;
    }
    /**
     * Auto generated method that gets the related <code>AcctgTrans</code> by the relation named <code>AcctgTrans</code>.
     * @return the list of <code>AcctgTrans</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends AcctgTrans> getAcctgTranses() throws RepositoryException {
        if (this.acctgTranses == null) {
            this.acctgTranses = getRelated(AcctgTrans.class, "AcctgTrans");
        }
        return this.acctgTranses;
    }
    /**
     * Auto generated method that gets the related <code>InventoryItemDetail</code> by the relation named <code>InventoryItemDetail</code>.
     * @return the list of <code>InventoryItemDetail</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends InventoryItemDetail> getInventoryItemDetails() throws RepositoryException {
        if (this.inventoryItemDetails == null) {
            this.inventoryItemDetails = getRelated(InventoryItemDetail.class, "InventoryItemDetail");
        }
        return this.inventoryItemDetails;
    }
    /**
     * Auto generated method that gets the related <code>OrderItemBilling</code> by the relation named <code>OrderItemBilling</code>.
     * @return the list of <code>OrderItemBilling</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OrderItemBilling> getOrderItemBillings() throws RepositoryException {
        if (this.orderItemBillings == null) {
            this.orderItemBillings = getRelated(OrderItemBilling.class, "OrderItemBilling");
        }
        return this.orderItemBillings;
    }
    /**
     * Auto generated method that gets the related <code>ReturnItemBilling</code> by the relation named <code>ReturnItemBilling</code>.
     * @return the list of <code>ReturnItemBilling</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ReturnItemBilling> getReturnItemBillings() throws RepositoryException {
        if (this.returnItemBillings == null) {
            this.returnItemBillings = getRelated(ReturnItemBilling.class, "ReturnItemBilling");
        }
        return this.returnItemBillings;
    }
    /**
     * Auto generated method that gets the related <code>ShipmentReceiptRole</code> by the relation named <code>ShipmentReceiptRole</code>.
     * @return the list of <code>ShipmentReceiptRole</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ShipmentReceiptRole> getShipmentReceiptRoles() throws RepositoryException {
        if (this.shipmentReceiptRoles == null) {
            this.shipmentReceiptRoles = getRelated(ShipmentReceiptRole.class, "ShipmentReceiptRole");
        }
        return this.shipmentReceiptRoles;
    }

    /**
     * Auto generated value setter.
     * @param inventoryItem the inventoryItem to set
    */
    public void setInventoryItem(InventoryItem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }
    /**
     * Auto generated value setter.
     * @param product the product to set
    */
    public void setProduct(Product product) {
        this.product = product;
    }
    /**
     * Auto generated value setter.
     * @param shipmentPackage the shipmentPackage to set
    */
    public void setShipmentPackage(ShipmentPackage shipmentPackage) {
        this.shipmentPackage = shipmentPackage;
    }
    /**
     * Auto generated value setter.
     * @param orderHeader the orderHeader to set
    */
    public void setOrderHeader(OrderHeader orderHeader) {
        this.orderHeader = orderHeader;
    }
    /**
     * Auto generated value setter.
     * @param orderItem the orderItem to set
    */
    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }
    /**
     * Auto generated value setter.
     * @param rejectionReason the rejectionReason to set
    */
    public void setRejectionReason(RejectionReason rejectionReason) {
        this.rejectionReason = rejectionReason;
    }
    /**
     * Auto generated value setter.
     * @param userLogin the userLogin to set
    */
    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }
    /**
     * Auto generated value setter.
     * @param shipment the shipment to set
    */
    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }
    /**
     * Auto generated value setter.
     * @param returnItem the returnItem to set
    */
    public void setReturnItem(ReturnItem returnItem) {
        this.returnItem = returnItem;
    }
    /**
     * Auto generated value setter.
     * @param acctgTranses the acctgTranses to set
    */
    public void setAcctgTranses(List<AcctgTrans> acctgTranses) {
        this.acctgTranses = acctgTranses;
    }
    /**
     * Auto generated value setter.
     * @param inventoryItemDetails the inventoryItemDetails to set
    */
    public void setInventoryItemDetails(List<InventoryItemDetail> inventoryItemDetails) {
        this.inventoryItemDetails = inventoryItemDetails;
    }
    /**
     * Auto generated value setter.
     * @param orderItemBillings the orderItemBillings to set
    */
    public void setOrderItemBillings(List<OrderItemBilling> orderItemBillings) {
        this.orderItemBillings = orderItemBillings;
    }
    /**
     * Auto generated value setter.
     * @param returnItemBillings the returnItemBillings to set
    */
    public void setReturnItemBillings(List<ReturnItemBilling> returnItemBillings) {
        this.returnItemBillings = returnItemBillings;
    }
    /**
     * Auto generated value setter.
     * @param shipmentReceiptRoles the shipmentReceiptRoles to set
    */
    public void setShipmentReceiptRoles(List<ShipmentReceiptRole> shipmentReceiptRoles) {
        this.shipmentReceiptRoles = shipmentReceiptRoles;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addShipmentReceiptRole(ShipmentReceiptRole shipmentReceiptRole) {
        if (this.shipmentReceiptRoles == null) {
            this.shipmentReceiptRoles = new ArrayList<ShipmentReceiptRole>();
        }
        this.shipmentReceiptRoles.add(shipmentReceiptRole);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeShipmentReceiptRole(ShipmentReceiptRole shipmentReceiptRole) {
        if (this.shipmentReceiptRoles == null) {
            return;
        }
        this.shipmentReceiptRoles.remove(shipmentReceiptRole);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearShipmentReceiptRole() {
        if (this.shipmentReceiptRoles == null) {
            return;
        }
        this.shipmentReceiptRoles.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setReceiptId((String) mapValue.get("receiptId"));
        setInventoryItemId((String) mapValue.get("inventoryItemId"));
        setProductId((String) mapValue.get("productId"));
        setShipmentId((String) mapValue.get("shipmentId"));
        setShipmentPackageSeqId((String) mapValue.get("shipmentPackageSeqId"));
        setOrderId((String) mapValue.get("orderId"));
        setOrderItemSeqId((String) mapValue.get("orderItemSeqId"));
        setReturnId((String) mapValue.get("returnId"));
        setReturnItemSeqId((String) mapValue.get("returnItemSeqId"));
        setRejectionId((String) mapValue.get("rejectionId"));
        setReceivedByUserLoginId((String) mapValue.get("receivedByUserLoginId"));
        setDatetimeReceived((Timestamp) mapValue.get("datetimeReceived"));
        setItemDescription((String) mapValue.get("itemDescription"));
        setQuantityAccepted(convertToBigDecimal(mapValue.get("quantityAccepted")));
        setQuantityRejected(convertToBigDecimal(mapValue.get("quantityRejected")));
        setLastUpdatedStamp((Timestamp) mapValue.get("lastUpdatedStamp"));
        setLastUpdatedTxStamp((Timestamp) mapValue.get("lastUpdatedTxStamp"));
        setCreatedStamp((Timestamp) mapValue.get("createdStamp"));
        setCreatedTxStamp((Timestamp) mapValue.get("createdTxStamp"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("receiptId", getReceiptId());
        mapValue.put("inventoryItemId", getInventoryItemId());
        mapValue.put("productId", getProductId());
        mapValue.put("shipmentId", getShipmentId());
        mapValue.put("shipmentPackageSeqId", getShipmentPackageSeqId());
        mapValue.put("orderId", getOrderId());
        mapValue.put("orderItemSeqId", getOrderItemSeqId());
        mapValue.put("returnId", getReturnId());
        mapValue.put("returnItemSeqId", getReturnItemSeqId());
        mapValue.put("rejectionId", getRejectionId());
        mapValue.put("receivedByUserLoginId", getReceivedByUserLoginId());
        mapValue.put("datetimeReceived", getDatetimeReceived());
        mapValue.put("itemDescription", getItemDescription());
        mapValue.put("quantityAccepted", getQuantityAccepted());
        mapValue.put("quantityRejected", getQuantityRejected());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
