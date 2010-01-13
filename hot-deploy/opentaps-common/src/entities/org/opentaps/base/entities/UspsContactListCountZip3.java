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
 * Auto generated base entity UspsContactListCountZip3.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectUspsContactListCountZip3s", query="SELECT UCLS.CONTACT_LIST_ID AS \"contactListId\",UCLS.CONTACT_MECH_ID AS \"contactMechId\",UCLS.ZIP3 AS \"zip3\",UCLS.SORT_RESULT AS \"sortResult\",UCLS.PROCESSED_TIMESTAMP AS \"processedTimestamp\" FROM USPS_CONTACT_LIST_SORT UCLS", resultSetMapping="UspsContactListCountZip3Mapping")
@SqlResultSetMapping(name="UspsContactListCountZip3Mapping", entities={
@EntityResult(entityClass=UspsContactListCountZip3.class, fields = {
@FieldResult(name="contactListId", column="contactListId")
,@FieldResult(name="contactMechId", column="contactMechId")
,@FieldResult(name="zip3", column="zip3")
,@FieldResult(name="sortResult", column="sortResult")
,@FieldResult(name="processedTimestamp", column="processedTimestamp")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class UspsContactListCountZip3 extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("contactListId", "UCLS.CONTACT_LIST_ID");
        fields.put("contactMechId", "UCLS.CONTACT_MECH_ID");
        fields.put("zip3", "UCLS.ZIP3");
        fields.put("sortResult", "UCLS.SORT_RESULT");
        fields.put("processedTimestamp", "UCLS.PROCESSED_TIMESTAMP");
fieldMapColumns.put("UspsContactListCountZip3", fields);
}
  public static enum Fields implements EntityFieldInterface<UspsContactListCountZip3> {
    contactListId("contactListId"),
    contactMechId("contactMechId"),
    zip3("zip3"),
    sortResult("sortResult"),
    processedTimestamp("processedTimestamp");
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
   private String contactListId;
    
   private Long contactMechId;
    
   private String zip3;
    
   private String sortResult;
    
   private Timestamp processedTimestamp;

  /**
   * Default constructor.
   */
  public UspsContactListCountZip3() {
      super();
      this.baseEntityName = "UspsContactListCountZip3";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("contactListId");this.allFieldsNames.add("contactMechId");this.allFieldsNames.add("zip3");this.allFieldsNames.add("sortResult");this.allFieldsNames.add("processedTimestamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public UspsContactListCountZip3(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param contactListId the contactListId to set
     */
    public void setContactListId(String contactListId) {
        this.contactListId = contactListId;
    }
    /**
     * Auto generated value setter.
     * @param contactMechId the contactMechId to set
     */
    public void setContactMechId(Long contactMechId) {
        this.contactMechId = contactMechId;
    }
    /**
     * Auto generated value setter.
     * @param zip3 the zip3 to set
     */
    public void setZip3(String zip3) {
        this.zip3 = zip3;
    }
    /**
     * Auto generated value setter.
     * @param sortResult the sortResult to set
     */
    public void setSortResult(String sortResult) {
        this.sortResult = sortResult;
    }
    /**
     * Auto generated value setter.
     * @param processedTimestamp the processedTimestamp to set
     */
    public void setProcessedTimestamp(Timestamp processedTimestamp) {
        this.processedTimestamp = processedTimestamp;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContactListId() {
        return this.contactListId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getContactMechId() {
        return this.contactMechId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getZip3() {
        return this.zip3;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSortResult() {
        return this.sortResult;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getProcessedTimestamp() {
        return this.processedTimestamp;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setContactListId((String) mapValue.get("contactListId"));
        setContactMechId((Long) mapValue.get("contactMechId"));
        setZip3((String) mapValue.get("zip3"));
        setSortResult((String) mapValue.get("sortResult"));
        setProcessedTimestamp((Timestamp) mapValue.get("processedTimestamp"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("contactListId", getContactListId());
        mapValue.put("contactMechId", getContactMechId());
        mapValue.put("zip3", getZip3());
        mapValue.put("sortResult", getSortResult());
        mapValue.put("processedTimestamp", getProcessedTimestamp());
        return mapValue;
    }


}
