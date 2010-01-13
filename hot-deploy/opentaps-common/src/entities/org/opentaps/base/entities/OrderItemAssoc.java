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
 * Auto generated base entity OrderItemAssoc.
 */
@javax.persistence.Entity
@Table(name="ORDER_ITEM_ASSOC")
public class OrderItemAssoc extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("orderId", "ORDER_ID");
        fields.put("orderItemSeqId", "ORDER_ITEM_SEQ_ID");
        fields.put("shipGroupSeqId", "SHIP_GROUP_SEQ_ID");
        fields.put("toOrderId", "TO_ORDER_ID");
        fields.put("toOrderItemSeqId", "TO_ORDER_ITEM_SEQ_ID");
        fields.put("toShipGroupSeqId", "TO_SHIP_GROUP_SEQ_ID");
        fields.put("orderItemAssocTypeId", "ORDER_ITEM_ASSOC_TYPE_ID");
        fields.put("quantity", "QUANTITY");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("OrderItemAssoc", fields);
}
  public static enum Fields implements EntityFieldInterface<OrderItemAssoc> {
    orderId("orderId"),
    orderItemSeqId("orderItemSeqId"),
    shipGroupSeqId("shipGroupSeqId"),
    toOrderId("toOrderId"),
    toOrderItemSeqId("toOrderItemSeqId"),
    toShipGroupSeqId("toShipGroupSeqId"),
    orderItemAssocTypeId("orderItemAssocTypeId"),
    quantity("quantity"),
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

   @EmbeddedId

   @FieldBridge(impl = org.opentaps.base.entities.bridge.OrderItemAssocPkBridge.class)
     protected OrderItemAssocPk id = new OrderItemAssocPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>OrderItemAssocPk</code>
     */
      public OrderItemAssocPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>OrderItemAssocPk</code> value to set
    */   
      public void setId(OrderItemAssocPk id) {
         this.id = id;
      }
   @Column(name="QUANTITY")
   protected BigDecimal quantity;
   @Column(name="LAST_UPDATED_STAMP")
   protected Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   protected Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   protected Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   protected Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ORDER_ITEM_ASSOC_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected OrderItemAssocType orderItemAssocType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ORDER_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected OrderHeader fromOrderHeader = null;
   private transient OrderItem fromOrderItem = null;
   private transient OrderItemShipGroupAssoc fromOrderItemShipGroupAssoc = null;
   private transient OrderItemShipGroup fromOrderItemShipGroup = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="TO_ORDER_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected OrderHeader toOrderHeader = null;
   private transient OrderItem toOrderItem = null;
   private transient OrderItemShipGroupAssoc toOrderItemShipGroupAssoc = null;
   private transient OrderItemShipGroup toOrderItemShipGroup = null;

  /**
   * Default constructor.
   */
  public OrderItemAssoc() {
      super();
      this.baseEntityName = "OrderItemAssoc";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("orderId");this.primaryKeyNames.add("orderItemSeqId");this.primaryKeyNames.add("shipGroupSeqId");this.primaryKeyNames.add("toOrderId");this.primaryKeyNames.add("toOrderItemSeqId");this.primaryKeyNames.add("toShipGroupSeqId");this.primaryKeyNames.add("orderItemAssocTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("orderId");this.allFieldsNames.add("orderItemSeqId");this.allFieldsNames.add("shipGroupSeqId");this.allFieldsNames.add("toOrderId");this.allFieldsNames.add("toOrderItemSeqId");this.allFieldsNames.add("toShipGroupSeqId");this.allFieldsNames.add("orderItemAssocTypeId");this.allFieldsNames.add("quantity");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public OrderItemAssoc(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        id.setOrderId(orderId);
    }
    /**
     * Auto generated value setter.
     * @param orderItemSeqId the orderItemSeqId to set
     */
    public void setOrderItemSeqId(String orderItemSeqId) {
        id.setOrderItemSeqId(orderItemSeqId);
    }
    /**
     * Auto generated value setter.
     * @param shipGroupSeqId the shipGroupSeqId to set
     */
    public void setShipGroupSeqId(String shipGroupSeqId) {
        id.setShipGroupSeqId(shipGroupSeqId);
    }
    /**
     * Auto generated value setter.
     * @param toOrderId the toOrderId to set
     */
    public void setToOrderId(String toOrderId) {
        id.setToOrderId(toOrderId);
    }
    /**
     * Auto generated value setter.
     * @param toOrderItemSeqId the toOrderItemSeqId to set
     */
    public void setToOrderItemSeqId(String toOrderItemSeqId) {
        id.setToOrderItemSeqId(toOrderItemSeqId);
    }
    /**
     * Auto generated value setter.
     * @param toShipGroupSeqId the toShipGroupSeqId to set
     */
    public void setToShipGroupSeqId(String toShipGroupSeqId) {
        id.setToShipGroupSeqId(toShipGroupSeqId);
    }
    /**
     * Auto generated value setter.
     * @param orderItemAssocTypeId the orderItemAssocTypeId to set
     */
    public void setOrderItemAssocTypeId(String orderItemAssocTypeId) {
        id.setOrderItemAssocTypeId(orderItemAssocTypeId);
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
    public String getOrderId() {
        return this.id.getOrderId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderItemSeqId() {
        return this.id.getOrderItemSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShipGroupSeqId() {
        return this.id.getShipGroupSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getToOrderId() {
        return this.id.getToOrderId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getToOrderItemSeqId() {
        return this.id.getToOrderItemSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getToShipGroupSeqId() {
        return this.id.getToShipGroupSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderItemAssocTypeId() {
        return this.id.getOrderItemAssocTypeId();
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
     * Auto generated method that gets the related <code>OrderItemAssocType</code> by the relation named <code>OrderItemAssocType</code>.
     * @return the <code>OrderItemAssocType</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderItemAssocType getOrderItemAssocType() throws RepositoryException {
        if (this.orderItemAssocType == null) {
            this.orderItemAssocType = getRelatedOne(OrderItemAssocType.class, "OrderItemAssocType");
        }
        return this.orderItemAssocType;
    }
    /**
     * Auto generated method that gets the related <code>OrderHeader</code> by the relation named <code>FromOrderHeader</code>.
     * @return the <code>OrderHeader</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderHeader getFromOrderHeader() throws RepositoryException {
        if (this.fromOrderHeader == null) {
            this.fromOrderHeader = getRelatedOne(OrderHeader.class, "FromOrderHeader");
        }
        return this.fromOrderHeader;
    }
    /**
     * Auto generated method that gets the related <code>OrderItem</code> by the relation named <code>FromOrderItem</code>.
     * @return the <code>OrderItem</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderItem getFromOrderItem() throws RepositoryException {
        if (this.fromOrderItem == null) {
            this.fromOrderItem = getRelatedOne(OrderItem.class, "FromOrderItem");
        }
        return this.fromOrderItem;
    }
    /**
     * Auto generated method that gets the related <code>OrderItemShipGroupAssoc</code> by the relation named <code>FromOrderItemShipGroupAssoc</code>.
     * @return the <code>OrderItemShipGroupAssoc</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderItemShipGroupAssoc getFromOrderItemShipGroupAssoc() throws RepositoryException {
        if (this.fromOrderItemShipGroupAssoc == null) {
            this.fromOrderItemShipGroupAssoc = getRelatedOne(OrderItemShipGroupAssoc.class, "FromOrderItemShipGroupAssoc");
        }
        return this.fromOrderItemShipGroupAssoc;
    }
    /**
     * Auto generated method that gets the related <code>OrderItemShipGroup</code> by the relation named <code>FromOrderItemShipGroup</code>.
     * @return the <code>OrderItemShipGroup</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderItemShipGroup getFromOrderItemShipGroup() throws RepositoryException {
        if (this.fromOrderItemShipGroup == null) {
            this.fromOrderItemShipGroup = getRelatedOne(OrderItemShipGroup.class, "FromOrderItemShipGroup");
        }
        return this.fromOrderItemShipGroup;
    }
    /**
     * Auto generated method that gets the related <code>OrderHeader</code> by the relation named <code>ToOrderHeader</code>.
     * @return the <code>OrderHeader</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderHeader getToOrderHeader() throws RepositoryException {
        if (this.toOrderHeader == null) {
            this.toOrderHeader = getRelatedOne(OrderHeader.class, "ToOrderHeader");
        }
        return this.toOrderHeader;
    }
    /**
     * Auto generated method that gets the related <code>OrderItem</code> by the relation named <code>ToOrderItem</code>.
     * @return the <code>OrderItem</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderItem getToOrderItem() throws RepositoryException {
        if (this.toOrderItem == null) {
            this.toOrderItem = getRelatedOne(OrderItem.class, "ToOrderItem");
        }
        return this.toOrderItem;
    }
    /**
     * Auto generated method that gets the related <code>OrderItemShipGroupAssoc</code> by the relation named <code>ToOrderItemShipGroupAssoc</code>.
     * @return the <code>OrderItemShipGroupAssoc</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderItemShipGroupAssoc getToOrderItemShipGroupAssoc() throws RepositoryException {
        if (this.toOrderItemShipGroupAssoc == null) {
            this.toOrderItemShipGroupAssoc = getRelatedOne(OrderItemShipGroupAssoc.class, "ToOrderItemShipGroupAssoc");
        }
        return this.toOrderItemShipGroupAssoc;
    }
    /**
     * Auto generated method that gets the related <code>OrderItemShipGroup</code> by the relation named <code>ToOrderItemShipGroup</code>.
     * @return the <code>OrderItemShipGroup</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderItemShipGroup getToOrderItemShipGroup() throws RepositoryException {
        if (this.toOrderItemShipGroup == null) {
            this.toOrderItemShipGroup = getRelatedOne(OrderItemShipGroup.class, "ToOrderItemShipGroup");
        }
        return this.toOrderItemShipGroup;
    }

    /**
     * Auto generated value setter.
     * @param orderItemAssocType the orderItemAssocType to set
    */
    public void setOrderItemAssocType(OrderItemAssocType orderItemAssocType) {
        this.orderItemAssocType = orderItemAssocType;
    }
    /**
     * Auto generated value setter.
     * @param fromOrderHeader the fromOrderHeader to set
    */
    public void setFromOrderHeader(OrderHeader fromOrderHeader) {
        this.fromOrderHeader = fromOrderHeader;
    }
    /**
     * Auto generated value setter.
     * @param fromOrderItem the fromOrderItem to set
    */
    public void setFromOrderItem(OrderItem fromOrderItem) {
        this.fromOrderItem = fromOrderItem;
    }
    /**
     * Auto generated value setter.
     * @param fromOrderItemShipGroupAssoc the fromOrderItemShipGroupAssoc to set
    */
    public void setFromOrderItemShipGroupAssoc(OrderItemShipGroupAssoc fromOrderItemShipGroupAssoc) {
        this.fromOrderItemShipGroupAssoc = fromOrderItemShipGroupAssoc;
    }
    /**
     * Auto generated value setter.
     * @param fromOrderItemShipGroup the fromOrderItemShipGroup to set
    */
    public void setFromOrderItemShipGroup(OrderItemShipGroup fromOrderItemShipGroup) {
        this.fromOrderItemShipGroup = fromOrderItemShipGroup;
    }
    /**
     * Auto generated value setter.
     * @param toOrderHeader the toOrderHeader to set
    */
    public void setToOrderHeader(OrderHeader toOrderHeader) {
        this.toOrderHeader = toOrderHeader;
    }
    /**
     * Auto generated value setter.
     * @param toOrderItem the toOrderItem to set
    */
    public void setToOrderItem(OrderItem toOrderItem) {
        this.toOrderItem = toOrderItem;
    }
    /**
     * Auto generated value setter.
     * @param toOrderItemShipGroupAssoc the toOrderItemShipGroupAssoc to set
    */
    public void setToOrderItemShipGroupAssoc(OrderItemShipGroupAssoc toOrderItemShipGroupAssoc) {
        this.toOrderItemShipGroupAssoc = toOrderItemShipGroupAssoc;
    }
    /**
     * Auto generated value setter.
     * @param toOrderItemShipGroup the toOrderItemShipGroup to set
    */
    public void setToOrderItemShipGroup(OrderItemShipGroup toOrderItemShipGroup) {
        this.toOrderItemShipGroup = toOrderItemShipGroup;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setOrderId((String) mapValue.get("orderId"));
        setOrderItemSeqId((String) mapValue.get("orderItemSeqId"));
        setShipGroupSeqId((String) mapValue.get("shipGroupSeqId"));
        setToOrderId((String) mapValue.get("toOrderId"));
        setToOrderItemSeqId((String) mapValue.get("toOrderItemSeqId"));
        setToShipGroupSeqId((String) mapValue.get("toShipGroupSeqId"));
        setOrderItemAssocTypeId((String) mapValue.get("orderItemAssocTypeId"));
        setQuantity(convertToBigDecimal(mapValue.get("quantity")));
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
        mapValue.put("orderId", getOrderId());
        mapValue.put("orderItemSeqId", getOrderItemSeqId());
        mapValue.put("shipGroupSeqId", getShipGroupSeqId());
        mapValue.put("toOrderId", getToOrderId());
        mapValue.put("toOrderItemSeqId", getToOrderItemSeqId());
        mapValue.put("toShipGroupSeqId", getToShipGroupSeqId());
        mapValue.put("orderItemAssocTypeId", getOrderItemAssocTypeId());
        mapValue.put("quantity", getQuantity());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
