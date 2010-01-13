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
import java.lang.Long;
import java.lang.String;
import java.sql.Timestamp;

/**
 * Auto generated base entity EntitySyncHistory.
 */
@javax.persistence.Entity
@Table(name="ENTITY_SYNC_HISTORY")
public class EntitySyncHistory extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("entitySyncId", "ENTITY_SYNC_ID");
        fields.put("startDate", "START_DATE");
        fields.put("runStatusId", "RUN_STATUS_ID");
        fields.put("beginningSynchTime", "BEGINNING_SYNCH_TIME");
        fields.put("lastSuccessfulSynchTime", "LAST_SUCCESSFUL_SYNCH_TIME");
        fields.put("lastCandidateEndTime", "LAST_CANDIDATE_END_TIME");
        fields.put("lastSplitStartTime", "LAST_SPLIT_START_TIME");
        fields.put("toCreateInserted", "TO_CREATE_INSERTED");
        fields.put("toCreateUpdated", "TO_CREATE_UPDATED");
        fields.put("toCreateNotUpdated", "TO_CREATE_NOT_UPDATED");
        fields.put("toStoreInserted", "TO_STORE_INSERTED");
        fields.put("toStoreUpdated", "TO_STORE_UPDATED");
        fields.put("toStoreNotUpdated", "TO_STORE_NOT_UPDATED");
        fields.put("toRemoveDeleted", "TO_REMOVE_DELETED");
        fields.put("toRemoveAlreadyDeleted", "TO_REMOVE_ALREADY_DELETED");
        fields.put("totalRowsExported", "TOTAL_ROWS_EXPORTED");
        fields.put("totalRowsToCreate", "TOTAL_ROWS_TO_CREATE");
        fields.put("totalRowsToStore", "TOTAL_ROWS_TO_STORE");
        fields.put("totalRowsToRemove", "TOTAL_ROWS_TO_REMOVE");
        fields.put("totalSplits", "TOTAL_SPLITS");
        fields.put("totalStoreCalls", "TOTAL_STORE_CALLS");
        fields.put("runningTimeMillis", "RUNNING_TIME_MILLIS");
        fields.put("perSplitMinMillis", "PER_SPLIT_MIN_MILLIS");
        fields.put("perSplitMaxMillis", "PER_SPLIT_MAX_MILLIS");
        fields.put("perSplitMinItems", "PER_SPLIT_MIN_ITEMS");
        fields.put("perSplitMaxItems", "PER_SPLIT_MAX_ITEMS");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("EntitySyncHistory", fields);
}
  public static enum Fields implements EntityFieldInterface<EntitySyncHistory> {
    entitySyncId("entitySyncId"),
    startDate("startDate"),
    runStatusId("runStatusId"),
    beginningSynchTime("beginningSynchTime"),
    lastSuccessfulSynchTime("lastSuccessfulSynchTime"),
    lastCandidateEndTime("lastCandidateEndTime"),
    lastSplitStartTime("lastSplitStartTime"),
    toCreateInserted("toCreateInserted"),
    toCreateUpdated("toCreateUpdated"),
    toCreateNotUpdated("toCreateNotUpdated"),
    toStoreInserted("toStoreInserted"),
    toStoreUpdated("toStoreUpdated"),
    toStoreNotUpdated("toStoreNotUpdated"),
    toRemoveDeleted("toRemoveDeleted"),
    toRemoveAlreadyDeleted("toRemoveAlreadyDeleted"),
    totalRowsExported("totalRowsExported"),
    totalRowsToCreate("totalRowsToCreate"),
    totalRowsToStore("totalRowsToStore"),
    totalRowsToRemove("totalRowsToRemove"),
    totalSplits("totalSplits"),
    totalStoreCalls("totalStoreCalls"),
    runningTimeMillis("runningTimeMillis"),
    perSplitMinMillis("perSplitMinMillis"),
    perSplitMaxMillis("perSplitMaxMillis"),
    perSplitMinItems("perSplitMinItems"),
    perSplitMaxItems("perSplitMaxItems"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.EntitySyncHistoryPkBridge.class)
     protected EntitySyncHistoryPk id = new EntitySyncHistoryPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>EntitySyncHistoryPk</code>
     */
      public EntitySyncHistoryPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>EntitySyncHistoryPk</code> value to set
    */   
      public void setId(EntitySyncHistoryPk id) {
         this.id = id;
      }
   @Column(name="RUN_STATUS_ID")
   protected String runStatusId;
   @Column(name="BEGINNING_SYNCH_TIME")
   protected Timestamp beginningSynchTime;
   @Column(name="LAST_SUCCESSFUL_SYNCH_TIME")
   protected Timestamp lastSuccessfulSynchTime;
   @Column(name="LAST_CANDIDATE_END_TIME")
   protected Timestamp lastCandidateEndTime;
   @Column(name="LAST_SPLIT_START_TIME")
   protected Long lastSplitStartTime;
   @Column(name="TO_CREATE_INSERTED")
   protected Long toCreateInserted;
   @Column(name="TO_CREATE_UPDATED")
   protected Long toCreateUpdated;
   @Column(name="TO_CREATE_NOT_UPDATED")
   protected Long toCreateNotUpdated;
   @Column(name="TO_STORE_INSERTED")
   protected Long toStoreInserted;
   @Column(name="TO_STORE_UPDATED")
   protected Long toStoreUpdated;
   @Column(name="TO_STORE_NOT_UPDATED")
   protected Long toStoreNotUpdated;
   @Column(name="TO_REMOVE_DELETED")
   protected Long toRemoveDeleted;
   @Column(name="TO_REMOVE_ALREADY_DELETED")
   protected Long toRemoveAlreadyDeleted;
   @Column(name="TOTAL_ROWS_EXPORTED")
   protected Long totalRowsExported;
   @Column(name="TOTAL_ROWS_TO_CREATE")
   protected Long totalRowsToCreate;
   @Column(name="TOTAL_ROWS_TO_STORE")
   protected Long totalRowsToStore;
   @Column(name="TOTAL_ROWS_TO_REMOVE")
   protected Long totalRowsToRemove;
   @Column(name="TOTAL_SPLITS")
   protected Long totalSplits;
   @Column(name="TOTAL_STORE_CALLS")
   protected Long totalStoreCalls;
   @Column(name="RUNNING_TIME_MILLIS")
   protected Long runningTimeMillis;
   @Column(name="PER_SPLIT_MIN_MILLIS")
   protected Long perSplitMinMillis;
   @Column(name="PER_SPLIT_MAX_MILLIS")
   protected Long perSplitMaxMillis;
   @Column(name="PER_SPLIT_MIN_ITEMS")
   protected Long perSplitMinItems;
   @Column(name="PER_SPLIT_MAX_ITEMS")
   protected Long perSplitMaxItems;
   @Column(name="LAST_UPDATED_STAMP")
   protected Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   protected Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   protected Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   protected Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ENTITY_SYNC_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected EntitySync entitySync = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ENTITY_SYNC_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected EntitySync lastEntitySync = null;

  /**
   * Default constructor.
   */
  public EntitySyncHistory() {
      super();
      this.baseEntityName = "EntitySyncHistory";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("entitySyncId");this.primaryKeyNames.add("startDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("entitySyncId");this.allFieldsNames.add("startDate");this.allFieldsNames.add("runStatusId");this.allFieldsNames.add("beginningSynchTime");this.allFieldsNames.add("lastSuccessfulSynchTime");this.allFieldsNames.add("lastCandidateEndTime");this.allFieldsNames.add("lastSplitStartTime");this.allFieldsNames.add("toCreateInserted");this.allFieldsNames.add("toCreateUpdated");this.allFieldsNames.add("toCreateNotUpdated");this.allFieldsNames.add("toStoreInserted");this.allFieldsNames.add("toStoreUpdated");this.allFieldsNames.add("toStoreNotUpdated");this.allFieldsNames.add("toRemoveDeleted");this.allFieldsNames.add("toRemoveAlreadyDeleted");this.allFieldsNames.add("totalRowsExported");this.allFieldsNames.add("totalRowsToCreate");this.allFieldsNames.add("totalRowsToStore");this.allFieldsNames.add("totalRowsToRemove");this.allFieldsNames.add("totalSplits");this.allFieldsNames.add("totalStoreCalls");this.allFieldsNames.add("runningTimeMillis");this.allFieldsNames.add("perSplitMinMillis");this.allFieldsNames.add("perSplitMaxMillis");this.allFieldsNames.add("perSplitMinItems");this.allFieldsNames.add("perSplitMaxItems");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public EntitySyncHistory(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param entitySyncId the entitySyncId to set
     */
    public void setEntitySyncId(String entitySyncId) {
        id.setEntitySyncId(entitySyncId);
    }
    /**
     * Auto generated value setter.
     * @param startDate the startDate to set
     */
    public void setStartDate(Timestamp startDate) {
        id.setStartDate(startDate);
    }
    /**
     * Auto generated value setter.
     * @param runStatusId the runStatusId to set
     */
    public void setRunStatusId(String runStatusId) {
        this.runStatusId = runStatusId;
    }
    /**
     * Auto generated value setter.
     * @param beginningSynchTime the beginningSynchTime to set
     */
    public void setBeginningSynchTime(Timestamp beginningSynchTime) {
        this.beginningSynchTime = beginningSynchTime;
    }
    /**
     * Auto generated value setter.
     * @param lastSuccessfulSynchTime the lastSuccessfulSynchTime to set
     */
    public void setLastSuccessfulSynchTime(Timestamp lastSuccessfulSynchTime) {
        this.lastSuccessfulSynchTime = lastSuccessfulSynchTime;
    }
    /**
     * Auto generated value setter.
     * @param lastCandidateEndTime the lastCandidateEndTime to set
     */
    public void setLastCandidateEndTime(Timestamp lastCandidateEndTime) {
        this.lastCandidateEndTime = lastCandidateEndTime;
    }
    /**
     * Auto generated value setter.
     * @param lastSplitStartTime the lastSplitStartTime to set
     */
    public void setLastSplitStartTime(Long lastSplitStartTime) {
        this.lastSplitStartTime = lastSplitStartTime;
    }
    /**
     * Auto generated value setter.
     * @param toCreateInserted the toCreateInserted to set
     */
    public void setToCreateInserted(Long toCreateInserted) {
        this.toCreateInserted = toCreateInserted;
    }
    /**
     * Auto generated value setter.
     * @param toCreateUpdated the toCreateUpdated to set
     */
    public void setToCreateUpdated(Long toCreateUpdated) {
        this.toCreateUpdated = toCreateUpdated;
    }
    /**
     * Auto generated value setter.
     * @param toCreateNotUpdated the toCreateNotUpdated to set
     */
    public void setToCreateNotUpdated(Long toCreateNotUpdated) {
        this.toCreateNotUpdated = toCreateNotUpdated;
    }
    /**
     * Auto generated value setter.
     * @param toStoreInserted the toStoreInserted to set
     */
    public void setToStoreInserted(Long toStoreInserted) {
        this.toStoreInserted = toStoreInserted;
    }
    /**
     * Auto generated value setter.
     * @param toStoreUpdated the toStoreUpdated to set
     */
    public void setToStoreUpdated(Long toStoreUpdated) {
        this.toStoreUpdated = toStoreUpdated;
    }
    /**
     * Auto generated value setter.
     * @param toStoreNotUpdated the toStoreNotUpdated to set
     */
    public void setToStoreNotUpdated(Long toStoreNotUpdated) {
        this.toStoreNotUpdated = toStoreNotUpdated;
    }
    /**
     * Auto generated value setter.
     * @param toRemoveDeleted the toRemoveDeleted to set
     */
    public void setToRemoveDeleted(Long toRemoveDeleted) {
        this.toRemoveDeleted = toRemoveDeleted;
    }
    /**
     * Auto generated value setter.
     * @param toRemoveAlreadyDeleted the toRemoveAlreadyDeleted to set
     */
    public void setToRemoveAlreadyDeleted(Long toRemoveAlreadyDeleted) {
        this.toRemoveAlreadyDeleted = toRemoveAlreadyDeleted;
    }
    /**
     * Auto generated value setter.
     * @param totalRowsExported the totalRowsExported to set
     */
    public void setTotalRowsExported(Long totalRowsExported) {
        this.totalRowsExported = totalRowsExported;
    }
    /**
     * Auto generated value setter.
     * @param totalRowsToCreate the totalRowsToCreate to set
     */
    public void setTotalRowsToCreate(Long totalRowsToCreate) {
        this.totalRowsToCreate = totalRowsToCreate;
    }
    /**
     * Auto generated value setter.
     * @param totalRowsToStore the totalRowsToStore to set
     */
    public void setTotalRowsToStore(Long totalRowsToStore) {
        this.totalRowsToStore = totalRowsToStore;
    }
    /**
     * Auto generated value setter.
     * @param totalRowsToRemove the totalRowsToRemove to set
     */
    public void setTotalRowsToRemove(Long totalRowsToRemove) {
        this.totalRowsToRemove = totalRowsToRemove;
    }
    /**
     * Auto generated value setter.
     * @param totalSplits the totalSplits to set
     */
    public void setTotalSplits(Long totalSplits) {
        this.totalSplits = totalSplits;
    }
    /**
     * Auto generated value setter.
     * @param totalStoreCalls the totalStoreCalls to set
     */
    public void setTotalStoreCalls(Long totalStoreCalls) {
        this.totalStoreCalls = totalStoreCalls;
    }
    /**
     * Auto generated value setter.
     * @param runningTimeMillis the runningTimeMillis to set
     */
    public void setRunningTimeMillis(Long runningTimeMillis) {
        this.runningTimeMillis = runningTimeMillis;
    }
    /**
     * Auto generated value setter.
     * @param perSplitMinMillis the perSplitMinMillis to set
     */
    public void setPerSplitMinMillis(Long perSplitMinMillis) {
        this.perSplitMinMillis = perSplitMinMillis;
    }
    /**
     * Auto generated value setter.
     * @param perSplitMaxMillis the perSplitMaxMillis to set
     */
    public void setPerSplitMaxMillis(Long perSplitMaxMillis) {
        this.perSplitMaxMillis = perSplitMaxMillis;
    }
    /**
     * Auto generated value setter.
     * @param perSplitMinItems the perSplitMinItems to set
     */
    public void setPerSplitMinItems(Long perSplitMinItems) {
        this.perSplitMinItems = perSplitMinItems;
    }
    /**
     * Auto generated value setter.
     * @param perSplitMaxItems the perSplitMaxItems to set
     */
    public void setPerSplitMaxItems(Long perSplitMaxItems) {
        this.perSplitMaxItems = perSplitMaxItems;
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
    public String getEntitySyncId() {
        return this.id.getEntitySyncId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getStartDate() {
        return this.id.getStartDate();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRunStatusId() {
        return this.runStatusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getBeginningSynchTime() {
        return this.beginningSynchTime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastSuccessfulSynchTime() {
        return this.lastSuccessfulSynchTime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastCandidateEndTime() {
        return this.lastCandidateEndTime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getLastSplitStartTime() {
        return this.lastSplitStartTime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getToCreateInserted() {
        return this.toCreateInserted;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getToCreateUpdated() {
        return this.toCreateUpdated;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getToCreateNotUpdated() {
        return this.toCreateNotUpdated;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getToStoreInserted() {
        return this.toStoreInserted;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getToStoreUpdated() {
        return this.toStoreUpdated;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getToStoreNotUpdated() {
        return this.toStoreNotUpdated;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getToRemoveDeleted() {
        return this.toRemoveDeleted;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getToRemoveAlreadyDeleted() {
        return this.toRemoveAlreadyDeleted;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getTotalRowsExported() {
        return this.totalRowsExported;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getTotalRowsToCreate() {
        return this.totalRowsToCreate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getTotalRowsToStore() {
        return this.totalRowsToStore;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getTotalRowsToRemove() {
        return this.totalRowsToRemove;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getTotalSplits() {
        return this.totalSplits;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getTotalStoreCalls() {
        return this.totalStoreCalls;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getRunningTimeMillis() {
        return this.runningTimeMillis;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getPerSplitMinMillis() {
        return this.perSplitMinMillis;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getPerSplitMaxMillis() {
        return this.perSplitMaxMillis;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getPerSplitMinItems() {
        return this.perSplitMinItems;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getPerSplitMaxItems() {
        return this.perSplitMaxItems;
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
     * Auto generated method that gets the related <code>EntitySync</code> by the relation named <code>EntitySync</code>.
     * @return the <code>EntitySync</code>
     * @throws RepositoryException if an error occurs
     */
    public EntitySync getEntitySync() throws RepositoryException {
        if (this.entitySync == null) {
            this.entitySync = getRelatedOne(EntitySync.class, "EntitySync");
        }
        return this.entitySync;
    }
    /**
     * Auto generated method that gets the related <code>EntitySync</code> by the relation named <code>LastEntitySync</code>.
     * @return the <code>EntitySync</code>
     * @throws RepositoryException if an error occurs
     */
    public EntitySync getLastEntitySync() throws RepositoryException {
        if (this.lastEntitySync == null) {
            this.lastEntitySync = getRelatedOne(EntitySync.class, "LastEntitySync");
        }
        return this.lastEntitySync;
    }

    /**
     * Auto generated value setter.
     * @param entitySync the entitySync to set
    */
    public void setEntitySync(EntitySync entitySync) {
        this.entitySync = entitySync;
    }
    /**
     * Auto generated value setter.
     * @param lastEntitySync the lastEntitySync to set
    */
    public void setLastEntitySync(EntitySync lastEntitySync) {
        this.lastEntitySync = lastEntitySync;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setEntitySyncId((String) mapValue.get("entitySyncId"));
        setStartDate((Timestamp) mapValue.get("startDate"));
        setRunStatusId((String) mapValue.get("runStatusId"));
        setBeginningSynchTime((Timestamp) mapValue.get("beginningSynchTime"));
        setLastSuccessfulSynchTime((Timestamp) mapValue.get("lastSuccessfulSynchTime"));
        setLastCandidateEndTime((Timestamp) mapValue.get("lastCandidateEndTime"));
        setLastSplitStartTime((Long) mapValue.get("lastSplitStartTime"));
        setToCreateInserted((Long) mapValue.get("toCreateInserted"));
        setToCreateUpdated((Long) mapValue.get("toCreateUpdated"));
        setToCreateNotUpdated((Long) mapValue.get("toCreateNotUpdated"));
        setToStoreInserted((Long) mapValue.get("toStoreInserted"));
        setToStoreUpdated((Long) mapValue.get("toStoreUpdated"));
        setToStoreNotUpdated((Long) mapValue.get("toStoreNotUpdated"));
        setToRemoveDeleted((Long) mapValue.get("toRemoveDeleted"));
        setToRemoveAlreadyDeleted((Long) mapValue.get("toRemoveAlreadyDeleted"));
        setTotalRowsExported((Long) mapValue.get("totalRowsExported"));
        setTotalRowsToCreate((Long) mapValue.get("totalRowsToCreate"));
        setTotalRowsToStore((Long) mapValue.get("totalRowsToStore"));
        setTotalRowsToRemove((Long) mapValue.get("totalRowsToRemove"));
        setTotalSplits((Long) mapValue.get("totalSplits"));
        setTotalStoreCalls((Long) mapValue.get("totalStoreCalls"));
        setRunningTimeMillis((Long) mapValue.get("runningTimeMillis"));
        setPerSplitMinMillis((Long) mapValue.get("perSplitMinMillis"));
        setPerSplitMaxMillis((Long) mapValue.get("perSplitMaxMillis"));
        setPerSplitMinItems((Long) mapValue.get("perSplitMinItems"));
        setPerSplitMaxItems((Long) mapValue.get("perSplitMaxItems"));
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
        mapValue.put("entitySyncId", getEntitySyncId());
        mapValue.put("startDate", getStartDate());
        mapValue.put("runStatusId", getRunStatusId());
        mapValue.put("beginningSynchTime", getBeginningSynchTime());
        mapValue.put("lastSuccessfulSynchTime", getLastSuccessfulSynchTime());
        mapValue.put("lastCandidateEndTime", getLastCandidateEndTime());
        mapValue.put("lastSplitStartTime", getLastSplitStartTime());
        mapValue.put("toCreateInserted", getToCreateInserted());
        mapValue.put("toCreateUpdated", getToCreateUpdated());
        mapValue.put("toCreateNotUpdated", getToCreateNotUpdated());
        mapValue.put("toStoreInserted", getToStoreInserted());
        mapValue.put("toStoreUpdated", getToStoreUpdated());
        mapValue.put("toStoreNotUpdated", getToStoreNotUpdated());
        mapValue.put("toRemoveDeleted", getToRemoveDeleted());
        mapValue.put("toRemoveAlreadyDeleted", getToRemoveAlreadyDeleted());
        mapValue.put("totalRowsExported", getTotalRowsExported());
        mapValue.put("totalRowsToCreate", getTotalRowsToCreate());
        mapValue.put("totalRowsToStore", getTotalRowsToStore());
        mapValue.put("totalRowsToRemove", getTotalRowsToRemove());
        mapValue.put("totalSplits", getTotalSplits());
        mapValue.put("totalStoreCalls", getTotalStoreCalls());
        mapValue.put("runningTimeMillis", getRunningTimeMillis());
        mapValue.put("perSplitMinMillis", getPerSplitMinMillis());
        mapValue.put("perSplitMaxMillis", getPerSplitMaxMillis());
        mapValue.put("perSplitMinItems", getPerSplitMinItems());
        mapValue.put("perSplitMaxItems", getPerSplitMaxItems());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
