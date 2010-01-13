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
 * Auto generated base entity Deliverable.
 */
@javax.persistence.Entity
@Table(name="DELIVERABLE")
public class Deliverable extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("deliverableId", "DELIVERABLE_ID");
        fields.put("deliverableTypeId", "DELIVERABLE_TYPE_ID");
        fields.put("deliverableName", "DELIVERABLE_NAME");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("Deliverable", fields);
}
  public static enum Fields implements EntityFieldInterface<Deliverable> {
    deliverableId("deliverableId"),
    deliverableTypeId("deliverableTypeId"),
    deliverableName("deliverableName"),
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

   @org.hibernate.annotations.GenericGenerator(name="Deliverable_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="Deliverable_GEN")
   @Id
   @Column(name="DELIVERABLE_ID")
   protected String deliverableId;
   @Column(name="DELIVERABLE_TYPE_ID")
   protected String deliverableTypeId;
   @Column(name="DELIVERABLE_NAME")
   protected String deliverableName;
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
   @JoinColumn(name="DELIVERABLE_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected DeliverableType deliverableType = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="DELIVERABLE_ID")
   
   protected List<Requirement> requirements = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="deliverable", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="DELIVERABLE_ID")
   
   protected List<WorkEffortDeliverableProd> workEffortDeliverableProds = null;

  /**
   * Default constructor.
   */
  public Deliverable() {
      super();
      this.baseEntityName = "Deliverable";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("deliverableId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("deliverableId");this.allFieldsNames.add("deliverableTypeId");this.allFieldsNames.add("deliverableName");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public Deliverable(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param deliverableId the deliverableId to set
     */
    public void setDeliverableId(String deliverableId) {
        this.deliverableId = deliverableId;
    }
    /**
     * Auto generated value setter.
     * @param deliverableTypeId the deliverableTypeId to set
     */
    public void setDeliverableTypeId(String deliverableTypeId) {
        this.deliverableTypeId = deliverableTypeId;
    }
    /**
     * Auto generated value setter.
     * @param deliverableName the deliverableName to set
     */
    public void setDeliverableName(String deliverableName) {
        this.deliverableName = deliverableName;
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
    public String getDeliverableId() {
        return this.deliverableId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDeliverableTypeId() {
        return this.deliverableTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDeliverableName() {
        return this.deliverableName;
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
     * Auto generated method that gets the related <code>DeliverableType</code> by the relation named <code>DeliverableType</code>.
     * @return the <code>DeliverableType</code>
     * @throws RepositoryException if an error occurs
     */
    public DeliverableType getDeliverableType() throws RepositoryException {
        if (this.deliverableType == null) {
            this.deliverableType = getRelatedOne(DeliverableType.class, "DeliverableType");
        }
        return this.deliverableType;
    }
    /**
     * Auto generated method that gets the related <code>Requirement</code> by the relation named <code>Requirement</code>.
     * @return the list of <code>Requirement</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends Requirement> getRequirements() throws RepositoryException {
        if (this.requirements == null) {
            this.requirements = getRelated(Requirement.class, "Requirement");
        }
        return this.requirements;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffortDeliverableProd</code> by the relation named <code>WorkEffortDeliverableProd</code>.
     * @return the list of <code>WorkEffortDeliverableProd</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WorkEffortDeliverableProd> getWorkEffortDeliverableProds() throws RepositoryException {
        if (this.workEffortDeliverableProds == null) {
            this.workEffortDeliverableProds = getRelated(WorkEffortDeliverableProd.class, "WorkEffortDeliverableProd");
        }
        return this.workEffortDeliverableProds;
    }

    /**
     * Auto generated value setter.
     * @param deliverableType the deliverableType to set
    */
    public void setDeliverableType(DeliverableType deliverableType) {
        this.deliverableType = deliverableType;
    }
    /**
     * Auto generated value setter.
     * @param requirements the requirements to set
    */
    public void setRequirements(List<Requirement> requirements) {
        this.requirements = requirements;
    }
    /**
     * Auto generated value setter.
     * @param workEffortDeliverableProds the workEffortDeliverableProds to set
    */
    public void setWorkEffortDeliverableProds(List<WorkEffortDeliverableProd> workEffortDeliverableProds) {
        this.workEffortDeliverableProds = workEffortDeliverableProds;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addWorkEffortDeliverableProd(WorkEffortDeliverableProd workEffortDeliverableProd) {
        if (this.workEffortDeliverableProds == null) {
            this.workEffortDeliverableProds = new ArrayList<WorkEffortDeliverableProd>();
        }
        this.workEffortDeliverableProds.add(workEffortDeliverableProd);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeWorkEffortDeliverableProd(WorkEffortDeliverableProd workEffortDeliverableProd) {
        if (this.workEffortDeliverableProds == null) {
            return;
        }
        this.workEffortDeliverableProds.remove(workEffortDeliverableProd);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearWorkEffortDeliverableProd() {
        if (this.workEffortDeliverableProds == null) {
            return;
        }
        this.workEffortDeliverableProds.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setDeliverableId((String) mapValue.get("deliverableId"));
        setDeliverableTypeId((String) mapValue.get("deliverableTypeId"));
        setDeliverableName((String) mapValue.get("deliverableName"));
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
        mapValue.put("deliverableId", getDeliverableId());
        mapValue.put("deliverableTypeId", getDeliverableTypeId());
        mapValue.put("deliverableName", getDeliverableName());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
