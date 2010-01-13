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
 * Auto generated base entity ProductStoreFacilityByOrder.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectProductStoreFacilityByOrders", query="SELECT ORH.ORDER_ID AS \"orderId\",PSF.PRODUCT_STORE_ID AS \"productStoreId\",PSF.FACILITY_ID AS \"facilityId\",PSF.FROM_DATE AS \"fromDate\",PSF.THRU_DATE AS \"thruDate\",PSF.SEQUENCE_NUM AS \"sequenceNum\",PDS.STORE_NAME AS \"storeName\",FAC.FACILITY_NAME AS \"facilityName\",FAC.FACILITY_TYPE_ID AS \"facilityTypeId\" FROM ORDER_HEADER ORH INNER JOIN PRODUCT_STORE_FACILITY PSF ON ORH.PRODUCT_STORE_ID = PSF.PRODUCT_STORE_ID INNER JOIN PRODUCT_STORE PDS ON PSF.PRODUCT_STORE_ID = PDS.PRODUCT_STORE_ID INNER JOIN FACILITY FAC ON PSF.FACILITY_ID = FAC.FACILITY_ID", resultSetMapping="ProductStoreFacilityByOrderMapping")
@SqlResultSetMapping(name="ProductStoreFacilityByOrderMapping", entities={
@EntityResult(entityClass=ProductStoreFacilityByOrder.class, fields = {
@FieldResult(name="orderId", column="orderId")
,@FieldResult(name="productStoreId", column="productStoreId")
,@FieldResult(name="facilityId", column="facilityId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="sequenceNum", column="sequenceNum")
,@FieldResult(name="storeName", column="storeName")
,@FieldResult(name="facilityName", column="facilityName")
,@FieldResult(name="facilityTypeId", column="facilityTypeId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class ProductStoreFacilityByOrder extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("orderId", "ORH.ORDER_ID");
        fields.put("productStoreId", "PSF.PRODUCT_STORE_ID");
        fields.put("facilityId", "PSF.FACILITY_ID");
        fields.put("fromDate", "PSF.FROM_DATE");
        fields.put("thruDate", "PSF.THRU_DATE");
        fields.put("sequenceNum", "PSF.SEQUENCE_NUM");
        fields.put("storeName", "PDS.STORE_NAME");
        fields.put("facilityName", "FAC.FACILITY_NAME");
        fields.put("facilityTypeId", "FAC.FACILITY_TYPE_ID");
fieldMapColumns.put("ProductStoreFacilityByOrder", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductStoreFacilityByOrder> {
    orderId("orderId"),
    productStoreId("productStoreId"),
    facilityId("facilityId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    sequenceNum("sequenceNum"),
    storeName("storeName"),
    facilityName("facilityName"),
    facilityTypeId("facilityTypeId");
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
   private String orderId;
    
   private String productStoreId;
    
   private String facilityId;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    
   private Long sequenceNum;
    
   private String storeName;
    
   private String facilityName;
    
   private String facilityTypeId;

  /**
   * Default constructor.
   */
  public ProductStoreFacilityByOrder() {
      super();
      this.baseEntityName = "ProductStoreFacilityByOrder";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("orderId");this.primaryKeyNames.add("productStoreId");this.primaryKeyNames.add("facilityId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("orderId");this.allFieldsNames.add("productStoreId");this.allFieldsNames.add("facilityId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("sequenceNum");this.allFieldsNames.add("storeName");this.allFieldsNames.add("facilityName");this.allFieldsNames.add("facilityTypeId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductStoreFacilityByOrder(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    /**
     * Auto generated value setter.
     * @param productStoreId the productStoreId to set
     */
    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }
    /**
     * Auto generated value setter.
     * @param facilityId the facilityId to set
     */
    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
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
     * @param sequenceNum the sequenceNum to set
     */
    public void setSequenceNum(Long sequenceNum) {
        this.sequenceNum = sequenceNum;
    }
    /**
     * Auto generated value setter.
     * @param storeName the storeName to set
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    /**
     * Auto generated value setter.
     * @param facilityName the facilityName to set
     */
    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }
    /**
     * Auto generated value setter.
     * @param facilityTypeId the facilityTypeId to set
     */
    public void setFacilityTypeId(String facilityTypeId) {
        this.facilityTypeId = facilityTypeId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderId() {
        return this.orderId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductStoreId() {
        return this.productStoreId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFacilityId() {
        return this.facilityId;
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
     * @return <code>Long</code>
     */
    public Long getSequenceNum() {
        return this.sequenceNum;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStoreName() {
        return this.storeName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFacilityName() {
        return this.facilityName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFacilityTypeId() {
        return this.facilityTypeId;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setOrderId((String) mapValue.get("orderId"));
        setProductStoreId((String) mapValue.get("productStoreId"));
        setFacilityId((String) mapValue.get("facilityId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setSequenceNum((Long) mapValue.get("sequenceNum"));
        setStoreName((String) mapValue.get("storeName"));
        setFacilityName((String) mapValue.get("facilityName"));
        setFacilityTypeId((String) mapValue.get("facilityTypeId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("orderId", getOrderId());
        mapValue.put("productStoreId", getProductStoreId());
        mapValue.put("facilityId", getFacilityId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("sequenceNum", getSequenceNum());
        mapValue.put("storeName", getStoreName());
        mapValue.put("facilityName", getFacilityName());
        mapValue.put("facilityTypeId", getFacilityTypeId());
        return mapValue;
    }


}
