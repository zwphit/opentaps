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
 * Auto generated base entity MarketingCampaignPromo.
 */
@javax.persistence.Entity
@Table(name="MARKETING_CAMPAIGN_PROMO")
public class MarketingCampaignPromo extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("marketingCampaignId", "MARKETING_CAMPAIGN_ID");
        fields.put("productPromoId", "PRODUCT_PROMO_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("MarketingCampaignPromo", fields);
}
  public static enum Fields implements EntityFieldInterface<MarketingCampaignPromo> {
    marketingCampaignId("marketingCampaignId"),
    productPromoId("productPromoId"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.MarketingCampaignPromoPkBridge.class)
     protected MarketingCampaignPromoPk id = new MarketingCampaignPromoPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>MarketingCampaignPromoPk</code>
     */
      public MarketingCampaignPromoPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>MarketingCampaignPromoPk</code> value to set
    */   
      public void setId(MarketingCampaignPromoPk id) {
         this.id = id;
      }
   @Column(name="LAST_UPDATED_STAMP")
   protected Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   protected Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   protected Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   protected Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="MARKETING_CAMPAIGN_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected MarketingCampaign marketingCampaign = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_PROMO_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected ProductPromo productPromo = null;

  /**
   * Default constructor.
   */
  public MarketingCampaignPromo() {
      super();
      this.baseEntityName = "MarketingCampaignPromo";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("marketingCampaignId");this.primaryKeyNames.add("productPromoId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("marketingCampaignId");this.allFieldsNames.add("productPromoId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public MarketingCampaignPromo(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param marketingCampaignId the marketingCampaignId to set
     */
    public void setMarketingCampaignId(String marketingCampaignId) {
        id.setMarketingCampaignId(marketingCampaignId);
    }
    /**
     * Auto generated value setter.
     * @param productPromoId the productPromoId to set
     */
    public void setProductPromoId(String productPromoId) {
        id.setProductPromoId(productPromoId);
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
    public String getMarketingCampaignId() {
        return this.id.getMarketingCampaignId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductPromoId() {
        return this.id.getProductPromoId();
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
     * Auto generated method that gets the related <code>MarketingCampaign</code> by the relation named <code>MarketingCampaign</code>.
     * @return the <code>MarketingCampaign</code>
     * @throws RepositoryException if an error occurs
     */
    public MarketingCampaign getMarketingCampaign() throws RepositoryException {
        if (this.marketingCampaign == null) {
            this.marketingCampaign = getRelatedOne(MarketingCampaign.class, "MarketingCampaign");
        }
        return this.marketingCampaign;
    }
    /**
     * Auto generated method that gets the related <code>ProductPromo</code> by the relation named <code>ProductPromo</code>.
     * @return the <code>ProductPromo</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductPromo getProductPromo() throws RepositoryException {
        if (this.productPromo == null) {
            this.productPromo = getRelatedOne(ProductPromo.class, "ProductPromo");
        }
        return this.productPromo;
    }

    /**
     * Auto generated value setter.
     * @param marketingCampaign the marketingCampaign to set
    */
    public void setMarketingCampaign(MarketingCampaign marketingCampaign) {
        this.marketingCampaign = marketingCampaign;
    }
    /**
     * Auto generated value setter.
     * @param productPromo the productPromo to set
    */
    public void setProductPromo(ProductPromo productPromo) {
        this.productPromo = productPromo;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setMarketingCampaignId((String) mapValue.get("marketingCampaignId"));
        setProductPromoId((String) mapValue.get("productPromoId"));
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
        mapValue.put("marketingCampaignId", getMarketingCampaignId());
        mapValue.put("productPromoId", getProductPromoId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
