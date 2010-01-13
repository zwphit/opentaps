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
import java.sql.Timestamp;

/**
 * Auto generated base entity SalesForecastItem.
 */
@javax.persistence.Entity
@Table(name="SALES_FORECAST_ITEM")
public class SalesForecastItem extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("salesForecastItemId", "SALES_FORECAST_ITEM_ID");
        fields.put("salesForecastId", "SALES_FORECAST_ID");
        fields.put("forecastDatetime", "FORECAST_DATETIME");
        fields.put("productStoreId", "PRODUCT_STORE_ID");
        fields.put("facilityId", "FACILITY_ID");
        fields.put("partyId", "PARTY_ID");
        fields.put("productId", "PRODUCT_ID");
        fields.put("forecastQuantity", "FORECAST_QUANTITY");
        fields.put("forecastUnitPrice", "FORECAST_UNIT_PRICE");
        fields.put("forecastTotalAmount", "FORECAST_TOTAL_AMOUNT");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("SalesForecastItem", fields);
}
  public static enum Fields implements EntityFieldInterface<SalesForecastItem> {
    salesForecastItemId("salesForecastItemId"),
    salesForecastId("salesForecastId"),
    forecastDatetime("forecastDatetime"),
    productStoreId("productStoreId"),
    facilityId("facilityId"),
    partyId("partyId"),
    productId("productId"),
    forecastQuantity("forecastQuantity"),
    forecastUnitPrice("forecastUnitPrice"),
    forecastTotalAmount("forecastTotalAmount"),
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

   @org.hibernate.annotations.GenericGenerator(name="SalesForecastItem_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="SalesForecastItem_GEN")
   @Id
   @Column(name="SALES_FORECAST_ITEM_ID")
   protected String salesForecastItemId;
   @Column(name="SALES_FORECAST_ID")
   protected String salesForecastId;
   @Column(name="FORECAST_DATETIME")
   protected Timestamp forecastDatetime;
   @Column(name="PRODUCT_STORE_ID")
   protected String productStoreId;
   @Column(name="FACILITY_ID")
   protected String facilityId;
   @Column(name="PARTY_ID")
   protected String partyId;
   @Column(name="PRODUCT_ID")
   protected String productId;
   @Column(name="FORECAST_QUANTITY")
   protected BigDecimal forecastQuantity;
   @Column(name="FORECAST_UNIT_PRICE")
   protected BigDecimal forecastUnitPrice;
   @Column(name="FORECAST_TOTAL_AMOUNT")
   protected BigDecimal forecastTotalAmount;
   @Column(name="LAST_UPDATED_STAMP")
   protected Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   protected Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   protected Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   protected Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SALES_FORECAST_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected SalesForecast salesForecast = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_STORE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected ProductStore productStore = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="FACILITY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected Facility facility = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected Party party = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected Product product = null;

  /**
   * Default constructor.
   */
  public SalesForecastItem() {
      super();
      this.baseEntityName = "SalesForecastItem";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("salesForecastItemId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("salesForecastItemId");this.allFieldsNames.add("salesForecastId");this.allFieldsNames.add("forecastDatetime");this.allFieldsNames.add("productStoreId");this.allFieldsNames.add("facilityId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("productId");this.allFieldsNames.add("forecastQuantity");this.allFieldsNames.add("forecastUnitPrice");this.allFieldsNames.add("forecastTotalAmount");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public SalesForecastItem(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param salesForecastItemId the salesForecastItemId to set
     */
    public void setSalesForecastItemId(String salesForecastItemId) {
        this.salesForecastItemId = salesForecastItemId;
    }
    /**
     * Auto generated value setter.
     * @param salesForecastId the salesForecastId to set
     */
    public void setSalesForecastId(String salesForecastId) {
        this.salesForecastId = salesForecastId;
    }
    /**
     * Auto generated value setter.
     * @param forecastDatetime the forecastDatetime to set
     */
    public void setForecastDatetime(Timestamp forecastDatetime) {
        this.forecastDatetime = forecastDatetime;
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
     * @param partyId the partyId to set
     */
    public void setPartyId(String partyId) {
        this.partyId = partyId;
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
     * @param forecastQuantity the forecastQuantity to set
     */
    public void setForecastQuantity(BigDecimal forecastQuantity) {
        this.forecastQuantity = forecastQuantity;
    }
    /**
     * Auto generated value setter.
     * @param forecastUnitPrice the forecastUnitPrice to set
     */
    public void setForecastUnitPrice(BigDecimal forecastUnitPrice) {
        this.forecastUnitPrice = forecastUnitPrice;
    }
    /**
     * Auto generated value setter.
     * @param forecastTotalAmount the forecastTotalAmount to set
     */
    public void setForecastTotalAmount(BigDecimal forecastTotalAmount) {
        this.forecastTotalAmount = forecastTotalAmount;
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
    public String getSalesForecastItemId() {
        return this.salesForecastItemId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSalesForecastId() {
        return this.salesForecastId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getForecastDatetime() {
        return this.forecastDatetime;
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
     * @return <code>String</code>
     */
    public String getPartyId() {
        return this.partyId;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getForecastQuantity() {
        return this.forecastQuantity;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getForecastUnitPrice() {
        return this.forecastUnitPrice;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getForecastTotalAmount() {
        return this.forecastTotalAmount;
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
     * Auto generated method that gets the related <code>SalesForecast</code> by the relation named <code>SalesForecast</code>.
     * @return the <code>SalesForecast</code>
     * @throws RepositoryException if an error occurs
     */
    public SalesForecast getSalesForecast() throws RepositoryException {
        if (this.salesForecast == null) {
            this.salesForecast = getRelatedOne(SalesForecast.class, "SalesForecast");
        }
        return this.salesForecast;
    }
    /**
     * Auto generated method that gets the related <code>ProductStore</code> by the relation named <code>ProductStore</code>.
     * @return the <code>ProductStore</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductStore getProductStore() throws RepositoryException {
        if (this.productStore == null) {
            this.productStore = getRelatedOne(ProductStore.class, "ProductStore");
        }
        return this.productStore;
    }
    /**
     * Auto generated method that gets the related <code>Facility</code> by the relation named <code>Facility</code>.
     * @return the <code>Facility</code>
     * @throws RepositoryException if an error occurs
     */
    public Facility getFacility() throws RepositoryException {
        if (this.facility == null) {
            this.facility = getRelatedOne(Facility.class, "Facility");
        }
        return this.facility;
    }
    /**
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>Party</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getParty() throws RepositoryException {
        if (this.party == null) {
            this.party = getRelatedOne(Party.class, "Party");
        }
        return this.party;
    }
    /**
     * Auto generated method that gets the related <code>Product</code> by the relation named <code>Product</code>.
     * @return the <code>Product</code>
     * @throws RepositoryException if an error occurs
     */
    public Product getProduct() throws RepositoryException {
        if (this.product == null) {
            this.product = getRelatedOne(Product.class, "Product");
        }
        return this.product;
    }

    /**
     * Auto generated value setter.
     * @param salesForecast the salesForecast to set
    */
    public void setSalesForecast(SalesForecast salesForecast) {
        this.salesForecast = salesForecast;
    }
    /**
     * Auto generated value setter.
     * @param productStore the productStore to set
    */
    public void setProductStore(ProductStore productStore) {
        this.productStore = productStore;
    }
    /**
     * Auto generated value setter.
     * @param facility the facility to set
    */
    public void setFacility(Facility facility) {
        this.facility = facility;
    }
    /**
     * Auto generated value setter.
     * @param party the party to set
    */
    public void setParty(Party party) {
        this.party = party;
    }
    /**
     * Auto generated value setter.
     * @param product the product to set
    */
    public void setProduct(Product product) {
        this.product = product;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setSalesForecastItemId((String) mapValue.get("salesForecastItemId"));
        setSalesForecastId((String) mapValue.get("salesForecastId"));
        setForecastDatetime((Timestamp) mapValue.get("forecastDatetime"));
        setProductStoreId((String) mapValue.get("productStoreId"));
        setFacilityId((String) mapValue.get("facilityId"));
        setPartyId((String) mapValue.get("partyId"));
        setProductId((String) mapValue.get("productId"));
        setForecastQuantity(convertToBigDecimal(mapValue.get("forecastQuantity")));
        setForecastUnitPrice(convertToBigDecimal(mapValue.get("forecastUnitPrice")));
        setForecastTotalAmount(convertToBigDecimal(mapValue.get("forecastTotalAmount")));
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
        mapValue.put("salesForecastItemId", getSalesForecastItemId());
        mapValue.put("salesForecastId", getSalesForecastId());
        mapValue.put("forecastDatetime", getForecastDatetime());
        mapValue.put("productStoreId", getProductStoreId());
        mapValue.put("facilityId", getFacilityId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("productId", getProductId());
        mapValue.put("forecastQuantity", getForecastQuantity());
        mapValue.put("forecastUnitPrice", getForecastUnitPrice());
        mapValue.put("forecastTotalAmount", getForecastTotalAmount());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
