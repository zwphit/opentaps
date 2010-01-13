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
 * Auto generated base entity SegmentGroupViewRelatedParties.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectSegmentGroupViewRelatedPartiess", query="SELECT SGR.SEGMENT_GROUP_ID AS \"segmentGroupId\",SGR.PARTY_ID AS \"partyId\",SGR.ROLE_TYPE_ID AS \"roleTypeId\",SGRTO.SEGMENT_GROUP_ID AS \"segmentGroupId\",SGRTO.PARTY_ID AS \"partyId\",SGRTO.ROLE_TYPE_ID AS \"roleTypeId\",PRSGR.PARTY_ID_FROM AS \"partyIdFrom\",PRSGR.PARTY_ID_TO AS \"partyIdTo\",PRSGR.ROLE_TYPE_ID_FROM AS \"roleTypeIdFrom\",PRSGR.ROLE_TYPE_ID_TO AS \"roleTypeIdTo\",PRSGR.FROM_DATE AS \"fromDate\",PRSGR.THRU_DATE AS \"thruDate\",PRSGR.STATUS_ID AS \"statusId\",PRSGR.RELATIONSHIP_NAME AS \"relationshipName\",PRSGR.SECURITY_GROUP_ID AS \"securityGroupId\",PRSGR.PRIORITY_TYPE_ID AS \"priorityTypeId\",PRSGR.PARTY_RELATIONSHIP_TYPE_ID AS \"partyRelationshipTypeId\",PRSGR.PERMISSIONS_ENUM_ID AS \"permissionsEnumId\",PRSGR.POSITION_TITLE AS \"positionTitle\",PRSGR.COMMENTS AS \"comments\",SGC.SEGMENT_GROUP_ID AS \"segmentGroupId\",SGC.PARTY_CLASSIFICATION_GROUP_ID AS \"partyClassificationGroupId\",PC.PARTY_ID AS \"partyId\",PC.PARTY_CLASSIFICATION_GROUP_ID AS \"partyClassificationGroupId\",PC.FROM_DATE AS \"fromDate\",PC.THRU_DATE AS \"thruDate\",PRPC.PARTY_ID_FROM AS \"partyIdFrom\",PRPC.PARTY_ID_TO AS \"partyIdTo\",PRPC.ROLE_TYPE_ID_FROM AS \"roleTypeIdFrom\",PRPC.ROLE_TYPE_ID_TO AS \"roleTypeIdTo\",PRPC.FROM_DATE AS \"fromDate\",PRPC.THRU_DATE AS \"thruDate\",PRPC.STATUS_ID AS \"statusId\",PRPC.RELATIONSHIP_NAME AS \"relationshipName\",PRPC.SECURITY_GROUP_ID AS \"securityGroupId\",PRPC.PRIORITY_TYPE_ID AS \"priorityTypeId\",PRPC.PARTY_RELATIONSHIP_TYPE_ID AS \"partyRelationshipTypeId\",PRPC.PERMISSIONS_ENUM_ID AS \"permissionsEnumId\",PRPC.POSITION_TITLE AS \"positionTitle\",PRPC.COMMENTS AS \"comments\" FROM SEGMENT_GROUP_ROLE SGR LEFT JOIN SEGMENT_GROUP_ROLE SGRTO ON SGR.SEGMENT_GROUP_ID = SGRTO.SEGMENT_GROUP_ID LEFT JOIN PARTY_RELATIONSHIP PRSGR ON SGRTO.PARTY_ID = PRSGR.PARTY_ID_FROM LEFT JOIN SEGMENT_GROUP_CLASSIFICATION SGC ON SGR.SEGMENT_GROUP_ID = SGC.SEGMENT_GROUP_ID INNER JOIN PARTY_CLASSIFICATION PC ON SGC.PARTY_CLASSIFICATION_GROUP_ID = PC.PARTY_CLASSIFICATION_GROUP_ID LEFT JOIN PARTY_RELATIONSHIP PRPC ON PC.PARTY_ID = PRPC.PARTY_ID_FROM", resultSetMapping="SegmentGroupViewRelatedPartiesMapping")
@SqlResultSetMapping(name="SegmentGroupViewRelatedPartiesMapping", entities={
@EntityResult(entityClass=SegmentGroupViewRelatedParties.class, fields = {
@FieldResult(name="sgrSegmentGroupId", column="sgrSegmentGroupId")
,@FieldResult(name="sgrPartyId", column="sgrPartyId")
,@FieldResult(name="sgrRoleTypeId", column="sgrRoleTypeId")
,@FieldResult(name="sgrToSegmentGroupId", column="sgrToSegmentGroupId")
,@FieldResult(name="sgrToPartyId", column="sgrToPartyId")
,@FieldResult(name="sgrToRoleTypeId", column="sgrToRoleTypeId")
,@FieldResult(name="prSgrPartyIdFrom", column="prSgrPartyIdFrom")
,@FieldResult(name="prSgrPartyIdTo", column="prSgrPartyIdTo")
,@FieldResult(name="prSgrRoleTypeIdFrom", column="prSgrRoleTypeIdFrom")
,@FieldResult(name="prSgrRoleTypeIdTo", column="prSgrRoleTypeIdTo")
,@FieldResult(name="prSgrFromDate", column="prSgrFromDate")
,@FieldResult(name="prSgrThruDate", column="prSgrThruDate")
,@FieldResult(name="prSgrStatusId", column="prSgrStatusId")
,@FieldResult(name="prSgrRelationshipName", column="prSgrRelationshipName")
,@FieldResult(name="prSgrSecurityGroupId", column="prSgrSecurityGroupId")
,@FieldResult(name="prSgrPriorityTypeId", column="prSgrPriorityTypeId")
,@FieldResult(name="prSgrPartyRelationshipTypeId", column="prSgrPartyRelationshipTypeId")
,@FieldResult(name="prSgrPermissionsEnumId", column="prSgrPermissionsEnumId")
,@FieldResult(name="prSgrPositionTitle", column="prSgrPositionTitle")
,@FieldResult(name="prSgrComments", column="prSgrComments")
,@FieldResult(name="sgcSegmentGroupId", column="sgcSegmentGroupId")
,@FieldResult(name="sgcPartyClassificationGroupId", column="sgcPartyClassificationGroupId")
,@FieldResult(name="pcPartyId", column="pcPartyId")
,@FieldResult(name="pcPartyClassificationGroupId", column="pcPartyClassificationGroupId")
,@FieldResult(name="pcFromDate", column="pcFromDate")
,@FieldResult(name="pcThruDate", column="pcThruDate")
,@FieldResult(name="prPcPartyIdFrom", column="prPcPartyIdFrom")
,@FieldResult(name="prPcPartyIdTo", column="prPcPartyIdTo")
,@FieldResult(name="prPcRoleTypeIdFrom", column="prPcRoleTypeIdFrom")
,@FieldResult(name="prPcRoleTypeIdTo", column="prPcRoleTypeIdTo")
,@FieldResult(name="prPcFromDate", column="prPcFromDate")
,@FieldResult(name="prPcThruDate", column="prPcThruDate")
,@FieldResult(name="prPcStatusId", column="prPcStatusId")
,@FieldResult(name="prPcRelationshipName", column="prPcRelationshipName")
,@FieldResult(name="prPcSecurityGroupId", column="prPcSecurityGroupId")
,@FieldResult(name="prPcPriorityTypeId", column="prPcPriorityTypeId")
,@FieldResult(name="prPcPartyRelationshipTypeId", column="prPcPartyRelationshipTypeId")
,@FieldResult(name="prPcPermissionsEnumId", column="prPcPermissionsEnumId")
,@FieldResult(name="prPcPositionTitle", column="prPcPositionTitle")
,@FieldResult(name="prPcComments", column="prPcComments")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class SegmentGroupViewRelatedParties extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("sgrSegmentGroupId", "SGR.SEGMENT_GROUP_ID");
        fields.put("sgrPartyId", "SGR.PARTY_ID");
        fields.put("sgrRoleTypeId", "SGR.ROLE_TYPE_ID");
        fields.put("sgrToSegmentGroupId", "SGRTO.SEGMENT_GROUP_ID");
        fields.put("sgrToPartyId", "SGRTO.PARTY_ID");
        fields.put("sgrToRoleTypeId", "SGRTO.ROLE_TYPE_ID");
        fields.put("prSgrPartyIdFrom", "PRSGR.PARTY_ID_FROM");
        fields.put("prSgrPartyIdTo", "PRSGR.PARTY_ID_TO");
        fields.put("prSgrRoleTypeIdFrom", "PRSGR.ROLE_TYPE_ID_FROM");
        fields.put("prSgrRoleTypeIdTo", "PRSGR.ROLE_TYPE_ID_TO");
        fields.put("prSgrFromDate", "PRSGR.FROM_DATE");
        fields.put("prSgrThruDate", "PRSGR.THRU_DATE");
        fields.put("prSgrStatusId", "PRSGR.STATUS_ID");
        fields.put("prSgrRelationshipName", "PRSGR.RELATIONSHIP_NAME");
        fields.put("prSgrSecurityGroupId", "PRSGR.SECURITY_GROUP_ID");
        fields.put("prSgrPriorityTypeId", "PRSGR.PRIORITY_TYPE_ID");
        fields.put("prSgrPartyRelationshipTypeId", "PRSGR.PARTY_RELATIONSHIP_TYPE_ID");
        fields.put("prSgrPermissionsEnumId", "PRSGR.PERMISSIONS_ENUM_ID");
        fields.put("prSgrPositionTitle", "PRSGR.POSITION_TITLE");
        fields.put("prSgrComments", "PRSGR.COMMENTS");
        fields.put("sgcSegmentGroupId", "SGC.SEGMENT_GROUP_ID");
        fields.put("sgcPartyClassificationGroupId", "SGC.PARTY_CLASSIFICATION_GROUP_ID");
        fields.put("pcPartyId", "PC.PARTY_ID");
        fields.put("pcPartyClassificationGroupId", "PC.PARTY_CLASSIFICATION_GROUP_ID");
        fields.put("pcFromDate", "PC.FROM_DATE");
        fields.put("pcThruDate", "PC.THRU_DATE");
        fields.put("prPcPartyIdFrom", "PRPC.PARTY_ID_FROM");
        fields.put("prPcPartyIdTo", "PRPC.PARTY_ID_TO");
        fields.put("prPcRoleTypeIdFrom", "PRPC.ROLE_TYPE_ID_FROM");
        fields.put("prPcRoleTypeIdTo", "PRPC.ROLE_TYPE_ID_TO");
        fields.put("prPcFromDate", "PRPC.FROM_DATE");
        fields.put("prPcThruDate", "PRPC.THRU_DATE");
        fields.put("prPcStatusId", "PRPC.STATUS_ID");
        fields.put("prPcRelationshipName", "PRPC.RELATIONSHIP_NAME");
        fields.put("prPcSecurityGroupId", "PRPC.SECURITY_GROUP_ID");
        fields.put("prPcPriorityTypeId", "PRPC.PRIORITY_TYPE_ID");
        fields.put("prPcPartyRelationshipTypeId", "PRPC.PARTY_RELATIONSHIP_TYPE_ID");
        fields.put("prPcPermissionsEnumId", "PRPC.PERMISSIONS_ENUM_ID");
        fields.put("prPcPositionTitle", "PRPC.POSITION_TITLE");
        fields.put("prPcComments", "PRPC.COMMENTS");
fieldMapColumns.put("SegmentGroupViewRelatedParties", fields);
}
  public static enum Fields implements EntityFieldInterface<SegmentGroupViewRelatedParties> {
    sgrSegmentGroupId("sgrSegmentGroupId"),
    sgrPartyId("sgrPartyId"),
    sgrRoleTypeId("sgrRoleTypeId"),
    sgrToSegmentGroupId("sgrToSegmentGroupId"),
    sgrToPartyId("sgrToPartyId"),
    sgrToRoleTypeId("sgrToRoleTypeId"),
    prSgrPartyIdFrom("prSgrPartyIdFrom"),
    prSgrPartyIdTo("prSgrPartyIdTo"),
    prSgrRoleTypeIdFrom("prSgrRoleTypeIdFrom"),
    prSgrRoleTypeIdTo("prSgrRoleTypeIdTo"),
    prSgrFromDate("prSgrFromDate"),
    prSgrThruDate("prSgrThruDate"),
    prSgrStatusId("prSgrStatusId"),
    prSgrRelationshipName("prSgrRelationshipName"),
    prSgrSecurityGroupId("prSgrSecurityGroupId"),
    prSgrPriorityTypeId("prSgrPriorityTypeId"),
    prSgrPartyRelationshipTypeId("prSgrPartyRelationshipTypeId"),
    prSgrPermissionsEnumId("prSgrPermissionsEnumId"),
    prSgrPositionTitle("prSgrPositionTitle"),
    prSgrComments("prSgrComments"),
    sgcSegmentGroupId("sgcSegmentGroupId"),
    sgcPartyClassificationGroupId("sgcPartyClassificationGroupId"),
    pcPartyId("pcPartyId"),
    pcPartyClassificationGroupId("pcPartyClassificationGroupId"),
    pcFromDate("pcFromDate"),
    pcThruDate("pcThruDate"),
    prPcPartyIdFrom("prPcPartyIdFrom"),
    prPcPartyIdTo("prPcPartyIdTo"),
    prPcRoleTypeIdFrom("prPcRoleTypeIdFrom"),
    prPcRoleTypeIdTo("prPcRoleTypeIdTo"),
    prPcFromDate("prPcFromDate"),
    prPcThruDate("prPcThruDate"),
    prPcStatusId("prPcStatusId"),
    prPcRelationshipName("prPcRelationshipName"),
    prPcSecurityGroupId("prPcSecurityGroupId"),
    prPcPriorityTypeId("prPcPriorityTypeId"),
    prPcPartyRelationshipTypeId("prPcPartyRelationshipTypeId"),
    prPcPermissionsEnumId("prPcPermissionsEnumId"),
    prPcPositionTitle("prPcPositionTitle"),
    prPcComments("prPcComments");
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
   private String sgrSegmentGroupId;
    
   private String sgrPartyId;
    
   private String sgrRoleTypeId;
    
   private String sgrToSegmentGroupId;
    
   private String sgrToPartyId;
    
   private String sgrToRoleTypeId;
    
   private String prSgrPartyIdFrom;
    
   private String prSgrPartyIdTo;
    
   private String prSgrRoleTypeIdFrom;
    
   private String prSgrRoleTypeIdTo;
    
   private Timestamp prSgrFromDate;
    
   private Timestamp prSgrThruDate;
    
   private String prSgrStatusId;
    
   private String prSgrRelationshipName;
    
   private String prSgrSecurityGroupId;
    
   private String prSgrPriorityTypeId;
    
   private String prSgrPartyRelationshipTypeId;
    
   private String prSgrPermissionsEnumId;
    
   private String prSgrPositionTitle;
    
   private String prSgrComments;
    
   private String sgcSegmentGroupId;
    
   private String sgcPartyClassificationGroupId;
    
   private String pcPartyId;
    
   private String pcPartyClassificationGroupId;
    
   private Timestamp pcFromDate;
    
   private Timestamp pcThruDate;
    
   private String prPcPartyIdFrom;
    
   private String prPcPartyIdTo;
    
   private String prPcRoleTypeIdFrom;
    
   private String prPcRoleTypeIdTo;
    
   private Timestamp prPcFromDate;
    
   private Timestamp prPcThruDate;
    
   private String prPcStatusId;
    
   private String prPcRelationshipName;
    
   private String prPcSecurityGroupId;
    
   private String prPcPriorityTypeId;
    
   private String prPcPartyRelationshipTypeId;
    
   private String prPcPermissionsEnumId;
    
   private String prPcPositionTitle;
    
   private String prPcComments;

  /**
   * Default constructor.
   */
  public SegmentGroupViewRelatedParties() {
      super();
      this.baseEntityName = "SegmentGroupViewRelatedParties";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("sgrSegmentGroupId");this.primaryKeyNames.add("sgrPartyId");this.primaryKeyNames.add("sgrRoleTypeId");this.primaryKeyNames.add("sgrToSegmentGroupId");this.primaryKeyNames.add("sgrToPartyId");this.primaryKeyNames.add("sgrToRoleTypeId");this.primaryKeyNames.add("prSgrPartyIdFrom");this.primaryKeyNames.add("prSgrPartyIdTo");this.primaryKeyNames.add("prSgrRoleTypeIdFrom");this.primaryKeyNames.add("prSgrRoleTypeIdTo");this.primaryKeyNames.add("prSgrFromDate");this.primaryKeyNames.add("sgcSegmentGroupId");this.primaryKeyNames.add("sgcPartyClassificationGroupId");this.primaryKeyNames.add("pcPartyId");this.primaryKeyNames.add("pcPartyClassificationGroupId");this.primaryKeyNames.add("pcFromDate");this.primaryKeyNames.add("prPcPartyIdFrom");this.primaryKeyNames.add("prPcPartyIdTo");this.primaryKeyNames.add("prPcRoleTypeIdFrom");this.primaryKeyNames.add("prPcRoleTypeIdTo");this.primaryKeyNames.add("prPcFromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("sgrSegmentGroupId");this.allFieldsNames.add("sgrPartyId");this.allFieldsNames.add("sgrRoleTypeId");this.allFieldsNames.add("sgrToSegmentGroupId");this.allFieldsNames.add("sgrToPartyId");this.allFieldsNames.add("sgrToRoleTypeId");this.allFieldsNames.add("prSgrPartyIdFrom");this.allFieldsNames.add("prSgrPartyIdTo");this.allFieldsNames.add("prSgrRoleTypeIdFrom");this.allFieldsNames.add("prSgrRoleTypeIdTo");this.allFieldsNames.add("prSgrFromDate");this.allFieldsNames.add("prSgrThruDate");this.allFieldsNames.add("prSgrStatusId");this.allFieldsNames.add("prSgrRelationshipName");this.allFieldsNames.add("prSgrSecurityGroupId");this.allFieldsNames.add("prSgrPriorityTypeId");this.allFieldsNames.add("prSgrPartyRelationshipTypeId");this.allFieldsNames.add("prSgrPermissionsEnumId");this.allFieldsNames.add("prSgrPositionTitle");this.allFieldsNames.add("prSgrComments");this.allFieldsNames.add("sgcSegmentGroupId");this.allFieldsNames.add("sgcPartyClassificationGroupId");this.allFieldsNames.add("pcPartyId");this.allFieldsNames.add("pcPartyClassificationGroupId");this.allFieldsNames.add("pcFromDate");this.allFieldsNames.add("pcThruDate");this.allFieldsNames.add("prPcPartyIdFrom");this.allFieldsNames.add("prPcPartyIdTo");this.allFieldsNames.add("prPcRoleTypeIdFrom");this.allFieldsNames.add("prPcRoleTypeIdTo");this.allFieldsNames.add("prPcFromDate");this.allFieldsNames.add("prPcThruDate");this.allFieldsNames.add("prPcStatusId");this.allFieldsNames.add("prPcRelationshipName");this.allFieldsNames.add("prPcSecurityGroupId");this.allFieldsNames.add("prPcPriorityTypeId");this.allFieldsNames.add("prPcPartyRelationshipTypeId");this.allFieldsNames.add("prPcPermissionsEnumId");this.allFieldsNames.add("prPcPositionTitle");this.allFieldsNames.add("prPcComments");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public SegmentGroupViewRelatedParties(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param sgrSegmentGroupId the sgrSegmentGroupId to set
     */
    public void setSgrSegmentGroupId(String sgrSegmentGroupId) {
        this.sgrSegmentGroupId = sgrSegmentGroupId;
    }
    /**
     * Auto generated value setter.
     * @param sgrPartyId the sgrPartyId to set
     */
    public void setSgrPartyId(String sgrPartyId) {
        this.sgrPartyId = sgrPartyId;
    }
    /**
     * Auto generated value setter.
     * @param sgrRoleTypeId the sgrRoleTypeId to set
     */
    public void setSgrRoleTypeId(String sgrRoleTypeId) {
        this.sgrRoleTypeId = sgrRoleTypeId;
    }
    /**
     * Auto generated value setter.
     * @param sgrToSegmentGroupId the sgrToSegmentGroupId to set
     */
    public void setSgrToSegmentGroupId(String sgrToSegmentGroupId) {
        this.sgrToSegmentGroupId = sgrToSegmentGroupId;
    }
    /**
     * Auto generated value setter.
     * @param sgrToPartyId the sgrToPartyId to set
     */
    public void setSgrToPartyId(String sgrToPartyId) {
        this.sgrToPartyId = sgrToPartyId;
    }
    /**
     * Auto generated value setter.
     * @param sgrToRoleTypeId the sgrToRoleTypeId to set
     */
    public void setSgrToRoleTypeId(String sgrToRoleTypeId) {
        this.sgrToRoleTypeId = sgrToRoleTypeId;
    }
    /**
     * Auto generated value setter.
     * @param prSgrPartyIdFrom the prSgrPartyIdFrom to set
     */
    public void setPrSgrPartyIdFrom(String prSgrPartyIdFrom) {
        this.prSgrPartyIdFrom = prSgrPartyIdFrom;
    }
    /**
     * Auto generated value setter.
     * @param prSgrPartyIdTo the prSgrPartyIdTo to set
     */
    public void setPrSgrPartyIdTo(String prSgrPartyIdTo) {
        this.prSgrPartyIdTo = prSgrPartyIdTo;
    }
    /**
     * Auto generated value setter.
     * @param prSgrRoleTypeIdFrom the prSgrRoleTypeIdFrom to set
     */
    public void setPrSgrRoleTypeIdFrom(String prSgrRoleTypeIdFrom) {
        this.prSgrRoleTypeIdFrom = prSgrRoleTypeIdFrom;
    }
    /**
     * Auto generated value setter.
     * @param prSgrRoleTypeIdTo the prSgrRoleTypeIdTo to set
     */
    public void setPrSgrRoleTypeIdTo(String prSgrRoleTypeIdTo) {
        this.prSgrRoleTypeIdTo = prSgrRoleTypeIdTo;
    }
    /**
     * Auto generated value setter.
     * @param prSgrFromDate the prSgrFromDate to set
     */
    public void setPrSgrFromDate(Timestamp prSgrFromDate) {
        this.prSgrFromDate = prSgrFromDate;
    }
    /**
     * Auto generated value setter.
     * @param prSgrThruDate the prSgrThruDate to set
     */
    public void setPrSgrThruDate(Timestamp prSgrThruDate) {
        this.prSgrThruDate = prSgrThruDate;
    }
    /**
     * Auto generated value setter.
     * @param prSgrStatusId the prSgrStatusId to set
     */
    public void setPrSgrStatusId(String prSgrStatusId) {
        this.prSgrStatusId = prSgrStatusId;
    }
    /**
     * Auto generated value setter.
     * @param prSgrRelationshipName the prSgrRelationshipName to set
     */
    public void setPrSgrRelationshipName(String prSgrRelationshipName) {
        this.prSgrRelationshipName = prSgrRelationshipName;
    }
    /**
     * Auto generated value setter.
     * @param prSgrSecurityGroupId the prSgrSecurityGroupId to set
     */
    public void setPrSgrSecurityGroupId(String prSgrSecurityGroupId) {
        this.prSgrSecurityGroupId = prSgrSecurityGroupId;
    }
    /**
     * Auto generated value setter.
     * @param prSgrPriorityTypeId the prSgrPriorityTypeId to set
     */
    public void setPrSgrPriorityTypeId(String prSgrPriorityTypeId) {
        this.prSgrPriorityTypeId = prSgrPriorityTypeId;
    }
    /**
     * Auto generated value setter.
     * @param prSgrPartyRelationshipTypeId the prSgrPartyRelationshipTypeId to set
     */
    public void setPrSgrPartyRelationshipTypeId(String prSgrPartyRelationshipTypeId) {
        this.prSgrPartyRelationshipTypeId = prSgrPartyRelationshipTypeId;
    }
    /**
     * Auto generated value setter.
     * @param prSgrPermissionsEnumId the prSgrPermissionsEnumId to set
     */
    public void setPrSgrPermissionsEnumId(String prSgrPermissionsEnumId) {
        this.prSgrPermissionsEnumId = prSgrPermissionsEnumId;
    }
    /**
     * Auto generated value setter.
     * @param prSgrPositionTitle the prSgrPositionTitle to set
     */
    public void setPrSgrPositionTitle(String prSgrPositionTitle) {
        this.prSgrPositionTitle = prSgrPositionTitle;
    }
    /**
     * Auto generated value setter.
     * @param prSgrComments the prSgrComments to set
     */
    public void setPrSgrComments(String prSgrComments) {
        this.prSgrComments = prSgrComments;
    }
    /**
     * Auto generated value setter.
     * @param sgcSegmentGroupId the sgcSegmentGroupId to set
     */
    public void setSgcSegmentGroupId(String sgcSegmentGroupId) {
        this.sgcSegmentGroupId = sgcSegmentGroupId;
    }
    /**
     * Auto generated value setter.
     * @param sgcPartyClassificationGroupId the sgcPartyClassificationGroupId to set
     */
    public void setSgcPartyClassificationGroupId(String sgcPartyClassificationGroupId) {
        this.sgcPartyClassificationGroupId = sgcPartyClassificationGroupId;
    }
    /**
     * Auto generated value setter.
     * @param pcPartyId the pcPartyId to set
     */
    public void setPcPartyId(String pcPartyId) {
        this.pcPartyId = pcPartyId;
    }
    /**
     * Auto generated value setter.
     * @param pcPartyClassificationGroupId the pcPartyClassificationGroupId to set
     */
    public void setPcPartyClassificationGroupId(String pcPartyClassificationGroupId) {
        this.pcPartyClassificationGroupId = pcPartyClassificationGroupId;
    }
    /**
     * Auto generated value setter.
     * @param pcFromDate the pcFromDate to set
     */
    public void setPcFromDate(Timestamp pcFromDate) {
        this.pcFromDate = pcFromDate;
    }
    /**
     * Auto generated value setter.
     * @param pcThruDate the pcThruDate to set
     */
    public void setPcThruDate(Timestamp pcThruDate) {
        this.pcThruDate = pcThruDate;
    }
    /**
     * Auto generated value setter.
     * @param prPcPartyIdFrom the prPcPartyIdFrom to set
     */
    public void setPrPcPartyIdFrom(String prPcPartyIdFrom) {
        this.prPcPartyIdFrom = prPcPartyIdFrom;
    }
    /**
     * Auto generated value setter.
     * @param prPcPartyIdTo the prPcPartyIdTo to set
     */
    public void setPrPcPartyIdTo(String prPcPartyIdTo) {
        this.prPcPartyIdTo = prPcPartyIdTo;
    }
    /**
     * Auto generated value setter.
     * @param prPcRoleTypeIdFrom the prPcRoleTypeIdFrom to set
     */
    public void setPrPcRoleTypeIdFrom(String prPcRoleTypeIdFrom) {
        this.prPcRoleTypeIdFrom = prPcRoleTypeIdFrom;
    }
    /**
     * Auto generated value setter.
     * @param prPcRoleTypeIdTo the prPcRoleTypeIdTo to set
     */
    public void setPrPcRoleTypeIdTo(String prPcRoleTypeIdTo) {
        this.prPcRoleTypeIdTo = prPcRoleTypeIdTo;
    }
    /**
     * Auto generated value setter.
     * @param prPcFromDate the prPcFromDate to set
     */
    public void setPrPcFromDate(Timestamp prPcFromDate) {
        this.prPcFromDate = prPcFromDate;
    }
    /**
     * Auto generated value setter.
     * @param prPcThruDate the prPcThruDate to set
     */
    public void setPrPcThruDate(Timestamp prPcThruDate) {
        this.prPcThruDate = prPcThruDate;
    }
    /**
     * Auto generated value setter.
     * @param prPcStatusId the prPcStatusId to set
     */
    public void setPrPcStatusId(String prPcStatusId) {
        this.prPcStatusId = prPcStatusId;
    }
    /**
     * Auto generated value setter.
     * @param prPcRelationshipName the prPcRelationshipName to set
     */
    public void setPrPcRelationshipName(String prPcRelationshipName) {
        this.prPcRelationshipName = prPcRelationshipName;
    }
    /**
     * Auto generated value setter.
     * @param prPcSecurityGroupId the prPcSecurityGroupId to set
     */
    public void setPrPcSecurityGroupId(String prPcSecurityGroupId) {
        this.prPcSecurityGroupId = prPcSecurityGroupId;
    }
    /**
     * Auto generated value setter.
     * @param prPcPriorityTypeId the prPcPriorityTypeId to set
     */
    public void setPrPcPriorityTypeId(String prPcPriorityTypeId) {
        this.prPcPriorityTypeId = prPcPriorityTypeId;
    }
    /**
     * Auto generated value setter.
     * @param prPcPartyRelationshipTypeId the prPcPartyRelationshipTypeId to set
     */
    public void setPrPcPartyRelationshipTypeId(String prPcPartyRelationshipTypeId) {
        this.prPcPartyRelationshipTypeId = prPcPartyRelationshipTypeId;
    }
    /**
     * Auto generated value setter.
     * @param prPcPermissionsEnumId the prPcPermissionsEnumId to set
     */
    public void setPrPcPermissionsEnumId(String prPcPermissionsEnumId) {
        this.prPcPermissionsEnumId = prPcPermissionsEnumId;
    }
    /**
     * Auto generated value setter.
     * @param prPcPositionTitle the prPcPositionTitle to set
     */
    public void setPrPcPositionTitle(String prPcPositionTitle) {
        this.prPcPositionTitle = prPcPositionTitle;
    }
    /**
     * Auto generated value setter.
     * @param prPcComments the prPcComments to set
     */
    public void setPrPcComments(String prPcComments) {
        this.prPcComments = prPcComments;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSgrSegmentGroupId() {
        return this.sgrSegmentGroupId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSgrPartyId() {
        return this.sgrPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSgrRoleTypeId() {
        return this.sgrRoleTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSgrToSegmentGroupId() {
        return this.sgrToSegmentGroupId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSgrToPartyId() {
        return this.sgrToPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSgrToRoleTypeId() {
        return this.sgrToRoleTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrSgrPartyIdFrom() {
        return this.prSgrPartyIdFrom;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrSgrPartyIdTo() {
        return this.prSgrPartyIdTo;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrSgrRoleTypeIdFrom() {
        return this.prSgrRoleTypeIdFrom;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrSgrRoleTypeIdTo() {
        return this.prSgrRoleTypeIdTo;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getPrSgrFromDate() {
        return this.prSgrFromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getPrSgrThruDate() {
        return this.prSgrThruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrSgrStatusId() {
        return this.prSgrStatusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrSgrRelationshipName() {
        return this.prSgrRelationshipName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrSgrSecurityGroupId() {
        return this.prSgrSecurityGroupId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrSgrPriorityTypeId() {
        return this.prSgrPriorityTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrSgrPartyRelationshipTypeId() {
        return this.prSgrPartyRelationshipTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrSgrPermissionsEnumId() {
        return this.prSgrPermissionsEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrSgrPositionTitle() {
        return this.prSgrPositionTitle;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrSgrComments() {
        return this.prSgrComments;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSgcSegmentGroupId() {
        return this.sgcSegmentGroupId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSgcPartyClassificationGroupId() {
        return this.sgcPartyClassificationGroupId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPcPartyId() {
        return this.pcPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPcPartyClassificationGroupId() {
        return this.pcPartyClassificationGroupId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getPcFromDate() {
        return this.pcFromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getPcThruDate() {
        return this.pcThruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrPcPartyIdFrom() {
        return this.prPcPartyIdFrom;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrPcPartyIdTo() {
        return this.prPcPartyIdTo;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrPcRoleTypeIdFrom() {
        return this.prPcRoleTypeIdFrom;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrPcRoleTypeIdTo() {
        return this.prPcRoleTypeIdTo;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getPrPcFromDate() {
        return this.prPcFromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getPrPcThruDate() {
        return this.prPcThruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrPcStatusId() {
        return this.prPcStatusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrPcRelationshipName() {
        return this.prPcRelationshipName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrPcSecurityGroupId() {
        return this.prPcSecurityGroupId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrPcPriorityTypeId() {
        return this.prPcPriorityTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrPcPartyRelationshipTypeId() {
        return this.prPcPartyRelationshipTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrPcPermissionsEnumId() {
        return this.prPcPermissionsEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrPcPositionTitle() {
        return this.prPcPositionTitle;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrPcComments() {
        return this.prPcComments;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setSgrSegmentGroupId((String) mapValue.get("sgrSegmentGroupId"));
        setSgrPartyId((String) mapValue.get("sgrPartyId"));
        setSgrRoleTypeId((String) mapValue.get("sgrRoleTypeId"));
        setSgrToSegmentGroupId((String) mapValue.get("sgrToSegmentGroupId"));
        setSgrToPartyId((String) mapValue.get("sgrToPartyId"));
        setSgrToRoleTypeId((String) mapValue.get("sgrToRoleTypeId"));
        setPrSgrPartyIdFrom((String) mapValue.get("prSgrPartyIdFrom"));
        setPrSgrPartyIdTo((String) mapValue.get("prSgrPartyIdTo"));
        setPrSgrRoleTypeIdFrom((String) mapValue.get("prSgrRoleTypeIdFrom"));
        setPrSgrRoleTypeIdTo((String) mapValue.get("prSgrRoleTypeIdTo"));
        setPrSgrFromDate((Timestamp) mapValue.get("prSgrFromDate"));
        setPrSgrThruDate((Timestamp) mapValue.get("prSgrThruDate"));
        setPrSgrStatusId((String) mapValue.get("prSgrStatusId"));
        setPrSgrRelationshipName((String) mapValue.get("prSgrRelationshipName"));
        setPrSgrSecurityGroupId((String) mapValue.get("prSgrSecurityGroupId"));
        setPrSgrPriorityTypeId((String) mapValue.get("prSgrPriorityTypeId"));
        setPrSgrPartyRelationshipTypeId((String) mapValue.get("prSgrPartyRelationshipTypeId"));
        setPrSgrPermissionsEnumId((String) mapValue.get("prSgrPermissionsEnumId"));
        setPrSgrPositionTitle((String) mapValue.get("prSgrPositionTitle"));
        setPrSgrComments((String) mapValue.get("prSgrComments"));
        setSgcSegmentGroupId((String) mapValue.get("sgcSegmentGroupId"));
        setSgcPartyClassificationGroupId((String) mapValue.get("sgcPartyClassificationGroupId"));
        setPcPartyId((String) mapValue.get("pcPartyId"));
        setPcPartyClassificationGroupId((String) mapValue.get("pcPartyClassificationGroupId"));
        setPcFromDate((Timestamp) mapValue.get("pcFromDate"));
        setPcThruDate((Timestamp) mapValue.get("pcThruDate"));
        setPrPcPartyIdFrom((String) mapValue.get("prPcPartyIdFrom"));
        setPrPcPartyIdTo((String) mapValue.get("prPcPartyIdTo"));
        setPrPcRoleTypeIdFrom((String) mapValue.get("prPcRoleTypeIdFrom"));
        setPrPcRoleTypeIdTo((String) mapValue.get("prPcRoleTypeIdTo"));
        setPrPcFromDate((Timestamp) mapValue.get("prPcFromDate"));
        setPrPcThruDate((Timestamp) mapValue.get("prPcThruDate"));
        setPrPcStatusId((String) mapValue.get("prPcStatusId"));
        setPrPcRelationshipName((String) mapValue.get("prPcRelationshipName"));
        setPrPcSecurityGroupId((String) mapValue.get("prPcSecurityGroupId"));
        setPrPcPriorityTypeId((String) mapValue.get("prPcPriorityTypeId"));
        setPrPcPartyRelationshipTypeId((String) mapValue.get("prPcPartyRelationshipTypeId"));
        setPrPcPermissionsEnumId((String) mapValue.get("prPcPermissionsEnumId"));
        setPrPcPositionTitle((String) mapValue.get("prPcPositionTitle"));
        setPrPcComments((String) mapValue.get("prPcComments"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("sgrSegmentGroupId", getSgrSegmentGroupId());
        mapValue.put("sgrPartyId", getSgrPartyId());
        mapValue.put("sgrRoleTypeId", getSgrRoleTypeId());
        mapValue.put("sgrToSegmentGroupId", getSgrToSegmentGroupId());
        mapValue.put("sgrToPartyId", getSgrToPartyId());
        mapValue.put("sgrToRoleTypeId", getSgrToRoleTypeId());
        mapValue.put("prSgrPartyIdFrom", getPrSgrPartyIdFrom());
        mapValue.put("prSgrPartyIdTo", getPrSgrPartyIdTo());
        mapValue.put("prSgrRoleTypeIdFrom", getPrSgrRoleTypeIdFrom());
        mapValue.put("prSgrRoleTypeIdTo", getPrSgrRoleTypeIdTo());
        mapValue.put("prSgrFromDate", getPrSgrFromDate());
        mapValue.put("prSgrThruDate", getPrSgrThruDate());
        mapValue.put("prSgrStatusId", getPrSgrStatusId());
        mapValue.put("prSgrRelationshipName", getPrSgrRelationshipName());
        mapValue.put("prSgrSecurityGroupId", getPrSgrSecurityGroupId());
        mapValue.put("prSgrPriorityTypeId", getPrSgrPriorityTypeId());
        mapValue.put("prSgrPartyRelationshipTypeId", getPrSgrPartyRelationshipTypeId());
        mapValue.put("prSgrPermissionsEnumId", getPrSgrPermissionsEnumId());
        mapValue.put("prSgrPositionTitle", getPrSgrPositionTitle());
        mapValue.put("prSgrComments", getPrSgrComments());
        mapValue.put("sgcSegmentGroupId", getSgcSegmentGroupId());
        mapValue.put("sgcPartyClassificationGroupId", getSgcPartyClassificationGroupId());
        mapValue.put("pcPartyId", getPcPartyId());
        mapValue.put("pcPartyClassificationGroupId", getPcPartyClassificationGroupId());
        mapValue.put("pcFromDate", getPcFromDate());
        mapValue.put("pcThruDate", getPcThruDate());
        mapValue.put("prPcPartyIdFrom", getPrPcPartyIdFrom());
        mapValue.put("prPcPartyIdTo", getPrPcPartyIdTo());
        mapValue.put("prPcRoleTypeIdFrom", getPrPcRoleTypeIdFrom());
        mapValue.put("prPcRoleTypeIdTo", getPrPcRoleTypeIdTo());
        mapValue.put("prPcFromDate", getPrPcFromDate());
        mapValue.put("prPcThruDate", getPrPcThruDate());
        mapValue.put("prPcStatusId", getPrPcStatusId());
        mapValue.put("prPcRelationshipName", getPrPcRelationshipName());
        mapValue.put("prPcSecurityGroupId", getPrPcSecurityGroupId());
        mapValue.put("prPcPriorityTypeId", getPrPcPriorityTypeId());
        mapValue.put("prPcPartyRelationshipTypeId", getPrPcPartyRelationshipTypeId());
        mapValue.put("prPcPermissionsEnumId", getPrPcPermissionsEnumId());
        mapValue.put("prPcPositionTitle", getPrPcPositionTitle());
        mapValue.put("prPcComments", getPrPcComments());
        return mapValue;
    }


}
