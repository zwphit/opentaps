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
 * Auto generated base entity ProductSearchConstraint.
 */
@javax.persistence.Entity
@Table(name="PRODUCT_SEARCH_CONSTRAINT")
public class ProductSearchConstraint extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productSearchResultId", "PRODUCT_SEARCH_RESULT_ID");
        fields.put("constraintSeqId", "CONSTRAINT_SEQ_ID");
        fields.put("constraintName", "CONSTRAINT_NAME");
        fields.put("infoString", "INFO_STRING");
        fields.put("includeSubCategories", "INCLUDE_SUB_CATEGORIES");
        fields.put("isAnd", "IS_AND");
        fields.put("anyPrefix", "ANY_PREFIX");
        fields.put("anySuffix", "ANY_SUFFIX");
        fields.put("removeStems", "REMOVE_STEMS");
        fields.put("lowValue", "LOW_VALUE");
        fields.put("highValue", "HIGH_VALUE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ProductSearchConstraint", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductSearchConstraint> {
    productSearchResultId("productSearchResultId"),
    constraintSeqId("constraintSeqId"),
    constraintName("constraintName"),
    infoString("infoString"),
    includeSubCategories("includeSubCategories"),
    isAnd("isAnd"),
    anyPrefix("anyPrefix"),
    anySuffix("anySuffix"),
    removeStems("removeStems"),
    lowValue("lowValue"),
    highValue("highValue"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.ProductSearchConstraintPkBridge.class)
     protected ProductSearchConstraintPk id = new ProductSearchConstraintPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>ProductSearchConstraintPk</code>
     */
      public ProductSearchConstraintPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>ProductSearchConstraintPk</code> value to set
    */   
      public void setId(ProductSearchConstraintPk id) {
         this.id = id;
      }
   @Column(name="CONSTRAINT_NAME")
   protected String constraintName;
   @Column(name="INFO_STRING")
   protected String infoString;
   @Column(name="INCLUDE_SUB_CATEGORIES")
   protected String includeSubCategories;
   @Column(name="IS_AND")
   protected String isAnd;
   @Column(name="ANY_PREFIX")
   protected String anyPrefix;
   @Column(name="ANY_SUFFIX")
   protected String anySuffix;
   @Column(name="REMOVE_STEMS")
   protected String removeStems;
   @Column(name="LOW_VALUE")
   protected String lowValue;
   @Column(name="HIGH_VALUE")
   protected String highValue;
   @Column(name="LAST_UPDATED_STAMP")
   protected Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   protected Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   protected Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   protected Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_SEARCH_RESULT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected ProductSearchResult productSearchResult = null;

  /**
   * Default constructor.
   */
  public ProductSearchConstraint() {
      super();
      this.baseEntityName = "ProductSearchConstraint";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productSearchResultId");this.primaryKeyNames.add("constraintSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productSearchResultId");this.allFieldsNames.add("constraintSeqId");this.allFieldsNames.add("constraintName");this.allFieldsNames.add("infoString");this.allFieldsNames.add("includeSubCategories");this.allFieldsNames.add("isAnd");this.allFieldsNames.add("anyPrefix");this.allFieldsNames.add("anySuffix");this.allFieldsNames.add("removeStems");this.allFieldsNames.add("lowValue");this.allFieldsNames.add("highValue");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductSearchConstraint(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param productSearchResultId the productSearchResultId to set
     */
    public void setProductSearchResultId(String productSearchResultId) {
        id.setProductSearchResultId(productSearchResultId);
    }
    /**
     * Auto generated value setter.
     * @param constraintSeqId the constraintSeqId to set
     */
    public void setConstraintSeqId(String constraintSeqId) {
        id.setConstraintSeqId(constraintSeqId);
    }
    /**
     * Auto generated value setter.
     * @param constraintName the constraintName to set
     */
    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
    }
    /**
     * Auto generated value setter.
     * @param infoString the infoString to set
     */
    public void setInfoString(String infoString) {
        this.infoString = infoString;
    }
    /**
     * Auto generated value setter.
     * @param includeSubCategories the includeSubCategories to set
     */
    public void setIncludeSubCategories(String includeSubCategories) {
        this.includeSubCategories = includeSubCategories;
    }
    /**
     * Auto generated value setter.
     * @param isAnd the isAnd to set
     */
    public void setIsAnd(String isAnd) {
        this.isAnd = isAnd;
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
     * @param lowValue the lowValue to set
     */
    public void setLowValue(String lowValue) {
        this.lowValue = lowValue;
    }
    /**
     * Auto generated value setter.
     * @param highValue the highValue to set
     */
    public void setHighValue(String highValue) {
        this.highValue = highValue;
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
    public String getProductSearchResultId() {
        return this.id.getProductSearchResultId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getConstraintSeqId() {
        return this.id.getConstraintSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getConstraintName() {
        return this.constraintName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInfoString() {
        return this.infoString;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIncludeSubCategories() {
        return this.includeSubCategories;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIsAnd() {
        return this.isAnd;
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
     * @return <code>String</code>
     */
    public String getLowValue() {
        return this.lowValue;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getHighValue() {
        return this.highValue;
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
     * Auto generated method that gets the related <code>ProductSearchResult</code> by the relation named <code>ProductSearchResult</code>.
     * @return the <code>ProductSearchResult</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductSearchResult getProductSearchResult() throws RepositoryException {
        if (this.productSearchResult == null) {
            this.productSearchResult = getRelatedOne(ProductSearchResult.class, "ProductSearchResult");
        }
        return this.productSearchResult;
    }

    /**
     * Auto generated value setter.
     * @param productSearchResult the productSearchResult to set
    */
    public void setProductSearchResult(ProductSearchResult productSearchResult) {
        this.productSearchResult = productSearchResult;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductSearchResultId((String) mapValue.get("productSearchResultId"));
        setConstraintSeqId((String) mapValue.get("constraintSeqId"));
        setConstraintName((String) mapValue.get("constraintName"));
        setInfoString((String) mapValue.get("infoString"));
        setIncludeSubCategories((String) mapValue.get("includeSubCategories"));
        setIsAnd((String) mapValue.get("isAnd"));
        setAnyPrefix((String) mapValue.get("anyPrefix"));
        setAnySuffix((String) mapValue.get("anySuffix"));
        setRemoveStems((String) mapValue.get("removeStems"));
        setLowValue((String) mapValue.get("lowValue"));
        setHighValue((String) mapValue.get("highValue"));
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
        mapValue.put("productSearchResultId", getProductSearchResultId());
        mapValue.put("constraintSeqId", getConstraintSeqId());
        mapValue.put("constraintName", getConstraintName());
        mapValue.put("infoString", getInfoString());
        mapValue.put("includeSubCategories", getIncludeSubCategories());
        mapValue.put("isAnd", getIsAnd());
        mapValue.put("anyPrefix", getAnyPrefix());
        mapValue.put("anySuffix", getAnySuffix());
        mapValue.put("removeStems", getRemoveStems());
        mapValue.put("lowValue", getLowValue());
        mapValue.put("highValue", getHighValue());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
