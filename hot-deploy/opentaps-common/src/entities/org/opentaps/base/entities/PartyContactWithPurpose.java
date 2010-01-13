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
 * Auto generated base entity PartyContactWithPurpose.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectPartyContactWithPurposes", query="SELECT CM.CONTACT_MECH_ID AS \"contactMechId\",PCM.PARTY_ID AS \"partyId\",PCMP.CONTACT_MECH_PURPOSE_TYPE_ID AS \"contactMechPurposeTypeId\",PCM.FROM_DATE AS \"fromDate\",PCM.THRU_DATE AS \"thruDate\",PCMP.FROM_DATE AS \"fromDate\",PCMP.THRU_DATE AS \"thruDate\",CM.CONTACT_MECH_TYPE_ID AS \"contactMechTypeId\",CM.INFO_STRING AS \"infoString\",PCM.COMMENTS AS \"comments\",PCM.EXTENSION AS \"extension\",PCM.ALLOW_SOLICITATION AS \"allowSolicitation\",PT.DESCRIPTION AS \"description\" FROM PARTY_CONTACT_MECH_PURPOSE PCMP INNER JOIN CONTACT_MECH CM ON PCMP.CONTACT_MECH_ID = CM.CONTACT_MECH_ID INNER JOIN PARTY_CONTACT_MECH PCM ON PCMP.PARTY_ID = PCM.PARTY_ID AND PCMP.CONTACT_MECH_ID = PCM.CONTACT_MECH_ID INNER JOIN CONTACT_MECH_PURPOSE_TYPE PT ON PCMP.CONTACT_MECH_PURPOSE_TYPE_ID = PT.CONTACT_MECH_PURPOSE_TYPE_ID", resultSetMapping="PartyContactWithPurposeMapping")
@SqlResultSetMapping(name="PartyContactWithPurposeMapping", entities={
@EntityResult(entityClass=PartyContactWithPurpose.class, fields = {
@FieldResult(name="contactMechId", column="contactMechId")
,@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="contactMechPurposeTypeId", column="contactMechPurposeTypeId")
,@FieldResult(name="contactFromDate", column="contactFromDate")
,@FieldResult(name="contactThruDate", column="contactThruDate")
,@FieldResult(name="purposeFromDate", column="purposeFromDate")
,@FieldResult(name="purposeThruDate", column="purposeThruDate")
,@FieldResult(name="contactMechTypeId", column="contactMechTypeId")
,@FieldResult(name="infoString", column="infoString")
,@FieldResult(name="comments", column="comments")
,@FieldResult(name="extension", column="extension")
,@FieldResult(name="allowSolicitation", column="allowSolicitation")
,@FieldResult(name="purposeDescription", column="purposeDescription")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class PartyContactWithPurpose extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("contactMechId", "CM.CONTACT_MECH_ID");
        fields.put("partyId", "PCM.PARTY_ID");
        fields.put("contactMechPurposeTypeId", "PCMP.CONTACT_MECH_PURPOSE_TYPE_ID");
        fields.put("contactFromDate", "PCM.FROM_DATE");
        fields.put("contactThruDate", "PCM.THRU_DATE");
        fields.put("purposeFromDate", "PCMP.FROM_DATE");
        fields.put("purposeThruDate", "PCMP.THRU_DATE");
        fields.put("contactMechTypeId", "CM.CONTACT_MECH_TYPE_ID");
        fields.put("infoString", "CM.INFO_STRING");
        fields.put("comments", "PCM.COMMENTS");
        fields.put("extension", "PCM.EXTENSION");
        fields.put("allowSolicitation", "PCM.ALLOW_SOLICITATION");
        fields.put("purposeDescription", "PT.DESCRIPTION");
fieldMapColumns.put("PartyContactWithPurpose", fields);
}
  public static enum Fields implements EntityFieldInterface<PartyContactWithPurpose> {
    contactMechId("contactMechId"),
    partyId("partyId"),
    contactMechPurposeTypeId("contactMechPurposeTypeId"),
    contactFromDate("contactFromDate"),
    contactThruDate("contactThruDate"),
    purposeFromDate("purposeFromDate"),
    purposeThruDate("purposeThruDate"),
    contactMechTypeId("contactMechTypeId"),
    infoString("infoString"),
    comments("comments"),
    extension("extension"),
    allowSolicitation("allowSolicitation"),
    purposeDescription("purposeDescription");
    protected final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private String contactMechId;
    @Id
   private String partyId;
    
   private String contactMechPurposeTypeId;
    
   private Timestamp contactFromDate;
    
   private Timestamp contactThruDate;
    
   private Timestamp purposeFromDate;
    
   private Timestamp purposeThruDate;
    
   private String contactMechTypeId;
    
   private String infoString;
    
   private String comments;
    
   private String extension;
    
   private String allowSolicitation;
    
   private String purposeDescription;
   private transient List<PartyContactMech> partyContactMeches = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CONTACT_MECH_PURPOSE_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected ContactMechPurposeType contactMechPurposeType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected Party party = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CONTACT_MECH_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected ContactMech contactMech = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CONTACT_MECH_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected TelecomNumber telecomNumber = null;

  /**
   * Default constructor.
   */
  public PartyContactWithPurpose() {
      super();
      this.baseEntityName = "PartyContactWithPurpose";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("contactMechId");this.primaryKeyNames.add("partyId");this.primaryKeyNames.add("contactMechPurposeTypeId");this.primaryKeyNames.add("contactFromDate");this.primaryKeyNames.add("purposeFromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("contactMechId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("contactMechPurposeTypeId");this.allFieldsNames.add("contactFromDate");this.allFieldsNames.add("contactThruDate");this.allFieldsNames.add("purposeFromDate");this.allFieldsNames.add("purposeThruDate");this.allFieldsNames.add("contactMechTypeId");this.allFieldsNames.add("infoString");this.allFieldsNames.add("comments");this.allFieldsNames.add("extension");this.allFieldsNames.add("allowSolicitation");this.allFieldsNames.add("purposeDescription");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PartyContactWithPurpose(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param contactMechId the contactMechId to set
     */
    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }
    /**
     * Auto generated value setter.
     * @param partyId the partyId to set
     */
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
    /**
     * Auto generated value setter.
     * @param contactMechPurposeTypeId the contactMechPurposeTypeId to set
     */
    public void setContactMechPurposeTypeId(String contactMechPurposeTypeId) {
        this.contactMechPurposeTypeId = contactMechPurposeTypeId;
    }
    /**
     * Auto generated value setter.
     * @param contactFromDate the contactFromDate to set
     */
    public void setContactFromDate(Timestamp contactFromDate) {
        this.contactFromDate = contactFromDate;
    }
    /**
     * Auto generated value setter.
     * @param contactThruDate the contactThruDate to set
     */
    public void setContactThruDate(Timestamp contactThruDate) {
        this.contactThruDate = contactThruDate;
    }
    /**
     * Auto generated value setter.
     * @param purposeFromDate the purposeFromDate to set
     */
    public void setPurposeFromDate(Timestamp purposeFromDate) {
        this.purposeFromDate = purposeFromDate;
    }
    /**
     * Auto generated value setter.
     * @param purposeThruDate the purposeThruDate to set
     */
    public void setPurposeThruDate(Timestamp purposeThruDate) {
        this.purposeThruDate = purposeThruDate;
    }
    /**
     * Auto generated value setter.
     * @param contactMechTypeId the contactMechTypeId to set
     */
    public void setContactMechTypeId(String contactMechTypeId) {
        this.contactMechTypeId = contactMechTypeId;
    }
    /**
     * Auto generated value setter.
     * @param infoString the infoString to set
     */
    public void setInfoString(String infoString) {
        this.infoString = infoString;
    }
    /**
     * Auto generated value setter.
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
    /**
     * Auto generated value setter.
     * @param extension the extension to set
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }
    /**
     * Auto generated value setter.
     * @param allowSolicitation the allowSolicitation to set
     */
    public void setAllowSolicitation(String allowSolicitation) {
        this.allowSolicitation = allowSolicitation;
    }
    /**
     * Auto generated value setter.
     * @param purposeDescription the purposeDescription to set
     */
    public void setPurposeDescription(String purposeDescription) {
        this.purposeDescription = purposeDescription;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContactMechId() {
        return this.contactMechId;
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
    public String getContactMechPurposeTypeId() {
        return this.contactMechPurposeTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getContactFromDate() {
        return this.contactFromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getContactThruDate() {
        return this.contactThruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getPurposeFromDate() {
        return this.purposeFromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getPurposeThruDate() {
        return this.purposeThruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContactMechTypeId() {
        return this.contactMechTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInfoString() {
        return this.infoString;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getComments() {
        return this.comments;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getExtension() {
        return this.extension;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAllowSolicitation() {
        return this.allowSolicitation;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPurposeDescription() {
        return this.purposeDescription;
    }

    /**
     * Auto generated method that gets the related <code>PartyContactMech</code> by the relation named <code>PartyContactMech</code>.
     * @return the list of <code>PartyContactMech</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PartyContactMech> getPartyContactMeches() throws RepositoryException {
        if (this.partyContactMeches == null) {
            this.partyContactMeches = getRelated(PartyContactMech.class, "PartyContactMech");
        }
        return this.partyContactMeches;
    }
    /**
     * Auto generated method that gets the related <code>ContactMechPurposeType</code> by the relation named <code>ContactMechPurposeType</code>.
     * @return the <code>ContactMechPurposeType</code>
     * @throws RepositoryException if an error occurs
     */
    public ContactMechPurposeType getContactMechPurposeType() throws RepositoryException {
        if (this.contactMechPurposeType == null) {
            this.contactMechPurposeType = getRelatedOne(ContactMechPurposeType.class, "ContactMechPurposeType");
        }
        return this.contactMechPurposeType;
    }
    /**
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>Party</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getParty() throws RepositoryException {
        if (this.party == null) {
            this.party = getRelatedOne(Party.class, "Party");
        }
        return this.party;
    }
    /**
     * Auto generated method that gets the related <code>ContactMech</code> by the relation named <code>ContactMech</code>.
     * @return the <code>ContactMech</code>
     * @throws RepositoryException if an error occurs
     */
    public ContactMech getContactMech() throws RepositoryException {
        if (this.contactMech == null) {
            this.contactMech = getRelatedOne(ContactMech.class, "ContactMech");
        }
        return this.contactMech;
    }
    /**
     * Auto generated method that gets the related <code>TelecomNumber</code> by the relation named <code>TelecomNumber</code>.
     * @return the <code>TelecomNumber</code>
     * @throws RepositoryException if an error occurs
     */
    public TelecomNumber getTelecomNumber() throws RepositoryException {
        if (this.telecomNumber == null) {
            this.telecomNumber = getRelatedOne(TelecomNumber.class, "TelecomNumber");
        }
        return this.telecomNumber;
    }

    /**
     * Auto generated value setter.
     * @param partyContactMeches the partyContactMeches to set
    */
    public void setPartyContactMeches(List<PartyContactMech> partyContactMeches) {
        this.partyContactMeches = partyContactMeches;
    }
    /**
     * Auto generated value setter.
     * @param contactMechPurposeType the contactMechPurposeType to set
    */
    public void setContactMechPurposeType(ContactMechPurposeType contactMechPurposeType) {
        this.contactMechPurposeType = contactMechPurposeType;
    }
    /**
     * Auto generated value setter.
     * @param party the party to set
    */
    public void setParty(Party party) {
        this.party = party;
    }
    /**
     * Auto generated value setter.
     * @param contactMech the contactMech to set
    */
    public void setContactMech(ContactMech contactMech) {
        this.contactMech = contactMech;
    }
    /**
     * Auto generated value setter.
     * @param telecomNumber the telecomNumber to set
    */
    public void setTelecomNumber(TelecomNumber telecomNumber) {
        this.telecomNumber = telecomNumber;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setContactMechId((String) mapValue.get("contactMechId"));
        setPartyId((String) mapValue.get("partyId"));
        setContactMechPurposeTypeId((String) mapValue.get("contactMechPurposeTypeId"));
        setContactFromDate((Timestamp) mapValue.get("contactFromDate"));
        setContactThruDate((Timestamp) mapValue.get("contactThruDate"));
        setPurposeFromDate((Timestamp) mapValue.get("purposeFromDate"));
        setPurposeThruDate((Timestamp) mapValue.get("purposeThruDate"));
        setContactMechTypeId((String) mapValue.get("contactMechTypeId"));
        setInfoString((String) mapValue.get("infoString"));
        setComments((String) mapValue.get("comments"));
        setExtension((String) mapValue.get("extension"));
        setAllowSolicitation((String) mapValue.get("allowSolicitation"));
        setPurposeDescription((String) mapValue.get("purposeDescription"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("contactMechId", getContactMechId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("contactMechPurposeTypeId", getContactMechPurposeTypeId());
        mapValue.put("contactFromDate", getContactFromDate());
        mapValue.put("contactThruDate", getContactThruDate());
        mapValue.put("purposeFromDate", getPurposeFromDate());
        mapValue.put("purposeThruDate", getPurposeThruDate());
        mapValue.put("contactMechTypeId", getContactMechTypeId());
        mapValue.put("infoString", getInfoString());
        mapValue.put("comments", getComments());
        mapValue.put("extension", getExtension());
        mapValue.put("allowSolicitation", getAllowSolicitation());
        mapValue.put("purposeDescription", getPurposeDescription());
        return mapValue;
    }


}
