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
 * Auto generated base entity ResponsibilityType.
 */
@javax.persistence.Entity
@Table(name="RESPONSIBILITY_TYPE")
public class ResponsibilityType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("responsibilityTypeId", "RESPONSIBILITY_TYPE_ID");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("hasTable", "HAS_TABLE");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ResponsibilityType", fields);
}
  public static enum Fields implements EntityFieldInterface<ResponsibilityType> {
    responsibilityTypeId("responsibilityTypeId"),
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

   @org.hibernate.annotations.GenericGenerator(name="ResponsibilityType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="ResponsibilityType_GEN")
   @Id
   @Column(name="RESPONSIBILITY_TYPE_ID")
   protected String responsibilityTypeId;
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
   
   protected ResponsibilityType parentResponsibilityType = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="responsibilityType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="RESPONSIBILITY_TYPE_ID")
   
   protected List<EmplPositionResponsibility> emplPositionResponsibilitys = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_TYPE_ID")
   
   protected List<ResponsibilityType> childResponsibilityTypes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="responsibilityType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="RESPONSIBILITY_TYPE_ID")
   
   protected List<ValidResponsibility> validResponsibilitys = null;

  /**
   * Default constructor.
   */
  public ResponsibilityType() {
      super();
      this.baseEntityName = "ResponsibilityType";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("responsibilityTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("responsibilityTypeId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("hasTable");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ResponsibilityType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param responsibilityTypeId the responsibilityTypeId to set
     */
    public void setResponsibilityTypeId(String responsibilityTypeId) {
        this.responsibilityTypeId = responsibilityTypeId;
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
    public String getResponsibilityTypeId() {
        return this.responsibilityTypeId;
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
     * Auto generated method that gets the related <code>ResponsibilityType</code> by the relation named <code>ParentResponsibilityType</code>.
     * @return the <code>ResponsibilityType</code>
     * @throws RepositoryException if an error occurs
     */
    public ResponsibilityType getParentResponsibilityType() throws RepositoryException {
        if (this.parentResponsibilityType == null) {
            this.parentResponsibilityType = getRelatedOne(ResponsibilityType.class, "ParentResponsibilityType");
        }
        return this.parentResponsibilityType;
    }
    /**
     * Auto generated method that gets the related <code>EmplPositionResponsibility</code> by the relation named <code>EmplPositionResponsibility</code>.
     * @return the list of <code>EmplPositionResponsibility</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends EmplPositionResponsibility> getEmplPositionResponsibilitys() throws RepositoryException {
        if (this.emplPositionResponsibilitys == null) {
            this.emplPositionResponsibilitys = getRelated(EmplPositionResponsibility.class, "EmplPositionResponsibility");
        }
        return this.emplPositionResponsibilitys;
    }
    /**
     * Auto generated method that gets the related <code>ResponsibilityType</code> by the relation named <code>ChildResponsibilityType</code>.
     * @return the list of <code>ResponsibilityType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ResponsibilityType> getChildResponsibilityTypes() throws RepositoryException {
        if (this.childResponsibilityTypes == null) {
            this.childResponsibilityTypes = getRelated(ResponsibilityType.class, "ChildResponsibilityType");
        }
        return this.childResponsibilityTypes;
    }
    /**
     * Auto generated method that gets the related <code>ValidResponsibility</code> by the relation named <code>ValidResponsibility</code>.
     * @return the list of <code>ValidResponsibility</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ValidResponsibility> getValidResponsibilitys() throws RepositoryException {
        if (this.validResponsibilitys == null) {
            this.validResponsibilitys = getRelated(ValidResponsibility.class, "ValidResponsibility");
        }
        return this.validResponsibilitys;
    }

    /**
     * Auto generated value setter.
     * @param parentResponsibilityType the parentResponsibilityType to set
    */
    public void setParentResponsibilityType(ResponsibilityType parentResponsibilityType) {
        this.parentResponsibilityType = parentResponsibilityType;
    }
    /**
     * Auto generated value setter.
     * @param emplPositionResponsibilitys the emplPositionResponsibilitys to set
    */
    public void setEmplPositionResponsibilitys(List<EmplPositionResponsibility> emplPositionResponsibilitys) {
        this.emplPositionResponsibilitys = emplPositionResponsibilitys;
    }
    /**
     * Auto generated value setter.
     * @param childResponsibilityTypes the childResponsibilityTypes to set
    */
    public void setChildResponsibilityTypes(List<ResponsibilityType> childResponsibilityTypes) {
        this.childResponsibilityTypes = childResponsibilityTypes;
    }
    /**
     * Auto generated value setter.
     * @param validResponsibilitys the validResponsibilitys to set
    */
    public void setValidResponsibilitys(List<ValidResponsibility> validResponsibilitys) {
        this.validResponsibilitys = validResponsibilitys;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addEmplPositionResponsibility(EmplPositionResponsibility emplPositionResponsibility) {
        if (this.emplPositionResponsibilitys == null) {
            this.emplPositionResponsibilitys = new ArrayList<EmplPositionResponsibility>();
        }
        this.emplPositionResponsibilitys.add(emplPositionResponsibility);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeEmplPositionResponsibility(EmplPositionResponsibility emplPositionResponsibility) {
        if (this.emplPositionResponsibilitys == null) {
            return;
        }
        this.emplPositionResponsibilitys.remove(emplPositionResponsibility);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearEmplPositionResponsibility() {
        if (this.emplPositionResponsibilitys == null) {
            return;
        }
        this.emplPositionResponsibilitys.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addValidResponsibility(ValidResponsibility validResponsibility) {
        if (this.validResponsibilitys == null) {
            this.validResponsibilitys = new ArrayList<ValidResponsibility>();
        }
        this.validResponsibilitys.add(validResponsibility);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeValidResponsibility(ValidResponsibility validResponsibility) {
        if (this.validResponsibilitys == null) {
            return;
        }
        this.validResponsibilitys.remove(validResponsibility);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearValidResponsibility() {
        if (this.validResponsibilitys == null) {
            return;
        }
        this.validResponsibilitys.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setResponsibilityTypeId((String) mapValue.get("responsibilityTypeId"));
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
        mapValue.put("responsibilityTypeId", getResponsibilityTypeId());
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
