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
 * Auto generated base entity PartyContentDetail.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectPartyContentDetails", query="SELECT PCT.PARTY_ID AS \"partyId\",PCT.CONTENT_ID AS \"contentId\",PCT.PARTY_CONTENT_TYPE_ID AS \"partyContentTypeId\",PCT.FROM_DATE AS \"fromDate\",PCT.THRU_DATE AS \"thruDate\",PCT.CONTENT_PURPOSE_ENUM_ID AS \"contentPurposeEnumId\",CNT.CONTENT_TYPE_ID AS \"contentTypeId\",CNT.OWNER_CONTENT_ID AS \"ownerContentId\",CNT.DECORATOR_CONTENT_ID AS \"decoratorContentId\",CNT.INSTANCE_OF_CONTENT_ID AS \"instanceOfContentId\",CNT.DATA_RESOURCE_ID AS \"dataResourceId\",CNT.TEMPLATE_DATA_RESOURCE_ID AS \"templateDataResourceId\",CNT.DATA_SOURCE_ID AS \"dataSourceId\",CNT.STATUS_ID AS \"statusId\",CNT.PRIVILEGE_ENUM_ID AS \"privilegeEnumId\",CNT.SERVICE_NAME AS \"serviceName\",CNT.CONTENT_NAME AS \"contentName\",CNT.DESCRIPTION AS \"description\",CNT.LOCALE_STRING AS \"localeString\",CNT.MIME_TYPE_ID AS \"mimeTypeId\",CNT.CHARACTER_SET_ID AS \"characterSetId\",CNT.CHILD_LEAF_COUNT AS \"childLeafCount\",CNT.CHILD_BRANCH_COUNT AS \"childBranchCount\",CNT.CREATED_DATE AS \"createdDate\",CNT.CREATED_BY_USER_LOGIN AS \"createdByUserLogin\",CNT.LAST_MODIFIED_DATE AS \"lastModifiedDate\",CNT.LAST_MODIFIED_BY_USER_LOGIN AS \"lastModifiedByUserLogin\",CNT.CLASSIFICATION_ENUM_ID AS \"classificationEnumId\" FROM PARTY_CONTENT PCT INNER JOIN CONTENT CNT ON PCT.CONTENT_ID = CNT.CONTENT_ID", resultSetMapping="PartyContentDetailMapping")
@SqlResultSetMapping(name="PartyContentDetailMapping", entities={
@EntityResult(entityClass=PartyContentDetail.class, fields = {
@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="contentId", column="contentId")
,@FieldResult(name="partyContentTypeId", column="partyContentTypeId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="contentPurposeEnumId", column="contentPurposeEnumId")
,@FieldResult(name="contentTypeId", column="contentTypeId")
,@FieldResult(name="ownerContentId", column="ownerContentId")
,@FieldResult(name="decoratorContentId", column="decoratorContentId")
,@FieldResult(name="instanceOfContentId", column="instanceOfContentId")
,@FieldResult(name="dataResourceId", column="dataResourceId")
,@FieldResult(name="templateDataResourceId", column="templateDataResourceId")
,@FieldResult(name="dataSourceId", column="dataSourceId")
,@FieldResult(name="statusId", column="statusId")
,@FieldResult(name="privilegeEnumId", column="privilegeEnumId")
,@FieldResult(name="serviceName", column="serviceName")
,@FieldResult(name="contentName", column="contentName")
,@FieldResult(name="description", column="description")
,@FieldResult(name="localeString", column="localeString")
,@FieldResult(name="mimeTypeId", column="mimeTypeId")
,@FieldResult(name="characterSetId", column="characterSetId")
,@FieldResult(name="childLeafCount", column="childLeafCount")
,@FieldResult(name="childBranchCount", column="childBranchCount")
,@FieldResult(name="createdDate", column="createdDate")
,@FieldResult(name="createdByUserLogin", column="createdByUserLogin")
,@FieldResult(name="lastModifiedDate", column="lastModifiedDate")
,@FieldResult(name="lastModifiedByUserLogin", column="lastModifiedByUserLogin")
,@FieldResult(name="classificationEnumId", column="classificationEnumId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class PartyContentDetail extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("partyId", "PCT.PARTY_ID");
        fields.put("contentId", "PCT.CONTENT_ID");
        fields.put("partyContentTypeId", "PCT.PARTY_CONTENT_TYPE_ID");
        fields.put("fromDate", "PCT.FROM_DATE");
        fields.put("thruDate", "PCT.THRU_DATE");
        fields.put("contentPurposeEnumId", "PCT.CONTENT_PURPOSE_ENUM_ID");
        fields.put("contentTypeId", "CNT.CONTENT_TYPE_ID");
        fields.put("ownerContentId", "CNT.OWNER_CONTENT_ID");
        fields.put("decoratorContentId", "CNT.DECORATOR_CONTENT_ID");
        fields.put("instanceOfContentId", "CNT.INSTANCE_OF_CONTENT_ID");
        fields.put("dataResourceId", "CNT.DATA_RESOURCE_ID");
        fields.put("templateDataResourceId", "CNT.TEMPLATE_DATA_RESOURCE_ID");
        fields.put("dataSourceId", "CNT.DATA_SOURCE_ID");
        fields.put("statusId", "CNT.STATUS_ID");
        fields.put("privilegeEnumId", "CNT.PRIVILEGE_ENUM_ID");
        fields.put("serviceName", "CNT.SERVICE_NAME");
        fields.put("contentName", "CNT.CONTENT_NAME");
        fields.put("description", "CNT.DESCRIPTION");
        fields.put("localeString", "CNT.LOCALE_STRING");
        fields.put("mimeTypeId", "CNT.MIME_TYPE_ID");
        fields.put("characterSetId", "CNT.CHARACTER_SET_ID");
        fields.put("childLeafCount", "CNT.CHILD_LEAF_COUNT");
        fields.put("childBranchCount", "CNT.CHILD_BRANCH_COUNT");
        fields.put("createdDate", "CNT.CREATED_DATE");
        fields.put("createdByUserLogin", "CNT.CREATED_BY_USER_LOGIN");
        fields.put("lastModifiedDate", "CNT.LAST_MODIFIED_DATE");
        fields.put("lastModifiedByUserLogin", "CNT.LAST_MODIFIED_BY_USER_LOGIN");
        fields.put("classificationEnumId", "CNT.CLASSIFICATION_ENUM_ID");
fieldMapColumns.put("PartyContentDetail", fields);
}
  public static enum Fields implements EntityFieldInterface<PartyContentDetail> {
    partyId("partyId"),
    contentId("contentId"),
    partyContentTypeId("partyContentTypeId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    contentPurposeEnumId("contentPurposeEnumId"),
    contentTypeId("contentTypeId"),
    ownerContentId("ownerContentId"),
    decoratorContentId("decoratorContentId"),
    instanceOfContentId("instanceOfContentId"),
    dataResourceId("dataResourceId"),
    templateDataResourceId("templateDataResourceId"),
    dataSourceId("dataSourceId"),
    statusId("statusId"),
    privilegeEnumId("privilegeEnumId"),
    serviceName("serviceName"),
    contentName("contentName"),
    description("description"),
    localeString("localeString"),
    mimeTypeId("mimeTypeId"),
    characterSetId("characterSetId"),
    childLeafCount("childLeafCount"),
    childBranchCount("childBranchCount"),
    createdDate("createdDate"),
    createdByUserLogin("createdByUserLogin"),
    lastModifiedDate("lastModifiedDate"),
    lastModifiedByUserLogin("lastModifiedByUserLogin"),
    classificationEnumId("classificationEnumId");
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
   private String partyId;
    
   private String contentId;
    
   private String partyContentTypeId;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    
   private String contentPurposeEnumId;
    
   private String contentTypeId;
    
   private String ownerContentId;
    
   private String decoratorContentId;
    
   private String instanceOfContentId;
    
   private String dataResourceId;
    
   private String templateDataResourceId;
    
   private String dataSourceId;
    
   private String statusId;
    
   private String privilegeEnumId;
    
   private String serviceName;
    
   private String contentName;
    
   private String description;
    
   private String localeString;
    
   private String mimeTypeId;
    
   private String characterSetId;
    
   private Long childLeafCount;
    
   private Long childBranchCount;
    
   private Timestamp createdDate;
    
   private String createdByUserLogin;
    
   private Timestamp lastModifiedDate;
    
   private String lastModifiedByUserLogin;
    
   private String classificationEnumId;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="DATA_RESOURCE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected DataResource dataResource = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CONTENT_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected ContentType contentType = null;

  /**
   * Default constructor.
   */
  public PartyContentDetail() {
      super();
      this.baseEntityName = "PartyContentDetail";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("partyId");this.primaryKeyNames.add("contentId");this.primaryKeyNames.add("partyContentTypeId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("partyId");this.allFieldsNames.add("contentId");this.allFieldsNames.add("partyContentTypeId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("contentPurposeEnumId");this.allFieldsNames.add("contentTypeId");this.allFieldsNames.add("ownerContentId");this.allFieldsNames.add("decoratorContentId");this.allFieldsNames.add("instanceOfContentId");this.allFieldsNames.add("dataResourceId");this.allFieldsNames.add("templateDataResourceId");this.allFieldsNames.add("dataSourceId");this.allFieldsNames.add("statusId");this.allFieldsNames.add("privilegeEnumId");this.allFieldsNames.add("serviceName");this.allFieldsNames.add("contentName");this.allFieldsNames.add("description");this.allFieldsNames.add("localeString");this.allFieldsNames.add("mimeTypeId");this.allFieldsNames.add("characterSetId");this.allFieldsNames.add("childLeafCount");this.allFieldsNames.add("childBranchCount");this.allFieldsNames.add("createdDate");this.allFieldsNames.add("createdByUserLogin");this.allFieldsNames.add("lastModifiedDate");this.allFieldsNames.add("lastModifiedByUserLogin");this.allFieldsNames.add("classificationEnumId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PartyContentDetail(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param partyId the partyId to set
     */
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
    /**
     * Auto generated value setter.
     * @param contentId the contentId to set
     */
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }
    /**
     * Auto generated value setter.
     * @param partyContentTypeId the partyContentTypeId to set
     */
    public void setPartyContentTypeId(String partyContentTypeId) {
        this.partyContentTypeId = partyContentTypeId;
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
     * @param contentPurposeEnumId the contentPurposeEnumId to set
     */
    public void setContentPurposeEnumId(String contentPurposeEnumId) {
        this.contentPurposeEnumId = contentPurposeEnumId;
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
     * @param ownerContentId the ownerContentId to set
     */
    public void setOwnerContentId(String ownerContentId) {
        this.ownerContentId = ownerContentId;
    }
    /**
     * Auto generated value setter.
     * @param decoratorContentId the decoratorContentId to set
     */
    public void setDecoratorContentId(String decoratorContentId) {
        this.decoratorContentId = decoratorContentId;
    }
    /**
     * Auto generated value setter.
     * @param instanceOfContentId the instanceOfContentId to set
     */
    public void setInstanceOfContentId(String instanceOfContentId) {
        this.instanceOfContentId = instanceOfContentId;
    }
    /**
     * Auto generated value setter.
     * @param dataResourceId the dataResourceId to set
     */
    public void setDataResourceId(String dataResourceId) {
        this.dataResourceId = dataResourceId;
    }
    /**
     * Auto generated value setter.
     * @param templateDataResourceId the templateDataResourceId to set
     */
    public void setTemplateDataResourceId(String templateDataResourceId) {
        this.templateDataResourceId = templateDataResourceId;
    }
    /**
     * Auto generated value setter.
     * @param dataSourceId the dataSourceId to set
     */
    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }
    /**
     * Auto generated value setter.
     * @param statusId the statusId to set
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
    /**
     * Auto generated value setter.
     * @param privilegeEnumId the privilegeEnumId to set
     */
    public void setPrivilegeEnumId(String privilegeEnumId) {
        this.privilegeEnumId = privilegeEnumId;
    }
    /**
     * Auto generated value setter.
     * @param serviceName the serviceName to set
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    /**
     * Auto generated value setter.
     * @param contentName the contentName to set
     */
    public void setContentName(String contentName) {
        this.contentName = contentName;
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
     * @param localeString the localeString to set
     */
    public void setLocaleString(String localeString) {
        this.localeString = localeString;
    }
    /**
     * Auto generated value setter.
     * @param mimeTypeId the mimeTypeId to set
     */
    public void setMimeTypeId(String mimeTypeId) {
        this.mimeTypeId = mimeTypeId;
    }
    /**
     * Auto generated value setter.
     * @param characterSetId the characterSetId to set
     */
    public void setCharacterSetId(String characterSetId) {
        this.characterSetId = characterSetId;
    }
    /**
     * Auto generated value setter.
     * @param childLeafCount the childLeafCount to set
     */
    public void setChildLeafCount(Long childLeafCount) {
        this.childLeafCount = childLeafCount;
    }
    /**
     * Auto generated value setter.
     * @param childBranchCount the childBranchCount to set
     */
    public void setChildBranchCount(Long childBranchCount) {
        this.childBranchCount = childBranchCount;
    }
    /**
     * Auto generated value setter.
     * @param createdDate the createdDate to set
     */
    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }
    /**
     * Auto generated value setter.
     * @param createdByUserLogin the createdByUserLogin to set
     */
    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }
    /**
     * Auto generated value setter.
     * @param lastModifiedDate the lastModifiedDate to set
     */
    public void setLastModifiedDate(Timestamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    /**
     * Auto generated value setter.
     * @param lastModifiedByUserLogin the lastModifiedByUserLogin to set
     */
    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }
    /**
     * Auto generated value setter.
     * @param classificationEnumId the classificationEnumId to set
     */
    public void setClassificationEnumId(String classificationEnumId) {
        this.classificationEnumId = classificationEnumId;
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
    public String getContentId() {
        return this.contentId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyContentTypeId() {
        return this.partyContentTypeId;
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
     * @return <code>String</code>
     */
    public String getContentPurposeEnumId() {
        return this.contentPurposeEnumId;
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
    public String getOwnerContentId() {
        return this.ownerContentId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDecoratorContentId() {
        return this.decoratorContentId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInstanceOfContentId() {
        return this.instanceOfContentId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDataResourceId() {
        return this.dataResourceId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTemplateDataResourceId() {
        return this.templateDataResourceId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStatusId() {
        return this.statusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrivilegeEnumId() {
        return this.privilegeEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getServiceName() {
        return this.serviceName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContentName() {
        return this.contentName;
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
     * @return <code>String</code>
     */
    public String getLocaleString() {
        return this.localeString;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getMimeTypeId() {
        return this.mimeTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCharacterSetId() {
        return this.characterSetId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getChildLeafCount() {
        return this.childLeafCount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getChildBranchCount() {
        return this.childBranchCount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedDate() {
        return this.createdDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCreatedByUserLogin() {
        return this.createdByUserLogin;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLastModifiedByUserLogin() {
        return this.lastModifiedByUserLogin;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getClassificationEnumId() {
        return this.classificationEnumId;
    }

    /**
     * Auto generated method that gets the related <code>DataResource</code> by the relation named <code>DataResource</code>.
     * @return the <code>DataResource</code>
     * @throws RepositoryException if an error occurs
     */
    public DataResource getDataResource() throws RepositoryException {
        if (this.dataResource == null) {
            this.dataResource = getRelatedOne(DataResource.class, "DataResource");
        }
        return this.dataResource;
    }
    /**
     * Auto generated method that gets the related <code>ContentType</code> by the relation named <code>ContentType</code>.
     * @return the <code>ContentType</code>
     * @throws RepositoryException if an error occurs
     */
    public ContentType getContentType() throws RepositoryException {
        if (this.contentType == null) {
            this.contentType = getRelatedOne(ContentType.class, "ContentType");
        }
        return this.contentType;
    }

    /**
     * Auto generated value setter.
     * @param dataResource the dataResource to set
    */
    public void setDataResource(DataResource dataResource) {
        this.dataResource = dataResource;
    }
    /**
     * Auto generated value setter.
     * @param contentType the contentType to set
    */
    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPartyId((String) mapValue.get("partyId"));
        setContentId((String) mapValue.get("contentId"));
        setPartyContentTypeId((String) mapValue.get("partyContentTypeId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setContentPurposeEnumId((String) mapValue.get("contentPurposeEnumId"));
        setContentTypeId((String) mapValue.get("contentTypeId"));
        setOwnerContentId((String) mapValue.get("ownerContentId"));
        setDecoratorContentId((String) mapValue.get("decoratorContentId"));
        setInstanceOfContentId((String) mapValue.get("instanceOfContentId"));
        setDataResourceId((String) mapValue.get("dataResourceId"));
        setTemplateDataResourceId((String) mapValue.get("templateDataResourceId"));
        setDataSourceId((String) mapValue.get("dataSourceId"));
        setStatusId((String) mapValue.get("statusId"));
        setPrivilegeEnumId((String) mapValue.get("privilegeEnumId"));
        setServiceName((String) mapValue.get("serviceName"));
        setContentName((String) mapValue.get("contentName"));
        setDescription((String) mapValue.get("description"));
        setLocaleString((String) mapValue.get("localeString"));
        setMimeTypeId((String) mapValue.get("mimeTypeId"));
        setCharacterSetId((String) mapValue.get("characterSetId"));
        setChildLeafCount((Long) mapValue.get("childLeafCount"));
        setChildBranchCount((Long) mapValue.get("childBranchCount"));
        setCreatedDate((Timestamp) mapValue.get("createdDate"));
        setCreatedByUserLogin((String) mapValue.get("createdByUserLogin"));
        setLastModifiedDate((Timestamp) mapValue.get("lastModifiedDate"));
        setLastModifiedByUserLogin((String) mapValue.get("lastModifiedByUserLogin"));
        setClassificationEnumId((String) mapValue.get("classificationEnumId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("partyId", getPartyId());
        mapValue.put("contentId", getContentId());
        mapValue.put("partyContentTypeId", getPartyContentTypeId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("contentPurposeEnumId", getContentPurposeEnumId());
        mapValue.put("contentTypeId", getContentTypeId());
        mapValue.put("ownerContentId", getOwnerContentId());
        mapValue.put("decoratorContentId", getDecoratorContentId());
        mapValue.put("instanceOfContentId", getInstanceOfContentId());
        mapValue.put("dataResourceId", getDataResourceId());
        mapValue.put("templateDataResourceId", getTemplateDataResourceId());
        mapValue.put("dataSourceId", getDataSourceId());
        mapValue.put("statusId", getStatusId());
        mapValue.put("privilegeEnumId", getPrivilegeEnumId());
        mapValue.put("serviceName", getServiceName());
        mapValue.put("contentName", getContentName());
        mapValue.put("description", getDescription());
        mapValue.put("localeString", getLocaleString());
        mapValue.put("mimeTypeId", getMimeTypeId());
        mapValue.put("characterSetId", getCharacterSetId());
        mapValue.put("childLeafCount", getChildLeafCount());
        mapValue.put("childBranchCount", getChildBranchCount());
        mapValue.put("createdDate", getCreatedDate());
        mapValue.put("createdByUserLogin", getCreatedByUserLogin());
        mapValue.put("lastModifiedDate", getLastModifiedDate());
        mapValue.put("lastModifiedByUserLogin", getLastModifiedByUserLogin());
        mapValue.put("classificationEnumId", getClassificationEnumId());
        return mapValue;
    }


}
