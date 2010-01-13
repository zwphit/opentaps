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
 * Auto generated base entity CustRequestItem.
 */
@javax.persistence.Entity
@Table(name="CUST_REQUEST_ITEM")
public class CustRequestItem extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("custRequestId", "CUST_REQUEST_ID");
        fields.put("custRequestItemSeqId", "CUST_REQUEST_ITEM_SEQ_ID");
        fields.put("custRequestResolutionId", "CUST_REQUEST_RESOLUTION_ID");
        fields.put("statusId", "STATUS_ID");
        fields.put("priority", "PRIORITY");
        fields.put("sequenceNum", "SEQUENCE_NUM");
        fields.put("requiredByDate", "REQUIRED_BY_DATE");
        fields.put("productId", "PRODUCT_ID");
        fields.put("quantity", "QUANTITY");
        fields.put("selectedAmount", "SELECTED_AMOUNT");
        fields.put("maximumAmount", "MAXIMUM_AMOUNT");
        fields.put("reservStart", "RESERV_START");
        fields.put("reservLength", "RESERV_LENGTH");
        fields.put("reservPersons", "RESERV_PERSONS");
        fields.put("configId", "CONFIG_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("story", "STORY");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("CustRequestItem", fields);
}
  public static enum Fields implements EntityFieldInterface<CustRequestItem> {
    custRequestId("custRequestId"),
    custRequestItemSeqId("custRequestItemSeqId"),
    custRequestResolutionId("custRequestResolutionId"),
    statusId("statusId"),
    priority("priority"),
    sequenceNum("sequenceNum"),
    requiredByDate("requiredByDate"),
    productId("productId"),
    quantity("quantity"),
    selectedAmount("selectedAmount"),
    maximumAmount("maximumAmount"),
    reservStart("reservStart"),
    reservLength("reservLength"),
    reservPersons("reservPersons"),
    configId("configId"),
    description("description"),
    story("story"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.CustRequestItemPkBridge.class)
     protected CustRequestItemPk id = new CustRequestItemPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>CustRequestItemPk</code>
     */
      public CustRequestItemPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>CustRequestItemPk</code> value to set
    */   
      public void setId(CustRequestItemPk id) {
         this.id = id;
      }
   @Column(name="CUST_REQUEST_RESOLUTION_ID")
   protected String custRequestResolutionId;
   @Column(name="STATUS_ID")
   protected String statusId;
   @Column(name="PRIORITY")
   protected Long priority;
   @Column(name="SEQUENCE_NUM")
   protected Long sequenceNum;
   @Column(name="REQUIRED_BY_DATE")
   protected Timestamp requiredByDate;
   @Column(name="PRODUCT_ID")
   protected String productId;
   @Column(name="QUANTITY")
   protected BigDecimal quantity;
   @Column(name="SELECTED_AMOUNT")
   protected BigDecimal selectedAmount;
   @Column(name="MAXIMUM_AMOUNT")
   protected BigDecimal maximumAmount;
   @Column(name="RESERV_START")
   protected Timestamp reservStart;
   @Column(name="RESERV_LENGTH")
   protected BigDecimal reservLength;
   @Column(name="RESERV_PERSONS")
   protected BigDecimal reservPersons;
   @Column(name="CONFIG_ID")
   protected String configId;
   @Column(name="DESCRIPTION")
   protected String description;
   @Column(name="STORY")
   protected String story;
   @Column(name="LAST_UPDATED_STAMP")
   protected Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   protected Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   protected Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   protected Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CUST_REQUEST_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected CustRequest custRequest = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="STATUS_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected StatusItem statusItem = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CUST_REQUEST_RESOLUTION_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected CustRequestResolution custRequestResolution = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected Product product = null;
   private transient List<CustRequestItemNote> custRequestItemNotes = null;
   private transient List<CustRequestItemWorkEffort> custRequestItemWorkEfforts = null;
   private transient List<CustRequestStatus> custRequestStatuses = null;
   private transient List<QuoteItem> quoteItems = null;
   private transient List<RequirementCustRequest> requirementCustRequests = null;

  /**
   * Default constructor.
   */
  public CustRequestItem() {
      super();
      this.baseEntityName = "CustRequestItem";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("custRequestId");this.primaryKeyNames.add("custRequestItemSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("custRequestId");this.allFieldsNames.add("custRequestItemSeqId");this.allFieldsNames.add("custRequestResolutionId");this.allFieldsNames.add("statusId");this.allFieldsNames.add("priority");this.allFieldsNames.add("sequenceNum");this.allFieldsNames.add("requiredByDate");this.allFieldsNames.add("productId");this.allFieldsNames.add("quantity");this.allFieldsNames.add("selectedAmount");this.allFieldsNames.add("maximumAmount");this.allFieldsNames.add("reservStart");this.allFieldsNames.add("reservLength");this.allFieldsNames.add("reservPersons");this.allFieldsNames.add("configId");this.allFieldsNames.add("description");this.allFieldsNames.add("story");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public CustRequestItem(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param custRequestId the custRequestId to set
     */
    public void setCustRequestId(String custRequestId) {
        id.setCustRequestId(custRequestId);
    }
    /**
     * Auto generated value setter.
     * @param custRequestItemSeqId the custRequestItemSeqId to set
     */
    public void setCustRequestItemSeqId(String custRequestItemSeqId) {
        id.setCustRequestItemSeqId(custRequestItemSeqId);
    }
    /**
     * Auto generated value setter.
     * @param custRequestResolutionId the custRequestResolutionId to set
     */
    public void setCustRequestResolutionId(String custRequestResolutionId) {
        this.custRequestResolutionId = custRequestResolutionId;
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
     * @param priority the priority to set
     */
    public void setPriority(Long priority) {
        this.priority = priority;
    }
    /**
     * Auto generated value setter.
     * @param sequenceNum the sequenceNum to set
     */
    public void setSequenceNum(Long sequenceNum) {
        this.sequenceNum = sequenceNum;
    }
    /**
     * Auto generated value setter.
     * @param requiredByDate the requiredByDate to set
     */
    public void setRequiredByDate(Timestamp requiredByDate) {
        this.requiredByDate = requiredByDate;
    }
    /**
     * Auto generated value setter.
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }
    /**
     * Auto generated value setter.
     * @param quantity the quantity to set
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
    /**
     * Auto generated value setter.
     * @param selectedAmount the selectedAmount to set
     */
    public void setSelectedAmount(BigDecimal selectedAmount) {
        this.selectedAmount = selectedAmount;
    }
    /**
     * Auto generated value setter.
     * @param maximumAmount the maximumAmount to set
     */
    public void setMaximumAmount(BigDecimal maximumAmount) {
        this.maximumAmount = maximumAmount;
    }
    /**
     * Auto generated value setter.
     * @param reservStart the reservStart to set
     */
    public void setReservStart(Timestamp reservStart) {
        this.reservStart = reservStart;
    }
    /**
     * Auto generated value setter.
     * @param reservLength the reservLength to set
     */
    public void setReservLength(BigDecimal reservLength) {
        this.reservLength = reservLength;
    }
    /**
     * Auto generated value setter.
     * @param reservPersons the reservPersons to set
     */
    public void setReservPersons(BigDecimal reservPersons) {
        this.reservPersons = reservPersons;
    }
    /**
     * Auto generated value setter.
     * @param configId the configId to set
     */
    public void setConfigId(String configId) {
        this.configId = configId;
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
     * @param story the story to set
     */
    public void setStory(String story) {
        this.story = story;
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
    public String getCustRequestId() {
        return this.id.getCustRequestId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCustRequestItemSeqId() {
        return this.id.getCustRequestItemSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCustRequestResolutionId() {
        return this.custRequestResolutionId;
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
     * @return <code>Long</code>
     */
    public Long getPriority() {
        return this.priority;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getSequenceNum() {
        return this.sequenceNum;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getRequiredByDate() {
        return this.requiredByDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductId() {
        return this.productId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantity() {
        return this.quantity;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getSelectedAmount() {
        return this.selectedAmount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getMaximumAmount() {
        return this.maximumAmount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getReservStart() {
        return this.reservStart;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getReservLength() {
        return this.reservLength;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getReservPersons() {
        return this.reservPersons;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getConfigId() {
        return this.configId;
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
    public String getStory() {
        return this.story;
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
     * Auto generated method that gets the related <code>CustRequest</code> by the relation named <code>CustRequest</code>.
     * @return the <code>CustRequest</code>
     * @throws RepositoryException if an error occurs
     */
    public CustRequest getCustRequest() throws RepositoryException {
        if (this.custRequest == null) {
            this.custRequest = getRelatedOne(CustRequest.class, "CustRequest");
        }
        return this.custRequest;
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
     * Auto generated method that gets the related <code>CustRequestResolution</code> by the relation named <code>CustRequestResolution</code>.
     * @return the <code>CustRequestResolution</code>
     * @throws RepositoryException if an error occurs
     */
    public CustRequestResolution getCustRequestResolution() throws RepositoryException {
        if (this.custRequestResolution == null) {
            this.custRequestResolution = getRelatedOne(CustRequestResolution.class, "CustRequestResolution");
        }
        return this.custRequestResolution;
    }
    /**
     * Auto generated method that gets the related <code>Product</code> by the relation named <code>Product</code>.
     * @return the <code>Product</code>
     * @throws RepositoryException if an error occurs
     */
    public Product getProduct() throws RepositoryException {
        if (this.product == null) {
            this.product = getRelatedOne(Product.class, "Product");
        }
        return this.product;
    }
    /**
     * Auto generated method that gets the related <code>CustRequestItemNote</code> by the relation named <code>CustRequestItemNote</code>.
     * @return the list of <code>CustRequestItemNote</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends CustRequestItemNote> getCustRequestItemNotes() throws RepositoryException {
        if (this.custRequestItemNotes == null) {
            this.custRequestItemNotes = getRelated(CustRequestItemNote.class, "CustRequestItemNote");
        }
        return this.custRequestItemNotes;
    }
    /**
     * Auto generated method that gets the related <code>CustRequestItemWorkEffort</code> by the relation named <code>CustRequestItemWorkEffort</code>.
     * @return the list of <code>CustRequestItemWorkEffort</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends CustRequestItemWorkEffort> getCustRequestItemWorkEfforts() throws RepositoryException {
        if (this.custRequestItemWorkEfforts == null) {
            this.custRequestItemWorkEfforts = getRelated(CustRequestItemWorkEffort.class, "CustRequestItemWorkEffort");
        }
        return this.custRequestItemWorkEfforts;
    }
    /**
     * Auto generated method that gets the related <code>CustRequestStatus</code> by the relation named <code>CustRequestStatus</code>.
     * @return the list of <code>CustRequestStatus</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends CustRequestStatus> getCustRequestStatuses() throws RepositoryException {
        if (this.custRequestStatuses == null) {
            this.custRequestStatuses = getRelated(CustRequestStatus.class, "CustRequestStatus");
        }
        return this.custRequestStatuses;
    }
    /**
     * Auto generated method that gets the related <code>QuoteItem</code> by the relation named <code>QuoteItem</code>.
     * @return the list of <code>QuoteItem</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends QuoteItem> getQuoteItems() throws RepositoryException {
        if (this.quoteItems == null) {
            this.quoteItems = getRelated(QuoteItem.class, "QuoteItem");
        }
        return this.quoteItems;
    }
    /**
     * Auto generated method that gets the related <code>RequirementCustRequest</code> by the relation named <code>RequirementCustRequest</code>.
     * @return the list of <code>RequirementCustRequest</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends RequirementCustRequest> getRequirementCustRequests() throws RepositoryException {
        if (this.requirementCustRequests == null) {
            this.requirementCustRequests = getRelated(RequirementCustRequest.class, "RequirementCustRequest");
        }
        return this.requirementCustRequests;
    }

    /**
     * Auto generated value setter.
     * @param custRequest the custRequest to set
    */
    public void setCustRequest(CustRequest custRequest) {
        this.custRequest = custRequest;
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
     * @param custRequestResolution the custRequestResolution to set
    */
    public void setCustRequestResolution(CustRequestResolution custRequestResolution) {
        this.custRequestResolution = custRequestResolution;
    }
    /**
     * Auto generated value setter.
     * @param product the product to set
    */
    public void setProduct(Product product) {
        this.product = product;
    }
    /**
     * Auto generated value setter.
     * @param custRequestItemNotes the custRequestItemNotes to set
    */
    public void setCustRequestItemNotes(List<CustRequestItemNote> custRequestItemNotes) {
        this.custRequestItemNotes = custRequestItemNotes;
    }
    /**
     * Auto generated value setter.
     * @param custRequestItemWorkEfforts the custRequestItemWorkEfforts to set
    */
    public void setCustRequestItemWorkEfforts(List<CustRequestItemWorkEffort> custRequestItemWorkEfforts) {
        this.custRequestItemWorkEfforts = custRequestItemWorkEfforts;
    }
    /**
     * Auto generated value setter.
     * @param custRequestStatuses the custRequestStatuses to set
    */
    public void setCustRequestStatuses(List<CustRequestStatus> custRequestStatuses) {
        this.custRequestStatuses = custRequestStatuses;
    }
    /**
     * Auto generated value setter.
     * @param quoteItems the quoteItems to set
    */
    public void setQuoteItems(List<QuoteItem> quoteItems) {
        this.quoteItems = quoteItems;
    }
    /**
     * Auto generated value setter.
     * @param requirementCustRequests the requirementCustRequests to set
    */
    public void setRequirementCustRequests(List<RequirementCustRequest> requirementCustRequests) {
        this.requirementCustRequests = requirementCustRequests;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setCustRequestId((String) mapValue.get("custRequestId"));
        setCustRequestItemSeqId((String) mapValue.get("custRequestItemSeqId"));
        setCustRequestResolutionId((String) mapValue.get("custRequestResolutionId"));
        setStatusId((String) mapValue.get("statusId"));
        setPriority((Long) mapValue.get("priority"));
        setSequenceNum((Long) mapValue.get("sequenceNum"));
        setRequiredByDate((Timestamp) mapValue.get("requiredByDate"));
        setProductId((String) mapValue.get("productId"));
        setQuantity(convertToBigDecimal(mapValue.get("quantity")));
        setSelectedAmount(convertToBigDecimal(mapValue.get("selectedAmount")));
        setMaximumAmount(convertToBigDecimal(mapValue.get("maximumAmount")));
        setReservStart((Timestamp) mapValue.get("reservStart"));
        setReservLength(convertToBigDecimal(mapValue.get("reservLength")));
        setReservPersons(convertToBigDecimal(mapValue.get("reservPersons")));
        setConfigId((String) mapValue.get("configId"));
        setDescription((String) mapValue.get("description"));
        setStory((String) mapValue.get("story"));
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
        mapValue.put("custRequestId", getCustRequestId());
        mapValue.put("custRequestItemSeqId", getCustRequestItemSeqId());
        mapValue.put("custRequestResolutionId", getCustRequestResolutionId());
        mapValue.put("statusId", getStatusId());
        mapValue.put("priority", getPriority());
        mapValue.put("sequenceNum", getSequenceNum());
        mapValue.put("requiredByDate", getRequiredByDate());
        mapValue.put("productId", getProductId());
        mapValue.put("quantity", getQuantity());
        mapValue.put("selectedAmount", getSelectedAmount());
        mapValue.put("maximumAmount", getMaximumAmount());
        mapValue.put("reservStart", getReservStart());
        mapValue.put("reservLength", getReservLength());
        mapValue.put("reservPersons", getReservPersons());
        mapValue.put("configId", getConfigId());
        mapValue.put("description", getDescription());
        mapValue.put("story", getStory());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
