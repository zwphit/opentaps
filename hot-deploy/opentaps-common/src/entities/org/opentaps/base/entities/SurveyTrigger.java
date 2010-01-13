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
 * Auto generated base entity SurveyTrigger.
 */
@javax.persistence.Entity
@Table(name="SURVEY_TRIGGER")
public class SurveyTrigger extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("surveyId", "SURVEY_ID");
        fields.put("surveyApplTypeId", "SURVEY_APPL_TYPE_ID");
        fields.put("fromDate", "FROM_DATE");
        fields.put("thruDate", "THRU_DATE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("SurveyTrigger", fields);
}
  public static enum Fields implements EntityFieldInterface<SurveyTrigger> {
    surveyId("surveyId"),
    surveyApplTypeId("surveyApplTypeId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.SurveyTriggerPkBridge.class)
     protected SurveyTriggerPk id = new SurveyTriggerPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>SurveyTriggerPk</code>
     */
      public SurveyTriggerPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>SurveyTriggerPk</code> value to set
    */   
      public void setId(SurveyTriggerPk id) {
         this.id = id;
      }
   @Column(name="THRU_DATE")
   protected Timestamp thruDate;
   @Column(name="LAST_UPDATED_STAMP")
   protected Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   protected Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   protected Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   protected Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SURVEY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected Survey survey = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SURVEY_APPL_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected SurveyApplType surveyApplType = null;

  /**
   * Default constructor.
   */
  public SurveyTrigger() {
      super();
      this.baseEntityName = "SurveyTrigger";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("surveyId");this.primaryKeyNames.add("surveyApplTypeId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("surveyId");this.allFieldsNames.add("surveyApplTypeId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public SurveyTrigger(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param surveyId the surveyId to set
     */
    public void setSurveyId(String surveyId) {
        id.setSurveyId(surveyId);
    }
    /**
     * Auto generated value setter.
     * @param surveyApplTypeId the surveyApplTypeId to set
     */
    public void setSurveyApplTypeId(String surveyApplTypeId) {
        id.setSurveyApplTypeId(surveyApplTypeId);
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        id.setFromDate(fromDate);
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
    public String getSurveyId() {
        return this.id.getSurveyId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSurveyApplTypeId() {
        return this.id.getSurveyApplTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.id.getFromDate();
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
     * Auto generated method that gets the related <code>Survey</code> by the relation named <code>Survey</code>.
     * @return the <code>Survey</code>
     * @throws RepositoryException if an error occurs
     */
    public Survey getSurvey() throws RepositoryException {
        if (this.survey == null) {
            this.survey = getRelatedOne(Survey.class, "Survey");
        }
        return this.survey;
    }
    /**
     * Auto generated method that gets the related <code>SurveyApplType</code> by the relation named <code>SurveyApplType</code>.
     * @return the <code>SurveyApplType</code>
     * @throws RepositoryException if an error occurs
     */
    public SurveyApplType getSurveyApplType() throws RepositoryException {
        if (this.surveyApplType == null) {
            this.surveyApplType = getRelatedOne(SurveyApplType.class, "SurveyApplType");
        }
        return this.surveyApplType;
    }

    /**
     * Auto generated value setter.
     * @param survey the survey to set
    */
    public void setSurvey(Survey survey) {
        this.survey = survey;
    }
    /**
     * Auto generated value setter.
     * @param surveyApplType the surveyApplType to set
    */
    public void setSurveyApplType(SurveyApplType surveyApplType) {
        this.surveyApplType = surveyApplType;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setSurveyId((String) mapValue.get("surveyId"));
        setSurveyApplTypeId((String) mapValue.get("surveyApplTypeId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
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
        mapValue.put("surveyId", getSurveyId());
        mapValue.put("surveyApplTypeId", getSurveyApplTypeId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
