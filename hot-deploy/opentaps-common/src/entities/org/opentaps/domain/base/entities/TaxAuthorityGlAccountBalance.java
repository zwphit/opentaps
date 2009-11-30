package org.opentaps.domain.base.entities;

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
import java.sql.Timestamp;

/**
 * Auto generated base entity TaxAuthorityGlAccountBalance.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectTaxAuthorityGlAccountBalances", query="SELECT PAP.BASE_CURRENCY_UOM_ID AS \"baseCurrencyUomId\",TAGA.TAX_AUTH_GEO_ID AS \"taxAuthGeoId\",TAGA.TAX_AUTH_PARTY_ID AS \"taxAuthPartyId\",TAGA.ORGANIZATION_PARTY_ID AS \"organizationPartyId\",TAGA.GL_ACCOUNT_ID AS \"glAccountId\",GLAO.ROLE_TYPE_ID AS \"roleTypeId\",GLAO.FROM_DATE AS \"fromDate\",GLAO.THRU_DATE AS \"thruDate\",GLAO.POSTED_BALANCE AS \"postedBalance\" FROM TAX_AUTHORITY_GL_ACCOUNT TAGA INNER JOIN GL_ACCOUNT_ORGANIZATION GLAO ON TAGA.GL_ACCOUNT_ID = GLAO.GL_ACCOUNT_ID AND TAGA.ORGANIZATION_PARTY_ID = GLAO.ORGANIZATION_PARTY_ID INNER JOIN PARTY_ACCTG_PREFERENCE PAP ON TAGA.ORGANIZATION_PARTY_ID = PAP.PARTY_ID", resultSetMapping="TaxAuthorityGlAccountBalanceMapping")
@SqlResultSetMapping(name="TaxAuthorityGlAccountBalanceMapping", entities={
@EntityResult(entityClass=TaxAuthorityGlAccountBalance.class, fields = {
@FieldResult(name="baseCurrencyUomId", column="baseCurrencyUomId")
,@FieldResult(name="taxAuthGeoId", column="taxAuthGeoId")
,@FieldResult(name="taxAuthPartyId", column="taxAuthPartyId")
,@FieldResult(name="organizationPartyId", column="organizationPartyId")
,@FieldResult(name="glAccountId", column="glAccountId")
,@FieldResult(name="roleTypeId", column="roleTypeId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="postedBalance", column="postedBalance")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class TaxAuthorityGlAccountBalance extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("baseCurrencyUomId", "PAP.BASE_CURRENCY_UOM_ID");
        fields.put("taxAuthGeoId", "TAGA.TAX_AUTH_GEO_ID");
        fields.put("taxAuthPartyId", "TAGA.TAX_AUTH_PARTY_ID");
        fields.put("organizationPartyId", "TAGA.ORGANIZATION_PARTY_ID");
        fields.put("glAccountId", "TAGA.GL_ACCOUNT_ID");
        fields.put("roleTypeId", "GLAO.ROLE_TYPE_ID");
        fields.put("fromDate", "GLAO.FROM_DATE");
        fields.put("thruDate", "GLAO.THRU_DATE");
        fields.put("postedBalance", "GLAO.POSTED_BALANCE");
fieldMapColumns.put("TaxAuthorityGlAccountBalance", fields);
}
  public static enum Fields implements EntityFieldInterface<TaxAuthorityGlAccountBalance> {
    baseCurrencyUomId("baseCurrencyUomId"),
    taxAuthGeoId("taxAuthGeoId"),
    taxAuthPartyId("taxAuthPartyId"),
    organizationPartyId("organizationPartyId"),
    glAccountId("glAccountId"),
    roleTypeId("roleTypeId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    postedBalance("postedBalance");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private String baseCurrencyUomId;
    @Id
   private String taxAuthGeoId;
    
   private String taxAuthPartyId;
    
   private String organizationPartyId;
    
   private String glAccountId;
    
   private String roleTypeId;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    
   private BigDecimal postedBalance;

  /**
   * Default constructor.
   */
  public TaxAuthorityGlAccountBalance() {
      super();
      this.baseEntityName = "TaxAuthorityGlAccountBalance";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("taxAuthGeoId");this.primaryKeyNames.add("taxAuthPartyId");this.primaryKeyNames.add("organizationPartyId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("baseCurrencyUomId");this.allFieldsNames.add("taxAuthGeoId");this.allFieldsNames.add("taxAuthPartyId");this.allFieldsNames.add("organizationPartyId");this.allFieldsNames.add("glAccountId");this.allFieldsNames.add("roleTypeId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("postedBalance");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public TaxAuthorityGlAccountBalance(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param baseCurrencyUomId the baseCurrencyUomId to set
     */
    public void setBaseCurrencyUomId(String baseCurrencyUomId) {
        this.baseCurrencyUomId = baseCurrencyUomId;
    }
    /**
     * Auto generated value setter.
     * @param taxAuthGeoId the taxAuthGeoId to set
     */
    public void setTaxAuthGeoId(String taxAuthGeoId) {
        this.taxAuthGeoId = taxAuthGeoId;
    }
    /**
     * Auto generated value setter.
     * @param taxAuthPartyId the taxAuthPartyId to set
     */
    public void setTaxAuthPartyId(String taxAuthPartyId) {
        this.taxAuthPartyId = taxAuthPartyId;
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
     * @param glAccountId the glAccountId to set
     */
    public void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId;
    }
    /**
     * Auto generated value setter.
     * @param roleTypeId the roleTypeId to set
     */
    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
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
     * @param postedBalance the postedBalance to set
     */
    public void setPostedBalance(BigDecimal postedBalance) {
        this.postedBalance = postedBalance;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getBaseCurrencyUomId() {
        return this.baseCurrencyUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTaxAuthGeoId() {
        return this.taxAuthGeoId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTaxAuthPartyId() {
        return this.taxAuthPartyId;
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
    public String getGlAccountId() {
        return this.glAccountId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRoleTypeId() {
        return this.roleTypeId;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getPostedBalance() {
        return this.postedBalance;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setBaseCurrencyUomId((String) mapValue.get("baseCurrencyUomId"));
        setTaxAuthGeoId((String) mapValue.get("taxAuthGeoId"));
        setTaxAuthPartyId((String) mapValue.get("taxAuthPartyId"));
        setOrganizationPartyId((String) mapValue.get("organizationPartyId"));
        setGlAccountId((String) mapValue.get("glAccountId"));
        setRoleTypeId((String) mapValue.get("roleTypeId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setPostedBalance(convertToBigDecimal(mapValue.get("postedBalance")));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("baseCurrencyUomId", getBaseCurrencyUomId());
        mapValue.put("taxAuthGeoId", getTaxAuthGeoId());
        mapValue.put("taxAuthPartyId", getTaxAuthPartyId());
        mapValue.put("organizationPartyId", getOrganizationPartyId());
        mapValue.put("glAccountId", getGlAccountId());
        mapValue.put("roleTypeId", getRoleTypeId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("postedBalance", getPostedBalance());
        return mapValue;
    }


}