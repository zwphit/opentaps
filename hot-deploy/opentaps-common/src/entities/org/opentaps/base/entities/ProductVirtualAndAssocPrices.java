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
 * Auto generated base entity ProductVirtualAndAssocPrices.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectProductVirtualAndAssocPricess", query="SELECT PVIRT.PRODUCT_ID AS \"productId\",PVIRT.INTERNAL_NAME AS \"internalName\",PVIRT.PRODUCT_NAME AS \"productName\",PA.PRODUCT_ASSOC_TYPE_ID AS \"productAssocTypeId\",PA.FROM_DATE AS \"fromDate\",PA.THRU_DATE AS \"thruDate\",PASC.PRODUCT_ID AS \"productId\",PASC.PRODUCT_ID AS \"productId\",PASCPRC.PRODUCT_PRICE_TYPE_ID AS \"productPriceTypeId\",PASCPRC.CURRENCY_UOM_ID AS \"currencyUomId\",PASCPRC.PRODUCT_STORE_GROUP_ID AS \"productStoreGroupId\",PASCPRC.FROM_DATE AS \"fromDate\",PASCPRC.THRU_DATE AS \"thruDate\",PASCPRC.PRICE AS \"price\",PASCPRC.PRICE AS \"price\" FROM PRODUCT PVIRT INNER JOIN PRODUCT_ASSOC PA ON PVIRT.PRODUCT_ID = PA.PRODUCT_ID INNER JOIN PRODUCT PASC ON PA.PRODUCT_ID_TO = PASC.PRODUCT_ID INNER JOIN PRODUCT_PRICE PASCPRC ON PASC.PRODUCT_ID = PASCPRC.PRODUCT_ID", resultSetMapping="ProductVirtualAndAssocPricesMapping")
@SqlResultSetMapping(name="ProductVirtualAndAssocPricesMapping", entities={
@EntityResult(entityClass=ProductVirtualAndAssocPrices.class, fields = {
@FieldResult(name="productId", column="productId")
,@FieldResult(name="internalName", column="internalName")
,@FieldResult(name="productName", column="productName")
,@FieldResult(name="productAssocTypeId", column="productAssocTypeId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="assocProductId", column="assocProductId")
,@FieldResult(name="assocProductCount", column="assocProductCount")
,@FieldResult(name="assocPriceTypeId", column="assocPriceTypeId")
,@FieldResult(name="assocCurrencyUomId", column="assocCurrencyUomId")
,@FieldResult(name="assocProductStoreGroupId", column="assocProductStoreGroupId")
,@FieldResult(name="assocPriceFromDate", column="assocPriceFromDate")
,@FieldResult(name="assocPriceThruDate", column="assocPriceThruDate")
,@FieldResult(name="assocMinPrice", column="assocMinPrice")
,@FieldResult(name="assocMaxPrice", column="assocMaxPrice")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class ProductVirtualAndAssocPrices extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productId", "PVIRT.PRODUCT_ID");
        fields.put("internalName", "PVIRT.INTERNAL_NAME");
        fields.put("productName", "PVIRT.PRODUCT_NAME");
        fields.put("productAssocTypeId", "PA.PRODUCT_ASSOC_TYPE_ID");
        fields.put("fromDate", "PA.FROM_DATE");
        fields.put("thruDate", "PA.THRU_DATE");
        fields.put("assocProductId", "PASC.PRODUCT_ID");
        fields.put("assocProductCount", "PASC.PRODUCT_ID");
        fields.put("assocPriceTypeId", "PASCPRC.PRODUCT_PRICE_TYPE_ID");
        fields.put("assocCurrencyUomId", "PASCPRC.CURRENCY_UOM_ID");
        fields.put("assocProductStoreGroupId", "PASCPRC.PRODUCT_STORE_GROUP_ID");
        fields.put("assocPriceFromDate", "PASCPRC.FROM_DATE");
        fields.put("assocPriceThruDate", "PASCPRC.THRU_DATE");
        fields.put("assocMinPrice", "PASCPRC.PRICE");
        fields.put("assocMaxPrice", "PASCPRC.PRICE");
fieldMapColumns.put("ProductVirtualAndAssocPrices", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductVirtualAndAssocPrices> {
    productId("productId"),
    internalName("internalName"),
    productName("productName"),
    productAssocTypeId("productAssocTypeId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    assocProductId("assocProductId"),
    assocProductCount("assocProductCount"),
    assocPriceTypeId("assocPriceTypeId"),
    assocCurrencyUomId("assocCurrencyUomId"),
    assocProductStoreGroupId("assocProductStoreGroupId"),
    assocPriceFromDate("assocPriceFromDate"),
    assocPriceThruDate("assocPriceThruDate"),
    assocMinPrice("assocMinPrice"),
    assocMaxPrice("assocMaxPrice");
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
   private String productId;
    
   private String internalName;
    
   private String productName;
    
   private String productAssocTypeId;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    
   private String assocProductId;
    
   private Long assocProductCount;
    
   private String assocPriceTypeId;
    
   private String assocCurrencyUomId;
    
   private String assocProductStoreGroupId;
    
   private Timestamp assocPriceFromDate;
    
   private Timestamp assocPriceThruDate;
    
   private BigDecimal assocMinPrice;
    
   private BigDecimal assocMaxPrice;

  /**
   * Default constructor.
   */
  public ProductVirtualAndAssocPrices() {
      super();
      this.baseEntityName = "ProductVirtualAndAssocPrices";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productId");this.primaryKeyNames.add("productAssocTypeId");this.primaryKeyNames.add("fromDate");this.primaryKeyNames.add("assocProductId");this.primaryKeyNames.add("assocProductCount");this.primaryKeyNames.add("assocPriceTypeId");this.primaryKeyNames.add("assocCurrencyUomId");this.primaryKeyNames.add("assocProductStoreGroupId");this.primaryKeyNames.add("assocPriceFromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productId");this.allFieldsNames.add("internalName");this.allFieldsNames.add("productName");this.allFieldsNames.add("productAssocTypeId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("assocProductId");this.allFieldsNames.add("assocProductCount");this.allFieldsNames.add("assocPriceTypeId");this.allFieldsNames.add("assocCurrencyUomId");this.allFieldsNames.add("assocProductStoreGroupId");this.allFieldsNames.add("assocPriceFromDate");this.allFieldsNames.add("assocPriceThruDate");this.allFieldsNames.add("assocMinPrice");this.allFieldsNames.add("assocMaxPrice");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductVirtualAndAssocPrices(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }
    /**
     * Auto generated value setter.
     * @param internalName the internalName to set
     */
    public void setInternalName(String internalName) {
        this.internalName = internalName;
    }
    /**
     * Auto generated value setter.
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }
    /**
     * Auto generated value setter.
     * @param productAssocTypeId the productAssocTypeId to set
     */
    public void setProductAssocTypeId(String productAssocTypeId) {
        this.productAssocTypeId = productAssocTypeId;
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
     * @param assocProductId the assocProductId to set
     */
    public void setAssocProductId(String assocProductId) {
        this.assocProductId = assocProductId;
    }
    /**
     * Auto generated value setter.
     * @param assocProductCount the assocProductCount to set
     */
    public void setAssocProductCount(Long assocProductCount) {
        this.assocProductCount = assocProductCount;
    }
    /**
     * Auto generated value setter.
     * @param assocPriceTypeId the assocPriceTypeId to set
     */
    public void setAssocPriceTypeId(String assocPriceTypeId) {
        this.assocPriceTypeId = assocPriceTypeId;
    }
    /**
     * Auto generated value setter.
     * @param assocCurrencyUomId the assocCurrencyUomId to set
     */
    public void setAssocCurrencyUomId(String assocCurrencyUomId) {
        this.assocCurrencyUomId = assocCurrencyUomId;
    }
    /**
     * Auto generated value setter.
     * @param assocProductStoreGroupId the assocProductStoreGroupId to set
     */
    public void setAssocProductStoreGroupId(String assocProductStoreGroupId) {
        this.assocProductStoreGroupId = assocProductStoreGroupId;
    }
    /**
     * Auto generated value setter.
     * @param assocPriceFromDate the assocPriceFromDate to set
     */
    public void setAssocPriceFromDate(Timestamp assocPriceFromDate) {
        this.assocPriceFromDate = assocPriceFromDate;
    }
    /**
     * Auto generated value setter.
     * @param assocPriceThruDate the assocPriceThruDate to set
     */
    public void setAssocPriceThruDate(Timestamp assocPriceThruDate) {
        this.assocPriceThruDate = assocPriceThruDate;
    }
    /**
     * Auto generated value setter.
     * @param assocMinPrice the assocMinPrice to set
     */
    public void setAssocMinPrice(BigDecimal assocMinPrice) {
        this.assocMinPrice = assocMinPrice;
    }
    /**
     * Auto generated value setter.
     * @param assocMaxPrice the assocMaxPrice to set
     */
    public void setAssocMaxPrice(BigDecimal assocMaxPrice) {
        this.assocMaxPrice = assocMaxPrice;
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
    public String getInternalName() {
        return this.internalName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductName() {
        return this.productName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductAssocTypeId() {
        return this.productAssocTypeId;
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
    public String getAssocProductId() {
        return this.assocProductId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getAssocProductCount() {
        return this.assocProductCount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAssocPriceTypeId() {
        return this.assocPriceTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAssocCurrencyUomId() {
        return this.assocCurrencyUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAssocProductStoreGroupId() {
        return this.assocProductStoreGroupId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getAssocPriceFromDate() {
        return this.assocPriceFromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getAssocPriceThruDate() {
        return this.assocPriceThruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getAssocMinPrice() {
        return this.assocMinPrice;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getAssocMaxPrice() {
        return this.assocMaxPrice;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductId((String) mapValue.get("productId"));
        setInternalName((String) mapValue.get("internalName"));
        setProductName((String) mapValue.get("productName"));
        setProductAssocTypeId((String) mapValue.get("productAssocTypeId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setAssocProductId((String) mapValue.get("assocProductId"));
        setAssocProductCount((Long) mapValue.get("assocProductCount"));
        setAssocPriceTypeId((String) mapValue.get("assocPriceTypeId"));
        setAssocCurrencyUomId((String) mapValue.get("assocCurrencyUomId"));
        setAssocProductStoreGroupId((String) mapValue.get("assocProductStoreGroupId"));
        setAssocPriceFromDate((Timestamp) mapValue.get("assocPriceFromDate"));
        setAssocPriceThruDate((Timestamp) mapValue.get("assocPriceThruDate"));
        setAssocMinPrice(convertToBigDecimal(mapValue.get("assocMinPrice")));
        setAssocMaxPrice(convertToBigDecimal(mapValue.get("assocMaxPrice")));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("productId", getProductId());
        mapValue.put("internalName", getInternalName());
        mapValue.put("productName", getProductName());
        mapValue.put("productAssocTypeId", getProductAssocTypeId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("assocProductId", getAssocProductId());
        mapValue.put("assocProductCount", getAssocProductCount());
        mapValue.put("assocPriceTypeId", getAssocPriceTypeId());
        mapValue.put("assocCurrencyUomId", getAssocCurrencyUomId());
        mapValue.put("assocProductStoreGroupId", getAssocProductStoreGroupId());
        mapValue.put("assocPriceFromDate", getAssocPriceFromDate());
        mapValue.put("assocPriceThruDate", getAssocPriceThruDate());
        mapValue.put("assocMinPrice", getAssocMinPrice());
        mapValue.put("assocMaxPrice", getAssocMaxPrice());
        return mapValue;
    }


}
