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
 * Auto generated base entity FacilityType.
 */
@javax.persistence.Entity
@Table(name="FACILITY_TYPE")
public class FacilityType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("facilityTypeId", "FACILITY_TYPE_ID");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("hasTable", "HAS_TABLE");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("FacilityType", fields);
}
  public static enum Fields implements EntityFieldInterface<FacilityType> {
    facilityTypeId("facilityTypeId"),
    parentTypeId("parentTypeId"),
    hasTable("hasTable"),
    description("description"),
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

   @org.hibernate.annotations.GenericGenerator(name="FacilityType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="FacilityType_GEN")
   @Id
   @Column(name="FACILITY_TYPE_ID")
   protected String facilityTypeId;
   @Column(name="PARENT_TYPE_ID")
   protected String parentTypeId;
   @Column(name="HAS_TABLE")
   protected String hasTable;
   @Column(name="DESCRIPTION")
   protected String description;
   @Column(name="LAST_UPDATED_STAMP")
   protected Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   protected Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   protected Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   protected Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected FacilityType parentFacilityType = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="FACILITY_TYPE_ID")
   
   protected List<Facility> facilitys = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_TYPE_ID")
   
   protected List<FacilityType> childFacilityTypes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="facilityType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="FACILITY_TYPE_ID")
   
   protected List<FacilityTypeAttr> facilityTypeAttrs = null;

  /**
   * Default constructor.
   */
  public FacilityType() {
      super();
      this.baseEntityName = "FacilityType";
      this.isView = false;
      this.resourceName = "ProductEntityLabels";
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("facilityTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("facilityTypeId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("hasTable");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public FacilityType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param facilityTypeId the facilityTypeId to set
     */
    public void setFacilityTypeId(String facilityTypeId) {
        this.facilityTypeId = facilityTypeId;
    }
    /**
     * Auto generated value setter.
     * @param parentTypeId the parentTypeId to set
     */
    public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
    /**
     * Auto generated value setter.
     * @param hasTable the hasTable to set
     */
    public void setHasTable(String hasTable) {
        this.hasTable = hasTable;
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
    public String getFacilityTypeId() {
        return this.facilityTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentTypeId() {
        return this.parentTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getHasTable() {
        return this.hasTable;
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
     * Auto generated method that gets the related <code>FacilityType</code> by the relation named <code>ParentFacilityType</code>.
     * @return the <code>FacilityType</code>
     * @throws RepositoryException if an error occurs
     */
    public FacilityType getParentFacilityType() throws RepositoryException {
        if (this.parentFacilityType == null) {
            this.parentFacilityType = getRelatedOne(FacilityType.class, "ParentFacilityType");
        }
        return this.parentFacilityType;
    }
    /**
     * Auto generated method that gets the related <code>Facility</code> by the relation named <code>Facility</code>.
     * @return the list of <code>Facility</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends Facility> getFacilitys() throws RepositoryException {
        if (this.facilitys == null) {
            this.facilitys = getRelated(Facility.class, "Facility");
        }
        return this.facilitys;
    }
    /**
     * Auto generated method that gets the related <code>FacilityType</code> by the relation named <code>ChildFacilityType</code>.
     * @return the list of <code>FacilityType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends FacilityType> getChildFacilityTypes() throws RepositoryException {
        if (this.childFacilityTypes == null) {
            this.childFacilityTypes = getRelated(FacilityType.class, "ChildFacilityType");
        }
        return this.childFacilityTypes;
    }
    /**
     * Auto generated method that gets the related <code>FacilityTypeAttr</code> by the relation named <code>FacilityTypeAttr</code>.
     * @return the list of <code>FacilityTypeAttr</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends FacilityTypeAttr> getFacilityTypeAttrs() throws RepositoryException {
        if (this.facilityTypeAttrs == null) {
            this.facilityTypeAttrs = getRelated(FacilityTypeAttr.class, "FacilityTypeAttr");
        }
        return this.facilityTypeAttrs;
    }

    /**
     * Auto generated value setter.
     * @param parentFacilityType the parentFacilityType to set
    */
    public void setParentFacilityType(FacilityType parentFacilityType) {
        this.parentFacilityType = parentFacilityType;
    }
    /**
     * Auto generated value setter.
     * @param facilitys the facilitys to set
    */
    public void setFacilitys(List<Facility> facilitys) {
        this.facilitys = facilitys;
    }
    /**
     * Auto generated value setter.
     * @param childFacilityTypes the childFacilityTypes to set
    */
    public void setChildFacilityTypes(List<FacilityType> childFacilityTypes) {
        this.childFacilityTypes = childFacilityTypes;
    }
    /**
     * Auto generated value setter.
     * @param facilityTypeAttrs the facilityTypeAttrs to set
    */
    public void setFacilityTypeAttrs(List<FacilityTypeAttr> facilityTypeAttrs) {
        this.facilityTypeAttrs = facilityTypeAttrs;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addFacilityTypeAttr(FacilityTypeAttr facilityTypeAttr) {
        if (this.facilityTypeAttrs == null) {
            this.facilityTypeAttrs = new ArrayList<FacilityTypeAttr>();
        }
        this.facilityTypeAttrs.add(facilityTypeAttr);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeFacilityTypeAttr(FacilityTypeAttr facilityTypeAttr) {
        if (this.facilityTypeAttrs == null) {
            return;
        }
        this.facilityTypeAttrs.remove(facilityTypeAttr);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearFacilityTypeAttr() {
        if (this.facilityTypeAttrs == null) {
            return;
        }
        this.facilityTypeAttrs.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setFacilityTypeId((String) mapValue.get("facilityTypeId"));
        setParentTypeId((String) mapValue.get("parentTypeId"));
        setHasTable((String) mapValue.get("hasTable"));
        setDescription((String) mapValue.get("description"));
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
        mapValue.put("facilityTypeId", getFacilityTypeId());
        mapValue.put("parentTypeId", getParentTypeId());
        mapValue.put("hasTable", getHasTable());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
