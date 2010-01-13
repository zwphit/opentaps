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
 * Auto generated base entity AmazonNodeValidAttribute.
 */
@javax.persistence.Entity
@Table(name="AMAZON_NODE_VALID_ATTRIBUTE")
public class AmazonNodeValidAttribute extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("nodeValidAttrId", "NODE_VALID_ATTR_ID");
        fields.put("nodeId", "NODE_ID");
        fields.put("itemTypeId", "ITEM_TYPE_ID");
        fields.put("nodeMappingTypeId", "NODE_MAPPING_TYPE_ID");
        fields.put("relatedToId", "RELATED_TO_ID");
        fields.put("relatedTo1Id", "RELATED_TO1_ID");
        fields.put("relatedTo2Id", "RELATED_TO2_ID");
        fields.put("relatedTo3Id", "RELATED_TO3_ID");
        fields.put("relatedTo4Id", "RELATED_TO4_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("AmazonNodeValidAttribute", fields);
}
  public static enum Fields implements EntityFieldInterface<AmazonNodeValidAttribute> {
    nodeValidAttrId("nodeValidAttrId"),
    nodeId("nodeId"),
    itemTypeId("itemTypeId"),
    nodeMappingTypeId("nodeMappingTypeId"),
    relatedToId("relatedToId"),
    relatedTo1Id("relatedTo1Id"),
    relatedTo2Id("relatedTo2Id"),
    relatedTo3Id("relatedTo3Id"),
    relatedTo4Id("relatedTo4Id"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.AmazonNodeValidAttributePkBridge.class)
     protected AmazonNodeValidAttributePk id = new AmazonNodeValidAttributePk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>AmazonNodeValidAttributePk</code>
     */
      public AmazonNodeValidAttributePk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>AmazonNodeValidAttributePk</code> value to set
    */   
      public void setId(AmazonNodeValidAttributePk id) {
         this.id = id;
      }
   @Column(name="NODE_MAPPING_TYPE_ID")
   protected String nodeMappingTypeId;
   @Column(name="RELATED_TO_ID")
   protected String relatedToId;
   @Column(name="RELATED_TO1_ID")
   protected String relatedTo1Id;
   @Column(name="RELATED_TO2_ID")
   protected String relatedTo2Id;
   @Column(name="RELATED_TO3_ID")
   protected String relatedTo3Id;
   @Column(name="RELATED_TO4_ID")
   protected String relatedTo4Id;
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
  public AmazonNodeValidAttribute() {
      super();
      this.baseEntityName = "AmazonNodeValidAttribute";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("nodeValidAttrId");this.primaryKeyNames.add("nodeId");this.primaryKeyNames.add("itemTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("nodeValidAttrId");this.allFieldsNames.add("nodeId");this.allFieldsNames.add("itemTypeId");this.allFieldsNames.add("nodeMappingTypeId");this.allFieldsNames.add("relatedToId");this.allFieldsNames.add("relatedTo1Id");this.allFieldsNames.add("relatedTo2Id");this.allFieldsNames.add("relatedTo3Id");this.allFieldsNames.add("relatedTo4Id");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public AmazonNodeValidAttribute(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param nodeValidAttrId the nodeValidAttrId to set
     */
    public void setNodeValidAttrId(String nodeValidAttrId) {
        id.setNodeValidAttrId(nodeValidAttrId);
    }
    /**
     * Auto generated value setter.
     * @param nodeId the nodeId to set
     */
    public void setNodeId(String nodeId) {
        id.setNodeId(nodeId);
    }
    /**
     * Auto generated value setter.
     * @param itemTypeId the itemTypeId to set
     */
    public void setItemTypeId(String itemTypeId) {
        id.setItemTypeId(itemTypeId);
    }
    /**
     * Auto generated value setter.
     * @param nodeMappingTypeId the nodeMappingTypeId to set
     */
    public void setNodeMappingTypeId(String nodeMappingTypeId) {
        this.nodeMappingTypeId = nodeMappingTypeId;
    }
    /**
     * Auto generated value setter.
     * @param relatedToId the relatedToId to set
     */
    public void setRelatedToId(String relatedToId) {
        this.relatedToId = relatedToId;
    }
    /**
     * Auto generated value setter.
     * @param relatedTo1Id the relatedTo1Id to set
     */
    public void setRelatedTo1Id(String relatedTo1Id) {
        this.relatedTo1Id = relatedTo1Id;
    }
    /**
     * Auto generated value setter.
     * @param relatedTo2Id the relatedTo2Id to set
     */
    public void setRelatedTo2Id(String relatedTo2Id) {
        this.relatedTo2Id = relatedTo2Id;
    }
    /**
     * Auto generated value setter.
     * @param relatedTo3Id the relatedTo3Id to set
     */
    public void setRelatedTo3Id(String relatedTo3Id) {
        this.relatedTo3Id = relatedTo3Id;
    }
    /**
     * Auto generated value setter.
     * @param relatedTo4Id the relatedTo4Id to set
     */
    public void setRelatedTo4Id(String relatedTo4Id) {
        this.relatedTo4Id = relatedTo4Id;
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
    public String getNodeValidAttrId() {
        return this.id.getNodeValidAttrId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getNodeId() {
        return this.id.getNodeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getItemTypeId() {
        return this.id.getItemTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getNodeMappingTypeId() {
        return this.nodeMappingTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRelatedToId() {
        return this.relatedToId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRelatedTo1Id() {
        return this.relatedTo1Id;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRelatedTo2Id() {
        return this.relatedTo2Id;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRelatedTo3Id() {
        return this.relatedTo3Id;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRelatedTo4Id() {
        return this.relatedTo4Id;
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
        setNodeValidAttrId((String) mapValue.get("nodeValidAttrId"));
        setNodeId((String) mapValue.get("nodeId"));
        setItemTypeId((String) mapValue.get("itemTypeId"));
        setNodeMappingTypeId((String) mapValue.get("nodeMappingTypeId"));
        setRelatedToId((String) mapValue.get("relatedToId"));
        setRelatedTo1Id((String) mapValue.get("relatedTo1Id"));
        setRelatedTo2Id((String) mapValue.get("relatedTo2Id"));
        setRelatedTo3Id((String) mapValue.get("relatedTo3Id"));
        setRelatedTo4Id((String) mapValue.get("relatedTo4Id"));
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
        mapValue.put("nodeValidAttrId", getNodeValidAttrId());
        mapValue.put("nodeId", getNodeId());
        mapValue.put("itemTypeId", getItemTypeId());
        mapValue.put("nodeMappingTypeId", getNodeMappingTypeId());
        mapValue.put("relatedToId", getRelatedToId());
        mapValue.put("relatedTo1Id", getRelatedTo1Id());
        mapValue.put("relatedTo2Id", getRelatedTo2Id());
        mapValue.put("relatedTo3Id", getRelatedTo3Id());
        mapValue.put("relatedTo4Id", getRelatedTo4Id());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
