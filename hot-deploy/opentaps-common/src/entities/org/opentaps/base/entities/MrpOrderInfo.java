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
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity MrpOrderInfo.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectMrpOrderInfos", query="SELECT OH.ORDER_ID AS \"orderId\",OH.ORDER_TYPE_ID AS \"orderTypeId\",OH.ORDER_DATE AS \"orderDate\",OH.PRODUCT_STORE_ID AS \"productStoreId\",OH.STATUS_ID AS \"statusId\",OI.ORDER_ITEM_SEQ_ID AS \"orderItemSeqId\",OI.PRODUCT_ID AS \"productId\",OI.QUANTITY AS \"quantity\",OI.CANCEL_QUANTITY AS \"cancelQuantity\",OI.STATUS_ID AS \"statusId\",OI.SHIP_BEFORE_DATE AS \"shipBeforeDate\",OI.SHIP_AFTER_DATE AS \"shipAfterDate\",OI.ESTIMATED_DELIVERY_DATE AS \"estimatedDeliveryDate\",OISG.SHIP_GROUP_SEQ_ID AS \"shipGroupSeqId\",OISG.CONTACT_MECH_ID AS \"contactMechId\",OISG.SHIP_BY_DATE AS \"shipByDate\",OISG.SHIP_AFTER_DATE AS \"shipAfterDate\",OISGIR.QUANTITY AS \"quantity\",OISGIR.RESERVED_DATETIME AS \"reservedDatetime\",OISGIR.SEQUENCE_ID AS \"sequenceId\",II.FACILITY_ID AS \"facilityId\",P.SALES_DISCONTINUATION_DATE AS \"salesDiscontinuationDate\",P.INTRODUCTION_DATE AS \"introductionDate\" FROM ORDER_HEADER OH LEFT JOIN ORDER_ITEM OI ON OH.ORDER_ID = OI.ORDER_ID LEFT JOIN ORDER_ITEM_SHIP_GRP_INV_RES OISGIR ON OI.ORDER_ID = OISGIR.ORDER_ID AND OI.ORDER_ITEM_SEQ_ID = OISGIR.ORDER_ITEM_SEQ_ID INNER JOIN ORDER_ITEM_SHIP_GROUP_ASSOC OISGA ON OI.ORDER_ID = OISGA.ORDER_ID AND OI.ORDER_ITEM_SEQ_ID = OISGA.ORDER_ITEM_SEQ_ID INNER JOIN ORDER_ITEM_SHIP_GROUP OISG ON OISGA.ORDER_ID = OISG.ORDER_ID AND OISGA.SHIP_GROUP_SEQ_ID = OISG.SHIP_GROUP_SEQ_ID LEFT JOIN INVENTORY_ITEM II ON OISGIR.INVENTORY_ITEM_ID = II.INVENTORY_ITEM_ID LEFT JOIN PRODUCT P ON OI.PRODUCT_ID = P.PRODUCT_ID", resultSetMapping="MrpOrderInfoMapping")
@SqlResultSetMapping(name="MrpOrderInfoMapping", entities={
@EntityResult(entityClass=MrpOrderInfo.class, fields = {
@FieldResult(name="orderId", column="orderId")
,@FieldResult(name="orderTypeId", column="orderTypeId")
,@FieldResult(name="orderDate", column="orderDate")
,@FieldResult(name="productStoreId", column="productStoreId")
,@FieldResult(name="orderStatusId", column="orderStatusId")
,@FieldResult(name="orderItemSeqId", column="orderItemSeqId")
,@FieldResult(name="productId", column="productId")
,@FieldResult(name="quantity", column="quantity")
,@FieldResult(name="cancelQuantity", column="cancelQuantity")
,@FieldResult(name="itemStatusId", column="itemStatusId")
,@FieldResult(name="itemShipBeforeDate", column="itemShipBeforeDate")
,@FieldResult(name="itemShipAfterDate", column="itemShipAfterDate")
,@FieldResult(name="itemEstimatedDeliveryDate", column="itemEstimatedDeliveryDate")
,@FieldResult(name="shipGroupSeqId", column="shipGroupSeqId")
,@FieldResult(name="shipGroupContactMechId", column="shipGroupContactMechId")
,@FieldResult(name="shipByDate", column="shipByDate")
,@FieldResult(name="shipAfterDate", column="shipAfterDate")
,@FieldResult(name="quantityReserved", column="quantityReserved")
,@FieldResult(name="reservedDatetime", column="reservedDatetime")
,@FieldResult(name="reserveSequenceId", column="reserveSequenceId")
,@FieldResult(name="facilityId", column="facilityId")
,@FieldResult(name="salesDiscontinuationDate", column="salesDiscontinuationDate")
,@FieldResult(name="introductionDate", column="introductionDate")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class MrpOrderInfo extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("orderId", "OH.ORDER_ID");
        fields.put("orderTypeId", "OH.ORDER_TYPE_ID");
        fields.put("orderDate", "OH.ORDER_DATE");
        fields.put("productStoreId", "OH.PRODUCT_STORE_ID");
        fields.put("orderStatusId", "OH.STATUS_ID");
        fields.put("orderItemSeqId", "OI.ORDER_ITEM_SEQ_ID");
        fields.put("productId", "OI.PRODUCT_ID");
        fields.put("quantity", "OI.QUANTITY");
        fields.put("cancelQuantity", "OI.CANCEL_QUANTITY");
        fields.put("itemStatusId", "OI.STATUS_ID");
        fields.put("itemShipBeforeDate", "OI.SHIP_BEFORE_DATE");
        fields.put("itemShipAfterDate", "OI.SHIP_AFTER_DATE");
        fields.put("itemEstimatedDeliveryDate", "OI.ESTIMATED_DELIVERY_DATE");
        fields.put("shipGroupSeqId", "OISG.SHIP_GROUP_SEQ_ID");
        fields.put("shipGroupContactMechId", "OISG.CONTACT_MECH_ID");
        fields.put("shipByDate", "OISG.SHIP_BY_DATE");
        fields.put("shipAfterDate", "OISG.SHIP_AFTER_DATE");
        fields.put("quantityReserved", "OISGIR.QUANTITY");
        fields.put("reservedDatetime", "OISGIR.RESERVED_DATETIME");
        fields.put("reserveSequenceId", "OISGIR.SEQUENCE_ID");
        fields.put("facilityId", "II.FACILITY_ID");
        fields.put("salesDiscontinuationDate", "P.SALES_DISCONTINUATION_DATE");
        fields.put("introductionDate", "P.INTRODUCTION_DATE");
fieldMapColumns.put("MrpOrderInfo", fields);
}
  public static enum Fields implements EntityFieldInterface<MrpOrderInfo> {
    orderId("orderId"),
    orderTypeId("orderTypeId"),
    orderDate("orderDate"),
    productStoreId("productStoreId"),
    orderStatusId("orderStatusId"),
    orderItemSeqId("orderItemSeqId"),
    productId("productId"),
    quantity("quantity"),
    cancelQuantity("cancelQuantity"),
    itemStatusId("itemStatusId"),
    itemShipBeforeDate("itemShipBeforeDate"),
    itemShipAfterDate("itemShipAfterDate"),
    itemEstimatedDeliveryDate("itemEstimatedDeliveryDate"),
    shipGroupSeqId("shipGroupSeqId"),
    shipGroupContactMechId("shipGroupContactMechId"),
    shipByDate("shipByDate"),
    shipAfterDate("shipAfterDate"),
    quantityReserved("quantityReserved"),
    reservedDatetime("reservedDatetime"),
    reserveSequenceId("reserveSequenceId"),
    facilityId("facilityId"),
    salesDiscontinuationDate("salesDiscontinuationDate"),
    introductionDate("introductionDate");
    protected final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    @Id
   private String orderId;
    
   private String orderTypeId;
    
   private Timestamp orderDate;
    
   private String productStoreId;
    
   private String orderStatusId;
    
   private String orderItemSeqId;
    
   private String productId;
    
   private BigDecimal quantity;
    
   private BigDecimal cancelQuantity;
    
   private String itemStatusId;
    
   private Timestamp itemShipBeforeDate;
    
   private Timestamp itemShipAfterDate;
    
   private Timestamp itemEstimatedDeliveryDate;
    
   private String shipGroupSeqId;
    
   private String shipGroupContactMechId;
    
   private Timestamp shipByDate;
    
   private Timestamp shipAfterDate;
    
   private BigDecimal quantityReserved;
    
   private Timestamp reservedDatetime;
    
   private Long reserveSequenceId;
    
   private String facilityId;
    
   private Timestamp salesDiscontinuationDate;
    
   private Timestamp introductionDate;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ORDER_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected OrderType orderType = null;
   private transient OrderItem orderItem = null;

  /**
   * Default constructor.
   */
  public MrpOrderInfo() {
      super();
      this.baseEntityName = "MrpOrderInfo";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("orderId");this.primaryKeyNames.add("orderItemSeqId");this.primaryKeyNames.add("shipGroupSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("orderId");this.allFieldsNames.add("orderTypeId");this.allFieldsNames.add("orderDate");this.allFieldsNames.add("productStoreId");this.allFieldsNames.add("orderStatusId");this.allFieldsNames.add("orderItemSeqId");this.allFieldsNames.add("productId");this.allFieldsNames.add("quantity");this.allFieldsNames.add("cancelQuantity");this.allFieldsNames.add("itemStatusId");this.allFieldsNames.add("itemShipBeforeDate");this.allFieldsNames.add("itemShipAfterDate");this.allFieldsNames.add("itemEstimatedDeliveryDate");this.allFieldsNames.add("shipGroupSeqId");this.allFieldsNames.add("shipGroupContactMechId");this.allFieldsNames.add("shipByDate");this.allFieldsNames.add("shipAfterDate");this.allFieldsNames.add("quantityReserved");this.allFieldsNames.add("reservedDatetime");this.allFieldsNames.add("reserveSequenceId");this.allFieldsNames.add("facilityId");this.allFieldsNames.add("salesDiscontinuationDate");this.allFieldsNames.add("introductionDate");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public MrpOrderInfo(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
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
     * @param productStoreId the productStoreId to set
     */
    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }
    /**
     * Auto generated value setter.
     * @param orderStatusId the orderStatusId to set
     */
    public void setOrderStatusId(String orderStatusId) {
        this.orderStatusId = orderStatusId;
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
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
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
     * @param cancelQuantity the cancelQuantity to set
     */
    public void setCancelQuantity(BigDecimal cancelQuantity) {
        this.cancelQuantity = cancelQuantity;
    }
    /**
     * Auto generated value setter.
     * @param itemStatusId the itemStatusId to set
     */
    public void setItemStatusId(String itemStatusId) {
        this.itemStatusId = itemStatusId;
    }
    /**
     * Auto generated value setter.
     * @param itemShipBeforeDate the itemShipBeforeDate to set
     */
    public void setItemShipBeforeDate(Timestamp itemShipBeforeDate) {
        this.itemShipBeforeDate = itemShipBeforeDate;
    }
    /**
     * Auto generated value setter.
     * @param itemShipAfterDate the itemShipAfterDate to set
     */
    public void setItemShipAfterDate(Timestamp itemShipAfterDate) {
        this.itemShipAfterDate = itemShipAfterDate;
    }
    /**
     * Auto generated value setter.
     * @param itemEstimatedDeliveryDate the itemEstimatedDeliveryDate to set
     */
    public void setItemEstimatedDeliveryDate(Timestamp itemEstimatedDeliveryDate) {
        this.itemEstimatedDeliveryDate = itemEstimatedDeliveryDate;
    }
    /**
     * Auto generated value setter.
     * @param shipGroupSeqId the shipGroupSeqId to set
     */
    public void setShipGroupSeqId(String shipGroupSeqId) {
        this.shipGroupSeqId = shipGroupSeqId;
    }
    /**
     * Auto generated value setter.
     * @param shipGroupContactMechId the shipGroupContactMechId to set
     */
    public void setShipGroupContactMechId(String shipGroupContactMechId) {
        this.shipGroupContactMechId = shipGroupContactMechId;
    }
    /**
     * Auto generated value setter.
     * @param shipByDate the shipByDate to set
     */
    public void setShipByDate(Timestamp shipByDate) {
        this.shipByDate = shipByDate;
    }
    /**
     * Auto generated value setter.
     * @param shipAfterDate the shipAfterDate to set
     */
    public void setShipAfterDate(Timestamp shipAfterDate) {
        this.shipAfterDate = shipAfterDate;
    }
    /**
     * Auto generated value setter.
     * @param quantityReserved the quantityReserved to set
     */
    public void setQuantityReserved(BigDecimal quantityReserved) {
        this.quantityReserved = quantityReserved;
    }
    /**
     * Auto generated value setter.
     * @param reservedDatetime the reservedDatetime to set
     */
    public void setReservedDatetime(Timestamp reservedDatetime) {
        this.reservedDatetime = reservedDatetime;
    }
    /**
     * Auto generated value setter.
     * @param reserveSequenceId the reserveSequenceId to set
     */
    public void setReserveSequenceId(Long reserveSequenceId) {
        this.reserveSequenceId = reserveSequenceId;
    }
    /**
     * Auto generated value setter.
     * @param facilityId the facilityId to set
     */
    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
    /**
     * Auto generated value setter.
     * @param salesDiscontinuationDate the salesDiscontinuationDate to set
     */
    public void setSalesDiscontinuationDate(Timestamp salesDiscontinuationDate) {
        this.salesDiscontinuationDate = salesDiscontinuationDate;
    }
    /**
     * Auto generated value setter.
     * @param introductionDate the introductionDate to set
     */
    public void setIntroductionDate(Timestamp introductionDate) {
        this.introductionDate = introductionDate;
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
    public String getProductStoreId() {
        return this.productStoreId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderStatusId() {
        return this.orderStatusId;
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
    public String getProductId() {
        return this.productId;
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
    public BigDecimal getCancelQuantity() {
        return this.cancelQuantity;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getItemStatusId() {
        return this.itemStatusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getItemShipBeforeDate() {
        return this.itemShipBeforeDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getItemShipAfterDate() {
        return this.itemShipAfterDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getItemEstimatedDeliveryDate() {
        return this.itemEstimatedDeliveryDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShipGroupSeqId() {
        return this.shipGroupSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShipGroupContactMechId() {
        return this.shipGroupContactMechId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getShipByDate() {
        return this.shipByDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getShipAfterDate() {
        return this.shipAfterDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantityReserved() {
        return this.quantityReserved;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getReservedDatetime() {
        return this.reservedDatetime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getReserveSequenceId() {
        return this.reserveSequenceId;
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
     * @return <code>Timestamp</code>
     */
    public Timestamp getSalesDiscontinuationDate() {
        return this.salesDiscontinuationDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getIntroductionDate() {
        return this.introductionDate;
    }

    /**
     * Auto generated method that gets the related <code>OrderType</code> by the relation named <code>OrderType</code>.
     * @return the <code>OrderType</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderType getOrderType() throws RepositoryException {
        if (this.orderType == null) {
            this.orderType = getRelatedOne(OrderType.class, "OrderType");
        }
        return this.orderType;
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
     * Auto generated value setter.
     * @param orderType the orderType to set
    */
    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }
    /**
     * Auto generated value setter.
     * @param orderItem the orderItem to set
    */
    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setOrderId((String) mapValue.get("orderId"));
        setOrderTypeId((String) mapValue.get("orderTypeId"));
        setOrderDate((Timestamp) mapValue.get("orderDate"));
        setProductStoreId((String) mapValue.get("productStoreId"));
        setOrderStatusId((String) mapValue.get("orderStatusId"));
        setOrderItemSeqId((String) mapValue.get("orderItemSeqId"));
        setProductId((String) mapValue.get("productId"));
        setQuantity(convertToBigDecimal(mapValue.get("quantity")));
        setCancelQuantity(convertToBigDecimal(mapValue.get("cancelQuantity")));
        setItemStatusId((String) mapValue.get("itemStatusId"));
        setItemShipBeforeDate((Timestamp) mapValue.get("itemShipBeforeDate"));
        setItemShipAfterDate((Timestamp) mapValue.get("itemShipAfterDate"));
        setItemEstimatedDeliveryDate((Timestamp) mapValue.get("itemEstimatedDeliveryDate"));
        setShipGroupSeqId((String) mapValue.get("shipGroupSeqId"));
        setShipGroupContactMechId((String) mapValue.get("shipGroupContactMechId"));
        setShipByDate((Timestamp) mapValue.get("shipByDate"));
        setShipAfterDate((Timestamp) mapValue.get("shipAfterDate"));
        setQuantityReserved(convertToBigDecimal(mapValue.get("quantityReserved")));
        setReservedDatetime((Timestamp) mapValue.get("reservedDatetime"));
        setReserveSequenceId((Long) mapValue.get("reserveSequenceId"));
        setFacilityId((String) mapValue.get("facilityId"));
        setSalesDiscontinuationDate((Timestamp) mapValue.get("salesDiscontinuationDate"));
        setIntroductionDate((Timestamp) mapValue.get("introductionDate"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("orderId", getOrderId());
        mapValue.put("orderTypeId", getOrderTypeId());
        mapValue.put("orderDate", getOrderDate());
        mapValue.put("productStoreId", getProductStoreId());
        mapValue.put("orderStatusId", getOrderStatusId());
        mapValue.put("orderItemSeqId", getOrderItemSeqId());
        mapValue.put("productId", getProductId());
        mapValue.put("quantity", getQuantity());
        mapValue.put("cancelQuantity", getCancelQuantity());
        mapValue.put("itemStatusId", getItemStatusId());
        mapValue.put("itemShipBeforeDate", getItemShipBeforeDate());
        mapValue.put("itemShipAfterDate", getItemShipAfterDate());
        mapValue.put("itemEstimatedDeliveryDate", getItemEstimatedDeliveryDate());
        mapValue.put("shipGroupSeqId", getShipGroupSeqId());
        mapValue.put("shipGroupContactMechId", getShipGroupContactMechId());
        mapValue.put("shipByDate", getShipByDate());
        mapValue.put("shipAfterDate", getShipAfterDate());
        mapValue.put("quantityReserved", getQuantityReserved());
        mapValue.put("reservedDatetime", getReservedDatetime());
        mapValue.put("reserveSequenceId", getReserveSequenceId());
        mapValue.put("facilityId", getFacilityId());
        mapValue.put("salesDiscontinuationDate", getSalesDiscontinuationDate());
        mapValue.put("introductionDate", getIntroductionDate());
        return mapValue;
    }


}
