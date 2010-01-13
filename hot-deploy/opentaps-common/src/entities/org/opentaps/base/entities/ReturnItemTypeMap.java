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
 * Auto generated base entity ReturnItemTypeMap.
 */
@javax.persistence.Entity
@Table(name="RETURN_ITEM_TYPE_MAP")
public class ReturnItemTypeMap extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("returnItemMapKey", "RETURN_ITEM_MAP_KEY");
        fields.put("returnHeaderTypeId", "RETURN_HEADER_TYPE_ID");
        fields.put("returnItemTypeId", "RETURN_ITEM_TYPE_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ReturnItemTypeMap", fields);
}
  public static enum Fields implements EntityFieldInterface<ReturnItemTypeMap> {
    returnItemMapKey("returnItemMapKey"),
    returnHeaderTypeId("returnHeaderTypeId"),
    returnItemTypeId("returnItemTypeId"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.ReturnItemTypeMapPkBridge.class)
     protected ReturnItemTypeMapPk id = new ReturnItemTypeMapPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>ReturnItemTypeMapPk</code>
     */
      public ReturnItemTypeMapPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>ReturnItemTypeMapPk</code> value to set
    */   
      public void setId(ReturnItemTypeMapPk id) {
         this.id = id;
      }
   @Column(name="RETURN_ITEM_TYPE_ID")
   protected String returnItemTypeId;
   @Column(name="LAST_UPDATED_STAMP")
   protected Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   protected Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   protected Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   protected Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="RETURN_ITEM_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected ReturnItemType returnItemType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="RETURN_HEADER_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected ReturnHeaderType returnHeaderType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="RETURN_ITEM_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected ReturnAdjustmentType returnAdjustmentType = null;

  /**
   * Default constructor.
   */
  public ReturnItemTypeMap() {
      super();
      this.baseEntityName = "ReturnItemTypeMap";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("returnItemMapKey");this.primaryKeyNames.add("returnHeaderTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("returnItemMapKey");this.allFieldsNames.add("returnHeaderTypeId");this.allFieldsNames.add("returnItemTypeId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ReturnItemTypeMap(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param returnItemMapKey the returnItemMapKey to set
     */
    public void setReturnItemMapKey(String returnItemMapKey) {
        id.setReturnItemMapKey(returnItemMapKey);
    }
    /**
     * Auto generated value setter.
     * @param returnHeaderTypeId the returnHeaderTypeId to set
     */
    public void setReturnHeaderTypeId(String returnHeaderTypeId) {
        id.setReturnHeaderTypeId(returnHeaderTypeId);
    }
    /**
     * Auto generated value setter.
     * @param returnItemTypeId the returnItemTypeId to set
     */
    public void setReturnItemTypeId(String returnItemTypeId) {
        this.returnItemTypeId = returnItemTypeId;
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
    public String getReturnItemMapKey() {
        return this.id.getReturnItemMapKey();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReturnHeaderTypeId() {
        return this.id.getReturnHeaderTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReturnItemTypeId() {
        return this.returnItemTypeId;
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
     * Auto generated method that gets the related <code>ReturnItemType</code> by the relation named <code>ReturnItemType</code>.
     * @return the <code>ReturnItemType</code>
     * @throws RepositoryException if an error occurs
     */
    public ReturnItemType getReturnItemType() throws RepositoryException {
        if (this.returnItemType == null) {
            this.returnItemType = getRelatedOne(ReturnItemType.class, "ReturnItemType");
        }
        return this.returnItemType;
    }
    /**
     * Auto generated method that gets the related <code>ReturnHeaderType</code> by the relation named <code>ReturnHeaderType</code>.
     * @return the <code>ReturnHeaderType</code>
     * @throws RepositoryException if an error occurs
     */
    public ReturnHeaderType getReturnHeaderType() throws RepositoryException {
        if (this.returnHeaderType == null) {
            this.returnHeaderType = getRelatedOne(ReturnHeaderType.class, "ReturnHeaderType");
        }
        return this.returnHeaderType;
    }
    /**
     * Auto generated method that gets the related <code>ReturnAdjustmentType</code> by the relation named <code>ReturnAdjustmentType</code>.
     * @return the <code>ReturnAdjustmentType</code>
     * @throws RepositoryException if an error occurs
     */
    public ReturnAdjustmentType getReturnAdjustmentType() throws RepositoryException {
        if (this.returnAdjustmentType == null) {
            this.returnAdjustmentType = getRelatedOne(ReturnAdjustmentType.class, "ReturnAdjustmentType");
        }
        return this.returnAdjustmentType;
    }

    /**
     * Auto generated value setter.
     * @param returnItemType the returnItemType to set
    */
    public void setReturnItemType(ReturnItemType returnItemType) {
        this.returnItemType = returnItemType;
    }
    /**
     * Auto generated value setter.
     * @param returnHeaderType the returnHeaderType to set
    */
    public void setReturnHeaderType(ReturnHeaderType returnHeaderType) {
        this.returnHeaderType = returnHeaderType;
    }
    /**
     * Auto generated value setter.
     * @param returnAdjustmentType the returnAdjustmentType to set
    */
    public void setReturnAdjustmentType(ReturnAdjustmentType returnAdjustmentType) {
        this.returnAdjustmentType = returnAdjustmentType;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setReturnItemMapKey((String) mapValue.get("returnItemMapKey"));
        setReturnHeaderTypeId((String) mapValue.get("returnHeaderTypeId"));
        setReturnItemTypeId((String) mapValue.get("returnItemTypeId"));
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
        mapValue.put("returnItemMapKey", getReturnItemMapKey());
        mapValue.put("returnHeaderTypeId", getReturnHeaderTypeId());
        mapValue.put("returnItemTypeId", getReturnItemTypeId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
