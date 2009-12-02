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
 * Auto generated base entity OrderTerm.
 */
@javax.persistence.Entity
@Table(name="ORDER_TERM")
public class OrderTerm extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("termTypeId", "TERM_TYPE_ID");
        fields.put("orderId", "ORDER_ID");
        fields.put("orderItemSeqId", "ORDER_ITEM_SEQ_ID");
        fields.put("termValue", "TERM_VALUE");
        fields.put("termDays", "TERM_DAYS");
        fields.put("textValue", "TEXT_VALUE");
        fields.put("description", "DESCRIPTION");
        fields.put("uomId", "UOM_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("OrderTerm", fields);
}
  public static enum Fields implements EntityFieldInterface<OrderTerm> {
    termTypeId("termTypeId"),
    orderId("orderId"),
    orderItemSeqId("orderItemSeqId"),
    termValue("termValue"),
    termDays("termDays"),
    textValue("textValue"),
    description("description"),
    uomId("uomId"),
    lastUpdatedStamp("lastUpdatedStamp"),
    lastUpdatedTxStamp("lastUpdatedTxStamp"),
    createdStamp("createdStamp"),
    createdTxStamp("createdTxStamp");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

   @EmbeddedId

   @FieldBridge(impl = org.opentaps.base.entities.bridge.OrderTermPkBridge.class)
     private OrderTermPk id = new OrderTermPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>OrderTermPk</code>
     */
      public OrderTermPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>OrderTermPk</code> value to set
    */   
      public void setId(OrderTermPk id) {
         this.id = id;
      }
   @Column(name="TERM_VALUE")
   private BigDecimal termValue;
   @Column(name="TERM_DAYS")
   private Long termDays;
   @Column(name="TEXT_VALUE")
   private String textValue;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="UOM_ID")
   private String uomId;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="UOM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Uom uom = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ORDER_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private OrderHeader orderHeader = null;
   private transient OrderItem orderItem = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="TERM_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private TermType termType = null;
   private transient List<OrderTermAttribute> orderTermAttributes = null;

  /**
   * Default constructor.
   */
  public OrderTerm() {
      super();
      this.baseEntityName = "OrderTerm";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("termTypeId");this.primaryKeyNames.add("orderId");this.primaryKeyNames.add("orderItemSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("termTypeId");this.allFieldsNames.add("orderId");this.allFieldsNames.add("orderItemSeqId");this.allFieldsNames.add("termValue");this.allFieldsNames.add("termDays");this.allFieldsNames.add("textValue");this.allFieldsNames.add("description");this.allFieldsNames.add("uomId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public OrderTerm(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param termTypeId the termTypeId to set
     */
    public void setTermTypeId(String termTypeId) {
        id.setTermTypeId(termTypeId);
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
     * @param termValue the termValue to set
     */
    public void setTermValue(BigDecimal termValue) {
        this.termValue = termValue;
    }
    /**
     * Auto generated value setter.
     * @param termDays the termDays to set
     */
    public void setTermDays(Long termDays) {
        this.termDays = termDays;
    }
    /**
     * Auto generated value setter.
     * @param textValue the textValue to set
     */
    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }
    /**
     * Auto generated value setter.
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Auto generated value setter.
     * @param uomId the uomId to set
     */
    public void setUomId(String uomId) {
        this.uomId = uomId;
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
    public String getTermTypeId() {
        return this.id.getTermTypeId();
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getTermValue() {
        return this.termValue;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getTermDays() {
        return this.termDays;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTextValue() {
        return this.textValue;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getUomId() {
        return this.uomId;
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
     * Auto generated method that gets the related <code>Uom</code> by the relation named <code>Uom</code>.
     * @return the <code>Uom</code>
     * @throws RepositoryException if an error occurs
     */
    public Uom getUom() throws RepositoryException {
        if (this.uom == null) {
            this.uom = getRelatedOne(Uom.class, "Uom");
        }
        return this.uom;
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
     * Auto generated method that gets the related <code>TermType</code> by the relation named <code>TermType</code>.
     * @return the <code>TermType</code>
     * @throws RepositoryException if an error occurs
     */
    public TermType getTermType() throws RepositoryException {
        if (this.termType == null) {
            this.termType = getRelatedOne(TermType.class, "TermType");
        }
        return this.termType;
    }
    /**
     * Auto generated method that gets the related <code>OrderTermAttribute</code> by the relation named <code>OrderTermAttribute</code>.
     * @return the list of <code>OrderTermAttribute</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OrderTermAttribute> getOrderTermAttributes() throws RepositoryException {
        if (this.orderTermAttributes == null) {
            this.orderTermAttributes = getRelated(OrderTermAttribute.class, "OrderTermAttribute");
        }
        return this.orderTermAttributes;
    }

    /**
     * Auto generated value setter.
     * @param uom the uom to set
    */
    public void setUom(Uom uom) {
        this.uom = uom;
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
     * @param termType the termType to set
    */
    public void setTermType(TermType termType) {
        this.termType = termType;
    }
    /**
     * Auto generated value setter.
     * @param orderTermAttributes the orderTermAttributes to set
    */
    public void setOrderTermAttributes(List<OrderTermAttribute> orderTermAttributes) {
        this.orderTermAttributes = orderTermAttributes;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setTermTypeId((String) mapValue.get("termTypeId"));
        setOrderId((String) mapValue.get("orderId"));
        setOrderItemSeqId((String) mapValue.get("orderItemSeqId"));
        setTermValue(convertToBigDecimal(mapValue.get("termValue")));
        setTermDays((Long) mapValue.get("termDays"));
        setTextValue((String) mapValue.get("textValue"));
        setDescription((String) mapValue.get("description"));
        setUomId((String) mapValue.get("uomId"));
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
        mapValue.put("termTypeId", getTermTypeId());
        mapValue.put("orderId", getOrderId());
        mapValue.put("orderItemSeqId", getOrderItemSeqId());
        mapValue.put("termValue", getTermValue());
        mapValue.put("termDays", getTermDays());
        mapValue.put("textValue", getTextValue());
        mapValue.put("description", getDescription());
        mapValue.put("uomId", getUomId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}