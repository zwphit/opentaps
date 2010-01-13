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
 * Auto generated base entity AgreementToItemMap.
 */
@javax.persistence.Entity
@Table(name="AGREEMENT_TO_ITEM_MAP")
public class AgreementToItemMap extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("agreementTypeId", "AGREEMENT_TYPE_ID");
        fields.put("agreementItemTypeId", "AGREEMENT_ITEM_TYPE_ID");
        fields.put("autoCreate", "AUTO_CREATE");
        fields.put("sequenceNum", "SEQUENCE_NUM");
        fields.put("maxAllowed", "MAX_ALLOWED");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("AgreementToItemMap", fields);
}
  public static enum Fields implements EntityFieldInterface<AgreementToItemMap> {
    agreementTypeId("agreementTypeId"),
    agreementItemTypeId("agreementItemTypeId"),
    autoCreate("autoCreate"),
    sequenceNum("sequenceNum"),
    maxAllowed("maxAllowed"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.AgreementToItemMapPkBridge.class)
     protected AgreementToItemMapPk id = new AgreementToItemMapPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>AgreementToItemMapPk</code>
     */
      public AgreementToItemMapPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>AgreementToItemMapPk</code> value to set
    */   
      public void setId(AgreementToItemMapPk id) {
         this.id = id;
      }
   @Column(name="AUTO_CREATE")
   protected String autoCreate;
   @Column(name="SEQUENCE_NUM")
   protected Long sequenceNum;
   @Column(name="MAX_ALLOWED")
   protected Long maxAllowed;
   @Column(name="LAST_UPDATED_STAMP")
   protected Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   protected Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   protected Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   protected Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="AGREEMENT_ITEM_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected AgreementItemType agreementItemType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="AGREEMENT_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected AgreementType agreementType = null;

  /**
   * Default constructor.
   */
  public AgreementToItemMap() {
      super();
      this.baseEntityName = "AgreementToItemMap";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("agreementTypeId");this.primaryKeyNames.add("agreementItemTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("agreementTypeId");this.allFieldsNames.add("agreementItemTypeId");this.allFieldsNames.add("autoCreate");this.allFieldsNames.add("sequenceNum");this.allFieldsNames.add("maxAllowed");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public AgreementToItemMap(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param agreementTypeId the agreementTypeId to set
     */
    public void setAgreementTypeId(String agreementTypeId) {
        id.setAgreementTypeId(agreementTypeId);
    }
    /**
     * Auto generated value setter.
     * @param agreementItemTypeId the agreementItemTypeId to set
     */
    public void setAgreementItemTypeId(String agreementItemTypeId) {
        id.setAgreementItemTypeId(agreementItemTypeId);
    }
    /**
     * Auto generated value setter.
     * @param autoCreate the autoCreate to set
     */
    public void setAutoCreate(String autoCreate) {
        this.autoCreate = autoCreate;
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
     * @param maxAllowed the maxAllowed to set
     */
    public void setMaxAllowed(Long maxAllowed) {
        this.maxAllowed = maxAllowed;
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
    public String getAgreementTypeId() {
        return this.id.getAgreementTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAgreementItemTypeId() {
        return this.id.getAgreementItemTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAutoCreate() {
        return this.autoCreate;
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
     * @return <code>Long</code>
     */
    public Long getMaxAllowed() {
        return this.maxAllowed;
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
     * Auto generated method that gets the related <code>AgreementItemType</code> by the relation named <code>AgreementItemType</code>.
     * @return the <code>AgreementItemType</code>
     * @throws RepositoryException if an error occurs
     */
    public AgreementItemType getAgreementItemType() throws RepositoryException {
        if (this.agreementItemType == null) {
            this.agreementItemType = getRelatedOne(AgreementItemType.class, "AgreementItemType");
        }
        return this.agreementItemType;
    }
    /**
     * Auto generated method that gets the related <code>AgreementType</code> by the relation named <code>AgreementType</code>.
     * @return the <code>AgreementType</code>
     * @throws RepositoryException if an error occurs
     */
    public AgreementType getAgreementType() throws RepositoryException {
        if (this.agreementType == null) {
            this.agreementType = getRelatedOne(AgreementType.class, "AgreementType");
        }
        return this.agreementType;
    }

    /**
     * Auto generated value setter.
     * @param agreementItemType the agreementItemType to set
    */
    public void setAgreementItemType(AgreementItemType agreementItemType) {
        this.agreementItemType = agreementItemType;
    }
    /**
     * Auto generated value setter.
     * @param agreementType the agreementType to set
    */
    public void setAgreementType(AgreementType agreementType) {
        this.agreementType = agreementType;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setAgreementTypeId((String) mapValue.get("agreementTypeId"));
        setAgreementItemTypeId((String) mapValue.get("agreementItemTypeId"));
        setAutoCreate((String) mapValue.get("autoCreate"));
        setSequenceNum((Long) mapValue.get("sequenceNum"));
        setMaxAllowed((Long) mapValue.get("maxAllowed"));
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
        mapValue.put("agreementTypeId", getAgreementTypeId());
        mapValue.put("agreementItemTypeId", getAgreementItemTypeId());
        mapValue.put("autoCreate", getAutoCreate());
        mapValue.put("sequenceNum", getSequenceNum());
        mapValue.put("maxAllowed", getMaxAllowed());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
