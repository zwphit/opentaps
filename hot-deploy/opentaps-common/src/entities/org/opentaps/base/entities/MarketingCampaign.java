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
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity MarketingCampaign.
 */
@javax.persistence.Entity
@Table(name="MARKETING_CAMPAIGN")
public class MarketingCampaign extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("marketingCampaignId", "MARKETING_CAMPAIGN_ID");
        fields.put("parentCampaignId", "PARENT_CAMPAIGN_ID");
        fields.put("statusId", "STATUS_ID");
        fields.put("campaignName", "CAMPAIGN_NAME");
        fields.put("campaignSummary", "CAMPAIGN_SUMMARY");
        fields.put("budgetedCost", "BUDGETED_COST");
        fields.put("actualCost", "ACTUAL_COST");
        fields.put("estimatedCost", "ESTIMATED_COST");
        fields.put("currencyUomId", "CURRENCY_UOM_ID");
        fields.put("fromDate", "FROM_DATE");
        fields.put("thruDate", "THRU_DATE");
        fields.put("isActive", "IS_ACTIVE");
        fields.put("convertedLeads", "CONVERTED_LEADS");
        fields.put("expectedResponsePercent", "EXPECTED_RESPONSE_PERCENT");
        fields.put("expectedRevenue", "EXPECTED_REVENUE");
        fields.put("numSent", "NUM_SENT");
        fields.put("startDate", "START_DATE");
        fields.put("createdByUserLogin", "CREATED_BY_USER_LOGIN");
        fields.put("lastModifiedByUserLogin", "LAST_MODIFIED_BY_USER_LOGIN");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("MarketingCampaign", fields);
}
  public static enum Fields implements EntityFieldInterface<MarketingCampaign> {
    marketingCampaignId("marketingCampaignId"),
    parentCampaignId("parentCampaignId"),
    statusId("statusId"),
    campaignName("campaignName"),
    campaignSummary("campaignSummary"),
    budgetedCost("budgetedCost"),
    actualCost("actualCost"),
    estimatedCost("estimatedCost"),
    currencyUomId("currencyUomId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    isActive("isActive"),
    convertedLeads("convertedLeads"),
    expectedResponsePercent("expectedResponsePercent"),
    expectedRevenue("expectedRevenue"),
    numSent("numSent"),
    startDate("startDate"),
    createdByUserLogin("createdByUserLogin"),
    lastModifiedByUserLogin("lastModifiedByUserLogin"),
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

   @org.hibernate.annotations.GenericGenerator(name="MarketingCampaign_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="MarketingCampaign_GEN")
   @Id
   @Column(name="MARKETING_CAMPAIGN_ID")
   protected String marketingCampaignId;
   @Column(name="PARENT_CAMPAIGN_ID")
   protected String parentCampaignId;
   @Column(name="STATUS_ID")
   protected String statusId;
   @Column(name="CAMPAIGN_NAME")
   protected String campaignName;
   @Column(name="CAMPAIGN_SUMMARY")
   protected String campaignSummary;
   @Column(name="BUDGETED_COST")
   protected BigDecimal budgetedCost;
   @Column(name="ACTUAL_COST")
   protected BigDecimal actualCost;
   @Column(name="ESTIMATED_COST")
   protected BigDecimal estimatedCost;
   @Column(name="CURRENCY_UOM_ID")
   protected String currencyUomId;
   @Column(name="FROM_DATE")
   protected Timestamp fromDate;
   @Column(name="THRU_DATE")
   protected Timestamp thruDate;
   @Column(name="IS_ACTIVE")
   protected String isActive;
   @Column(name="CONVERTED_LEADS")
   protected String convertedLeads;
   @Column(name="EXPECTED_RESPONSE_PERCENT")
   protected BigDecimal expectedResponsePercent;
   @Column(name="EXPECTED_REVENUE")
   protected BigDecimal expectedRevenue;
   @Column(name="NUM_SENT")
   protected Long numSent;
   @Column(name="START_DATE")
   protected Timestamp startDate;
   @Column(name="CREATED_BY_USER_LOGIN")
   protected String createdByUserLogin;
   @Column(name="LAST_MODIFIED_BY_USER_LOGIN")
   protected String lastModifiedByUserLogin;
   @Column(name="LAST_UPDATED_STAMP")
   protected Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   protected Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   protected Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   protected Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_CAMPAIGN_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected MarketingCampaign parentMarketingCampaign = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="STATUS_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected StatusItem statusItem = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CURRENCY_UOM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected Uom uom = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="MARKETING_CAMPAIGN_ID")
   
   protected List<ContactList> contactLists = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_CAMPAIGN_ID")
   
   protected List<MarketingCampaign> childMarketingCampaigns = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="MARKETING_CAMPAIGN_ID")
   
   protected List<MarketingCampaignContactList> marketingCampaignContactLists = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="marketingCampaign", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="MARKETING_CAMPAIGN_ID")
   
   protected List<MarketingCampaignNote> marketingCampaignNotes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="marketingCampaign", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="MARKETING_CAMPAIGN_ID")
   
   protected List<MarketingCampaignPrice> marketingCampaignPrices = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="marketingCampaign", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="MARKETING_CAMPAIGN_ID")
   
   protected List<MarketingCampaignPromo> marketingCampaignPromoes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="marketingCampaign", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="MARKETING_CAMPAIGN_ID")
   
   protected List<MarketingCampaignRole> marketingCampaignRoles = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="MARKETING_CAMPAIGN_ID")
   
   protected List<SalesOpportunity> salesOpportunitys = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="MARKETING_CAMPAIGN_ID")
   
   protected List<TrackingCode> trackingCodes = null;

  /**
   * Default constructor.
   */
  public MarketingCampaign() {
      super();
      this.baseEntityName = "MarketingCampaign";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("marketingCampaignId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("marketingCampaignId");this.allFieldsNames.add("parentCampaignId");this.allFieldsNames.add("statusId");this.allFieldsNames.add("campaignName");this.allFieldsNames.add("campaignSummary");this.allFieldsNames.add("budgetedCost");this.allFieldsNames.add("actualCost");this.allFieldsNames.add("estimatedCost");this.allFieldsNames.add("currencyUomId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("isActive");this.allFieldsNames.add("convertedLeads");this.allFieldsNames.add("expectedResponsePercent");this.allFieldsNames.add("expectedRevenue");this.allFieldsNames.add("numSent");this.allFieldsNames.add("startDate");this.allFieldsNames.add("createdByUserLogin");this.allFieldsNames.add("lastModifiedByUserLogin");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public MarketingCampaign(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param marketingCampaignId the marketingCampaignId to set
     */
    public void setMarketingCampaignId(String marketingCampaignId) {
        this.marketingCampaignId = marketingCampaignId;
    }
    /**
     * Auto generated value setter.
     * @param parentCampaignId the parentCampaignId to set
     */
    public void setParentCampaignId(String parentCampaignId) {
        this.parentCampaignId = parentCampaignId;
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
     * @param campaignName the campaignName to set
     */
    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }
    /**
     * Auto generated value setter.
     * @param campaignSummary the campaignSummary to set
     */
    public void setCampaignSummary(String campaignSummary) {
        this.campaignSummary = campaignSummary;
    }
    /**
     * Auto generated value setter.
     * @param budgetedCost the budgetedCost to set
     */
    public void setBudgetedCost(BigDecimal budgetedCost) {
        this.budgetedCost = budgetedCost;
    }
    /**
     * Auto generated value setter.
     * @param actualCost the actualCost to set
     */
    public void setActualCost(BigDecimal actualCost) {
        this.actualCost = actualCost;
    }
    /**
     * Auto generated value setter.
     * @param estimatedCost the estimatedCost to set
     */
    public void setEstimatedCost(BigDecimal estimatedCost) {
        this.estimatedCost = estimatedCost;
    }
    /**
     * Auto generated value setter.
     * @param currencyUomId the currencyUomId to set
     */
    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
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
     * @param isActive the isActive to set
     */
    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }
    /**
     * Auto generated value setter.
     * @param convertedLeads the convertedLeads to set
     */
    public void setConvertedLeads(String convertedLeads) {
        this.convertedLeads = convertedLeads;
    }
    /**
     * Auto generated value setter.
     * @param expectedResponsePercent the expectedResponsePercent to set
     */
    public void setExpectedResponsePercent(BigDecimal expectedResponsePercent) {
        this.expectedResponsePercent = expectedResponsePercent;
    }
    /**
     * Auto generated value setter.
     * @param expectedRevenue the expectedRevenue to set
     */
    public void setExpectedRevenue(BigDecimal expectedRevenue) {
        this.expectedRevenue = expectedRevenue;
    }
    /**
     * Auto generated value setter.
     * @param numSent the numSent to set
     */
    public void setNumSent(Long numSent) {
        this.numSent = numSent;
    }
    /**
     * Auto generated value setter.
     * @param startDate the startDate to set
     */
    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }
    /**
     * Auto generated value setter.
     * @param createdByUserLogin the createdByUserLogin to set
     */
    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }
    /**
     * Auto generated value setter.
     * @param lastModifiedByUserLogin the lastModifiedByUserLogin to set
     */
    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
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
    public String getMarketingCampaignId() {
        return this.marketingCampaignId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentCampaignId() {
        return this.parentCampaignId;
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
    public String getCampaignName() {
        return this.campaignName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCampaignSummary() {
        return this.campaignSummary;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getBudgetedCost() {
        return this.budgetedCost;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getActualCost() {
        return this.actualCost;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getEstimatedCost() {
        return this.estimatedCost;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCurrencyUomId() {
        return this.currencyUomId;
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
     * @return <code>String</code>
     */
    public String getIsActive() {
        return this.isActive;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getConvertedLeads() {
        return this.convertedLeads;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getExpectedResponsePercent() {
        return this.expectedResponsePercent;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getExpectedRevenue() {
        return this.expectedRevenue;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getNumSent() {
        return this.numSent;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getStartDate() {
        return this.startDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCreatedByUserLogin() {
        return this.createdByUserLogin;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLastModifiedByUserLogin() {
        return this.lastModifiedByUserLogin;
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
     * Auto generated method that gets the related <code>MarketingCampaign</code> by the relation named <code>ParentMarketingCampaign</code>.
     * @return the <code>MarketingCampaign</code>
     * @throws RepositoryException if an error occurs
     */
    public MarketingCampaign getParentMarketingCampaign() throws RepositoryException {
        if (this.parentMarketingCampaign == null) {
            this.parentMarketingCampaign = getRelatedOne(MarketingCampaign.class, "ParentMarketingCampaign");
        }
        return this.parentMarketingCampaign;
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
     * Auto generated method that gets the related <code>Uom</code> by the relation named <code>Uom</code>.
     * @return the <code>Uom</code>
     * @throws RepositoryException if an error occurs
     */
    public Uom getUom() throws RepositoryException {
        if (this.uom == null) {
            this.uom = getRelatedOne(Uom.class, "Uom");
        }
        return this.uom;
    }
    /**
     * Auto generated method that gets the related <code>ContactList</code> by the relation named <code>ContactList</code>.
     * @return the list of <code>ContactList</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ContactList> getContactLists() throws RepositoryException {
        if (this.contactLists == null) {
            this.contactLists = getRelated(ContactList.class, "ContactList");
        }
        return this.contactLists;
    }
    /**
     * Auto generated method that gets the related <code>MarketingCampaign</code> by the relation named <code>ChildMarketingCampaign</code>.
     * @return the list of <code>MarketingCampaign</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends MarketingCampaign> getChildMarketingCampaigns() throws RepositoryException {
        if (this.childMarketingCampaigns == null) {
            this.childMarketingCampaigns = getRelated(MarketingCampaign.class, "ChildMarketingCampaign");
        }
        return this.childMarketingCampaigns;
    }
    /**
     * Auto generated method that gets the related <code>MarketingCampaignContactList</code> by the relation named <code>MarketingCampaignContactList</code>.
     * @return the list of <code>MarketingCampaignContactList</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends MarketingCampaignContactList> getMarketingCampaignContactLists() throws RepositoryException {
        if (this.marketingCampaignContactLists == null) {
            this.marketingCampaignContactLists = getRelated(MarketingCampaignContactList.class, "MarketingCampaignContactList");
        }
        return this.marketingCampaignContactLists;
    }
    /**
     * Auto generated method that gets the related <code>MarketingCampaignNote</code> by the relation named <code>MarketingCampaignNote</code>.
     * @return the list of <code>MarketingCampaignNote</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends MarketingCampaignNote> getMarketingCampaignNotes() throws RepositoryException {
        if (this.marketingCampaignNotes == null) {
            this.marketingCampaignNotes = getRelated(MarketingCampaignNote.class, "MarketingCampaignNote");
        }
        return this.marketingCampaignNotes;
    }
    /**
     * Auto generated method that gets the related <code>MarketingCampaignPrice</code> by the relation named <code>MarketingCampaignPrice</code>.
     * @return the list of <code>MarketingCampaignPrice</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends MarketingCampaignPrice> getMarketingCampaignPrices() throws RepositoryException {
        if (this.marketingCampaignPrices == null) {
            this.marketingCampaignPrices = getRelated(MarketingCampaignPrice.class, "MarketingCampaignPrice");
        }
        return this.marketingCampaignPrices;
    }
    /**
     * Auto generated method that gets the related <code>MarketingCampaignPromo</code> by the relation named <code>MarketingCampaignPromo</code>.
     * @return the list of <code>MarketingCampaignPromo</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends MarketingCampaignPromo> getMarketingCampaignPromoes() throws RepositoryException {
        if (this.marketingCampaignPromoes == null) {
            this.marketingCampaignPromoes = getRelated(MarketingCampaignPromo.class, "MarketingCampaignPromo");
        }
        return this.marketingCampaignPromoes;
    }
    /**
     * Auto generated method that gets the related <code>MarketingCampaignRole</code> by the relation named <code>MarketingCampaignRole</code>.
     * @return the list of <code>MarketingCampaignRole</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends MarketingCampaignRole> getMarketingCampaignRoles() throws RepositoryException {
        if (this.marketingCampaignRoles == null) {
            this.marketingCampaignRoles = getRelated(MarketingCampaignRole.class, "MarketingCampaignRole");
        }
        return this.marketingCampaignRoles;
    }
    /**
     * Auto generated method that gets the related <code>SalesOpportunity</code> by the relation named <code>SalesOpportunity</code>.
     * @return the list of <code>SalesOpportunity</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends SalesOpportunity> getSalesOpportunitys() throws RepositoryException {
        if (this.salesOpportunitys == null) {
            this.salesOpportunitys = getRelated(SalesOpportunity.class, "SalesOpportunity");
        }
        return this.salesOpportunitys;
    }
    /**
     * Auto generated method that gets the related <code>TrackingCode</code> by the relation named <code>TrackingCode</code>.
     * @return the list of <code>TrackingCode</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends TrackingCode> getTrackingCodes() throws RepositoryException {
        if (this.trackingCodes == null) {
            this.trackingCodes = getRelated(TrackingCode.class, "TrackingCode");
        }
        return this.trackingCodes;
    }

    /**
     * Auto generated value setter.
     * @param parentMarketingCampaign the parentMarketingCampaign to set
    */
    public void setParentMarketingCampaign(MarketingCampaign parentMarketingCampaign) {
        this.parentMarketingCampaign = parentMarketingCampaign;
    }
    /**
     * Auto generated value setter.
     * @param statusItem the statusItem to set
    */
    public void setStatusItem(StatusItem statusItem) {
        this.statusItem = statusItem;
    }
    /**
     * Auto generated value setter.
     * @param uom the uom to set
    */
    public void setUom(Uom uom) {
        this.uom = uom;
    }
    /**
     * Auto generated value setter.
     * @param contactLists the contactLists to set
    */
    public void setContactLists(List<ContactList> contactLists) {
        this.contactLists = contactLists;
    }
    /**
     * Auto generated value setter.
     * @param childMarketingCampaigns the childMarketingCampaigns to set
    */
    public void setChildMarketingCampaigns(List<MarketingCampaign> childMarketingCampaigns) {
        this.childMarketingCampaigns = childMarketingCampaigns;
    }
    /**
     * Auto generated value setter.
     * @param marketingCampaignContactLists the marketingCampaignContactLists to set
    */
    public void setMarketingCampaignContactLists(List<MarketingCampaignContactList> marketingCampaignContactLists) {
        this.marketingCampaignContactLists = marketingCampaignContactLists;
    }
    /**
     * Auto generated value setter.
     * @param marketingCampaignNotes the marketingCampaignNotes to set
    */
    public void setMarketingCampaignNotes(List<MarketingCampaignNote> marketingCampaignNotes) {
        this.marketingCampaignNotes = marketingCampaignNotes;
    }
    /**
     * Auto generated value setter.
     * @param marketingCampaignPrices the marketingCampaignPrices to set
    */
    public void setMarketingCampaignPrices(List<MarketingCampaignPrice> marketingCampaignPrices) {
        this.marketingCampaignPrices = marketingCampaignPrices;
    }
    /**
     * Auto generated value setter.
     * @param marketingCampaignPromoes the marketingCampaignPromoes to set
    */
    public void setMarketingCampaignPromoes(List<MarketingCampaignPromo> marketingCampaignPromoes) {
        this.marketingCampaignPromoes = marketingCampaignPromoes;
    }
    /**
     * Auto generated value setter.
     * @param marketingCampaignRoles the marketingCampaignRoles to set
    */
    public void setMarketingCampaignRoles(List<MarketingCampaignRole> marketingCampaignRoles) {
        this.marketingCampaignRoles = marketingCampaignRoles;
    }
    /**
     * Auto generated value setter.
     * @param salesOpportunitys the salesOpportunitys to set
    */
    public void setSalesOpportunitys(List<SalesOpportunity> salesOpportunitys) {
        this.salesOpportunitys = salesOpportunitys;
    }
    /**
     * Auto generated value setter.
     * @param trackingCodes the trackingCodes to set
    */
    public void setTrackingCodes(List<TrackingCode> trackingCodes) {
        this.trackingCodes = trackingCodes;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addMarketingCampaignNote(MarketingCampaignNote marketingCampaignNote) {
        if (this.marketingCampaignNotes == null) {
            this.marketingCampaignNotes = new ArrayList<MarketingCampaignNote>();
        }
        this.marketingCampaignNotes.add(marketingCampaignNote);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeMarketingCampaignNote(MarketingCampaignNote marketingCampaignNote) {
        if (this.marketingCampaignNotes == null) {
            return;
        }
        this.marketingCampaignNotes.remove(marketingCampaignNote);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearMarketingCampaignNote() {
        if (this.marketingCampaignNotes == null) {
            return;
        }
        this.marketingCampaignNotes.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addMarketingCampaignPrice(MarketingCampaignPrice marketingCampaignPrice) {
        if (this.marketingCampaignPrices == null) {
            this.marketingCampaignPrices = new ArrayList<MarketingCampaignPrice>();
        }
        this.marketingCampaignPrices.add(marketingCampaignPrice);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeMarketingCampaignPrice(MarketingCampaignPrice marketingCampaignPrice) {
        if (this.marketingCampaignPrices == null) {
            return;
        }
        this.marketingCampaignPrices.remove(marketingCampaignPrice);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearMarketingCampaignPrice() {
        if (this.marketingCampaignPrices == null) {
            return;
        }
        this.marketingCampaignPrices.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addMarketingCampaignPromoe(MarketingCampaignPromo marketingCampaignPromoe) {
        if (this.marketingCampaignPromoes == null) {
            this.marketingCampaignPromoes = new ArrayList<MarketingCampaignPromo>();
        }
        this.marketingCampaignPromoes.add(marketingCampaignPromoe);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeMarketingCampaignPromoe(MarketingCampaignPromo marketingCampaignPromoe) {
        if (this.marketingCampaignPromoes == null) {
            return;
        }
        this.marketingCampaignPromoes.remove(marketingCampaignPromoe);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearMarketingCampaignPromoe() {
        if (this.marketingCampaignPromoes == null) {
            return;
        }
        this.marketingCampaignPromoes.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addMarketingCampaignRole(MarketingCampaignRole marketingCampaignRole) {
        if (this.marketingCampaignRoles == null) {
            this.marketingCampaignRoles = new ArrayList<MarketingCampaignRole>();
        }
        this.marketingCampaignRoles.add(marketingCampaignRole);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeMarketingCampaignRole(MarketingCampaignRole marketingCampaignRole) {
        if (this.marketingCampaignRoles == null) {
            return;
        }
        this.marketingCampaignRoles.remove(marketingCampaignRole);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearMarketingCampaignRole() {
        if (this.marketingCampaignRoles == null) {
            return;
        }
        this.marketingCampaignRoles.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setMarketingCampaignId((String) mapValue.get("marketingCampaignId"));
        setParentCampaignId((String) mapValue.get("parentCampaignId"));
        setStatusId((String) mapValue.get("statusId"));
        setCampaignName((String) mapValue.get("campaignName"));
        setCampaignSummary((String) mapValue.get("campaignSummary"));
        setBudgetedCost(convertToBigDecimal(mapValue.get("budgetedCost")));
        setActualCost(convertToBigDecimal(mapValue.get("actualCost")));
        setEstimatedCost(convertToBigDecimal(mapValue.get("estimatedCost")));
        setCurrencyUomId((String) mapValue.get("currencyUomId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setIsActive((String) mapValue.get("isActive"));
        setConvertedLeads((String) mapValue.get("convertedLeads"));
        setExpectedResponsePercent(convertToBigDecimal(mapValue.get("expectedResponsePercent")));
        setExpectedRevenue(convertToBigDecimal(mapValue.get("expectedRevenue")));
        setNumSent((Long) mapValue.get("numSent"));
        setStartDate((Timestamp) mapValue.get("startDate"));
        setCreatedByUserLogin((String) mapValue.get("createdByUserLogin"));
        setLastModifiedByUserLogin((String) mapValue.get("lastModifiedByUserLogin"));
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
        mapValue.put("marketingCampaignId", getMarketingCampaignId());
        mapValue.put("parentCampaignId", getParentCampaignId());
        mapValue.put("statusId", getStatusId());
        mapValue.put("campaignName", getCampaignName());
        mapValue.put("campaignSummary", getCampaignSummary());
        mapValue.put("budgetedCost", getBudgetedCost());
        mapValue.put("actualCost", getActualCost());
        mapValue.put("estimatedCost", getEstimatedCost());
        mapValue.put("currencyUomId", getCurrencyUomId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("isActive", getIsActive());
        mapValue.put("convertedLeads", getConvertedLeads());
        mapValue.put("expectedResponsePercent", getExpectedResponsePercent());
        mapValue.put("expectedRevenue", getExpectedRevenue());
        mapValue.put("numSent", getNumSent());
        mapValue.put("startDate", getStartDate());
        mapValue.put("createdByUserLogin", getCreatedByUserLogin());
        mapValue.put("lastModifiedByUserLogin", getLastModifiedByUserLogin());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
