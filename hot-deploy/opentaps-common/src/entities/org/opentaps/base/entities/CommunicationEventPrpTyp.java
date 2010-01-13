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
 * Auto generated base entity CommunicationEventPrpTyp.
 */
@javax.persistence.Entity
@Table(name="COMMUNICATION_EVENT_PRP_TYP")
public class CommunicationEventPrpTyp extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("communicationEventPrpTypId", "COMMUNICATION_EVENT_PRP_TYP_ID");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("hasTable", "HAS_TABLE");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("CommunicationEventPrpTyp", fields);
}
  public static enum Fields implements EntityFieldInterface<CommunicationEventPrpTyp> {
    communicationEventPrpTypId("communicationEventPrpTypId"),
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

   @org.hibernate.annotations.GenericGenerator(name="CommunicationEventPrpTyp_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="CommunicationEventPrpTyp_GEN")
   @Id
   @Column(name="COMMUNICATION_EVENT_PRP_TYP_ID")
   protected String communicationEventPrpTypId;
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
   
   protected CommunicationEventPrpTyp parentCommunicationEventPrpTyp = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_TYPE_ID")
   
   protected List<CommunicationEventPrpTyp> childCommunicationEventPrpTyps = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="communicationEventPrpTyp", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="COMMUNICATION_EVENT_PRP_TYP_ID")
   
   protected List<CommunicationEventPurpose> communicationEventPurposes = null;

  /**
   * Default constructor.
   */
  public CommunicationEventPrpTyp() {
      super();
      this.baseEntityName = "CommunicationEventPrpTyp";
      this.isView = false;
      this.resourceName = "PartyEntityLabels";
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("communicationEventPrpTypId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("communicationEventPrpTypId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("hasTable");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public CommunicationEventPrpTyp(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param communicationEventPrpTypId the communicationEventPrpTypId to set
     */
    public void setCommunicationEventPrpTypId(String communicationEventPrpTypId) {
        this.communicationEventPrpTypId = communicationEventPrpTypId;
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
    public String getCommunicationEventPrpTypId() {
        return this.communicationEventPrpTypId;
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
     * Auto generated method that gets the related <code>CommunicationEventPrpTyp</code> by the relation named <code>ParentCommunicationEventPrpTyp</code>.
     * @return the <code>CommunicationEventPrpTyp</code>
     * @throws RepositoryException if an error occurs
     */
    public CommunicationEventPrpTyp getParentCommunicationEventPrpTyp() throws RepositoryException {
        if (this.parentCommunicationEventPrpTyp == null) {
            this.parentCommunicationEventPrpTyp = getRelatedOne(CommunicationEventPrpTyp.class, "ParentCommunicationEventPrpTyp");
        }
        return this.parentCommunicationEventPrpTyp;
    }
    /**
     * Auto generated method that gets the related <code>CommunicationEventPrpTyp</code> by the relation named <code>ChildCommunicationEventPrpTyp</code>.
     * @return the list of <code>CommunicationEventPrpTyp</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends CommunicationEventPrpTyp> getChildCommunicationEventPrpTyps() throws RepositoryException {
        if (this.childCommunicationEventPrpTyps == null) {
            this.childCommunicationEventPrpTyps = getRelated(CommunicationEventPrpTyp.class, "ChildCommunicationEventPrpTyp");
        }
        return this.childCommunicationEventPrpTyps;
    }
    /**
     * Auto generated method that gets the related <code>CommunicationEventPurpose</code> by the relation named <code>CommunicationEventPurpose</code>.
     * @return the list of <code>CommunicationEventPurpose</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends CommunicationEventPurpose> getCommunicationEventPurposes() throws RepositoryException {
        if (this.communicationEventPurposes == null) {
            this.communicationEventPurposes = getRelated(CommunicationEventPurpose.class, "CommunicationEventPurpose");
        }
        return this.communicationEventPurposes;
    }

    /**
     * Auto generated value setter.
     * @param parentCommunicationEventPrpTyp the parentCommunicationEventPrpTyp to set
    */
    public void setParentCommunicationEventPrpTyp(CommunicationEventPrpTyp parentCommunicationEventPrpTyp) {
        this.parentCommunicationEventPrpTyp = parentCommunicationEventPrpTyp;
    }
    /**
     * Auto generated value setter.
     * @param childCommunicationEventPrpTyps the childCommunicationEventPrpTyps to set
    */
    public void setChildCommunicationEventPrpTyps(List<CommunicationEventPrpTyp> childCommunicationEventPrpTyps) {
        this.childCommunicationEventPrpTyps = childCommunicationEventPrpTyps;
    }
    /**
     * Auto generated value setter.
     * @param communicationEventPurposes the communicationEventPurposes to set
    */
    public void setCommunicationEventPurposes(List<CommunicationEventPurpose> communicationEventPurposes) {
        this.communicationEventPurposes = communicationEventPurposes;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addCommunicationEventPurpose(CommunicationEventPurpose communicationEventPurpose) {
        if (this.communicationEventPurposes == null) {
            this.communicationEventPurposes = new ArrayList<CommunicationEventPurpose>();
        }
        this.communicationEventPurposes.add(communicationEventPurpose);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeCommunicationEventPurpose(CommunicationEventPurpose communicationEventPurpose) {
        if (this.communicationEventPurposes == null) {
            return;
        }
        this.communicationEventPurposes.remove(communicationEventPurpose);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearCommunicationEventPurpose() {
        if (this.communicationEventPurposes == null) {
            return;
        }
        this.communicationEventPurposes.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setCommunicationEventPrpTypId((String) mapValue.get("communicationEventPrpTypId"));
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
        mapValue.put("communicationEventPrpTypId", getCommunicationEventPrpTypId());
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
