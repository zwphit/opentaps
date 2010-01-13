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
 * Auto generated base entity DateDim.
 */
@javax.persistence.Entity
@Table(name="DATE_DIM")
public class DateDim extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("dateDimId", "DATE_DIM_ID");
        fields.put("dayOfMonth", "DAY_OF_MONTH");
        fields.put("weekOfYear", "WEEK_OF_YEAR");
        fields.put("monthOfYear", "MONTH_OF_YEAR");
        fields.put("yearNumber", "YEAR_NUMBER");
        fields.put("quarter", "QUARTER");
        fields.put("nameDay", "NAME_DAY");
        fields.put("nameMonth", "NAME_MONTH");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("DateDim", fields);
}
  public static enum Fields implements EntityFieldInterface<DateDim> {
    dateDimId("dateDimId"),
    dayOfMonth("dayOfMonth"),
    weekOfYear("weekOfYear"),
    monthOfYear("monthOfYear"),
    yearNumber("yearNumber"),
    quarter("quarter"),
    nameDay("nameDay"),
    nameMonth("nameMonth"),
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

   @org.hibernate.annotations.GenericGenerator(name="DateDim_GEN",  strategy="increment")
   @GeneratedValue(generator="DateDim_GEN")
   @Id
   @Column(name="DATE_DIM_ID")
   protected Long dateDimId;
   @Column(name="DAY_OF_MONTH")
   protected String dayOfMonth;
   @Column(name="WEEK_OF_YEAR")
   protected String weekOfYear;
   @Column(name="MONTH_OF_YEAR")
   protected String monthOfYear;
   @Column(name="YEAR_NUMBER")
   protected String yearNumber;
   @Column(name="QUARTER")
   protected String quarter;
   @Column(name="NAME_DAY")
   protected String nameDay;
   @Column(name="NAME_MONTH")
   protected String nameMonth;
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
  public DateDim() {
      super();
      this.baseEntityName = "DateDim";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("dateDimId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("dateDimId");this.allFieldsNames.add("dayOfMonth");this.allFieldsNames.add("weekOfYear");this.allFieldsNames.add("monthOfYear");this.allFieldsNames.add("yearNumber");this.allFieldsNames.add("quarter");this.allFieldsNames.add("nameDay");this.allFieldsNames.add("nameMonth");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public DateDim(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param dateDimId the dateDimId to set
     */
    public void setDateDimId(Long dateDimId) {
        this.dateDimId = dateDimId;
    }
    /**
     * Auto generated value setter.
     * @param dayOfMonth the dayOfMonth to set
     */
    public void setDayOfMonth(String dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }
    /**
     * Auto generated value setter.
     * @param weekOfYear the weekOfYear to set
     */
    public void setWeekOfYear(String weekOfYear) {
        this.weekOfYear = weekOfYear;
    }
    /**
     * Auto generated value setter.
     * @param monthOfYear the monthOfYear to set
     */
    public void setMonthOfYear(String monthOfYear) {
        this.monthOfYear = monthOfYear;
    }
    /**
     * Auto generated value setter.
     * @param yearNumber the yearNumber to set
     */
    public void setYearNumber(String yearNumber) {
        this.yearNumber = yearNumber;
    }
    /**
     * Auto generated value setter.
     * @param quarter the quarter to set
     */
    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }
    /**
     * Auto generated value setter.
     * @param nameDay the nameDay to set
     */
    public void setNameDay(String nameDay) {
        this.nameDay = nameDay;
    }
    /**
     * Auto generated value setter.
     * @param nameMonth the nameMonth to set
     */
    public void setNameMonth(String nameMonth) {
        this.nameMonth = nameMonth;
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
     * @return <code>Long</code>
     */
    public Long getDateDimId() {
        return this.dateDimId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDayOfMonth() {
        return this.dayOfMonth;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWeekOfYear() {
        return this.weekOfYear;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getMonthOfYear() {
        return this.monthOfYear;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getYearNumber() {
        return this.yearNumber;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getQuarter() {
        return this.quarter;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getNameDay() {
        return this.nameDay;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getNameMonth() {
        return this.nameMonth;
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
        setDateDimId((Long) mapValue.get("dateDimId"));
        setDayOfMonth((String) mapValue.get("dayOfMonth"));
        setWeekOfYear((String) mapValue.get("weekOfYear"));
        setMonthOfYear((String) mapValue.get("monthOfYear"));
        setYearNumber((String) mapValue.get("yearNumber"));
        setQuarter((String) mapValue.get("quarter"));
        setNameDay((String) mapValue.get("nameDay"));
        setNameMonth((String) mapValue.get("nameMonth"));
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
        mapValue.put("dateDimId", getDateDimId());
        mapValue.put("dayOfMonth", getDayOfMonth());
        mapValue.put("weekOfYear", getWeekOfYear());
        mapValue.put("monthOfYear", getMonthOfYear());
        mapValue.put("yearNumber", getYearNumber());
        mapValue.put("quarter", getQuarter());
        mapValue.put("nameDay", getNameDay());
        mapValue.put("nameMonth", getNameMonth());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
