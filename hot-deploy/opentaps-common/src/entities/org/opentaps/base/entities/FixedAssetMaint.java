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
 * Auto generated base entity FixedAssetMaint.
 */
@javax.persistence.Entity
@Table(name="FIXED_ASSET_MAINT")
public class FixedAssetMaint extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("fixedAssetId", "FIXED_ASSET_ID");
        fields.put("maintHistSeqId", "MAINT_HIST_SEQ_ID");
        fields.put("statusId", "STATUS_ID");
        fields.put("productMaintTypeId", "PRODUCT_MAINT_TYPE_ID");
        fields.put("productMaintSeqId", "PRODUCT_MAINT_SEQ_ID");
        fields.put("scheduleWorkEffortId", "SCHEDULE_WORK_EFFORT_ID");
        fields.put("intervalQuantity", "INTERVAL_QUANTITY");
        fields.put("intervalUomId", "INTERVAL_UOM_ID");
        fields.put("intervalMeterTypeId", "INTERVAL_METER_TYPE_ID");
        fields.put("purchaseOrderId", "PURCHASE_ORDER_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("FixedAssetMaint", fields);
}
  public static enum Fields implements EntityFieldInterface<FixedAssetMaint> {
    fixedAssetId("fixedAssetId"),
    maintHistSeqId("maintHistSeqId"),
    statusId("statusId"),
    productMaintTypeId("productMaintTypeId"),
    productMaintSeqId("productMaintSeqId"),
    scheduleWorkEffortId("scheduleWorkEffortId"),
    intervalQuantity("intervalQuantity"),
    intervalUomId("intervalUomId"),
    intervalMeterTypeId("intervalMeterTypeId"),
    purchaseOrderId("purchaseOrderId"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.FixedAssetMaintPkBridge.class)
     protected FixedAssetMaintPk id = new FixedAssetMaintPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>FixedAssetMaintPk</code>
     */
      public FixedAssetMaintPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>FixedAssetMaintPk</code> value to set
    */   
      public void setId(FixedAssetMaintPk id) {
         this.id = id;
      }
   @Column(name="STATUS_ID")
   protected String statusId;
   @Column(name="PRODUCT_MAINT_TYPE_ID")
   protected String productMaintTypeId;
   @Column(name="PRODUCT_MAINT_SEQ_ID")
   protected String productMaintSeqId;
   @Column(name="SCHEDULE_WORK_EFFORT_ID")
   protected String scheduleWorkEffortId;
   @Column(name="INTERVAL_QUANTITY")
   protected BigDecimal intervalQuantity;
   @Column(name="INTERVAL_UOM_ID")
   protected String intervalUomId;
   @Column(name="INTERVAL_METER_TYPE_ID")
   protected String intervalMeterTypeId;
   @Column(name="PURCHASE_ORDER_ID")
   protected String purchaseOrderId;
   @Column(name="LAST_UPDATED_STAMP")
   protected Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   protected Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   protected Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   protected Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="FIXED_ASSET_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected FixedAsset fixedAsset = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_MAINT_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected ProductMaintType productMaintType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SCHEDULE_WORK_EFFORT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected WorkEffort scheduleWorkEffort = null;
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
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PURCHASE_ORDER_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected OrderHeader purchaseOrderHeader = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="STATUS_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected StatusItem statusItem = null;
   private transient List<FixedAssetMaintMeter> fixedAssetMaintMeters = null;
   private transient List<FixedAssetMeter> fixedAssetMeters = null;
   private transient List<InventoryItemDetail> inventoryItemDetails = null;
   private transient List<ItemIssuance> itemIssuances = null;

  /**
   * Default constructor.
   */
  public FixedAssetMaint() {
      super();
      this.baseEntityName = "FixedAssetMaint";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("fixedAssetId");this.primaryKeyNames.add("maintHistSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("fixedAssetId");this.allFieldsNames.add("maintHistSeqId");this.allFieldsNames.add("statusId");this.allFieldsNames.add("productMaintTypeId");this.allFieldsNames.add("productMaintSeqId");this.allFieldsNames.add("scheduleWorkEffortId");this.allFieldsNames.add("intervalQuantity");this.allFieldsNames.add("intervalUomId");this.allFieldsNames.add("intervalMeterTypeId");this.allFieldsNames.add("purchaseOrderId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public FixedAssetMaint(RepositoryInterface repository) {
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
     * @param maintHistSeqId the maintHistSeqId to set
     */
    public void setMaintHistSeqId(String maintHistSeqId) {
        id.setMaintHistSeqId(maintHistSeqId);
    }
    /**
     * Auto generated value setter.
     * @param statusId the statusId to set
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
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
     * @param productMaintSeqId the productMaintSeqId to set
     */
    public void setProductMaintSeqId(String productMaintSeqId) {
        this.productMaintSeqId = productMaintSeqId;
    }
    /**
     * Auto generated value setter.
     * @param scheduleWorkEffortId the scheduleWorkEffortId to set
     */
    public void setScheduleWorkEffortId(String scheduleWorkEffortId) {
        this.scheduleWorkEffortId = scheduleWorkEffortId;
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
     * @param purchaseOrderId the purchaseOrderId to set
     */
    public void setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
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
    public String getMaintHistSeqId() {
        return this.id.getMaintHistSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStatusId() {
        return this.statusId;
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
    public String getProductMaintSeqId() {
        return this.productMaintSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getScheduleWorkEffortId() {
        return this.scheduleWorkEffortId;
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
     * @return <code>String</code>
     */
    public String getPurchaseOrderId() {
        return this.purchaseOrderId;
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
     * Auto generated method that gets the related <code>FixedAsset</code> by the relation named <code>FixedAsset</code>.
     * @return the <code>FixedAsset</code>
     * @throws RepositoryException if an error occurs
     */
    public FixedAsset getFixedAsset() throws RepositoryException {
        if (this.fixedAsset == null) {
            this.fixedAsset = getRelatedOne(FixedAsset.class, "FixedAsset");
        }
        return this.fixedAsset;
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
     * Auto generated method that gets the related <code>WorkEffort</code> by the relation named <code>ScheduleWorkEffort</code>.
     * @return the <code>WorkEffort</code>
     * @throws RepositoryException if an error occurs
     */
    public WorkEffort getScheduleWorkEffort() throws RepositoryException {
        if (this.scheduleWorkEffort == null) {
            this.scheduleWorkEffort = getRelatedOne(WorkEffort.class, "ScheduleWorkEffort");
        }
        return this.scheduleWorkEffort;
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
     * Auto generated method that gets the related <code>OrderHeader</code> by the relation named <code>PurchaseOrderHeader</code>.
     * @return the <code>OrderHeader</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderHeader getPurchaseOrderHeader() throws RepositoryException {
        if (this.purchaseOrderHeader == null) {
            this.purchaseOrderHeader = getRelatedOne(OrderHeader.class, "PurchaseOrderHeader");
        }
        return this.purchaseOrderHeader;
    }
    /**
     * Auto generated method that gets the related <code>StatusItem</code> by the relation named <code>StatusItem</code>.
     * @return the <code>StatusItem</code>
     * @throws RepositoryException if an error occurs
     */
    public StatusItem getStatusItem() throws RepositoryException {
        if (this.statusItem == null) {
            this.statusItem = getRelatedOne(StatusItem.class, "StatusItem");
        }
        return this.statusItem;
    }
    /**
     * Auto generated method that gets the related <code>FixedAssetMaintMeter</code> by the relation named <code>FixedAssetMaintMeter</code>.
     * @return the list of <code>FixedAssetMaintMeter</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends FixedAssetMaintMeter> getFixedAssetMaintMeters() throws RepositoryException {
        if (this.fixedAssetMaintMeters == null) {
            this.fixedAssetMaintMeters = getRelated(FixedAssetMaintMeter.class, "FixedAssetMaintMeter");
        }
        return this.fixedAssetMaintMeters;
    }
    /**
     * Auto generated method that gets the related <code>FixedAssetMeter</code> by the relation named <code>FixedAssetMeter</code>.
     * @return the list of <code>FixedAssetMeter</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends FixedAssetMeter> getFixedAssetMeters() throws RepositoryException {
        if (this.fixedAssetMeters == null) {
            this.fixedAssetMeters = getRelated(FixedAssetMeter.class, "FixedAssetMeter");
        }
        return this.fixedAssetMeters;
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
     * Auto generated method that gets the related <code>ItemIssuance</code> by the relation named <code>ItemIssuance</code>.
     * @return the list of <code>ItemIssuance</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ItemIssuance> getItemIssuances() throws RepositoryException {
        if (this.itemIssuances == null) {
            this.itemIssuances = getRelated(ItemIssuance.class, "ItemIssuance");
        }
        return this.itemIssuances;
    }

    /**
     * Auto generated value setter.
     * @param fixedAsset the fixedAsset to set
    */
    public void setFixedAsset(FixedAsset fixedAsset) {
        this.fixedAsset = fixedAsset;
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
     * @param scheduleWorkEffort the scheduleWorkEffort to set
    */
    public void setScheduleWorkEffort(WorkEffort scheduleWorkEffort) {
        this.scheduleWorkEffort = scheduleWorkEffort;
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
     * @param purchaseOrderHeader the purchaseOrderHeader to set
    */
    public void setPurchaseOrderHeader(OrderHeader purchaseOrderHeader) {
        this.purchaseOrderHeader = purchaseOrderHeader;
    }
    /**
     * Auto generated value setter.
     * @param statusItem the statusItem to set
    */
    public void setStatusItem(StatusItem statusItem) {
        this.statusItem = statusItem;
    }
    /**
     * Auto generated value setter.
     * @param fixedAssetMaintMeters the fixedAssetMaintMeters to set
    */
    public void setFixedAssetMaintMeters(List<FixedAssetMaintMeter> fixedAssetMaintMeters) {
        this.fixedAssetMaintMeters = fixedAssetMaintMeters;
    }
    /**
     * Auto generated value setter.
     * @param fixedAssetMeters the fixedAssetMeters to set
    */
    public void setFixedAssetMeters(List<FixedAssetMeter> fixedAssetMeters) {
        this.fixedAssetMeters = fixedAssetMeters;
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
     * @param itemIssuances the itemIssuances to set
    */
    public void setItemIssuances(List<ItemIssuance> itemIssuances) {
        this.itemIssuances = itemIssuances;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setFixedAssetId((String) mapValue.get("fixedAssetId"));
        setMaintHistSeqId((String) mapValue.get("maintHistSeqId"));
        setStatusId((String) mapValue.get("statusId"));
        setProductMaintTypeId((String) mapValue.get("productMaintTypeId"));
        setProductMaintSeqId((String) mapValue.get("productMaintSeqId"));
        setScheduleWorkEffortId((String) mapValue.get("scheduleWorkEffortId"));
        setIntervalQuantity(convertToBigDecimal(mapValue.get("intervalQuantity")));
        setIntervalUomId((String) mapValue.get("intervalUomId"));
        setIntervalMeterTypeId((String) mapValue.get("intervalMeterTypeId"));
        setPurchaseOrderId((String) mapValue.get("purchaseOrderId"));
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
        mapValue.put("maintHistSeqId", getMaintHistSeqId());
        mapValue.put("statusId", getStatusId());
        mapValue.put("productMaintTypeId", getProductMaintTypeId());
        mapValue.put("productMaintSeqId", getProductMaintSeqId());
        mapValue.put("scheduleWorkEffortId", getScheduleWorkEffortId());
        mapValue.put("intervalQuantity", getIntervalQuantity());
        mapValue.put("intervalUomId", getIntervalUomId());
        mapValue.put("intervalMeterTypeId", getIntervalMeterTypeId());
        mapValue.put("purchaseOrderId", getPurchaseOrderId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
