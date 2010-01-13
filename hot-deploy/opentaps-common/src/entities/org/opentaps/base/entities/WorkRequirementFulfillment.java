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
 * Auto generated base entity WorkRequirementFulfillment.
 */
@javax.persistence.Entity
@Table(name="WORK_REQUIREMENT_FULFILLMENT")
public class WorkRequirementFulfillment extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("requirementId", "REQUIREMENT_ID");
        fields.put("workEffortId", "WORK_EFFORT_ID");
        fields.put("workReqFulfTypeId", "WORK_REQ_FULF_TYPE_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("WorkRequirementFulfillment", fields);
}
  public static enum Fields implements EntityFieldInterface<WorkRequirementFulfillment> {
    requirementId("requirementId"),
    workEffortId("workEffortId"),
    workReqFulfTypeId("workReqFulfTypeId"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.WorkRequirementFulfillmentPkBridge.class)
     protected WorkRequirementFulfillmentPk id = new WorkRequirementFulfillmentPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>WorkRequirementFulfillmentPk</code>
     */
      public WorkRequirementFulfillmentPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>WorkRequirementFulfillmentPk</code> value to set
    */   
      public void setId(WorkRequirementFulfillmentPk id) {
         this.id = id;
      }
   @Column(name="WORK_REQ_FULF_TYPE_ID")
   protected String workReqFulfTypeId;
   @Column(name="LAST_UPDATED_STAMP")
   protected Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   protected Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   protected Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   protected Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="REQUIREMENT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected Requirement requirement = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="WORK_EFFORT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected WorkEffort workEffort = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="WORK_REQ_FULF_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected WorkReqFulfType workReqFulfType = null;

  /**
   * Default constructor.
   */
  public WorkRequirementFulfillment() {
      super();
      this.baseEntityName = "WorkRequirementFulfillment";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("requirementId");this.primaryKeyNames.add("workEffortId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("requirementId");this.allFieldsNames.add("workEffortId");this.allFieldsNames.add("workReqFulfTypeId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public WorkRequirementFulfillment(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param requirementId the requirementId to set
     */
    public void setRequirementId(String requirementId) {
        id.setRequirementId(requirementId);
    }
    /**
     * Auto generated value setter.
     * @param workEffortId the workEffortId to set
     */
    public void setWorkEffortId(String workEffortId) {
        id.setWorkEffortId(workEffortId);
    }
    /**
     * Auto generated value setter.
     * @param workReqFulfTypeId the workReqFulfTypeId to set
     */
    public void setWorkReqFulfTypeId(String workReqFulfTypeId) {
        this.workReqFulfTypeId = workReqFulfTypeId;
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
    public String getRequirementId() {
        return this.id.getRequirementId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWorkEffortId() {
        return this.id.getWorkEffortId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWorkReqFulfTypeId() {
        return this.workReqFulfTypeId;
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
     * Auto generated method that gets the related <code>Requirement</code> by the relation named <code>Requirement</code>.
     * @return the <code>Requirement</code>
     * @throws RepositoryException if an error occurs
     */
    public Requirement getRequirement() throws RepositoryException {
        if (this.requirement == null) {
            this.requirement = getRelatedOne(Requirement.class, "Requirement");
        }
        return this.requirement;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffort</code> by the relation named <code>WorkEffort</code>.
     * @return the <code>WorkEffort</code>
     * @throws RepositoryException if an error occurs
     */
    public WorkEffort getWorkEffort() throws RepositoryException {
        if (this.workEffort == null) {
            this.workEffort = getRelatedOne(WorkEffort.class, "WorkEffort");
        }
        return this.workEffort;
    }
    /**
     * Auto generated method that gets the related <code>WorkReqFulfType</code> by the relation named <code>WorkReqFulfType</code>.
     * @return the <code>WorkReqFulfType</code>
     * @throws RepositoryException if an error occurs
     */
    public WorkReqFulfType getWorkReqFulfType() throws RepositoryException {
        if (this.workReqFulfType == null) {
            this.workReqFulfType = getRelatedOne(WorkReqFulfType.class, "WorkReqFulfType");
        }
        return this.workReqFulfType;
    }

    /**
     * Auto generated value setter.
     * @param requirement the requirement to set
    */
    public void setRequirement(Requirement requirement) {
        this.requirement = requirement;
    }
    /**
     * Auto generated value setter.
     * @param workEffort the workEffort to set
    */
    public void setWorkEffort(WorkEffort workEffort) {
        this.workEffort = workEffort;
    }
    /**
     * Auto generated value setter.
     * @param workReqFulfType the workReqFulfType to set
    */
    public void setWorkReqFulfType(WorkReqFulfType workReqFulfType) {
        this.workReqFulfType = workReqFulfType;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setRequirementId((String) mapValue.get("requirementId"));
        setWorkEffortId((String) mapValue.get("workEffortId"));
        setWorkReqFulfTypeId((String) mapValue.get("workReqFulfTypeId"));
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
        mapValue.put("requirementId", getRequirementId());
        mapValue.put("workEffortId", getWorkEffortId());
        mapValue.put("workReqFulfTypeId", getWorkReqFulfTypeId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
