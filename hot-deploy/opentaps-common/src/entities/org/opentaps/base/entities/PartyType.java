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
 * Auto generated base entity PartyType.
 */
@javax.persistence.Entity
@Table(name="PARTY_TYPE")
public class PartyType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("partyTypeId", "PARTY_TYPE_ID");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("hasTable", "HAS_TABLE");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("PartyType", fields);
}
  public static enum Fields implements EntityFieldInterface<PartyType> {
    partyTypeId("partyTypeId"),
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

   @org.hibernate.annotations.GenericGenerator(name="PartyType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="PartyType_GEN")
   @Id
   @Column(name="PARTY_TYPE_ID")
   protected String partyTypeId;
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
   
   protected PartyType parentPartyType = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_TYPE_ID")
   
   protected List<PartyType> siblingPartyTypes = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_TYPE_ID")
   
   protected List<Party> partys = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_TYPE_ID")
   
   protected List<PartyNeed> partyNeeds = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_TYPE_ID")
   
   protected List<PartyType> childPartyTypes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="partyType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PARTY_TYPE_ID")
   
   protected List<PartyTypeAttr> partyTypeAttrs = null;

  /**
   * Default constructor.
   */
  public PartyType() {
      super();
      this.baseEntityName = "PartyType";
      this.isView = false;
      this.resourceName = "PartyEntityLabels";
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("partyTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("partyTypeId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("hasTable");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PartyType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param partyTypeId the partyTypeId to set
     */
    public void setPartyTypeId(String partyTypeId) {
        this.partyTypeId = partyTypeId;
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
    public String getPartyTypeId() {
        return this.partyTypeId;
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
     * Auto generated method that gets the related <code>PartyType</code> by the relation named <code>ParentPartyType</code>.
     * @return the <code>PartyType</code>
     * @throws RepositoryException if an error occurs
     */
    public PartyType getParentPartyType() throws RepositoryException {
        if (this.parentPartyType == null) {
            this.parentPartyType = getRelatedOne(PartyType.class, "ParentPartyType");
        }
        return this.parentPartyType;
    }
    /**
     * Auto generated method that gets the related <code>PartyType</code> by the relation named <code>SiblingPartyType</code>.
     * @return the list of <code>PartyType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PartyType> getSiblingPartyTypes() throws RepositoryException {
        if (this.siblingPartyTypes == null) {
            this.siblingPartyTypes = getRelated(PartyType.class, "SiblingPartyType");
        }
        return this.siblingPartyTypes;
    }
    /**
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>Party</code>.
     * @return the list of <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends Party> getPartys() throws RepositoryException {
        if (this.partys == null) {
            this.partys = getRelated(Party.class, "Party");
        }
        return this.partys;
    }
    /**
     * Auto generated method that gets the related <code>PartyNeed</code> by the relation named <code>PartyNeed</code>.
     * @return the list of <code>PartyNeed</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PartyNeed> getPartyNeeds() throws RepositoryException {
        if (this.partyNeeds == null) {
            this.partyNeeds = getRelated(PartyNeed.class, "PartyNeed");
        }
        return this.partyNeeds;
    }
    /**
     * Auto generated method that gets the related <code>PartyType</code> by the relation named <code>ChildPartyType</code>.
     * @return the list of <code>PartyType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PartyType> getChildPartyTypes() throws RepositoryException {
        if (this.childPartyTypes == null) {
            this.childPartyTypes = getRelated(PartyType.class, "ChildPartyType");
        }
        return this.childPartyTypes;
    }
    /**
     * Auto generated method that gets the related <code>PartyTypeAttr</code> by the relation named <code>PartyTypeAttr</code>.
     * @return the list of <code>PartyTypeAttr</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PartyTypeAttr> getPartyTypeAttrs() throws RepositoryException {
        if (this.partyTypeAttrs == null) {
            this.partyTypeAttrs = getRelated(PartyTypeAttr.class, "PartyTypeAttr");
        }
        return this.partyTypeAttrs;
    }

    /**
     * Auto generated value setter.
     * @param parentPartyType the parentPartyType to set
    */
    public void setParentPartyType(PartyType parentPartyType) {
        this.parentPartyType = parentPartyType;
    }
    /**
     * Auto generated value setter.
     * @param siblingPartyTypes the siblingPartyTypes to set
    */
    public void setSiblingPartyTypes(List<PartyType> siblingPartyTypes) {
        this.siblingPartyTypes = siblingPartyTypes;
    }
    /**
     * Auto generated value setter.
     * @param partys the partys to set
    */
    public void setPartys(List<Party> partys) {
        this.partys = partys;
    }
    /**
     * Auto generated value setter.
     * @param partyNeeds the partyNeeds to set
    */
    public void setPartyNeeds(List<PartyNeed> partyNeeds) {
        this.partyNeeds = partyNeeds;
    }
    /**
     * Auto generated value setter.
     * @param childPartyTypes the childPartyTypes to set
    */
    public void setChildPartyTypes(List<PartyType> childPartyTypes) {
        this.childPartyTypes = childPartyTypes;
    }
    /**
     * Auto generated value setter.
     * @param partyTypeAttrs the partyTypeAttrs to set
    */
    public void setPartyTypeAttrs(List<PartyTypeAttr> partyTypeAttrs) {
        this.partyTypeAttrs = partyTypeAttrs;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addPartyTypeAttr(PartyTypeAttr partyTypeAttr) {
        if (this.partyTypeAttrs == null) {
            this.partyTypeAttrs = new ArrayList<PartyTypeAttr>();
        }
        this.partyTypeAttrs.add(partyTypeAttr);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removePartyTypeAttr(PartyTypeAttr partyTypeAttr) {
        if (this.partyTypeAttrs == null) {
            return;
        }
        this.partyTypeAttrs.remove(partyTypeAttr);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearPartyTypeAttr() {
        if (this.partyTypeAttrs == null) {
            return;
        }
        this.partyTypeAttrs.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPartyTypeId((String) mapValue.get("partyTypeId"));
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
        mapValue.put("partyTypeId", getPartyTypeId());
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
