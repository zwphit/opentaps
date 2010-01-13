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
 * Auto generated base entity MrpInventoryEvent.
 */
@javax.persistence.Entity
@Table(name="MRP_INVENTORY_EVENT")
public class MrpInventoryEvent extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productId", "PRODUCT_ID");
        fields.put("eventDate", "EVENT_DATE");
        fields.put("inventoryEventPlanTypeId", "INVENTORY_EVENT_PLAN_TYPE_ID");
        fields.put("eventQuantity", "EVENT_QUANTITY");
        fields.put("netQoh", "NET_QOH");
        fields.put("facilityId", "FACILITY_ID");
        fields.put("eventName", "EVENT_NAME");
        fields.put("isLate", "IS_LATE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("MrpInventoryEvent", fields);
}
  public static enum Fields implements EntityFieldInterface<MrpInventoryEvent> {
    productId("productId"),
    eventDate("eventDate"),
    inventoryEventPlanTypeId("inventoryEventPlanTypeId"),
    eventQuantity("eventQuantity"),
    netQoh("netQoh"),
    facilityId("facilityId"),
    eventName("eventName"),
    isLate("isLate"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.MrpInventoryEventPkBridge.class)
     protected MrpInventoryEventPk id = new MrpInventoryEventPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>MrpInventoryEventPk</code>
     */
      public MrpInventoryEventPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>MrpInventoryEventPk</code> value to set
    */   
      public void setId(MrpInventoryEventPk id) {
         this.id = id;
      }
   @Column(name="EVENT_QUANTITY")
   protected BigDecimal eventQuantity;
   @Column(name="NET_QOH")
   protected BigDecimal netQoh;
   @Column(name="EVENT_NAME")
   protected String eventName;
   @Column(name="IS_LATE")
   protected String isLate;
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
   @JoinColumn(name="INVENTORY_EVENT_PLAN_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected InventoryEventPlannedType inventoryEventPlannedType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="FACILITY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected Facility facility = null;
   private transient List<MrpInventoryEventDetail> mrpInventoryEventDetails = null;

  /**
   * Default constructor.
   */
  public MrpInventoryEvent() {
      super();
      this.baseEntityName = "MrpInventoryEvent";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productId");this.primaryKeyNames.add("eventDate");this.primaryKeyNames.add("inventoryEventPlanTypeId");this.primaryKeyNames.add("facilityId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productId");this.allFieldsNames.add("eventDate");this.allFieldsNames.add("inventoryEventPlanTypeId");this.allFieldsNames.add("eventQuantity");this.allFieldsNames.add("netQoh");this.allFieldsNames.add("facilityId");this.allFieldsNames.add("eventName");this.allFieldsNames.add("isLate");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public MrpInventoryEvent(RepositoryInterface repository) {
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
     * @param eventDate the eventDate to set
     */
    public void setEventDate(Timestamp eventDate) {
        id.setEventDate(eventDate);
    }
    /**
     * Auto generated value setter.
     * @param inventoryEventPlanTypeId the inventoryEventPlanTypeId to set
     */
    public void setInventoryEventPlanTypeId(String inventoryEventPlanTypeId) {
        id.setInventoryEventPlanTypeId(inventoryEventPlanTypeId);
    }
    /**
     * Auto generated value setter.
     * @param eventQuantity the eventQuantity to set
     */
    public void setEventQuantity(BigDecimal eventQuantity) {
        this.eventQuantity = eventQuantity;
    }
    /**
     * Auto generated value setter.
     * @param netQoh the netQoh to set
     */
    public void setNetQoh(BigDecimal netQoh) {
        this.netQoh = netQoh;
    }
    /**
     * Auto generated value setter.
     * @param facilityId the facilityId to set
     */
    public void setFacilityId(String facilityId) {
        id.setFacilityId(facilityId);
    }
    /**
     * Auto generated value setter.
     * @param eventName the eventName to set
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    /**
     * Auto generated value setter.
     * @param isLate the isLate to set
     */
    public void setIsLate(String isLate) {
        this.isLate = isLate;
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
     * @return <code>Timestamp</code>
     */
    public Timestamp getEventDate() {
        return this.id.getEventDate();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInventoryEventPlanTypeId() {
        return this.id.getInventoryEventPlanTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getEventQuantity() {
        return this.eventQuantity;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getNetQoh() {
        return this.netQoh;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFacilityId() {
        return this.id.getFacilityId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getEventName() {
        return this.eventName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIsLate() {
        return this.isLate;
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
     * Auto generated method that gets the related <code>InventoryEventPlannedType</code> by the relation named <code>InventoryEventPlannedType</code>.
     * @return the <code>InventoryEventPlannedType</code>
     * @throws RepositoryException if an error occurs
     */
    public InventoryEventPlannedType getInventoryEventPlannedType() throws RepositoryException {
        if (this.inventoryEventPlannedType == null) {
            this.inventoryEventPlannedType = getRelatedOne(InventoryEventPlannedType.class, "InventoryEventPlannedType");
        }
        return this.inventoryEventPlannedType;
    }
    /**
     * Auto generated method that gets the related <code>Facility</code> by the relation named <code>Facility</code>.
     * @return the <code>Facility</code>
     * @throws RepositoryException if an error occurs
     */
    public Facility getFacility() throws RepositoryException {
        if (this.facility == null) {
            this.facility = getRelatedOne(Facility.class, "Facility");
        }
        return this.facility;
    }
    /**
     * Auto generated method that gets the related <code>MrpInventoryEventDetail</code> by the relation named <code>MrpInventoryEventDetail</code>.
     * @return the list of <code>MrpInventoryEventDetail</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends MrpInventoryEventDetail> getMrpInventoryEventDetails() throws RepositoryException {
        if (this.mrpInventoryEventDetails == null) {
            this.mrpInventoryEventDetails = getRelated(MrpInventoryEventDetail.class, "MrpInventoryEventDetail");
        }
        return this.mrpInventoryEventDetails;
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
     * @param inventoryEventPlannedType the inventoryEventPlannedType to set
    */
    public void setInventoryEventPlannedType(InventoryEventPlannedType inventoryEventPlannedType) {
        this.inventoryEventPlannedType = inventoryEventPlannedType;
    }
    /**
     * Auto generated value setter.
     * @param facility the facility to set
    */
    public void setFacility(Facility facility) {
        this.facility = facility;
    }
    /**
     * Auto generated value setter.
     * @param mrpInventoryEventDetails the mrpInventoryEventDetails to set
    */
    public void setMrpInventoryEventDetails(List<MrpInventoryEventDetail> mrpInventoryEventDetails) {
        this.mrpInventoryEventDetails = mrpInventoryEventDetails;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductId((String) mapValue.get("productId"));
        setEventDate((Timestamp) mapValue.get("eventDate"));
        setInventoryEventPlanTypeId((String) mapValue.get("inventoryEventPlanTypeId"));
        setEventQuantity(convertToBigDecimal(mapValue.get("eventQuantity")));
        setNetQoh(convertToBigDecimal(mapValue.get("netQoh")));
        setFacilityId((String) mapValue.get("facilityId"));
        setEventName((String) mapValue.get("eventName"));
        setIsLate((String) mapValue.get("isLate"));
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
        mapValue.put("eventDate", getEventDate());
        mapValue.put("inventoryEventPlanTypeId", getInventoryEventPlanTypeId());
        mapValue.put("eventQuantity", getEventQuantity());
        mapValue.put("netQoh", getNetQoh());
        mapValue.put("facilityId", getFacilityId());
        mapValue.put("eventName", getEventName());
        mapValue.put("isLate", getIsLate());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
