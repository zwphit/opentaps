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
 * Auto generated base entity NetSuiteItemPrice.
 */
@javax.persistence.Entity
@Table(name="NET_SUITE_ITEM_PRICE")
public class NetSuiteItemPrice extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("priceId", "PRICE_ID");
        fields.put("isinactive", "ISINACTIVE");
        fields.put("itemPriceName", "ITEM_PRICE_NAME");
        fields.put("isonline", "ISONLINE");
        fields.put("currencyId", "CURRENCY_ID");
        fields.put("discountPercentage", "DISCOUNT_PERCENTAGE");
        fields.put("itemId", "ITEM_ID");
        fields.put("itemPriceExtid", "ITEM_PRICE_EXTID");
        fields.put("itemPriceId", "ITEM_PRICE_ID");
        fields.put("itemQuantityId", "ITEM_QUANTITY_ID");
        fields.put("itemUnitPrice", "ITEM_UNIT_PRICE");
        fields.put("importStatusId", "IMPORT_STATUS_ID");
        fields.put("importError", "IMPORT_ERROR");
        fields.put("processedTimestamp", "PROCESSED_TIMESTAMP");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("NetSuiteItemPrice", fields);
}
  public static enum Fields implements EntityFieldInterface<NetSuiteItemPrice> {
    priceId("priceId"),
    isinactive("isinactive"),
    itemPriceName("itemPriceName"),
    isonline("isonline"),
    currencyId("currencyId"),
    discountPercentage("discountPercentage"),
    itemId("itemId"),
    itemPriceExtid("itemPriceExtid"),
    itemPriceId("itemPriceId"),
    itemQuantityId("itemQuantityId"),
    itemUnitPrice("itemUnitPrice"),
    importStatusId("importStatusId"),
    importError("importError"),
    processedTimestamp("processedTimestamp"),
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

   @org.hibernate.annotations.GenericGenerator(name="NetSuiteItemPrice_GEN",  strategy="increment")
   @GeneratedValue(generator="NetSuiteItemPrice_GEN")
   @Id
   @Column(name="PRICE_ID")
   protected Long priceId;
   @Column(name="ISINACTIVE")
   protected String isinactive;
   @Column(name="ITEM_PRICE_NAME")
   protected String itemPriceName;
   @Column(name="ISONLINE")
   protected String isonline;
   @Column(name="CURRENCY_ID")
   protected String currencyId;
   @Column(name="DISCOUNT_PERCENTAGE")
   protected Long discountPercentage;
   @Column(name="ITEM_ID")
   protected Long itemId;
   @Column(name="ITEM_PRICE_EXTID")
   protected String itemPriceExtid;
   @Column(name="ITEM_PRICE_ID")
   protected Long itemPriceId;
   @Column(name="ITEM_QUANTITY_ID")
   protected Long itemQuantityId;
   @Column(name="ITEM_UNIT_PRICE")
   protected BigDecimal itemUnitPrice;
   @Column(name="IMPORT_STATUS_ID")
   protected String importStatusId;
   @Column(name="IMPORT_ERROR")
   protected String importError;
   @Column(name="PROCESSED_TIMESTAMP")
   protected Timestamp processedTimestamp;
   @Column(name="LAST_UPDATED_STAMP")
   protected Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   protected Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   protected Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   protected Timestamp createdTxStamp;

  /**
   * Default constructor.
   */
  public NetSuiteItemPrice() {
      super();
      this.baseEntityName = "NetSuiteItemPrice";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("priceId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("priceId");this.allFieldsNames.add("isinactive");this.allFieldsNames.add("itemPriceName");this.allFieldsNames.add("isonline");this.allFieldsNames.add("currencyId");this.allFieldsNames.add("discountPercentage");this.allFieldsNames.add("itemId");this.allFieldsNames.add("itemPriceExtid");this.allFieldsNames.add("itemPriceId");this.allFieldsNames.add("itemQuantityId");this.allFieldsNames.add("itemUnitPrice");this.allFieldsNames.add("importStatusId");this.allFieldsNames.add("importError");this.allFieldsNames.add("processedTimestamp");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public NetSuiteItemPrice(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param priceId the priceId to set
     */
    public void setPriceId(Long priceId) {
        this.priceId = priceId;
    }
    /**
     * Auto generated value setter.
     * @param isinactive the isinactive to set
     */
    public void setIsinactive(String isinactive) {
        this.isinactive = isinactive;
    }
    /**
     * Auto generated value setter.
     * @param itemPriceName the itemPriceName to set
     */
    public void setItemPriceName(String itemPriceName) {
        this.itemPriceName = itemPriceName;
    }
    /**
     * Auto generated value setter.
     * @param isonline the isonline to set
     */
    public void setIsonline(String isonline) {
        this.isonline = isonline;
    }
    /**
     * Auto generated value setter.
     * @param currencyId the currencyId to set
     */
    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }
    /**
     * Auto generated value setter.
     * @param discountPercentage the discountPercentage to set
     */
    public void setDiscountPercentage(Long discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    /**
     * Auto generated value setter.
     * @param itemId the itemId to set
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }
    /**
     * Auto generated value setter.
     * @param itemPriceExtid the itemPriceExtid to set
     */
    public void setItemPriceExtid(String itemPriceExtid) {
        this.itemPriceExtid = itemPriceExtid;
    }
    /**
     * Auto generated value setter.
     * @param itemPriceId the itemPriceId to set
     */
    public void setItemPriceId(Long itemPriceId) {
        this.itemPriceId = itemPriceId;
    }
    /**
     * Auto generated value setter.
     * @param itemQuantityId the itemQuantityId to set
     */
    public void setItemQuantityId(Long itemQuantityId) {
        this.itemQuantityId = itemQuantityId;
    }
    /**
     * Auto generated value setter.
     * @param itemUnitPrice the itemUnitPrice to set
     */
    public void setItemUnitPrice(BigDecimal itemUnitPrice) {
        this.itemUnitPrice = itemUnitPrice;
    }
    /**
     * Auto generated value setter.
     * @param importStatusId the importStatusId to set
     */
    public void setImportStatusId(String importStatusId) {
        this.importStatusId = importStatusId;
    }
    /**
     * Auto generated value setter.
     * @param importError the importError to set
     */
    public void setImportError(String importError) {
        this.importError = importError;
    }
    /**
     * Auto generated value setter.
     * @param processedTimestamp the processedTimestamp to set
     */
    public void setProcessedTimestamp(Timestamp processedTimestamp) {
        this.processedTimestamp = processedTimestamp;
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
     * @return <code>Long</code>
     */
    public Long getPriceId() {
        return this.priceId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIsinactive() {
        return this.isinactive;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getItemPriceName() {
        return this.itemPriceName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIsonline() {
        return this.isonline;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCurrencyId() {
        return this.currencyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getDiscountPercentage() {
        return this.discountPercentage;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getItemId() {
        return this.itemId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getItemPriceExtid() {
        return this.itemPriceExtid;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getItemPriceId() {
        return this.itemPriceId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getItemQuantityId() {
        return this.itemQuantityId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getItemUnitPrice() {
        return this.itemUnitPrice;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getImportStatusId() {
        return this.importStatusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getImportError() {
        return this.importError;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getProcessedTimestamp() {
        return this.processedTimestamp;
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




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPriceId((Long) mapValue.get("priceId"));
        setIsinactive((String) mapValue.get("isinactive"));
        setItemPriceName((String) mapValue.get("itemPriceName"));
        setIsonline((String) mapValue.get("isonline"));
        setCurrencyId((String) mapValue.get("currencyId"));
        setDiscountPercentage((Long) mapValue.get("discountPercentage"));
        setItemId((Long) mapValue.get("itemId"));
        setItemPriceExtid((String) mapValue.get("itemPriceExtid"));
        setItemPriceId((Long) mapValue.get("itemPriceId"));
        setItemQuantityId((Long) mapValue.get("itemQuantityId"));
        setItemUnitPrice(convertToBigDecimal(mapValue.get("itemUnitPrice")));
        setImportStatusId((String) mapValue.get("importStatusId"));
        setImportError((String) mapValue.get("importError"));
        setProcessedTimestamp((Timestamp) mapValue.get("processedTimestamp"));
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
        mapValue.put("priceId", getPriceId());
        mapValue.put("isinactive", getIsinactive());
        mapValue.put("itemPriceName", getItemPriceName());
        mapValue.put("isonline", getIsonline());
        mapValue.put("currencyId", getCurrencyId());
        mapValue.put("discountPercentage", getDiscountPercentage());
        mapValue.put("itemId", getItemId());
        mapValue.put("itemPriceExtid", getItemPriceExtid());
        mapValue.put("itemPriceId", getItemPriceId());
        mapValue.put("itemQuantityId", getItemQuantityId());
        mapValue.put("itemUnitPrice", getItemUnitPrice());
        mapValue.put("importStatusId", getImportStatusId());
        mapValue.put("importError", getImportError());
        mapValue.put("processedTimestamp", getProcessedTimestamp());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
