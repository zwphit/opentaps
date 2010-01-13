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
 * Auto generated base entity OldProductKeywordResult.
 */
@javax.persistence.Entity
@Table(name="PRODUCT_KEYWORD_RESULT")
public class OldProductKeywordResult extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productKeywordResultId", "PRODUCT_KEYWORD_RESULT_ID");
        fields.put("visitId", "VISIT_ID");
        fields.put("productCategoryId", "PRODUCT_CATEGORY_ID");
        fields.put("searchString", "SEARCH_STRING");
        fields.put("intraKeywordOperator", "INTRA_KEYWORD_OPERATOR");
        fields.put("anyPrefix", "ANY_PREFIX");
        fields.put("anySuffix", "ANY_SUFFIX");
        fields.put("removeStems", "REMOVE_STEMS");
        fields.put("numResults", "NUM_RESULTS");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("OldProductKeywordResult", fields);
}
  public static enum Fields implements EntityFieldInterface<OldProductKeywordResult> {
    productKeywordResultId("productKeywordResultId"),
    visitId("visitId"),
    productCategoryId("productCategoryId"),
    searchString("searchString"),
    intraKeywordOperator("intraKeywordOperator"),
    anyPrefix("anyPrefix"),
    anySuffix("anySuffix"),
    removeStems("removeStems"),
    numResults("numResults"),
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

   @org.hibernate.annotations.GenericGenerator(name="OldProductKeywordResult_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="OldProductKeywordResult_GEN")
   @Id
   @Column(name="PRODUCT_KEYWORD_RESULT_ID")
   protected String productKeywordResultId;
   @Column(name="VISIT_ID")
   protected String visitId;
   @Column(name="PRODUCT_CATEGORY_ID")
   protected String productCategoryId;
   @Column(name="SEARCH_STRING")
   protected String searchString;
   @Column(name="INTRA_KEYWORD_OPERATOR")
   protected String intraKeywordOperator;
   @Column(name="ANY_PREFIX")
   protected String anyPrefix;
   @Column(name="ANY_SUFFIX")
   protected String anySuffix;
   @Column(name="REMOVE_STEMS")
   protected String removeStems;
   @Column(name="NUM_RESULTS")
   protected Long numResults;
   @Column(name="LAST_UPDATED_STAMP")
   protected Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   protected Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   protected Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   protected Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="VISIT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected Visit visit = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_CATEGORY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected ProductCategory productCategory = null;

  /**
   * Default constructor.
   */
  public OldProductKeywordResult() {
      super();
      this.baseEntityName = "OldProductKeywordResult";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productKeywordResultId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productKeywordResultId");this.allFieldsNames.add("visitId");this.allFieldsNames.add("productCategoryId");this.allFieldsNames.add("searchString");this.allFieldsNames.add("intraKeywordOperator");this.allFieldsNames.add("anyPrefix");this.allFieldsNames.add("anySuffix");this.allFieldsNames.add("removeStems");this.allFieldsNames.add("numResults");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public OldProductKeywordResult(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param productKeywordResultId the productKeywordResultId to set
     */
    public void setProductKeywordResultId(String productKeywordResultId) {
        this.productKeywordResultId = productKeywordResultId;
    }
    /**
     * Auto generated value setter.
     * @param visitId the visitId to set
     */
    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }
    /**
     * Auto generated value setter.
     * @param productCategoryId the productCategoryId to set
     */
    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }
    /**
     * Auto generated value setter.
     * @param searchString the searchString to set
     */
    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }
    /**
     * Auto generated value setter.
     * @param intraKeywordOperator the intraKeywordOperator to set
     */
    public void setIntraKeywordOperator(String intraKeywordOperator) {
        this.intraKeywordOperator = intraKeywordOperator;
    }
    /**
     * Auto generated value setter.
     * @param anyPrefix the anyPrefix to set
     */
    public void setAnyPrefix(String anyPrefix) {
        this.anyPrefix = anyPrefix;
    }
    /**
     * Auto generated value setter.
     * @param anySuffix the anySuffix to set
     */
    public void setAnySuffix(String anySuffix) {
        this.anySuffix = anySuffix;
    }
    /**
     * Auto generated value setter.
     * @param removeStems the removeStems to set
     */
    public void setRemoveStems(String removeStems) {
        this.removeStems = removeStems;
    }
    /**
     * Auto generated value setter.
     * @param numResults the numResults to set
     */
    public void setNumResults(Long numResults) {
        this.numResults = numResults;
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
    public String getProductKeywordResultId() {
        return this.productKeywordResultId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getVisitId() {
        return this.visitId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductCategoryId() {
        return this.productCategoryId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSearchString() {
        return this.searchString;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIntraKeywordOperator() {
        return this.intraKeywordOperator;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAnyPrefix() {
        return this.anyPrefix;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAnySuffix() {
        return this.anySuffix;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRemoveStems() {
        return this.removeStems;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getNumResults() {
        return this.numResults;
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
     * Auto generated method that gets the related <code>Visit</code> by the relation named <code>Visit</code>.
     * @return the <code>Visit</code>
     * @throws RepositoryException if an error occurs
     */
    public Visit getVisit() throws RepositoryException {
        if (this.visit == null) {
            this.visit = getRelatedOne(Visit.class, "Visit");
        }
        return this.visit;
    }
    /**
     * Auto generated method that gets the related <code>ProductCategory</code> by the relation named <code>ProductCategory</code>.
     * @return the <code>ProductCategory</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductCategory getProductCategory() throws RepositoryException {
        if (this.productCategory == null) {
            this.productCategory = getRelatedOne(ProductCategory.class, "ProductCategory");
        }
        return this.productCategory;
    }

    /**
     * Auto generated value setter.
     * @param visit the visit to set
    */
    public void setVisit(Visit visit) {
        this.visit = visit;
    }
    /**
     * Auto generated value setter.
     * @param productCategory the productCategory to set
    */
    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductKeywordResultId((String) mapValue.get("productKeywordResultId"));
        setVisitId((String) mapValue.get("visitId"));
        setProductCategoryId((String) mapValue.get("productCategoryId"));
        setSearchString((String) mapValue.get("searchString"));
        setIntraKeywordOperator((String) mapValue.get("intraKeywordOperator"));
        setAnyPrefix((String) mapValue.get("anyPrefix"));
        setAnySuffix((String) mapValue.get("anySuffix"));
        setRemoveStems((String) mapValue.get("removeStems"));
        setNumResults((Long) mapValue.get("numResults"));
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
        mapValue.put("productKeywordResultId", getProductKeywordResultId());
        mapValue.put("visitId", getVisitId());
        mapValue.put("productCategoryId", getProductCategoryId());
        mapValue.put("searchString", getSearchString());
        mapValue.put("intraKeywordOperator", getIntraKeywordOperator());
        mapValue.put("anyPrefix", getAnyPrefix());
        mapValue.put("anySuffix", getAnySuffix());
        mapValue.put("removeStems", getRemoveStems());
        mapValue.put("numResults", getNumResults());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
