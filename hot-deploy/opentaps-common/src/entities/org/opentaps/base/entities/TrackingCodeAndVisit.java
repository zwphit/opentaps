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
 * Auto generated base entity TrackingCodeAndVisit.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectTrackingCodeAndVisits", query="SELECT TC.TRACKING_CODE_ID AS \"trackingCodeId\",TCV.VISIT_ID AS \"visitId\",TCV.FROM_DATE AS \"fromDate\" FROM TRACKING_CODE TC LEFT JOIN TRACKING_CODE_VISIT TCV ON TC.TRACKING_CODE_ID = TCV.TRACKING_CODE_ID", resultSetMapping="TrackingCodeAndVisitMapping")
@SqlResultSetMapping(name="TrackingCodeAndVisitMapping", entities={
@EntityResult(entityClass=TrackingCodeAndVisit.class, fields = {
@FieldResult(name="trackingCodeId", column="trackingCodeId")
,@FieldResult(name="visitId", column="visitId")
,@FieldResult(name="fromDate", column="fromDate")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class TrackingCodeAndVisit extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("trackingCodeId", "TC.TRACKING_CODE_ID");
        fields.put("visitId", "TCV.VISIT_ID");
        fields.put("fromDate", "TCV.FROM_DATE");
fieldMapColumns.put("TrackingCodeAndVisit", fields);
}
  public static enum Fields implements EntityFieldInterface<TrackingCodeAndVisit> {
    trackingCodeId("trackingCodeId"),
    visitId("visitId"),
    fromDate("fromDate");
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
   private String trackingCodeId;
    
   private Long visitId;
    
   private Timestamp fromDate;

  /**
   * Default constructor.
   */
  public TrackingCodeAndVisit() {
      super();
      this.baseEntityName = "TrackingCodeAndVisit";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("trackingCodeId");this.primaryKeyNames.add("visitId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("trackingCodeId");this.allFieldsNames.add("visitId");this.allFieldsNames.add("fromDate");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public TrackingCodeAndVisit(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param trackingCodeId the trackingCodeId to set
     */
    public void setTrackingCodeId(String trackingCodeId) {
        this.trackingCodeId = trackingCodeId;
    }
    /**
     * Auto generated value setter.
     * @param visitId the visitId to set
     */
    public void setVisitId(Long visitId) {
        this.visitId = visitId;
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTrackingCodeId() {
        return this.trackingCodeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getVisitId() {
        return this.visitId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.fromDate;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setTrackingCodeId((String) mapValue.get("trackingCodeId"));
        setVisitId((Long) mapValue.get("visitId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("trackingCodeId", getTrackingCodeId());
        mapValue.put("visitId", getVisitId());
        mapValue.put("fromDate", getFromDate());
        return mapValue;
    }


}
