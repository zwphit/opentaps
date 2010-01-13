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
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity EmplPositionTypeClass.
 */
@javax.persistence.Entity
@Table(name="EMPL_POSITION_TYPE_CLASS")
public class EmplPositionTypeClass extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("emplPositionTypeId", "EMPL_POSITION_TYPE_ID");
        fields.put("emplPositionClassTypeId", "EMPL_POSITION_CLASS_TYPE_ID");
        fields.put("fromDate", "FROM_DATE");
        fields.put("thruDate", "THRU_DATE");
        fields.put("standardHoursPerWeek", "STANDARD_HOURS_PER_WEEK");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("EmplPositionTypeClass", fields);
}
  public static enum Fields implements EntityFieldInterface<EmplPositionTypeClass> {
    emplPositionTypeId("emplPositionTypeId"),
    emplPositionClassTypeId("emplPositionClassTypeId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    standardHoursPerWeek("standardHoursPerWeek"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.EmplPositionTypeClassPkBridge.class)
     protected EmplPositionTypeClassPk id = new EmplPositionTypeClassPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>EmplPositionTypeClassPk</code>
     */
      public EmplPositionTypeClassPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>EmplPositionTypeClassPk</code> value to set
    */   
      public void setId(EmplPositionTypeClassPk id) {
         this.id = id;
      }
   @Column(name="THRU_DATE")
   protected Timestamp thruDate;
   @Column(name="STANDARD_HOURS_PER_WEEK")
   protected BigDecimal standardHoursPerWeek;
   @Column(name="LAST_UPDATED_STAMP")
   protected Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   protected Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   protected Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   protected Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="EMPL_POSITION_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected EmplPositionType emplPositionType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="EMPL_POSITION_CLASS_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected EmplPositionClassType emplPositionClassType = null;

  /**
   * Default constructor.
   */
  public EmplPositionTypeClass() {
      super();
      this.baseEntityName = "EmplPositionTypeClass";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("emplPositionTypeId");this.primaryKeyNames.add("emplPositionClassTypeId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("emplPositionTypeId");this.allFieldsNames.add("emplPositionClassTypeId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("standardHoursPerWeek");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public EmplPositionTypeClass(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param emplPositionTypeId the emplPositionTypeId to set
     */
    public void setEmplPositionTypeId(String emplPositionTypeId) {
        id.setEmplPositionTypeId(emplPositionTypeId);
    }
    /**
     * Auto generated value setter.
     * @param emplPositionClassTypeId the emplPositionClassTypeId to set
     */
    public void setEmplPositionClassTypeId(String emplPositionClassTypeId) {
        id.setEmplPositionClassTypeId(emplPositionClassTypeId);
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
     * @param standardHoursPerWeek the standardHoursPerWeek to set
     */
    public void setStandardHoursPerWeek(BigDecimal standardHoursPerWeek) {
        this.standardHoursPerWeek = standardHoursPerWeek;
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
    public String getEmplPositionTypeId() {
        return this.id.getEmplPositionTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getEmplPositionClassTypeId() {
        return this.id.getEmplPositionClassTypeId();
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getStandardHoursPerWeek() {
        return this.standardHoursPerWeek;
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
     * Auto generated method that gets the related <code>EmplPositionType</code> by the relation named <code>EmplPositionType</code>.
     * @return the <code>EmplPositionType</code>
     * @throws RepositoryException if an error occurs
     */
    public EmplPositionType getEmplPositionType() throws RepositoryException {
        if (this.emplPositionType == null) {
            this.emplPositionType = getRelatedOne(EmplPositionType.class, "EmplPositionType");
        }
        return this.emplPositionType;
    }
    /**
     * Auto generated method that gets the related <code>EmplPositionClassType</code> by the relation named <code>EmplPositionClassType</code>.
     * @return the <code>EmplPositionClassType</code>
     * @throws RepositoryException if an error occurs
     */
    public EmplPositionClassType getEmplPositionClassType() throws RepositoryException {
        if (this.emplPositionClassType == null) {
            this.emplPositionClassType = getRelatedOne(EmplPositionClassType.class, "EmplPositionClassType");
        }
        return this.emplPositionClassType;
    }

    /**
     * Auto generated value setter.
     * @param emplPositionType the emplPositionType to set
    */
    public void setEmplPositionType(EmplPositionType emplPositionType) {
        this.emplPositionType = emplPositionType;
    }
    /**
     * Auto generated value setter.
     * @param emplPositionClassType the emplPositionClassType to set
    */
    public void setEmplPositionClassType(EmplPositionClassType emplPositionClassType) {
        this.emplPositionClassType = emplPositionClassType;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setEmplPositionTypeId((String) mapValue.get("emplPositionTypeId"));
        setEmplPositionClassTypeId((String) mapValue.get("emplPositionClassTypeId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setStandardHoursPerWeek(convertToBigDecimal(mapValue.get("standardHoursPerWeek")));
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
        mapValue.put("emplPositionTypeId", getEmplPositionTypeId());
        mapValue.put("emplPositionClassTypeId", getEmplPositionClassTypeId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("standardHoursPerWeek", getStandardHoursPerWeek());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
