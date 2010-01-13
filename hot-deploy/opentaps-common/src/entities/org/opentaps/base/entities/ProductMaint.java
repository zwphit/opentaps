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
 * Auto generated base entity ProductMaint.
 */
@javax.persistence.Entity
@Table(name="PRODUCT_MAINT")
public class ProductMaint extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productId", "PRODUCT_ID");
        fields.put("productMaintSeqId", "PRODUCT_MAINT_SEQ_ID");
        fields.put("productMaintTypeId", "PRODUCT_MAINT_TYPE_ID");
        fields.put("maintName", "MAINT_NAME");
        fields.put("maintTemplateWorkEffortId", "MAINT_TEMPLATE_WORK_EFFORT_ID");
        fields.put("intervalQuantity", "INTERVAL_QUANTITY");
        fields.put("intervalUomId", "INTERVAL_UOM_ID");
        fields.put("intervalMeterTypeId", "INTERVAL_METER_TYPE_ID");
        fields.put("repeatCount", "REPEAT_COUNT");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ProductMaint", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductMaint> {
    productId("productId"),
    productMaintSeqId("productMaintSeqId"),
    productMaintTypeId("productMaintTypeId"),
    maintName("maintName"),
    maintTemplateWorkEffortId("maintTemplateWorkEffortId"),
    intervalQuantity("intervalQuantity"),
    intervalUomId("intervalUomId"),
    intervalMeterTypeId("intervalMeterTypeId"),
    repeatCount("repeatCount"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.ProductMaintPkBridge.class)
     protected ProductMaintPk id = new ProductMaintPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>ProductMaintPk</code>
     */
      public ProductMaintPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>ProductMaintPk</code> value to set
    */   
      public void setId(ProductMaintPk id) {
         this.id = id;
      }
   @Column(name="PRODUCT_MAINT_TYPE_ID")
   protected String productMaintTypeId;
   @Column(name="MAINT_NAME")
   protected String maintName;
   @Column(name="MAINT_TEMPLATE_WORK_EFFORT_ID")
   protected String maintTemplateWorkEffortId;
   @Column(name="INTERVAL_QUANTITY")
   protected BigDecimal intervalQuantity;
   @Column(name="INTERVAL_UOM_ID")
   protected String intervalUomId;
   @Column(name="INTERVAL_METER_TYPE_ID")
   protected String intervalMeterTypeId;
   @Column(name="REPEAT_COUNT")
   protected Long repeatCount;
   @Column(name="LAST_UPDATED_STAMP")
   protected Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   protected Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   protected Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   protected Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected Product product = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_MAINT_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected ProductMaintType productMaintType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="MAINT_TEMPLATE_WORK_EFFORT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected WorkEffort maintTemplateWorkEffort = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="INTERVAL_UOM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected Uom intervalUom = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="INTERVAL_METER_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected ProductMeterType intervalProductMeterType = null;
   private transient ProductMeter intervalProductMeter = null;

  /**
   * Default constructor.
   */
  public ProductMaint() {
      super();
      this.baseEntityName = "ProductMaint";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productId");this.primaryKeyNames.add("productMaintSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productId");this.allFieldsNames.add("productMaintSeqId");this.allFieldsNames.add("productMaintTypeId");this.allFieldsNames.add("maintName");this.allFieldsNames.add("maintTemplateWorkEffortId");this.allFieldsNames.add("intervalQuantity");this.allFieldsNames.add("intervalUomId");this.allFieldsNames.add("intervalMeterTypeId");this.allFieldsNames.add("repeatCount");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductMaint(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        id.setProductId(productId);
    }
    /**
     * Auto generated value setter.
     * @param productMaintSeqId the productMaintSeqId to set
     */
    public void setProductMaintSeqId(String productMaintSeqId) {
        id.setProductMaintSeqId(productMaintSeqId);
    }
    /**
     * Auto generated value setter.
     * @param productMaintTypeId the productMaintTypeId to set
     */
    public void setProductMaintTypeId(String productMaintTypeId) {
        this.productMaintTypeId = productMaintTypeId;
    }
    /**
     * Auto generated value setter.
     * @param maintName the maintName to set
     */
    public void setMaintName(String maintName) {
        this.maintName = maintName;
    }
    /**
     * Auto generated value setter.
     * @param maintTemplateWorkEffortId the maintTemplateWorkEffortId to set
     */
    public void setMaintTemplateWorkEffortId(String maintTemplateWorkEffortId) {
        this.maintTemplateWorkEffortId = maintTemplateWorkEffortId;
    }
    /**
     * Auto generated value setter.
     * @param intervalQuantity the intervalQuantity to set
     */
    public void setIntervalQuantity(BigDecimal intervalQuantity) {
        this.intervalQuantity = intervalQuantity;
    }
    /**
     * Auto generated value setter.
     * @param intervalUomId the intervalUomId to set
     */
    public void setIntervalUomId(String intervalUomId) {
        this.intervalUomId = intervalUomId;
    }
    /**
     * Auto generated value setter.
     * @param intervalMeterTypeId the intervalMeterTypeId to set
     */
    public void setIntervalMeterTypeId(String intervalMeterTypeId) {
        this.intervalMeterTypeId = intervalMeterTypeId;
    }
    /**
     * Auto generated value setter.
     * @param repeatCount the repeatCount to set
     */
    public void setRepeatCount(Long repeatCount) {
        this.repeatCount = repeatCount;
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
    public String getProductId() {
        return this.id.getProductId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductMaintSeqId() {
        return this.id.getProductMaintSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductMaintTypeId() {
        return this.productMaintTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getMaintName() {
        return this.maintName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getMaintTemplateWorkEffortId() {
        return this.maintTemplateWorkEffortId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getIntervalQuantity() {
        return this.intervalQuantity;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIntervalUomId() {
        return this.intervalUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIntervalMeterTypeId() {
        return this.intervalMeterTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getRepeatCount() {
        return this.repeatCount;
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
     * Auto generated method that gets the related <code>ProductMaintType</code> by the relation named <code>ProductMaintType</code>.
     * @return the <code>ProductMaintType</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductMaintType getProductMaintType() throws RepositoryException {
        if (this.productMaintType == null) {
            this.productMaintType = getRelatedOne(ProductMaintType.class, "ProductMaintType");
        }
        return this.productMaintType;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffort</code> by the relation named <code>MaintTemplateWorkEffort</code>.
     * @return the <code>WorkEffort</code>
     * @throws RepositoryException if an error occurs
     */
    public WorkEffort getMaintTemplateWorkEffort() throws RepositoryException {
        if (this.maintTemplateWorkEffort == null) {
            this.maintTemplateWorkEffort = getRelatedOne(WorkEffort.class, "MaintTemplateWorkEffort");
        }
        return this.maintTemplateWorkEffort;
    }
    /**
     * Auto generated method that gets the related <code>Uom</code> by the relation named <code>IntervalUom</code>.
     * @return the <code>Uom</code>
     * @throws RepositoryException if an error occurs
     */
    public Uom getIntervalUom() throws RepositoryException {
        if (this.intervalUom == null) {
            this.intervalUom = getRelatedOne(Uom.class, "IntervalUom");
        }
        return this.intervalUom;
    }
    /**
     * Auto generated method that gets the related <code>ProductMeterType</code> by the relation named <code>IntervalProductMeterType</code>.
     * @return the <code>ProductMeterType</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductMeterType getIntervalProductMeterType() throws RepositoryException {
        if (this.intervalProductMeterType == null) {
            this.intervalProductMeterType = getRelatedOne(ProductMeterType.class, "IntervalProductMeterType");
        }
        return this.intervalProductMeterType;
    }
    /**
     * Auto generated method that gets the related <code>ProductMeter</code> by the relation named <code>IntervalProductMeter</code>.
     * @return the <code>ProductMeter</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductMeter getIntervalProductMeter() throws RepositoryException {
        if (this.intervalProductMeter == null) {
            this.intervalProductMeter = getRelatedOne(ProductMeter.class, "IntervalProductMeter");
        }
        return this.intervalProductMeter;
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
     * @param productMaintType the productMaintType to set
    */
    public void setProductMaintType(ProductMaintType productMaintType) {
        this.productMaintType = productMaintType;
    }
    /**
     * Auto generated value setter.
     * @param maintTemplateWorkEffort the maintTemplateWorkEffort to set
    */
    public void setMaintTemplateWorkEffort(WorkEffort maintTemplateWorkEffort) {
        this.maintTemplateWorkEffort = maintTemplateWorkEffort;
    }
    /**
     * Auto generated value setter.
     * @param intervalUom the intervalUom to set
    */
    public void setIntervalUom(Uom intervalUom) {
        this.intervalUom = intervalUom;
    }
    /**
     * Auto generated value setter.
     * @param intervalProductMeterType the intervalProductMeterType to set
    */
    public void setIntervalProductMeterType(ProductMeterType intervalProductMeterType) {
        this.intervalProductMeterType = intervalProductMeterType;
    }
    /**
     * Auto generated value setter.
     * @param intervalProductMeter the intervalProductMeter to set
    */
    public void setIntervalProductMeter(ProductMeter intervalProductMeter) {
        this.intervalProductMeter = intervalProductMeter;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductId((String) mapValue.get("productId"));
        setProductMaintSeqId((String) mapValue.get("productMaintSeqId"));
        setProductMaintTypeId((String) mapValue.get("productMaintTypeId"));
        setMaintName((String) mapValue.get("maintName"));
        setMaintTemplateWorkEffortId((String) mapValue.get("maintTemplateWorkEffortId"));
        setIntervalQuantity(convertToBigDecimal(mapValue.get("intervalQuantity")));
        setIntervalUomId((String) mapValue.get("intervalUomId"));
        setIntervalMeterTypeId((String) mapValue.get("intervalMeterTypeId"));
        setRepeatCount((Long) mapValue.get("repeatCount"));
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
        mapValue.put("productId", getProductId());
        mapValue.put("productMaintSeqId", getProductMaintSeqId());
        mapValue.put("productMaintTypeId", getProductMaintTypeId());
        mapValue.put("maintName", getMaintName());
        mapValue.put("maintTemplateWorkEffortId", getMaintTemplateWorkEffortId());
        mapValue.put("intervalQuantity", getIntervalQuantity());
        mapValue.put("intervalUomId", getIntervalUomId());
        mapValue.put("intervalMeterTypeId", getIntervalMeterTypeId());
        mapValue.put("repeatCount", getRepeatCount());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
