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
 * Auto generated base entity VisualThemeResource.
 */
@javax.persistence.Entity
@Table(name="VISUAL_THEME_RESOURCE")
public class VisualThemeResource extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("visualThemeId", "VISUAL_THEME_ID");
        fields.put("resourceTypeEnumId", "RESOURCE_TYPE_ENUM_ID");
        fields.put("sequenceId", "SEQUENCE_ID");
        fields.put("resourceValue", "RESOURCE_VALUE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("VisualThemeResource", fields);
}
  public static enum Fields implements EntityFieldInterface<VisualThemeResource> {
    visualThemeId("visualThemeId"),
    resourceTypeEnumId("resourceTypeEnumId"),
    sequenceId("sequenceId"),
    resourceValue("resourceValue"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.VisualThemeResourcePkBridge.class)
     protected VisualThemeResourcePk id = new VisualThemeResourcePk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>VisualThemeResourcePk</code>
     */
      public VisualThemeResourcePk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>VisualThemeResourcePk</code> value to set
    */   
      public void setId(VisualThemeResourcePk id) {
         this.id = id;
      }
   @Column(name="RESOURCE_VALUE")
   protected String resourceValue;
   @Column(name="LAST_UPDATED_STAMP")
   protected Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   protected Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   protected Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   protected Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="VISUAL_THEME_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected VisualTheme visualTheme = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="RESOURCE_TYPE_ENUM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected Enumeration enumeration = null;

  /**
   * Default constructor.
   */
  public VisualThemeResource() {
      super();
      this.baseEntityName = "VisualThemeResource";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("visualThemeId");this.primaryKeyNames.add("resourceTypeEnumId");this.primaryKeyNames.add("sequenceId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("visualThemeId");this.allFieldsNames.add("resourceTypeEnumId");this.allFieldsNames.add("sequenceId");this.allFieldsNames.add("resourceValue");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public VisualThemeResource(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param visualThemeId the visualThemeId to set
     */
    public void setVisualThemeId(String visualThemeId) {
        id.setVisualThemeId(visualThemeId);
    }
    /**
     * Auto generated value setter.
     * @param resourceTypeEnumId the resourceTypeEnumId to set
     */
    public void setResourceTypeEnumId(String resourceTypeEnumId) {
        id.setResourceTypeEnumId(resourceTypeEnumId);
    }
    /**
     * Auto generated value setter.
     * @param sequenceId the sequenceId to set
     */
    public void setSequenceId(String sequenceId) {
        id.setSequenceId(sequenceId);
    }
    /**
     * Auto generated value setter.
     * @param resourceValue the resourceValue to set
     */
    public void setResourceValue(String resourceValue) {
        this.resourceValue = resourceValue;
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
    public String getVisualThemeId() {
        return this.id.getVisualThemeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getResourceTypeEnumId() {
        return this.id.getResourceTypeEnumId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSequenceId() {
        return this.id.getSequenceId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getResourceValue() {
        return this.resourceValue;
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
     * Auto generated method that gets the related <code>VisualTheme</code> by the relation named <code>VisualTheme</code>.
     * @return the <code>VisualTheme</code>
     * @throws RepositoryException if an error occurs
     */
    public VisualTheme getVisualTheme() throws RepositoryException {
        if (this.visualTheme == null) {
            this.visualTheme = getRelatedOne(VisualTheme.class, "VisualTheme");
        }
        return this.visualTheme;
    }
    /**
     * Auto generated method that gets the related <code>Enumeration</code> by the relation named <code>Enumeration</code>.
     * @return the <code>Enumeration</code>
     * @throws RepositoryException if an error occurs
     */
    public Enumeration getEnumeration() throws RepositoryException {
        if (this.enumeration == null) {
            this.enumeration = getRelatedOne(Enumeration.class, "Enumeration");
        }
        return this.enumeration;
    }

    /**
     * Auto generated value setter.
     * @param visualTheme the visualTheme to set
    */
    public void setVisualTheme(VisualTheme visualTheme) {
        this.visualTheme = visualTheme;
    }
    /**
     * Auto generated value setter.
     * @param enumeration the enumeration to set
    */
    public void setEnumeration(Enumeration enumeration) {
        this.enumeration = enumeration;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setVisualThemeId((String) mapValue.get("visualThemeId"));
        setResourceTypeEnumId((String) mapValue.get("resourceTypeEnumId"));
        setSequenceId((String) mapValue.get("sequenceId"));
        setResourceValue((String) mapValue.get("resourceValue"));
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
        mapValue.put("visualThemeId", getVisualThemeId());
        mapValue.put("resourceTypeEnumId", getResourceTypeEnumId());
        mapValue.put("sequenceId", getSequenceId());
        mapValue.put("resourceValue", getResourceValue());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
