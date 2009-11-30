package org.opentaps.domain.base.entities;

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
import java.sql.Timestamp;

/**
 * Auto generated base entity AccommodationMap.
 */
@javax.persistence.Entity
@Table(name="ACCOMMODATION_MAP")
public class AccommodationMap extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("accommodationMapId", "ACCOMMODATION_MAP_ID");
        fields.put("accommodationClassId", "ACCOMMODATION_CLASS_ID");
        fields.put("fixedAssetId", "FIXED_ASSET_ID");
        fields.put("accommodationMapTypeId", "ACCOMMODATION_MAP_TYPE_ID");
        fields.put("numberOfSpaces", "NUMBER_OF_SPACES");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("AccommodationMap", fields);
}
  public static enum Fields implements EntityFieldInterface<AccommodationMap> {
    accommodationMapId("accommodationMapId"),
    accommodationClassId("accommodationClassId"),
    fixedAssetId("fixedAssetId"),
    accommodationMapTypeId("accommodationMapTypeId"),
    numberOfSpaces("numberOfSpaces"),
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

   @org.hibernate.annotations.GenericGenerator(name="AccommodationMap_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="AccommodationMap_GEN")
   @Id
   @Column(name="ACCOMMODATION_MAP_ID")
   private String accommodationMapId;
   @Column(name="ACCOMMODATION_CLASS_ID")
   private String accommodationClassId;
   @Column(name="FIXED_ASSET_ID")
   private String fixedAssetId;
   @Column(name="ACCOMMODATION_MAP_TYPE_ID")
   private String accommodationMapTypeId;
   @Column(name="NUMBER_OF_SPACES")
   private Long numberOfSpaces;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ACCOMMODATION_CLASS_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private AccommodationClass accommodationClass = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="FIXED_ASSET_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private FixedAsset fixedAsset = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ACCOMMODATION_MAP_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private AccommodationMapType accommodationMapType = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="ACCOMMODATION_MAP_ID")
   
   private List<WorkEffort> workEfforts = null;

  /**
   * Default constructor.
   */
  public AccommodationMap() {
      super();
      this.baseEntityName = "AccommodationMap";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("accommodationMapId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("accommodationMapId");this.allFieldsNames.add("accommodationClassId");this.allFieldsNames.add("fixedAssetId");this.allFieldsNames.add("accommodationMapTypeId");this.allFieldsNames.add("numberOfSpaces");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public AccommodationMap(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param accommodationMapId the accommodationMapId to set
     */
    public void setAccommodationMapId(String accommodationMapId) {
        this.accommodationMapId = accommodationMapId;
    }
    /**
     * Auto generated value setter.
     * @param accommodationClassId the accommodationClassId to set
     */
    public void setAccommodationClassId(String accommodationClassId) {
        this.accommodationClassId = accommodationClassId;
    }
    /**
     * Auto generated value setter.
     * @param fixedAssetId the fixedAssetId to set
     */
    public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }
    /**
     * Auto generated value setter.
     * @param accommodationMapTypeId the accommodationMapTypeId to set
     */
    public void setAccommodationMapTypeId(String accommodationMapTypeId) {
        this.accommodationMapTypeId = accommodationMapTypeId;
    }
    /**
     * Auto generated value setter.
     * @param numberOfSpaces the numberOfSpaces to set
     */
    public void setNumberOfSpaces(Long numberOfSpaces) {
        this.numberOfSpaces = numberOfSpaces;
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
    public String getAccommodationMapId() {
        return this.accommodationMapId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAccommodationClassId() {
        return this.accommodationClassId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFixedAssetId() {
        return this.fixedAssetId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAccommodationMapTypeId() {
        return this.accommodationMapTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getNumberOfSpaces() {
        return this.numberOfSpaces;
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
     * Auto generated method that gets the related <code>AccommodationClass</code> by the relation named <code>AccommodationClass</code>.
     * @return the <code>AccommodationClass</code>
     * @throws RepositoryException if an error occurs
     */
    public AccommodationClass getAccommodationClass() throws RepositoryException {
        if (this.accommodationClass == null) {
            this.accommodationClass = getRelatedOne(AccommodationClass.class, "AccommodationClass");
        }
        return this.accommodationClass;
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
     * Auto generated method that gets the related <code>AccommodationMapType</code> by the relation named <code>AccommodationMapType</code>.
     * @return the <code>AccommodationMapType</code>
     * @throws RepositoryException if an error occurs
     */
    public AccommodationMapType getAccommodationMapType() throws RepositoryException {
        if (this.accommodationMapType == null) {
            this.accommodationMapType = getRelatedOne(AccommodationMapType.class, "AccommodationMapType");
        }
        return this.accommodationMapType;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffort</code> by the relation named <code>WorkEffort</code>.
     * @return the list of <code>WorkEffort</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WorkEffort> getWorkEfforts() throws RepositoryException {
        if (this.workEfforts == null) {
            this.workEfforts = getRelated(WorkEffort.class, "WorkEffort");
        }
        return this.workEfforts;
    }

    /**
     * Auto generated value setter.
     * @param accommodationClass the accommodationClass to set
    */
    public void setAccommodationClass(AccommodationClass accommodationClass) {
        this.accommodationClass = accommodationClass;
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
     * @param accommodationMapType the accommodationMapType to set
    */
    public void setAccommodationMapType(AccommodationMapType accommodationMapType) {
        this.accommodationMapType = accommodationMapType;
    }
    /**
     * Auto generated value setter.
     * @param workEfforts the workEfforts to set
    */
    public void setWorkEfforts(List<WorkEffort> workEfforts) {
        this.workEfforts = workEfforts;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setAccommodationMapId((String) mapValue.get("accommodationMapId"));
        setAccommodationClassId((String) mapValue.get("accommodationClassId"));
        setFixedAssetId((String) mapValue.get("fixedAssetId"));
        setAccommodationMapTypeId((String) mapValue.get("accommodationMapTypeId"));
        setNumberOfSpaces((Long) mapValue.get("numberOfSpaces"));
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
        mapValue.put("accommodationMapId", getAccommodationMapId());
        mapValue.put("accommodationClassId", getAccommodationClassId());
        mapValue.put("fixedAssetId", getFixedAssetId());
        mapValue.put("accommodationMapTypeId", getAccommodationMapTypeId());
        mapValue.put("numberOfSpaces", getNumberOfSpaces());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}