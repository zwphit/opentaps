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
 * Auto generated base entity PerfReviewItem.
 */
@javax.persistence.Entity
@Table(name="PERF_REVIEW_ITEM")
public class PerfReviewItem extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("employeePartyId", "EMPLOYEE_PARTY_ID");
        fields.put("employeeRoleTypeId", "EMPLOYEE_ROLE_TYPE_ID");
        fields.put("perfReviewId", "PERF_REVIEW_ID");
        fields.put("perfReviewItemSeqId", "PERF_REVIEW_ITEM_SEQ_ID");
        fields.put("perfRatingTypeId", "PERF_RATING_TYPE_ID");
        fields.put("perfReviewItemTypeId", "PERF_REVIEW_ITEM_TYPE_ID");
        fields.put("comments", "COMMENTS");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("PerfReviewItem", fields);
}
  public static enum Fields implements EntityFieldInterface<PerfReviewItem> {
    employeePartyId("employeePartyId"),
    employeeRoleTypeId("employeeRoleTypeId"),
    perfReviewId("perfReviewId"),
    perfReviewItemSeqId("perfReviewItemSeqId"),
    perfRatingTypeId("perfRatingTypeId"),
    perfReviewItemTypeId("perfReviewItemTypeId"),
    comments("comments"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.PerfReviewItemPkBridge.class)
     protected PerfReviewItemPk id = new PerfReviewItemPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>PerfReviewItemPk</code>
     */
      public PerfReviewItemPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>PerfReviewItemPk</code> value to set
    */   
      public void setId(PerfReviewItemPk id) {
         this.id = id;
      }
   @Column(name="PERF_RATING_TYPE_ID")
   protected String perfRatingTypeId;
   @Column(name="PERF_REVIEW_ITEM_TYPE_ID")
   protected String perfReviewItemTypeId;
   @Column(name="COMMENTS")
   protected String comments;
   @Column(name="LAST_UPDATED_STAMP")
   protected Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   protected Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   protected Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   protected Timestamp createdTxStamp;
   private transient PerfReview perfReview = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="EMPLOYEE_PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected Party employeeParty = null;
   private transient PartyRole employeePartyRole = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PERF_RATING_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected PerfRatingType perfRatingType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PERF_REVIEW_ITEM_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected PerfReviewItemType perfReviewItemType = null;

  /**
   * Default constructor.
   */
  public PerfReviewItem() {
      super();
      this.baseEntityName = "PerfReviewItem";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("employeePartyId");this.primaryKeyNames.add("employeeRoleTypeId");this.primaryKeyNames.add("perfReviewId");this.primaryKeyNames.add("perfReviewItemSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("employeePartyId");this.allFieldsNames.add("employeeRoleTypeId");this.allFieldsNames.add("perfReviewId");this.allFieldsNames.add("perfReviewItemSeqId");this.allFieldsNames.add("perfRatingTypeId");this.allFieldsNames.add("perfReviewItemTypeId");this.allFieldsNames.add("comments");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PerfReviewItem(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param employeePartyId the employeePartyId to set
     */
    public void setEmployeePartyId(String employeePartyId) {
        id.setEmployeePartyId(employeePartyId);
    }
    /**
     * Auto generated value setter.
     * @param employeeRoleTypeId the employeeRoleTypeId to set
     */
    public void setEmployeeRoleTypeId(String employeeRoleTypeId) {
        id.setEmployeeRoleTypeId(employeeRoleTypeId);
    }
    /**
     * Auto generated value setter.
     * @param perfReviewId the perfReviewId to set
     */
    public void setPerfReviewId(String perfReviewId) {
        id.setPerfReviewId(perfReviewId);
    }
    /**
     * Auto generated value setter.
     * @param perfReviewItemSeqId the perfReviewItemSeqId to set
     */
    public void setPerfReviewItemSeqId(String perfReviewItemSeqId) {
        id.setPerfReviewItemSeqId(perfReviewItemSeqId);
    }
    /**
     * Auto generated value setter.
     * @param perfRatingTypeId the perfRatingTypeId to set
     */
    public void setPerfRatingTypeId(String perfRatingTypeId) {
        this.perfRatingTypeId = perfRatingTypeId;
    }
    /**
     * Auto generated value setter.
     * @param perfReviewItemTypeId the perfReviewItemTypeId to set
     */
    public void setPerfReviewItemTypeId(String perfReviewItemTypeId) {
        this.perfReviewItemTypeId = perfReviewItemTypeId;
    }
    /**
     * Auto generated value setter.
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
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
    public String getEmployeePartyId() {
        return this.id.getEmployeePartyId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getEmployeeRoleTypeId() {
        return this.id.getEmployeeRoleTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPerfReviewId() {
        return this.id.getPerfReviewId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPerfReviewItemSeqId() {
        return this.id.getPerfReviewItemSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPerfRatingTypeId() {
        return this.perfRatingTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPerfReviewItemTypeId() {
        return this.perfReviewItemTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getComments() {
        return this.comments;
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
     * Auto generated method that gets the related <code>PerfReview</code> by the relation named <code>PerfReview</code>.
     * @return the <code>PerfReview</code>
     * @throws RepositoryException if an error occurs
     */
    public PerfReview getPerfReview() throws RepositoryException {
        if (this.perfReview == null) {
            this.perfReview = getRelatedOne(PerfReview.class, "PerfReview");
        }
        return this.perfReview;
    }
    /**
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>EmployeeParty</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getEmployeeParty() throws RepositoryException {
        if (this.employeeParty == null) {
            this.employeeParty = getRelatedOne(Party.class, "EmployeeParty");
        }
        return this.employeeParty;
    }
    /**
     * Auto generated method that gets the related <code>PartyRole</code> by the relation named <code>EmployeePartyRole</code>.
     * @return the <code>PartyRole</code>
     * @throws RepositoryException if an error occurs
     */
    public PartyRole getEmployeePartyRole() throws RepositoryException {
        if (this.employeePartyRole == null) {
            this.employeePartyRole = getRelatedOne(PartyRole.class, "EmployeePartyRole");
        }
        return this.employeePartyRole;
    }
    /**
     * Auto generated method that gets the related <code>PerfRatingType</code> by the relation named <code>PerfRatingType</code>.
     * @return the <code>PerfRatingType</code>
     * @throws RepositoryException if an error occurs
     */
    public PerfRatingType getPerfRatingType() throws RepositoryException {
        if (this.perfRatingType == null) {
            this.perfRatingType = getRelatedOne(PerfRatingType.class, "PerfRatingType");
        }
        return this.perfRatingType;
    }
    /**
     * Auto generated method that gets the related <code>PerfReviewItemType</code> by the relation named <code>PerfReviewItemType</code>.
     * @return the <code>PerfReviewItemType</code>
     * @throws RepositoryException if an error occurs
     */
    public PerfReviewItemType getPerfReviewItemType() throws RepositoryException {
        if (this.perfReviewItemType == null) {
            this.perfReviewItemType = getRelatedOne(PerfReviewItemType.class, "PerfReviewItemType");
        }
        return this.perfReviewItemType;
    }

    /**
     * Auto generated value setter.
     * @param perfReview the perfReview to set
    */
    public void setPerfReview(PerfReview perfReview) {
        this.perfReview = perfReview;
    }
    /**
     * Auto generated value setter.
     * @param employeeParty the employeeParty to set
    */
    public void setEmployeeParty(Party employeeParty) {
        this.employeeParty = employeeParty;
    }
    /**
     * Auto generated value setter.
     * @param employeePartyRole the employeePartyRole to set
    */
    public void setEmployeePartyRole(PartyRole employeePartyRole) {
        this.employeePartyRole = employeePartyRole;
    }
    /**
     * Auto generated value setter.
     * @param perfRatingType the perfRatingType to set
    */
    public void setPerfRatingType(PerfRatingType perfRatingType) {
        this.perfRatingType = perfRatingType;
    }
    /**
     * Auto generated value setter.
     * @param perfReviewItemType the perfReviewItemType to set
    */
    public void setPerfReviewItemType(PerfReviewItemType perfReviewItemType) {
        this.perfReviewItemType = perfReviewItemType;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setEmployeePartyId((String) mapValue.get("employeePartyId"));
        setEmployeeRoleTypeId((String) mapValue.get("employeeRoleTypeId"));
        setPerfReviewId((String) mapValue.get("perfReviewId"));
        setPerfReviewItemSeqId((String) mapValue.get("perfReviewItemSeqId"));
        setPerfRatingTypeId((String) mapValue.get("perfRatingTypeId"));
        setPerfReviewItemTypeId((String) mapValue.get("perfReviewItemTypeId"));
        setComments((String) mapValue.get("comments"));
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
        mapValue.put("employeePartyId", getEmployeePartyId());
        mapValue.put("employeeRoleTypeId", getEmployeeRoleTypeId());
        mapValue.put("perfReviewId", getPerfReviewId());
        mapValue.put("perfReviewItemSeqId", getPerfReviewItemSeqId());
        mapValue.put("perfRatingTypeId", getPerfRatingTypeId());
        mapValue.put("perfReviewItemTypeId", getPerfReviewItemTypeId());
        mapValue.put("comments", getComments());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
