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
 * Auto generated base entity GoodIdentificationType.
 */
@javax.persistence.Entity
@Table(name="GOOD_IDENTIFICATION_TYPE")
public class GoodIdentificationType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("goodIdentificationTypeId", "GOOD_IDENTIFICATION_TYPE_ID");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("hasTable", "HAS_TABLE");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("GoodIdentificationType", fields);
}
  public static enum Fields implements EntityFieldInterface<GoodIdentificationType> {
    goodIdentificationTypeId("goodIdentificationTypeId"),
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

   @org.hibernate.annotations.GenericGenerator(name="GoodIdentificationType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="GoodIdentificationType_GEN")
   @Id
   @Column(name="GOOD_IDENTIFICATION_TYPE_ID")
   protected String goodIdentificationTypeId;
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
   
   protected GoodIdentificationType parentGoodIdentificationType = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="goodIdentificationType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="GOOD_IDENTIFICATION_TYPE_ID")
   
   protected List<GoodIdentification> goodIdentifications = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_TYPE_ID")
   
   protected List<GoodIdentificationType> childGoodIdentificationTypes = null;

  /**
   * Default constructor.
   */
  public GoodIdentificationType() {
      super();
      this.baseEntityName = "GoodIdentificationType";
      this.isView = false;
      this.resourceName = "ProductEntityLabels";
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("goodIdentificationTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("goodIdentificationTypeId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("hasTable");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public GoodIdentificationType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param goodIdentificationTypeId the goodIdentificationTypeId to set
     */
    public void setGoodIdentificationTypeId(String goodIdentificationTypeId) {
        this.goodIdentificationTypeId = goodIdentificationTypeId;
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
    public String getGoodIdentificationTypeId() {
        return this.goodIdentificationTypeId;
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
     * Auto generated method that gets the related <code>GoodIdentificationType</code> by the relation named <code>ParentGoodIdentificationType</code>.
     * @return the <code>GoodIdentificationType</code>
     * @throws RepositoryException if an error occurs
     */
    public GoodIdentificationType getParentGoodIdentificationType() throws RepositoryException {
        if (this.parentGoodIdentificationType == null) {
            this.parentGoodIdentificationType = getRelatedOne(GoodIdentificationType.class, "ParentGoodIdentificationType");
        }
        return this.parentGoodIdentificationType;
    }
    /**
     * Auto generated method that gets the related <code>GoodIdentification</code> by the relation named <code>GoodIdentification</code>.
     * @return the list of <code>GoodIdentification</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends GoodIdentification> getGoodIdentifications() throws RepositoryException {
        if (this.goodIdentifications == null) {
            this.goodIdentifications = getRelated(GoodIdentification.class, "GoodIdentification");
        }
        return this.goodIdentifications;
    }
    /**
     * Auto generated method that gets the related <code>GoodIdentificationType</code> by the relation named <code>ChildGoodIdentificationType</code>.
     * @return the list of <code>GoodIdentificationType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends GoodIdentificationType> getChildGoodIdentificationTypes() throws RepositoryException {
        if (this.childGoodIdentificationTypes == null) {
            this.childGoodIdentificationTypes = getRelated(GoodIdentificationType.class, "ChildGoodIdentificationType");
        }
        return this.childGoodIdentificationTypes;
    }

    /**
     * Auto generated value setter.
     * @param parentGoodIdentificationType the parentGoodIdentificationType to set
    */
    public void setParentGoodIdentificationType(GoodIdentificationType parentGoodIdentificationType) {
        this.parentGoodIdentificationType = parentGoodIdentificationType;
    }
    /**
     * Auto generated value setter.
     * @param goodIdentifications the goodIdentifications to set
    */
    public void setGoodIdentifications(List<GoodIdentification> goodIdentifications) {
        this.goodIdentifications = goodIdentifications;
    }
    /**
     * Auto generated value setter.
     * @param childGoodIdentificationTypes the childGoodIdentificationTypes to set
    */
    public void setChildGoodIdentificationTypes(List<GoodIdentificationType> childGoodIdentificationTypes) {
        this.childGoodIdentificationTypes = childGoodIdentificationTypes;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addGoodIdentification(GoodIdentification goodIdentification) {
        if (this.goodIdentifications == null) {
            this.goodIdentifications = new ArrayList<GoodIdentification>();
        }
        this.goodIdentifications.add(goodIdentification);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeGoodIdentification(GoodIdentification goodIdentification) {
        if (this.goodIdentifications == null) {
            return;
        }
        this.goodIdentifications.remove(goodIdentification);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearGoodIdentification() {
        if (this.goodIdentifications == null) {
            return;
        }
        this.goodIdentifications.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setGoodIdentificationTypeId((String) mapValue.get("goodIdentificationTypeId"));
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
        mapValue.put("goodIdentificationTypeId", getGoodIdentificationTypeId());
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
