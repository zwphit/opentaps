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
 * Auto generated base entity FixedAssetMeter.
 */
@javax.persistence.Entity
@Table(name="FIXED_ASSET_METER")
public class FixedAssetMeter extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("fixedAssetId", "FIXED_ASSET_ID");
        fields.put("productMeterTypeId", "PRODUCT_METER_TYPE_ID");
        fields.put("readingDate", "READING_DATE");
        fields.put("meterValue", "METER_VALUE");
        fields.put("readingReasonEnumId", "READING_REASON_ENUM_ID");
        fields.put("maintHistSeqId", "MAINT_HIST_SEQ_ID");
        fields.put("workEffortId", "WORK_EFFORT_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("FixedAssetMeter", fields);
}
  public static enum Fields implements EntityFieldInterface<FixedAssetMeter> {
    fixedAssetId("fixedAssetId"),
    productMeterTypeId("productMeterTypeId"),
    readingDate("readingDate"),
    meterValue("meterValue"),
    readingReasonEnumId("readingReasonEnumId"),
    maintHistSeqId("maintHistSeqId"),
    workEffortId("workEffortId"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.FixedAssetMeterPkBridge.class)
     protected FixedAssetMeterPk id = new FixedAssetMeterPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>FixedAssetMeterPk</code>
     */
      public FixedAssetMeterPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>FixedAssetMeterPk</code> value to set
    */   
      public void setId(FixedAssetMeterPk id) {
         this.id = id;
      }
   @Column(name="METER_VALUE")
   protected BigDecimal meterValue;
   @Column(name="READING_REASON_ENUM_ID")
   protected String readingReasonEnumId;
   @Column(name="MAINT_HIST_SEQ_ID")
   protected String maintHistSeqId;
   @Column(name="WORK_EFFORT_ID")
   protected String workEffortId;
   @Column(name="LAST_UPDATED_STAMP")
   protected Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   protected Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   protected Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   protected Timestamp createdTxStamp;
   private transient FixedAssetMaint fixedAssetMaint = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_METER_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected ProductMeterType productMeterType = null;

  /**
   * Default constructor.
   */
  public FixedAssetMeter() {
      super();
      this.baseEntityName = "FixedAssetMeter";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("fixedAssetId");this.primaryKeyNames.add("productMeterTypeId");this.primaryKeyNames.add("readingDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("fixedAssetId");this.allFieldsNames.add("productMeterTypeId");this.allFieldsNames.add("readingDate");this.allFieldsNames.add("meterValue");this.allFieldsNames.add("readingReasonEnumId");this.allFieldsNames.add("maintHistSeqId");this.allFieldsNames.add("workEffortId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public FixedAssetMeter(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param fixedAssetId the fixedAssetId to set
     */
    public void setFixedAssetId(String fixedAssetId) {
        id.setFixedAssetId(fixedAssetId);
    }
    /**
     * Auto generated value setter.
     * @param productMeterTypeId the productMeterTypeId to set
     */
    public void setProductMeterTypeId(String productMeterTypeId) {
        id.setProductMeterTypeId(productMeterTypeId);
    }
    /**
     * Auto generated value setter.
     * @param readingDate the readingDate to set
     */
    public void setReadingDate(Timestamp readingDate) {
        id.setReadingDate(readingDate);
    }
    /**
     * Auto generated value setter.
     * @param meterValue the meterValue to set
     */
    public void setMeterValue(BigDecimal meterValue) {
        this.meterValue = meterValue;
    }
    /**
     * Auto generated value setter.
     * @param readingReasonEnumId the readingReasonEnumId to set
     */
    public void setReadingReasonEnumId(String readingReasonEnumId) {
        this.readingReasonEnumId = readingReasonEnumId;
    }
    /**
     * Auto generated value setter.
     * @param maintHistSeqId the maintHistSeqId to set
     */
    public void setMaintHistSeqId(String maintHistSeqId) {
        this.maintHistSeqId = maintHistSeqId;
    }
    /**
     * Auto generated value setter.
     * @param workEffortId the workEffortId to set
     */
    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
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
    public String getFixedAssetId() {
        return this.id.getFixedAssetId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductMeterTypeId() {
        return this.id.getProductMeterTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getReadingDate() {
        return this.id.getReadingDate();
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getMeterValue() {
        return this.meterValue;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReadingReasonEnumId() {
        return this.readingReasonEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getMaintHistSeqId() {
        return this.maintHistSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWorkEffortId() {
        return this.workEffortId;
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
     * Auto generated method that gets the related <code>FixedAssetMaint</code> by the relation named <code>FixedAssetMaint</code>.
     * @return the <code>FixedAssetMaint</code>
     * @throws RepositoryException if an error occurs
     */
    public FixedAssetMaint getFixedAssetMaint() throws RepositoryException {
        if (this.fixedAssetMaint == null) {
            this.fixedAssetMaint = getRelatedOne(FixedAssetMaint.class, "FixedAssetMaint");
        }
        return this.fixedAssetMaint;
    }
    /**
     * Auto generated method that gets the related <code>ProductMeterType</code> by the relation named <code>ProductMeterType</code>.
     * @return the <code>ProductMeterType</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductMeterType getProductMeterType() throws RepositoryException {
        if (this.productMeterType == null) {
            this.productMeterType = getRelatedOne(ProductMeterType.class, "ProductMeterType");
        }
        return this.productMeterType;
    }

    /**
     * Auto generated value setter.
     * @param fixedAssetMaint the fixedAssetMaint to set
    */
    public void setFixedAssetMaint(FixedAssetMaint fixedAssetMaint) {
        this.fixedAssetMaint = fixedAssetMaint;
    }
    /**
     * Auto generated value setter.
     * @param productMeterType the productMeterType to set
    */
    public void setProductMeterType(ProductMeterType productMeterType) {
        this.productMeterType = productMeterType;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setFixedAssetId((String) mapValue.get("fixedAssetId"));
        setProductMeterTypeId((String) mapValue.get("productMeterTypeId"));
        setReadingDate((Timestamp) mapValue.get("readingDate"));
        setMeterValue(convertToBigDecimal(mapValue.get("meterValue")));
        setReadingReasonEnumId((String) mapValue.get("readingReasonEnumId"));
        setMaintHistSeqId((String) mapValue.get("maintHistSeqId"));
        setWorkEffortId((String) mapValue.get("workEffortId"));
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
        mapValue.put("fixedAssetId", getFixedAssetId());
        mapValue.put("productMeterTypeId", getProductMeterTypeId());
        mapValue.put("readingDate", getReadingDate());
        mapValue.put("meterValue", getMeterValue());
        mapValue.put("readingReasonEnumId", getReadingReasonEnumId());
        mapValue.put("maintHistSeqId", getMaintHistSeqId());
        mapValue.put("workEffortId", getWorkEffortId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
