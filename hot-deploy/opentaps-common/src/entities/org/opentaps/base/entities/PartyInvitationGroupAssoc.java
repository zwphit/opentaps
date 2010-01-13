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
 * Auto generated base entity PartyInvitationGroupAssoc.
 */
@javax.persistence.Entity
@Table(name="PARTY_INVITATION_GROUP_ASSOC")
public class PartyInvitationGroupAssoc extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("partyInvitationId", "PARTY_INVITATION_ID");
        fields.put("partyIdTo", "PARTY_ID_TO");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("PartyInvitationGroupAssoc", fields);
}
  public static enum Fields implements EntityFieldInterface<PartyInvitationGroupAssoc> {
    partyInvitationId("partyInvitationId"),
    partyIdTo("partyIdTo"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.PartyInvitationGroupAssocPkBridge.class)
     protected PartyInvitationGroupAssocPk id = new PartyInvitationGroupAssocPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>PartyInvitationGroupAssocPk</code>
     */
      public PartyInvitationGroupAssocPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>PartyInvitationGroupAssocPk</code> value to set
    */   
      public void setId(PartyInvitationGroupAssocPk id) {
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
   private transient PartyGroup toPartyGroup = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID_TO", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected Party toParty = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_INVITATION_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected PartyInvitation partyInvitation = null;

  /**
   * Default constructor.
   */
  public PartyInvitationGroupAssoc() {
      super();
      this.baseEntityName = "PartyInvitationGroupAssoc";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("partyInvitationId");this.primaryKeyNames.add("partyIdTo");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("partyInvitationId");this.allFieldsNames.add("partyIdTo");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PartyInvitationGroupAssoc(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param partyInvitationId the partyInvitationId to set
     */
    public void setPartyInvitationId(String partyInvitationId) {
        id.setPartyInvitationId(partyInvitationId);
    }
    /**
     * Auto generated value setter.
     * @param partyIdTo the partyIdTo to set
     */
    public void setPartyIdTo(String partyIdTo) {
        id.setPartyIdTo(partyIdTo);
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
    public String getPartyInvitationId() {
        return this.id.getPartyInvitationId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyIdTo() {
        return this.id.getPartyIdTo();
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
     * Auto generated method that gets the related <code>PartyGroup</code> by the relation named <code>ToPartyGroup</code>.
     * @return the <code>PartyGroup</code>
     * @throws RepositoryException if an error occurs
     */
    public PartyGroup getToPartyGroup() throws RepositoryException {
        if (this.toPartyGroup == null) {
            this.toPartyGroup = getRelatedOne(PartyGroup.class, "ToPartyGroup");
        }
        return this.toPartyGroup;
    }
    /**
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>ToParty</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getToParty() throws RepositoryException {
        if (this.toParty == null) {
            this.toParty = getRelatedOne(Party.class, "ToParty");
        }
        return this.toParty;
    }
    /**
     * Auto generated method that gets the related <code>PartyInvitation</code> by the relation named <code>PartyInvitation</code>.
     * @return the <code>PartyInvitation</code>
     * @throws RepositoryException if an error occurs
     */
    public PartyInvitation getPartyInvitation() throws RepositoryException {
        if (this.partyInvitation == null) {
            this.partyInvitation = getRelatedOne(PartyInvitation.class, "PartyInvitation");
        }
        return this.partyInvitation;
    }

    /**
     * Auto generated value setter.
     * @param toPartyGroup the toPartyGroup to set
    */
    public void setToPartyGroup(PartyGroup toPartyGroup) {
        this.toPartyGroup = toPartyGroup;
    }
    /**
     * Auto generated value setter.
     * @param toParty the toParty to set
    */
    public void setToParty(Party toParty) {
        this.toParty = toParty;
    }
    /**
     * Auto generated value setter.
     * @param partyInvitation the partyInvitation to set
    */
    public void setPartyInvitation(PartyInvitation partyInvitation) {
        this.partyInvitation = partyInvitation;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPartyInvitationId((String) mapValue.get("partyInvitationId"));
        setPartyIdTo((String) mapValue.get("partyIdTo"));
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
        mapValue.put("partyInvitationId", getPartyInvitationId());
        mapValue.put("partyIdTo", getPartyIdTo());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
