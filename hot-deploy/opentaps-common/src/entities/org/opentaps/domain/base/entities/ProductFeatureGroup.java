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
import java.sql.Timestamp;

/**
 * Auto generated base entity ProductFeatureGroup.
 */
@javax.persistence.Entity
@Table(name="PRODUCT_FEATURE_GROUP")
public class ProductFeatureGroup extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productFeatureGroupId", "PRODUCT_FEATURE_GROUP_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ProductFeatureGroup", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductFeatureGroup> {
    productFeatureGroupId("productFeatureGroupId"),
    description("description"),
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

   @org.hibernate.annotations.GenericGenerator(name="ProductFeatureGroup_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="ProductFeatureGroup_GEN")
   @Id
   @Column(name="PRODUCT_FEATURE_GROUP_ID")
   private String productFeatureGroupId;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="productFeatureGroup", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PRODUCT_FEATURE_GROUP_ID")
   
   private List<ProductFeatureCatGrpAppl> productFeatureCatGrpAppls = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="productFeatureGroup", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PRODUCT_FEATURE_GROUP_ID")
   
   private List<ProductFeatureGroupAppl> productFeatureGroupAppls = null;

  /**
   * Default constructor.
   */
  public ProductFeatureGroup() {
      super();
      this.baseEntityName = "ProductFeatureGroup";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productFeatureGroupId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productFeatureGroupId");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductFeatureGroup(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param productFeatureGroupId the productFeatureGroupId to set
     */
    public void setProductFeatureGroupId(String productFeatureGroupId) {
        this.productFeatureGroupId = productFeatureGroupId;
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
    public String getProductFeatureGroupId() {
        return this.productFeatureGroupId;
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
     * Auto generated method that gets the related <code>ProductFeatureCatGrpAppl</code> by the relation named <code>ProductFeatureCatGrpAppl</code>.
     * @return the list of <code>ProductFeatureCatGrpAppl</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductFeatureCatGrpAppl> getProductFeatureCatGrpAppls() throws RepositoryException {
        if (this.productFeatureCatGrpAppls == null) {
            this.productFeatureCatGrpAppls = getRelated(ProductFeatureCatGrpAppl.class, "ProductFeatureCatGrpAppl");
        }
        return this.productFeatureCatGrpAppls;
    }
    /**
     * Auto generated method that gets the related <code>ProductFeatureGroupAppl</code> by the relation named <code>ProductFeatureGroupAppl</code>.
     * @return the list of <code>ProductFeatureGroupAppl</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductFeatureGroupAppl> getProductFeatureGroupAppls() throws RepositoryException {
        if (this.productFeatureGroupAppls == null) {
            this.productFeatureGroupAppls = getRelated(ProductFeatureGroupAppl.class, "ProductFeatureGroupAppl");
        }
        return this.productFeatureGroupAppls;
    }

    /**
     * Auto generated value setter.
     * @param productFeatureCatGrpAppls the productFeatureCatGrpAppls to set
    */
    public void setProductFeatureCatGrpAppls(List<ProductFeatureCatGrpAppl> productFeatureCatGrpAppls) {
        this.productFeatureCatGrpAppls = productFeatureCatGrpAppls;
    }
    /**
     * Auto generated value setter.
     * @param productFeatureGroupAppls the productFeatureGroupAppls to set
    */
    public void setProductFeatureGroupAppls(List<ProductFeatureGroupAppl> productFeatureGroupAppls) {
        this.productFeatureGroupAppls = productFeatureGroupAppls;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addProductFeatureCatGrpAppl(ProductFeatureCatGrpAppl productFeatureCatGrpAppl) {
        if (this.productFeatureCatGrpAppls == null) {
            this.productFeatureCatGrpAppls = new ArrayList<ProductFeatureCatGrpAppl>();
        }
        this.productFeatureCatGrpAppls.add(productFeatureCatGrpAppl);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeProductFeatureCatGrpAppl(ProductFeatureCatGrpAppl productFeatureCatGrpAppl) {
        if (this.productFeatureCatGrpAppls == null) {
            return;
        }
        this.productFeatureCatGrpAppls.remove(productFeatureCatGrpAppl);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearProductFeatureCatGrpAppl() {
        if (this.productFeatureCatGrpAppls == null) {
            return;
        }
        this.productFeatureCatGrpAppls.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addProductFeatureGroupAppl(ProductFeatureGroupAppl productFeatureGroupAppl) {
        if (this.productFeatureGroupAppls == null) {
            this.productFeatureGroupAppls = new ArrayList<ProductFeatureGroupAppl>();
        }
        this.productFeatureGroupAppls.add(productFeatureGroupAppl);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeProductFeatureGroupAppl(ProductFeatureGroupAppl productFeatureGroupAppl) {
        if (this.productFeatureGroupAppls == null) {
            return;
        }
        this.productFeatureGroupAppls.remove(productFeatureGroupAppl);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearProductFeatureGroupAppl() {
        if (this.productFeatureGroupAppls == null) {
            return;
        }
        this.productFeatureGroupAppls.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductFeatureGroupId((String) mapValue.get("productFeatureGroupId"));
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
        mapValue.put("productFeatureGroupId", getProductFeatureGroupId());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}