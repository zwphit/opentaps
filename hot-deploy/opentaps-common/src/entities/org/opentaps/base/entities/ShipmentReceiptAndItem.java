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
 * Auto generated base entity ShipmentReceiptAndItem.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectShipmentReceiptAndItems", query="SELECT II.FACILITY_ID AS \"facilityId\",II.LOCATION_SEQ_ID AS \"locationSeqId\",II.QUANTITY_ON_HAND_TOTAL AS \"quantityOnHandTotal\",II.AVAILABLE_TO_PROMISE_TOTAL AS \"availableToPromiseTotal\",II.UNIT_COST AS \"unitCost\",SR.RECEIPT_ID AS \"receiptId\",SR.INVENTORY_ITEM_ID AS \"inventoryItemId\",SR.PRODUCT_ID AS \"productId\",SR.SHIPMENT_ID AS \"shipmentId\",SR.SHIPMENT_PACKAGE_SEQ_ID AS \"shipmentPackageSeqId\",SR.ORDER_ID AS \"orderId\",SR.ORDER_ITEM_SEQ_ID AS \"orderItemSeqId\",SR.RETURN_ID AS \"returnId\",SR.RETURN_ITEM_SEQ_ID AS \"returnItemSeqId\",SR.REJECTION_ID AS \"rejectionId\",SR.RECEIVED_BY_USER_LOGIN_ID AS \"receivedByUserLoginId\",SR.DATETIME_RECEIVED AS \"datetimeReceived\",SR.ITEM_DESCRIPTION AS \"itemDescription\",SR.QUANTITY_ACCEPTED AS \"quantityAccepted\",SR.QUANTITY_REJECTED AS \"quantityRejected\" FROM SHIPMENT_RECEIPT SR INNER JOIN INVENTORY_ITEM II ON SR.INVENTORY_ITEM_ID = II.INVENTORY_ITEM_ID", resultSetMapping="ShipmentReceiptAndItemMapping")
@SqlResultSetMapping(name="ShipmentReceiptAndItemMapping", entities={
@EntityResult(entityClass=ShipmentReceiptAndItem.class, fields = {
@FieldResult(name="facilityId", column="facilityId")
,@FieldResult(name="locationSeqId", column="locationSeqId")
,@FieldResult(name="quantityOnHandTotal", column="quantityOnHandTotal")
,@FieldResult(name="availableToPromiseTotal", column="availableToPromiseTotal")
,@FieldResult(name="unitCost", column="unitCost")
,@FieldResult(name="receiptId", column="receiptId")
,@FieldResult(name="inventoryItemId", column="inventoryItemId")
,@FieldResult(name="productId", column="productId")
,@FieldResult(name="shipmentId", column="shipmentId")
,@FieldResult(name="shipmentPackageSeqId", column="shipmentPackageSeqId")
,@FieldResult(name="orderId", column="orderId")
,@FieldResult(name="orderItemSeqId", column="orderItemSeqId")
,@FieldResult(name="returnId", column="returnId")
,@FieldResult(name="returnItemSeqId", column="returnItemSeqId")
,@FieldResult(name="rejectionId", column="rejectionId")
,@FieldResult(name="receivedByUserLoginId", column="receivedByUserLoginId")
,@FieldResult(name="datetimeReceived", column="datetimeReceived")
,@FieldResult(name="itemDescription", column="itemDescription")
,@FieldResult(name="quantityAccepted", column="quantityAccepted")
,@FieldResult(name="quantityRejected", column="quantityRejected")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class ShipmentReceiptAndItem extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("facilityId", "II.FACILITY_ID");
        fields.put("locationSeqId", "II.LOCATION_SEQ_ID");
        fields.put("quantityOnHandTotal", "II.QUANTITY_ON_HAND_TOTAL");
        fields.put("availableToPromiseTotal", "II.AVAILABLE_TO_PROMISE_TOTAL");
        fields.put("unitCost", "II.UNIT_COST");
        fields.put("receiptId", "SR.RECEIPT_ID");
        fields.put("inventoryItemId", "SR.INVENTORY_ITEM_ID");
        fields.put("productId", "SR.PRODUCT_ID");
        fields.put("shipmentId", "SR.SHIPMENT_ID");
        fields.put("shipmentPackageSeqId", "SR.SHIPMENT_PACKAGE_SEQ_ID");
        fields.put("orderId", "SR.ORDER_ID");
        fields.put("orderItemSeqId", "SR.ORDER_ITEM_SEQ_ID");
        fields.put("returnId", "SR.RETURN_ID");
        fields.put("returnItemSeqId", "SR.RETURN_ITEM_SEQ_ID");
        fields.put("rejectionId", "SR.REJECTION_ID");
        fields.put("receivedByUserLoginId", "SR.RECEIVED_BY_USER_LOGIN_ID");
        fields.put("datetimeReceived", "SR.DATETIME_RECEIVED");
        fields.put("itemDescription", "SR.ITEM_DESCRIPTION");
        fields.put("quantityAccepted", "SR.QUANTITY_ACCEPTED");
        fields.put("quantityRejected", "SR.QUANTITY_REJECTED");
fieldMapColumns.put("ShipmentReceiptAndItem", fields);
}
  public static enum Fields implements EntityFieldInterface<ShipmentReceiptAndItem> {
    facilityId("facilityId"),
    locationSeqId("locationSeqId"),
    quantityOnHandTotal("quantityOnHandTotal"),
    availableToPromiseTotal("availableToPromiseTotal"),
    unitCost("unitCost"),
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
    quantityRejected("quantityRejected");
    protected final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private String facilityId;
    
   private String locationSeqId;
    
   private BigDecimal quantityOnHandTotal;
    
   private BigDecimal availableToPromiseTotal;
    
   private BigDecimal unitCost;
    @Id
   private String receiptId;
    
   private String inventoryItemId;
    
   private String productId;
    
   private String shipmentId;
    
   private String shipmentPackageSeqId;
    
   private String orderId;
    
   private String orderItemSeqId;
    
   private String returnId;
    
   private String returnItemSeqId;
    
   private String rejectionId;
    
   private String receivedByUserLoginId;
    
   private Timestamp datetimeReceived;
    
   private String itemDescription;
    
   private BigDecimal quantityAccepted;
    
   private BigDecimal quantityRejected;

  /**
   * Default constructor.
   */
  public ShipmentReceiptAndItem() {
      super();
      this.baseEntityName = "ShipmentReceiptAndItem";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("receiptId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("facilityId");this.allFieldsNames.add("locationSeqId");this.allFieldsNames.add("quantityOnHandTotal");this.allFieldsNames.add("availableToPromiseTotal");this.allFieldsNames.add("unitCost");this.allFieldsNames.add("receiptId");this.allFieldsNames.add("inventoryItemId");this.allFieldsNames.add("productId");this.allFieldsNames.add("shipmentId");this.allFieldsNames.add("shipmentPackageSeqId");this.allFieldsNames.add("orderId");this.allFieldsNames.add("orderItemSeqId");this.allFieldsNames.add("returnId");this.allFieldsNames.add("returnItemSeqId");this.allFieldsNames.add("rejectionId");this.allFieldsNames.add("receivedByUserLoginId");this.allFieldsNames.add("datetimeReceived");this.allFieldsNames.add("itemDescription");this.allFieldsNames.add("quantityAccepted");this.allFieldsNames.add("quantityRejected");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ShipmentReceiptAndItem(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param facilityId the facilityId to set
     */
    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
    /**
     * Auto generated value setter.
     * @param locationSeqId the locationSeqId to set
     */
    public void setLocationSeqId(String locationSeqId) {
        this.locationSeqId = locationSeqId;
    }
    /**
     * Auto generated value setter.
     * @param quantityOnHandTotal the quantityOnHandTotal to set
     */
    public void setQuantityOnHandTotal(BigDecimal quantityOnHandTotal) {
        this.quantityOnHandTotal = quantityOnHandTotal;
    }
    /**
     * Auto generated value setter.
     * @param availableToPromiseTotal the availableToPromiseTotal to set
     */
    public void setAvailableToPromiseTotal(BigDecimal availableToPromiseTotal) {
        this.availableToPromiseTotal = availableToPromiseTotal;
    }
    /**
     * Auto generated value setter.
     * @param unitCost the unitCost to set
     */
    public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
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
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFacilityId() {
        return this.facilityId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLocationSeqId() {
        return this.locationSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantityOnHandTotal() {
        return this.quantityOnHandTotal;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getAvailableToPromiseTotal() {
        return this.availableToPromiseTotal;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getUnitCost() {
        return this.unitCost;
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




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setFacilityId((String) mapValue.get("facilityId"));
        setLocationSeqId((String) mapValue.get("locationSeqId"));
        setQuantityOnHandTotal(convertToBigDecimal(mapValue.get("quantityOnHandTotal")));
        setAvailableToPromiseTotal(convertToBigDecimal(mapValue.get("availableToPromiseTotal")));
        setUnitCost(convertToBigDecimal(mapValue.get("unitCost")));
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
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("facilityId", getFacilityId());
        mapValue.put("locationSeqId", getLocationSeqId());
        mapValue.put("quantityOnHandTotal", getQuantityOnHandTotal());
        mapValue.put("availableToPromiseTotal", getAvailableToPromiseTotal());
        mapValue.put("unitCost", getUnitCost());
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
        return mapValue;
    }


}
