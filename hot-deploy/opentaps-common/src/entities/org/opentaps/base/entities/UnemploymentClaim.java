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
 * Auto generated base entity UnemploymentClaim.
 */
@javax.persistence.Entity
@Table(name="UNEMPLOYMENT_CLAIM")
public class UnemploymentClaim extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("unemploymentClaimId", "UNEMPLOYMENT_CLAIM_ID");
        fields.put("unemploymentClaimDate", "UNEMPLOYMENT_CLAIM_DATE");
        fields.put("description", "DESCRIPTION");
        fields.put("statusId", "STATUS_ID");
        fields.put("partyIdFrom", "PARTY_ID_FROM");
        fields.put("partyIdTo", "PARTY_ID_TO");
        fields.put("roleTypeIdFrom", "ROLE_TYPE_ID_FROM");
        fields.put("roleTypeIdTo", "ROLE_TYPE_ID_TO");
        fields.put("fromDate", "FROM_DATE");
        fields.put("thruDate", "THRU_DATE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("UnemploymentClaim", fields);
}
  public static enum Fields implements EntityFieldInterface<UnemploymentClaim> {
    unemploymentClaimId("unemploymentClaimId"),
    unemploymentClaimDate("unemploymentClaimDate"),
    description("description"),
    statusId("statusId"),
    partyIdFrom("partyIdFrom"),
    partyIdTo("partyIdTo"),
    roleTypeIdFrom("roleTypeIdFrom"),
    roleTypeIdTo("roleTypeIdTo"),
    fromDate("fromDate"),
    thruDate("thruDate"),
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

   @org.hibernate.annotations.GenericGenerator(name="UnemploymentClaim_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="UnemploymentClaim_GEN")
   @Id
   @Column(name="UNEMPLOYMENT_CLAIM_ID")
   protected String unemploymentClaimId;
   @Column(name="UNEMPLOYMENT_CLAIM_DATE")
   protected Timestamp unemploymentClaimDate;
   @Column(name="DESCRIPTION")
   protected String description;
   @Column(name="STATUS_ID")
   protected String statusId;
   @Column(name="PARTY_ID_FROM")
   protected String partyIdFrom;
   @Column(name="PARTY_ID_TO")
   protected String partyIdTo;
   @Column(name="ROLE_TYPE_ID_FROM")
   protected String roleTypeIdFrom;
   @Column(name="ROLE_TYPE_ID_TO")
   protected String roleTypeIdTo;
   @Column(name="FROM_DATE")
   protected Timestamp fromDate;
   @Column(name="THRU_DATE")
   protected Timestamp thruDate;
   @Column(name="LAST_UPDATED_STAMP")
   protected Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   protected Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   protected Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   protected Timestamp createdTxStamp;
   private transient Employment employment = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="STATUS_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected StatusItem statusItem = null;

  /**
   * Default constructor.
   */
  public UnemploymentClaim() {
      super();
      this.baseEntityName = "UnemploymentClaim";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("unemploymentClaimId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("unemploymentClaimId");this.allFieldsNames.add("unemploymentClaimDate");this.allFieldsNames.add("description");this.allFieldsNames.add("statusId");this.allFieldsNames.add("partyIdFrom");this.allFieldsNames.add("partyIdTo");this.allFieldsNames.add("roleTypeIdFrom");this.allFieldsNames.add("roleTypeIdTo");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public UnemploymentClaim(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param unemploymentClaimId the unemploymentClaimId to set
     */
    public void setUnemploymentClaimId(String unemploymentClaimId) {
        this.unemploymentClaimId = unemploymentClaimId;
    }
    /**
     * Auto generated value setter.
     * @param unemploymentClaimDate the unemploymentClaimDate to set
     */
    public void setUnemploymentClaimDate(Timestamp unemploymentClaimDate) {
        this.unemploymentClaimDate = unemploymentClaimDate;
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
     * @param statusId the statusId to set
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
    /**
     * Auto generated value setter.
     * @param partyIdFrom the partyIdFrom to set
     */
    public void setPartyIdFrom(String partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }
    /**
     * Auto generated value setter.
     * @param partyIdTo the partyIdTo to set
     */
    public void setPartyIdTo(String partyIdTo) {
        this.partyIdTo = partyIdTo;
    }
    /**
     * Auto generated value setter.
     * @param roleTypeIdFrom the roleTypeIdFrom to set
     */
    public void setRoleTypeIdFrom(String roleTypeIdFrom) {
        this.roleTypeIdFrom = roleTypeIdFrom;
    }
    /**
     * Auto generated value setter.
     * @param roleTypeIdTo the roleTypeIdTo to set
     */
    public void setRoleTypeIdTo(String roleTypeIdTo) {
        this.roleTypeIdTo = roleTypeIdTo;
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }
    /**
     * Auto generated value setter.
     * @param thruDate the thruDate to set
     */
    public void setThruDate(Timestamp thruDate) {
        this.thruDate = thruDate;
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
    public String getUnemploymentClaimId() {
        return this.unemploymentClaimId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getUnemploymentClaimDate() {
        return this.unemploymentClaimDate;
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
     * @return <code>String</code>
     */
    public String getStatusId() {
        return this.statusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyIdFrom() {
        return this.partyIdFrom;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyIdTo() {
        return this.partyIdTo;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRoleTypeIdFrom() {
        return this.roleTypeIdFrom;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRoleTypeIdTo() {
        return this.roleTypeIdTo;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.fromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getThruDate() {
        return this.thruDate;
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
     * Auto generated method that gets the related <code>Employment</code> by the relation named <code>Employment</code>.
     * @return the <code>Employment</code>
     * @throws RepositoryException if an error occurs
     */
    public Employment getEmployment() throws RepositoryException {
        if (this.employment == null) {
            this.employment = getRelatedOne(Employment.class, "Employment");
        }
        return this.employment;
    }
    /**
     * Auto generated method that gets the related <code>StatusItem</code> by the relation named <code>StatusItem</code>.
     * @return the <code>StatusItem</code>
     * @throws RepositoryException if an error occurs
     */
    public StatusItem getStatusItem() throws RepositoryException {
        if (this.statusItem == null) {
            this.statusItem = getRelatedOne(StatusItem.class, "StatusItem");
        }
        return this.statusItem;
    }

    /**
     * Auto generated value setter.
     * @param employment the employment to set
    */
    public void setEmployment(Employment employment) {
        this.employment = employment;
    }
    /**
     * Auto generated value setter.
     * @param statusItem the statusItem to set
    */
    public void setStatusItem(StatusItem statusItem) {
        this.statusItem = statusItem;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setUnemploymentClaimId((String) mapValue.get("unemploymentClaimId"));
        setUnemploymentClaimDate((Timestamp) mapValue.get("unemploymentClaimDate"));
        setDescription((String) mapValue.get("description"));
        setStatusId((String) mapValue.get("statusId"));
        setPartyIdFrom((String) mapValue.get("partyIdFrom"));
        setPartyIdTo((String) mapValue.get("partyIdTo"));
        setRoleTypeIdFrom((String) mapValue.get("roleTypeIdFrom"));
        setRoleTypeIdTo((String) mapValue.get("roleTypeIdTo"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
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
        mapValue.put("unemploymentClaimId", getUnemploymentClaimId());
        mapValue.put("unemploymentClaimDate", getUnemploymentClaimDate());
        mapValue.put("description", getDescription());
        mapValue.put("statusId", getStatusId());
        mapValue.put("partyIdFrom", getPartyIdFrom());
        mapValue.put("partyIdTo", getPartyIdTo());
        mapValue.put("roleTypeIdFrom", getRoleTypeIdFrom());
        mapValue.put("roleTypeIdTo", getRoleTypeIdTo());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
