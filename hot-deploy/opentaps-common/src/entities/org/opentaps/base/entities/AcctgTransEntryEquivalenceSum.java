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
import java.math.BigDecimal;

/**
 * Auto generated base entity AcctgTransEntryEquivalenceSum.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectAcctgTransEntryEquivalenceSums", query="SELECT ATR.ACCTG_TRANS_ID AS \"acctgTransId\",ATE.AMOUNT AS \"amount\",ATE.GL_ACCOUNT_ID AS \"glAccountId\",ATE.ORGANIZATION_PARTY_ID AS \"organizationPartyId\",ATE.DEBIT_CREDIT_FLAG AS \"debitCreditFlag\",ATE.CURRENCY_UOM_ID AS \"currencyUomId\",ATE.PRODUCT_ID AS \"productId\",ATE.PARTY_ID AS \"partyId\",ATE.ROLE_TYPE_ID AS \"roleTypeId\" FROM ACCTG_TRANS ATR INNER JOIN ACCTG_TRANS_ENTRY ATE ON ATR.ACCTG_TRANS_ID = ATE.ACCTG_TRANS_ID", resultSetMapping="AcctgTransEntryEquivalenceSumMapping")
@SqlResultSetMapping(name="AcctgTransEntryEquivalenceSumMapping", entities={
@EntityResult(entityClass=AcctgTransEntryEquivalenceSum.class, fields = {
@FieldResult(name="acctgTransId", column="acctgTransId")
,@FieldResult(name="amount", column="amount")
,@FieldResult(name="glAccountId", column="glAccountId")
,@FieldResult(name="organizationPartyId", column="organizationPartyId")
,@FieldResult(name="debitCreditFlag", column="debitCreditFlag")
,@FieldResult(name="currencyUomId", column="currencyUomId")
,@FieldResult(name="productId", column="productId")
,@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="roleTypeId", column="roleTypeId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class AcctgTransEntryEquivalenceSum extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("acctgTransId", "ATR.ACCTG_TRANS_ID");
        fields.put("amount", "ATE.AMOUNT");
        fields.put("glAccountId", "ATE.GL_ACCOUNT_ID");
        fields.put("organizationPartyId", "ATE.ORGANIZATION_PARTY_ID");
        fields.put("debitCreditFlag", "ATE.DEBIT_CREDIT_FLAG");
        fields.put("currencyUomId", "ATE.CURRENCY_UOM_ID");
        fields.put("productId", "ATE.PRODUCT_ID");
        fields.put("partyId", "ATE.PARTY_ID");
        fields.put("roleTypeId", "ATE.ROLE_TYPE_ID");
fieldMapColumns.put("AcctgTransEntryEquivalenceSum", fields);
}
  public static enum Fields implements EntityFieldInterface<AcctgTransEntryEquivalenceSum> {
    acctgTransId("acctgTransId"),
    amount("amount"),
    glAccountId("glAccountId"),
    organizationPartyId("organizationPartyId"),
    debitCreditFlag("debitCreditFlag"),
    currencyUomId("currencyUomId"),
    productId("productId"),
    partyId("partyId"),
    roleTypeId("roleTypeId");
    protected final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    @Id
   private String acctgTransId;
    
   private BigDecimal amount;
    
   private String glAccountId;
    
   private String organizationPartyId;
    
   private String debitCreditFlag;
    
   private String currencyUomId;
    
   private String productId;
    
   private String partyId;
    
   private String roleTypeId;

  /**
   * Default constructor.
   */
  public AcctgTransEntryEquivalenceSum() {
      super();
      this.baseEntityName = "AcctgTransEntryEquivalenceSum";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("acctgTransId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("acctgTransId");this.allFieldsNames.add("amount");this.allFieldsNames.add("glAccountId");this.allFieldsNames.add("organizationPartyId");this.allFieldsNames.add("debitCreditFlag");this.allFieldsNames.add("currencyUomId");this.allFieldsNames.add("productId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("roleTypeId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public AcctgTransEntryEquivalenceSum(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param acctgTransId the acctgTransId to set
     */
    public void setAcctgTransId(String acctgTransId) {
        this.acctgTransId = acctgTransId;
    }
    /**
     * Auto generated value setter.
     * @param amount the amount to set
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    /**
     * Auto generated value setter.
     * @param glAccountId the glAccountId to set
     */
    public void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId;
    }
    /**
     * Auto generated value setter.
     * @param organizationPartyId the organizationPartyId to set
     */
    public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }
    /**
     * Auto generated value setter.
     * @param debitCreditFlag the debitCreditFlag to set
     */
    public void setDebitCreditFlag(String debitCreditFlag) {
        this.debitCreditFlag = debitCreditFlag;
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
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }
    /**
     * Auto generated value setter.
     * @param partyId the partyId to set
     */
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
    /**
     * Auto generated value setter.
     * @param roleTypeId the roleTypeId to set
     */
    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcctgTransId() {
        return this.acctgTransId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getAmount() {
        return this.amount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGlAccountId() {
        return this.glAccountId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrganizationPartyId() {
        return this.organizationPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDebitCreditFlag() {
        return this.debitCreditFlag;
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
     * @return <code>String</code>
     */
    public String getProductId() {
        return this.productId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyId() {
        return this.partyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRoleTypeId() {
        return this.roleTypeId;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setAcctgTransId((String) mapValue.get("acctgTransId"));
        setAmount(convertToBigDecimal(mapValue.get("amount")));
        setGlAccountId((String) mapValue.get("glAccountId"));
        setOrganizationPartyId((String) mapValue.get("organizationPartyId"));
        setDebitCreditFlag((String) mapValue.get("debitCreditFlag"));
        setCurrencyUomId((String) mapValue.get("currencyUomId"));
        setProductId((String) mapValue.get("productId"));
        setPartyId((String) mapValue.get("partyId"));
        setRoleTypeId((String) mapValue.get("roleTypeId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("acctgTransId", getAcctgTransId());
        mapValue.put("amount", getAmount());
        mapValue.put("glAccountId", getGlAccountId());
        mapValue.put("organizationPartyId", getOrganizationPartyId());
        mapValue.put("debitCreditFlag", getDebitCreditFlag());
        mapValue.put("currencyUomId", getCurrencyUomId());
        mapValue.put("productId", getProductId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("roleTypeId", getRoleTypeId());
        return mapValue;
    }


}
