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
import java.sql.Timestamp;

/**
 * Auto generated base entity OrderAdjustmentTypeAttr.
 */
@javax.persistence.Entity
@Table(name="ORDER_ADJUSTMENT_TYPE_ATTR")
public class OrderAdjustmentTypeAttr extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("orderAdjustmentTypeId", "ORDER_ADJUSTMENT_TYPE_ID");
        fields.put("attrName", "ATTR_NAME");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("OrderAdjustmentTypeAttr", fields);
}
  public static enum Fields implements EntityFieldInterface<OrderAdjustmentTypeAttr> {
    orderAdjustmentTypeId("orderAdjustmentTypeId"),
    attrName("attrName"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.OrderAdjustmentTypeAttrPkBridge.class)
     protected OrderAdjustmentTypeAttrPk id = new OrderAdjustmentTypeAttrPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>OrderAdjustmentTypeAttrPk</code>
     */
      public OrderAdjustmentTypeAttrPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>OrderAdjustmentTypeAttrPk</code> value to set
    */   
      public void setId(OrderAdjustmentTypeAttrPk id) {
         this.id = id;
      }
   @Column(name="LAST_UPDATED_STAMP")
   protected Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   protected Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   protected Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   protected Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ORDER_ADJUSTMENT_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected OrderAdjustmentType orderAdjustmentType = null;
   protected transient List<OrderAdjustmentAttribute> orderAdjustmentAttributes = null;
   protected transient List<OrderAdjustment> orderAdjustments = null;

  /**
   * Default constructor.
   */
  public OrderAdjustmentTypeAttr() {
      super();
      this.baseEntityName = "OrderAdjustmentTypeAttr";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("orderAdjustmentTypeId");this.primaryKeyNames.add("attrName");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("orderAdjustmentTypeId");this.allFieldsNames.add("attrName");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public OrderAdjustmentTypeAttr(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param orderAdjustmentTypeId the orderAdjustmentTypeId to set
     */
    public void setOrderAdjustmentTypeId(String orderAdjustmentTypeId) {
        id.setOrderAdjustmentTypeId(orderAdjustmentTypeId);
    }
    /**
     * Auto generated value setter.
     * @param attrName the attrName to set
     */
    public void setAttrName(String attrName) {
        id.setAttrName(attrName);
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
    public String getOrderAdjustmentTypeId() {
        return this.id.getOrderAdjustmentTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAttrName() {
        return this.id.getAttrName();
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
     * Auto generated method that gets the related <code>OrderAdjustmentType</code> by the relation named <code>OrderAdjustmentType</code>.
     * @return the <code>OrderAdjustmentType</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderAdjustmentType getOrderAdjustmentType() throws RepositoryException {
        if (this.orderAdjustmentType == null) {
            this.orderAdjustmentType = getRelatedOne(OrderAdjustmentType.class, "OrderAdjustmentType");
        }
        return this.orderAdjustmentType;
    }
    /**
     * Auto generated method that gets the related <code>OrderAdjustmentAttribute</code> by the relation named <code>OrderAdjustmentAttribute</code>.
     * @return the list of <code>OrderAdjustmentAttribute</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OrderAdjustmentAttribute> getOrderAdjustmentAttributes() throws RepositoryException {
        if (this.orderAdjustmentAttributes == null) {
            this.orderAdjustmentAttributes = getRelated(OrderAdjustmentAttribute.class, "OrderAdjustmentAttribute");
        }
        return this.orderAdjustmentAttributes;
    }
    /**
     * Auto generated method that gets the related <code>OrderAdjustment</code> by the relation named <code>OrderAdjustment</code>.
     * @return the list of <code>OrderAdjustment</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OrderAdjustment> getOrderAdjustments() throws RepositoryException {
        if (this.orderAdjustments == null) {
            this.orderAdjustments = getRelated(OrderAdjustment.class, "OrderAdjustment");
        }
        return this.orderAdjustments;
    }

    /**
     * Auto generated value setter.
     * @param orderAdjustmentType the orderAdjustmentType to set
    */
    public void setOrderAdjustmentType(OrderAdjustmentType orderAdjustmentType) {
        this.orderAdjustmentType = orderAdjustmentType;
    }
    /**
     * Auto generated value setter.
     * @param orderAdjustmentAttributes the orderAdjustmentAttributes to set
    */
    public void setOrderAdjustmentAttributes(List<OrderAdjustmentAttribute> orderAdjustmentAttributes) {
        this.orderAdjustmentAttributes = orderAdjustmentAttributes;
    }
    /**
     * Auto generated value setter.
     * @param orderAdjustments the orderAdjustments to set
    */
    public void setOrderAdjustments(List<OrderAdjustment> orderAdjustments) {
        this.orderAdjustments = orderAdjustments;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setOrderAdjustmentTypeId((String) mapValue.get("orderAdjustmentTypeId"));
        setAttrName((String) mapValue.get("attrName"));
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
        mapValue.put("orderAdjustmentTypeId", getOrderAdjustmentTypeId());
        mapValue.put("attrName", getAttrName());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
