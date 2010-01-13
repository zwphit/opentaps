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
 * Auto generated base entity FinAccountType.
 */
@javax.persistence.Entity
@Table(name="FIN_ACCOUNT_TYPE")
public class FinAccountType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("finAccountTypeId", "FIN_ACCOUNT_TYPE_ID");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("replenishEnumId", "REPLENISH_ENUM_ID");
        fields.put("isRefundable", "IS_REFUNDABLE");
        fields.put("hasTable", "HAS_TABLE");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("FinAccountType", fields);
}
  public static enum Fields implements EntityFieldInterface<FinAccountType> {
    finAccountTypeId("finAccountTypeId"),
    parentTypeId("parentTypeId"),
    replenishEnumId("replenishEnumId"),
    isRefundable("isRefundable"),
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

   @org.hibernate.annotations.GenericGenerator(name="FinAccountType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="FinAccountType_GEN")
   @Id
   @Column(name="FIN_ACCOUNT_TYPE_ID")
   protected String finAccountTypeId;
   @Column(name="PARENT_TYPE_ID")
   protected String parentTypeId;
   @Column(name="REPLENISH_ENUM_ID")
   protected String replenishEnumId;
   @Column(name="IS_REFUNDABLE")
   protected String isRefundable;
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
   
   protected FinAccountType parentFinAccountType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="REPLENISH_ENUM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected Enumeration replenishEnumeration = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="FIN_ACCOUNT_TYPE_ID")
   
   protected List<FinAccount> finAccounts = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_TYPE_ID")
   
   protected List<FinAccountType> childFinAccountTypes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="finAccountType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="FIN_ACCOUNT_TYPE_ID")
   
   protected List<FinAccountTypeAttr> finAccountTypeAttrs = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="finAccountType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="FIN_ACCOUNT_TYPE_ID")
   
   protected List<FinAccountTypeGlAccount> finAccountTypeGlAccounts = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="finAccountType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="FIN_ACCOUNT_TYPE_ID")
   
   protected List<ProductStoreFinActSetting> productStoreFinActSettings = null;

  /**
   * Default constructor.
   */
  public FinAccountType() {
      super();
      this.baseEntityName = "FinAccountType";
      this.isView = false;
      this.resourceName = "AccountingEntityLabels";
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("finAccountTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("finAccountTypeId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("replenishEnumId");this.allFieldsNames.add("isRefundable");this.allFieldsNames.add("hasTable");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public FinAccountType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param finAccountTypeId the finAccountTypeId to set
     */
    public void setFinAccountTypeId(String finAccountTypeId) {
        this.finAccountTypeId = finAccountTypeId;
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
     * @param replenishEnumId the replenishEnumId to set
     */
    public void setReplenishEnumId(String replenishEnumId) {
        this.replenishEnumId = replenishEnumId;
    }
    /**
     * Auto generated value setter.
     * @param isRefundable the isRefundable to set
     */
    public void setIsRefundable(String isRefundable) {
        this.isRefundable = isRefundable;
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
    public String getFinAccountTypeId() {
        return this.finAccountTypeId;
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
    public String getReplenishEnumId() {
        return this.replenishEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIsRefundable() {
        return this.isRefundable;
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
     * Auto generated method that gets the related <code>FinAccountType</code> by the relation named <code>ParentFinAccountType</code>.
     * @return the <code>FinAccountType</code>
     * @throws RepositoryException if an error occurs
     */
    public FinAccountType getParentFinAccountType() throws RepositoryException {
        if (this.parentFinAccountType == null) {
            this.parentFinAccountType = getRelatedOne(FinAccountType.class, "ParentFinAccountType");
        }
        return this.parentFinAccountType;
    }
    /**
     * Auto generated method that gets the related <code>Enumeration</code> by the relation named <code>ReplenishEnumeration</code>.
     * @return the <code>Enumeration</code>
     * @throws RepositoryException if an error occurs
     */
    public Enumeration getReplenishEnumeration() throws RepositoryException {
        if (this.replenishEnumeration == null) {
            this.replenishEnumeration = getRelatedOne(Enumeration.class, "ReplenishEnumeration");
        }
        return this.replenishEnumeration;
    }
    /**
     * Auto generated method that gets the related <code>FinAccount</code> by the relation named <code>FinAccount</code>.
     * @return the list of <code>FinAccount</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends FinAccount> getFinAccounts() throws RepositoryException {
        if (this.finAccounts == null) {
            this.finAccounts = getRelated(FinAccount.class, "FinAccount");
        }
        return this.finAccounts;
    }
    /**
     * Auto generated method that gets the related <code>FinAccountType</code> by the relation named <code>ChildFinAccountType</code>.
     * @return the list of <code>FinAccountType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends FinAccountType> getChildFinAccountTypes() throws RepositoryException {
        if (this.childFinAccountTypes == null) {
            this.childFinAccountTypes = getRelated(FinAccountType.class, "ChildFinAccountType");
        }
        return this.childFinAccountTypes;
    }
    /**
     * Auto generated method that gets the related <code>FinAccountTypeAttr</code> by the relation named <code>FinAccountTypeAttr</code>.
     * @return the list of <code>FinAccountTypeAttr</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends FinAccountTypeAttr> getFinAccountTypeAttrs() throws RepositoryException {
        if (this.finAccountTypeAttrs == null) {
            this.finAccountTypeAttrs = getRelated(FinAccountTypeAttr.class, "FinAccountTypeAttr");
        }
        return this.finAccountTypeAttrs;
    }
    /**
     * Auto generated method that gets the related <code>FinAccountTypeGlAccount</code> by the relation named <code>FinAccountTypeGlAccount</code>.
     * @return the list of <code>FinAccountTypeGlAccount</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends FinAccountTypeGlAccount> getFinAccountTypeGlAccounts() throws RepositoryException {
        if (this.finAccountTypeGlAccounts == null) {
            this.finAccountTypeGlAccounts = getRelated(FinAccountTypeGlAccount.class, "FinAccountTypeGlAccount");
        }
        return this.finAccountTypeGlAccounts;
    }
    /**
     * Auto generated method that gets the related <code>ProductStoreFinActSetting</code> by the relation named <code>ProductStoreFinActSetting</code>.
     * @return the list of <code>ProductStoreFinActSetting</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductStoreFinActSetting> getProductStoreFinActSettings() throws RepositoryException {
        if (this.productStoreFinActSettings == null) {
            this.productStoreFinActSettings = getRelated(ProductStoreFinActSetting.class, "ProductStoreFinActSetting");
        }
        return this.productStoreFinActSettings;
    }

    /**
     * Auto generated value setter.
     * @param parentFinAccountType the parentFinAccountType to set
    */
    public void setParentFinAccountType(FinAccountType parentFinAccountType) {
        this.parentFinAccountType = parentFinAccountType;
    }
    /**
     * Auto generated value setter.
     * @param replenishEnumeration the replenishEnumeration to set
    */
    public void setReplenishEnumeration(Enumeration replenishEnumeration) {
        this.replenishEnumeration = replenishEnumeration;
    }
    /**
     * Auto generated value setter.
     * @param finAccounts the finAccounts to set
    */
    public void setFinAccounts(List<FinAccount> finAccounts) {
        this.finAccounts = finAccounts;
    }
    /**
     * Auto generated value setter.
     * @param childFinAccountTypes the childFinAccountTypes to set
    */
    public void setChildFinAccountTypes(List<FinAccountType> childFinAccountTypes) {
        this.childFinAccountTypes = childFinAccountTypes;
    }
    /**
     * Auto generated value setter.
     * @param finAccountTypeAttrs the finAccountTypeAttrs to set
    */
    public void setFinAccountTypeAttrs(List<FinAccountTypeAttr> finAccountTypeAttrs) {
        this.finAccountTypeAttrs = finAccountTypeAttrs;
    }
    /**
     * Auto generated value setter.
     * @param finAccountTypeGlAccounts the finAccountTypeGlAccounts to set
    */
    public void setFinAccountTypeGlAccounts(List<FinAccountTypeGlAccount> finAccountTypeGlAccounts) {
        this.finAccountTypeGlAccounts = finAccountTypeGlAccounts;
    }
    /**
     * Auto generated value setter.
     * @param productStoreFinActSettings the productStoreFinActSettings to set
    */
    public void setProductStoreFinActSettings(List<ProductStoreFinActSetting> productStoreFinActSettings) {
        this.productStoreFinActSettings = productStoreFinActSettings;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addFinAccountTypeAttr(FinAccountTypeAttr finAccountTypeAttr) {
        if (this.finAccountTypeAttrs == null) {
            this.finAccountTypeAttrs = new ArrayList<FinAccountTypeAttr>();
        }
        this.finAccountTypeAttrs.add(finAccountTypeAttr);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeFinAccountTypeAttr(FinAccountTypeAttr finAccountTypeAttr) {
        if (this.finAccountTypeAttrs == null) {
            return;
        }
        this.finAccountTypeAttrs.remove(finAccountTypeAttr);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearFinAccountTypeAttr() {
        if (this.finAccountTypeAttrs == null) {
            return;
        }
        this.finAccountTypeAttrs.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addFinAccountTypeGlAccount(FinAccountTypeGlAccount finAccountTypeGlAccount) {
        if (this.finAccountTypeGlAccounts == null) {
            this.finAccountTypeGlAccounts = new ArrayList<FinAccountTypeGlAccount>();
        }
        this.finAccountTypeGlAccounts.add(finAccountTypeGlAccount);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeFinAccountTypeGlAccount(FinAccountTypeGlAccount finAccountTypeGlAccount) {
        if (this.finAccountTypeGlAccounts == null) {
            return;
        }
        this.finAccountTypeGlAccounts.remove(finAccountTypeGlAccount);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearFinAccountTypeGlAccount() {
        if (this.finAccountTypeGlAccounts == null) {
            return;
        }
        this.finAccountTypeGlAccounts.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addProductStoreFinActSetting(ProductStoreFinActSetting productStoreFinActSetting) {
        if (this.productStoreFinActSettings == null) {
            this.productStoreFinActSettings = new ArrayList<ProductStoreFinActSetting>();
        }
        this.productStoreFinActSettings.add(productStoreFinActSetting);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeProductStoreFinActSetting(ProductStoreFinActSetting productStoreFinActSetting) {
        if (this.productStoreFinActSettings == null) {
            return;
        }
        this.productStoreFinActSettings.remove(productStoreFinActSetting);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearProductStoreFinActSetting() {
        if (this.productStoreFinActSettings == null) {
            return;
        }
        this.productStoreFinActSettings.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setFinAccountTypeId((String) mapValue.get("finAccountTypeId"));
        setParentTypeId((String) mapValue.get("parentTypeId"));
        setReplenishEnumId((String) mapValue.get("replenishEnumId"));
        setIsRefundable((String) mapValue.get("isRefundable"));
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
        mapValue.put("finAccountTypeId", getFinAccountTypeId());
        mapValue.put("parentTypeId", getParentTypeId());
        mapValue.put("replenishEnumId", getReplenishEnumId());
        mapValue.put("isRefundable", getIsRefundable());
        mapValue.put("hasTable", getHasTable());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
