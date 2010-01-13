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
 * Auto generated base entity ProductCategoryContentType.
 */
@javax.persistence.Entity
@Table(name="PRODUCT_CATEGORY_CONTENT_TYPE")
public class ProductCategoryContentType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("prodCatContentTypeId", "PROD_CAT_CONTENT_TYPE_ID");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("hasTable", "HAS_TABLE");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ProductCategoryContentType", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductCategoryContentType> {
    prodCatContentTypeId("prodCatContentTypeId"),
    parentTypeId("parentTypeId"),
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

   @org.hibernate.annotations.GenericGenerator(name="ProductCategoryContentType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="ProductCategoryContentType_GEN")
   @Id
   @Column(name="PROD_CAT_CONTENT_TYPE_ID")
   protected String prodCatContentTypeId;
   @Column(name="PARENT_TYPE_ID")
   protected String parentTypeId;
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
   
   protected ProductCategoryContentType parentProductCategoryContentType = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="productCategoryContentType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PROD_CAT_CONTENT_TYPE_ID")
   
   protected List<ProductCategoryContent> productCategoryContents = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_TYPE_ID")
   
   protected List<ProductCategoryContentType> childProductCategoryContentTypes = null;

  /**
   * Default constructor.
   */
  public ProductCategoryContentType() {
      super();
      this.baseEntityName = "ProductCategoryContentType";
      this.isView = false;
      this.resourceName = "ProductEntityLabels";
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("prodCatContentTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("prodCatContentTypeId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("hasTable");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductCategoryContentType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param prodCatContentTypeId the prodCatContentTypeId to set
     */
    public void setProdCatContentTypeId(String prodCatContentTypeId) {
        this.prodCatContentTypeId = prodCatContentTypeId;
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
    public String getProdCatContentTypeId() {
        return this.prodCatContentTypeId;
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
     * Auto generated method that gets the related <code>ProductCategoryContentType</code> by the relation named <code>ParentProductCategoryContentType</code>.
     * @return the <code>ProductCategoryContentType</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductCategoryContentType getParentProductCategoryContentType() throws RepositoryException {
        if (this.parentProductCategoryContentType == null) {
            this.parentProductCategoryContentType = getRelatedOne(ProductCategoryContentType.class, "ParentProductCategoryContentType");
        }
        return this.parentProductCategoryContentType;
    }
    /**
     * Auto generated method that gets the related <code>ProductCategoryContent</code> by the relation named <code>ProductCategoryContent</code>.
     * @return the list of <code>ProductCategoryContent</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductCategoryContent> getProductCategoryContents() throws RepositoryException {
        if (this.productCategoryContents == null) {
            this.productCategoryContents = getRelated(ProductCategoryContent.class, "ProductCategoryContent");
        }
        return this.productCategoryContents;
    }
    /**
     * Auto generated method that gets the related <code>ProductCategoryContentType</code> by the relation named <code>ChildProductCategoryContentType</code>.
     * @return the list of <code>ProductCategoryContentType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductCategoryContentType> getChildProductCategoryContentTypes() throws RepositoryException {
        if (this.childProductCategoryContentTypes == null) {
            this.childProductCategoryContentTypes = getRelated(ProductCategoryContentType.class, "ChildProductCategoryContentType");
        }
        return this.childProductCategoryContentTypes;
    }

    /**
     * Auto generated value setter.
     * @param parentProductCategoryContentType the parentProductCategoryContentType to set
    */
    public void setParentProductCategoryContentType(ProductCategoryContentType parentProductCategoryContentType) {
        this.parentProductCategoryContentType = parentProductCategoryContentType;
    }
    /**
     * Auto generated value setter.
     * @param productCategoryContents the productCategoryContents to set
    */
    public void setProductCategoryContents(List<ProductCategoryContent> productCategoryContents) {
        this.productCategoryContents = productCategoryContents;
    }
    /**
     * Auto generated value setter.
     * @param childProductCategoryContentTypes the childProductCategoryContentTypes to set
    */
    public void setChildProductCategoryContentTypes(List<ProductCategoryContentType> childProductCategoryContentTypes) {
        this.childProductCategoryContentTypes = childProductCategoryContentTypes;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addProductCategoryContent(ProductCategoryContent productCategoryContent) {
        if (this.productCategoryContents == null) {
            this.productCategoryContents = new ArrayList<ProductCategoryContent>();
        }
        this.productCategoryContents.add(productCategoryContent);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeProductCategoryContent(ProductCategoryContent productCategoryContent) {
        if (this.productCategoryContents == null) {
            return;
        }
        this.productCategoryContents.remove(productCategoryContent);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearProductCategoryContent() {
        if (this.productCategoryContents == null) {
            return;
        }
        this.productCategoryContents.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProdCatContentTypeId((String) mapValue.get("prodCatContentTypeId"));
        setParentTypeId((String) mapValue.get("parentTypeId"));
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
        mapValue.put("prodCatContentTypeId", getProdCatContentTypeId());
        mapValue.put("parentTypeId", getParentTypeId());
        mapValue.put("hasTable", getHasTable());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
