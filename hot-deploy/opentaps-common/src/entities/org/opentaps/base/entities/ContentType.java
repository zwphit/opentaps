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
 * Auto generated base entity ContentType.
 */
@javax.persistence.Entity
@Table(name="CONTENT_TYPE")
public class ContentType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("contentTypeId", "CONTENT_TYPE_ID");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("hasTable", "HAS_TABLE");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ContentType", fields);
}
  public static enum Fields implements EntityFieldInterface<ContentType> {
    contentTypeId("contentTypeId"),
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

   @org.hibernate.annotations.GenericGenerator(name="ContentType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="ContentType_GEN")
   @Id
   @Column(name="CONTENT_TYPE_ID")
   protected String contentTypeId;
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
   
   protected ContentType parentContentType = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="CONTENT_TYPE_ID")
   
   protected List<Content> contents = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_TYPE_ID")
   
   protected List<ContentType> childContentTypes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="contentType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="CONTENT_TYPE_ID")
   
   protected List<ContentTypeAttr> contentTypeAttrs = null;

  /**
   * Default constructor.
   */
  public ContentType() {
      super();
      this.baseEntityName = "ContentType";
      this.isView = false;
      this.resourceName = "ContentEntityLabels";
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("contentTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("contentTypeId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("hasTable");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ContentType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param contentTypeId the contentTypeId to set
     */
    public void setContentTypeId(String contentTypeId) {
        this.contentTypeId = contentTypeId;
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
    public String getContentTypeId() {
        return this.contentTypeId;
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
     * Auto generated method that gets the related <code>ContentType</code> by the relation named <code>ParentContentType</code>.
     * @return the <code>ContentType</code>
     * @throws RepositoryException if an error occurs
     */
    public ContentType getParentContentType() throws RepositoryException {
        if (this.parentContentType == null) {
            this.parentContentType = getRelatedOne(ContentType.class, "ParentContentType");
        }
        return this.parentContentType;
    }
    /**
     * Auto generated method that gets the related <code>Content</code> by the relation named <code>Content</code>.
     * @return the list of <code>Content</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends Content> getContents() throws RepositoryException {
        if (this.contents == null) {
            this.contents = getRelated(Content.class, "Content");
        }
        return this.contents;
    }
    /**
     * Auto generated method that gets the related <code>ContentType</code> by the relation named <code>ChildContentType</code>.
     * @return the list of <code>ContentType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ContentType> getChildContentTypes() throws RepositoryException {
        if (this.childContentTypes == null) {
            this.childContentTypes = getRelated(ContentType.class, "ChildContentType");
        }
        return this.childContentTypes;
    }
    /**
     * Auto generated method that gets the related <code>ContentTypeAttr</code> by the relation named <code>ContentTypeAttr</code>.
     * @return the list of <code>ContentTypeAttr</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ContentTypeAttr> getContentTypeAttrs() throws RepositoryException {
        if (this.contentTypeAttrs == null) {
            this.contentTypeAttrs = getRelated(ContentTypeAttr.class, "ContentTypeAttr");
        }
        return this.contentTypeAttrs;
    }

    /**
     * Auto generated value setter.
     * @param parentContentType the parentContentType to set
    */
    public void setParentContentType(ContentType parentContentType) {
        this.parentContentType = parentContentType;
    }
    /**
     * Auto generated value setter.
     * @param contents the contents to set
    */
    public void setContents(List<Content> contents) {
        this.contents = contents;
    }
    /**
     * Auto generated value setter.
     * @param childContentTypes the childContentTypes to set
    */
    public void setChildContentTypes(List<ContentType> childContentTypes) {
        this.childContentTypes = childContentTypes;
    }
    /**
     * Auto generated value setter.
     * @param contentTypeAttrs the contentTypeAttrs to set
    */
    public void setContentTypeAttrs(List<ContentTypeAttr> contentTypeAttrs) {
        this.contentTypeAttrs = contentTypeAttrs;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addContentTypeAttr(ContentTypeAttr contentTypeAttr) {
        if (this.contentTypeAttrs == null) {
            this.contentTypeAttrs = new ArrayList<ContentTypeAttr>();
        }
        this.contentTypeAttrs.add(contentTypeAttr);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeContentTypeAttr(ContentTypeAttr contentTypeAttr) {
        if (this.contentTypeAttrs == null) {
            return;
        }
        this.contentTypeAttrs.remove(contentTypeAttr);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearContentTypeAttr() {
        if (this.contentTypeAttrs == null) {
            return;
        }
        this.contentTypeAttrs.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setContentTypeId((String) mapValue.get("contentTypeId"));
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
        mapValue.put("contentTypeId", getContentTypeId());
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
