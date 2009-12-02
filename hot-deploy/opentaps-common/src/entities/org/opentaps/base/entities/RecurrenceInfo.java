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
 * Auto generated base entity RecurrenceInfo.
 */
@javax.persistence.Entity
@Table(name="RECURRENCE_INFO")
public class RecurrenceInfo extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("recurrenceInfoId", "RECURRENCE_INFO_ID");
        fields.put("startDateTime", "START_DATE_TIME");
        fields.put("exceptionDateTimes", "EXCEPTION_DATE_TIMES");
        fields.put("recurrenceDateTimes", "RECURRENCE_DATE_TIMES");
        fields.put("exceptionRuleId", "EXCEPTION_RULE_ID");
        fields.put("recurrenceRuleId", "RECURRENCE_RULE_ID");
        fields.put("recurrenceCount", "RECURRENCE_COUNT");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("RecurrenceInfo", fields);
}
  public static enum Fields implements EntityFieldInterface<RecurrenceInfo> {
    recurrenceInfoId("recurrenceInfoId"),
    startDateTime("startDateTime"),
    exceptionDateTimes("exceptionDateTimes"),
    recurrenceDateTimes("recurrenceDateTimes"),
    exceptionRuleId("exceptionRuleId"),
    recurrenceRuleId("recurrenceRuleId"),
    recurrenceCount("recurrenceCount"),
    lastUpdatedStamp("lastUpdatedStamp"),
    lastUpdatedTxStamp("lastUpdatedTxStamp"),
    createdStamp("createdStamp"),
    createdTxStamp("createdTxStamp");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

   @org.hibernate.annotations.GenericGenerator(name="RecurrenceInfo_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="RecurrenceInfo_GEN")
   @Id
   @Column(name="RECURRENCE_INFO_ID")
   private String recurrenceInfoId;
   @Column(name="START_DATE_TIME")
   private Timestamp startDateTime;
   @Column(name="EXCEPTION_DATE_TIMES")
   private String exceptionDateTimes;
   @Column(name="RECURRENCE_DATE_TIMES")
   private String recurrenceDateTimes;
   @Column(name="EXCEPTION_RULE_ID")
   private String exceptionRuleId;
   @Column(name="RECURRENCE_RULE_ID")
   private String recurrenceRuleId;
   @Column(name="RECURRENCE_COUNT")
   private Long recurrenceCount;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="RECURRENCE_RULE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private RecurrenceRule recurrenceRule = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="EXCEPTION_RULE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private RecurrenceRule exceptionRecurrenceRule = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="RECURRENCE_INFO_ID")
   
   private List<Invoice> invoices = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="recurrenceInfo", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="RECURRENCE_INFO_ID")
   
   private List<InvoiceRecurrence> invoiceRecurrences = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="RECURRENCE_INFO_ID")
   
   private List<JobSandbox> jobSandboxes = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="RECURRENCE_INFO_ID")
   
   private List<ProductAssoc> productAssocs = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="RECURRENCE_INFO_ID")
   
   private List<ShoppingList> shoppingLists = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="RECURRENCE_INFO_ID")
   
   private List<WorkEffort> workEfforts = null;

  /**
   * Default constructor.
   */
  public RecurrenceInfo() {
      super();
      this.baseEntityName = "RecurrenceInfo";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("recurrenceInfoId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("recurrenceInfoId");this.allFieldsNames.add("startDateTime");this.allFieldsNames.add("exceptionDateTimes");this.allFieldsNames.add("recurrenceDateTimes");this.allFieldsNames.add("exceptionRuleId");this.allFieldsNames.add("recurrenceRuleId");this.allFieldsNames.add("recurrenceCount");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public RecurrenceInfo(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param recurrenceInfoId the recurrenceInfoId to set
     */
    public void setRecurrenceInfoId(String recurrenceInfoId) {
        this.recurrenceInfoId = recurrenceInfoId;
    }
    /**
     * Auto generated value setter.
     * @param startDateTime the startDateTime to set
     */
    public void setStartDateTime(Timestamp startDateTime) {
        this.startDateTime = startDateTime;
    }
    /**
     * Auto generated value setter.
     * @param exceptionDateTimes the exceptionDateTimes to set
     */
    public void setExceptionDateTimes(String exceptionDateTimes) {
        this.exceptionDateTimes = exceptionDateTimes;
    }
    /**
     * Auto generated value setter.
     * @param recurrenceDateTimes the recurrenceDateTimes to set
     */
    public void setRecurrenceDateTimes(String recurrenceDateTimes) {
        this.recurrenceDateTimes = recurrenceDateTimes;
    }
    /**
     * Auto generated value setter.
     * @param exceptionRuleId the exceptionRuleId to set
     */
    public void setExceptionRuleId(String exceptionRuleId) {
        this.exceptionRuleId = exceptionRuleId;
    }
    /**
     * Auto generated value setter.
     * @param recurrenceRuleId the recurrenceRuleId to set
     */
    public void setRecurrenceRuleId(String recurrenceRuleId) {
        this.recurrenceRuleId = recurrenceRuleId;
    }
    /**
     * Auto generated value setter.
     * @param recurrenceCount the recurrenceCount to set
     */
    public void setRecurrenceCount(Long recurrenceCount) {
        this.recurrenceCount = recurrenceCount;
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
    public String getRecurrenceInfoId() {
        return this.recurrenceInfoId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getExceptionDateTimes() {
        return this.exceptionDateTimes;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRecurrenceDateTimes() {
        return this.recurrenceDateTimes;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getExceptionRuleId() {
        return this.exceptionRuleId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRecurrenceRuleId() {
        return this.recurrenceRuleId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getRecurrenceCount() {
        return this.recurrenceCount;
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
     * Auto generated method that gets the related <code>RecurrenceRule</code> by the relation named <code>RecurrenceRule</code>.
     * @return the <code>RecurrenceRule</code>
     * @throws RepositoryException if an error occurs
     */
    public RecurrenceRule getRecurrenceRule() throws RepositoryException {
        if (this.recurrenceRule == null) {
            this.recurrenceRule = getRelatedOne(RecurrenceRule.class, "RecurrenceRule");
        }
        return this.recurrenceRule;
    }
    /**
     * Auto generated method that gets the related <code>RecurrenceRule</code> by the relation named <code>ExceptionRecurrenceRule</code>.
     * @return the <code>RecurrenceRule</code>
     * @throws RepositoryException if an error occurs
     */
    public RecurrenceRule getExceptionRecurrenceRule() throws RepositoryException {
        if (this.exceptionRecurrenceRule == null) {
            this.exceptionRecurrenceRule = getRelatedOne(RecurrenceRule.class, "ExceptionRecurrenceRule");
        }
        return this.exceptionRecurrenceRule;
    }
    /**
     * Auto generated method that gets the related <code>Invoice</code> by the relation named <code>Invoice</code>.
     * @return the list of <code>Invoice</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends Invoice> getInvoices() throws RepositoryException {
        if (this.invoices == null) {
            this.invoices = getRelated(Invoice.class, "Invoice");
        }
        return this.invoices;
    }
    /**
     * Auto generated method that gets the related <code>InvoiceRecurrence</code> by the relation named <code>InvoiceRecurrence</code>.
     * @return the list of <code>InvoiceRecurrence</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends InvoiceRecurrence> getInvoiceRecurrences() throws RepositoryException {
        if (this.invoiceRecurrences == null) {
            this.invoiceRecurrences = getRelated(InvoiceRecurrence.class, "InvoiceRecurrence");
        }
        return this.invoiceRecurrences;
    }
    /**
     * Auto generated method that gets the related <code>JobSandbox</code> by the relation named <code>JobSandbox</code>.
     * @return the list of <code>JobSandbox</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends JobSandbox> getJobSandboxes() throws RepositoryException {
        if (this.jobSandboxes == null) {
            this.jobSandboxes = getRelated(JobSandbox.class, "JobSandbox");
        }
        return this.jobSandboxes;
    }
    /**
     * Auto generated method that gets the related <code>ProductAssoc</code> by the relation named <code>ProductAssoc</code>.
     * @return the list of <code>ProductAssoc</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductAssoc> getProductAssocs() throws RepositoryException {
        if (this.productAssocs == null) {
            this.productAssocs = getRelated(ProductAssoc.class, "ProductAssoc");
        }
        return this.productAssocs;
    }
    /**
     * Auto generated method that gets the related <code>ShoppingList</code> by the relation named <code>ShoppingList</code>.
     * @return the list of <code>ShoppingList</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ShoppingList> getShoppingLists() throws RepositoryException {
        if (this.shoppingLists == null) {
            this.shoppingLists = getRelated(ShoppingList.class, "ShoppingList");
        }
        return this.shoppingLists;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffort</code> by the relation named <code>WorkEffort</code>.
     * @return the list of <code>WorkEffort</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WorkEffort> getWorkEfforts() throws RepositoryException {
        if (this.workEfforts == null) {
            this.workEfforts = getRelated(WorkEffort.class, "WorkEffort");
        }
        return this.workEfforts;
    }

    /**
     * Auto generated value setter.
     * @param recurrenceRule the recurrenceRule to set
    */
    public void setRecurrenceRule(RecurrenceRule recurrenceRule) {
        this.recurrenceRule = recurrenceRule;
    }
    /**
     * Auto generated value setter.
     * @param exceptionRecurrenceRule the exceptionRecurrenceRule to set
    */
    public void setExceptionRecurrenceRule(RecurrenceRule exceptionRecurrenceRule) {
        this.exceptionRecurrenceRule = exceptionRecurrenceRule;
    }
    /**
     * Auto generated value setter.
     * @param invoices the invoices to set
    */
    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }
    /**
     * Auto generated value setter.
     * @param invoiceRecurrences the invoiceRecurrences to set
    */
    public void setInvoiceRecurrences(List<InvoiceRecurrence> invoiceRecurrences) {
        this.invoiceRecurrences = invoiceRecurrences;
    }
    /**
     * Auto generated value setter.
     * @param jobSandboxes the jobSandboxes to set
    */
    public void setJobSandboxes(List<JobSandbox> jobSandboxes) {
        this.jobSandboxes = jobSandboxes;
    }
    /**
     * Auto generated value setter.
     * @param productAssocs the productAssocs to set
    */
    public void setProductAssocs(List<ProductAssoc> productAssocs) {
        this.productAssocs = productAssocs;
    }
    /**
     * Auto generated value setter.
     * @param shoppingLists the shoppingLists to set
    */
    public void setShoppingLists(List<ShoppingList> shoppingLists) {
        this.shoppingLists = shoppingLists;
    }
    /**
     * Auto generated value setter.
     * @param workEfforts the workEfforts to set
    */
    public void setWorkEfforts(List<WorkEffort> workEfforts) {
        this.workEfforts = workEfforts;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addInvoiceRecurrence(InvoiceRecurrence invoiceRecurrence) {
        if (this.invoiceRecurrences == null) {
            this.invoiceRecurrences = new ArrayList<InvoiceRecurrence>();
        }
        this.invoiceRecurrences.add(invoiceRecurrence);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeInvoiceRecurrence(InvoiceRecurrence invoiceRecurrence) {
        if (this.invoiceRecurrences == null) {
            return;
        }
        this.invoiceRecurrences.remove(invoiceRecurrence);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearInvoiceRecurrence() {
        if (this.invoiceRecurrences == null) {
            return;
        }
        this.invoiceRecurrences.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setRecurrenceInfoId((String) mapValue.get("recurrenceInfoId"));
        setStartDateTime((Timestamp) mapValue.get("startDateTime"));
        setExceptionDateTimes((String) mapValue.get("exceptionDateTimes"));
        setRecurrenceDateTimes((String) mapValue.get("recurrenceDateTimes"));
        setExceptionRuleId((String) mapValue.get("exceptionRuleId"));
        setRecurrenceRuleId((String) mapValue.get("recurrenceRuleId"));
        setRecurrenceCount((Long) mapValue.get("recurrenceCount"));
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
        mapValue.put("recurrenceInfoId", getRecurrenceInfoId());
        mapValue.put("startDateTime", getStartDateTime());
        mapValue.put("exceptionDateTimes", getExceptionDateTimes());
        mapValue.put("recurrenceDateTimes", getRecurrenceDateTimes());
        mapValue.put("exceptionRuleId", getExceptionRuleId());
        mapValue.put("recurrenceRuleId", getRecurrenceRuleId());
        mapValue.put("recurrenceCount", getRecurrenceCount());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}