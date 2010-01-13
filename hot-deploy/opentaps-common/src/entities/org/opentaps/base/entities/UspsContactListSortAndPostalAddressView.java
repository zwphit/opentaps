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
 * Auto generated base entity UspsContactListSortAndPostalAddressView.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectUspsContactListSortAndPostalAddressViews", query="SELECT PA.ADDRESS1 AS \"address1\",PA.ADDRESS2 AS \"address2\",PA.TO_NAME AS \"toName\",PA.ATTN_NAME AS \"attnName\",PA.CITY AS \"city\",PA.POSTAL_CODE AS \"postalCode\",PA.STATE_PROVINCE_GEO_ID AS \"stateProvinceGeoId\",UCLS.USPS_CONTACT_LIST_SORT_ID AS \"uspsContactListSortId\",UCLS.CONTACT_LIST_ID AS \"contactListId\",UCLS.CONTACT_MECH_ID AS \"contactMechId\",UCLS.ZIP5 AS \"zip5\",UCLS.ZIP3 AS \"zip3\",UCLS.BMC_CODE AS \"bmcCode\",UCLS.SORT_RESULT AS \"sortResult\",UCLS.PROCESSED_TIMESTAMP AS \"processedTimestamp\" FROM USPS_CONTACT_LIST_SORT UCLS INNER JOIN POSTAL_ADDRESS PA ON PA.CONTACT_MECH_ID = UCLS.CONTACT_MECH_ID", resultSetMapping="UspsContactListSortAndPostalAddressViewMapping")
@SqlResultSetMapping(name="UspsContactListSortAndPostalAddressViewMapping", entities={
@EntityResult(entityClass=UspsContactListSortAndPostalAddressView.class, fields = {
@FieldResult(name="address1", column="address1")
,@FieldResult(name="address2", column="address2")
,@FieldResult(name="toName", column="toName")
,@FieldResult(name="attnName", column="attnName")
,@FieldResult(name="city", column="city")
,@FieldResult(name="postalCode", column="postalCode")
,@FieldResult(name="stateProvinceGeoId", column="stateProvinceGeoId")
,@FieldResult(name="uspsContactListSortId", column="uspsContactListSortId")
,@FieldResult(name="contactListId", column="contactListId")
,@FieldResult(name="contactMechId", column="contactMechId")
,@FieldResult(name="zip5", column="zip5")
,@FieldResult(name="zip3", column="zip3")
,@FieldResult(name="bmcCode", column="bmcCode")
,@FieldResult(name="sortResult", column="sortResult")
,@FieldResult(name="processedTimestamp", column="processedTimestamp")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class UspsContactListSortAndPostalAddressView extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("address1", "PA.ADDRESS1");
        fields.put("address2", "PA.ADDRESS2");
        fields.put("toName", "PA.TO_NAME");
        fields.put("attnName", "PA.ATTN_NAME");
        fields.put("city", "PA.CITY");
        fields.put("postalCode", "PA.POSTAL_CODE");
        fields.put("stateProvinceGeoId", "PA.STATE_PROVINCE_GEO_ID");
        fields.put("uspsContactListSortId", "UCLS.USPS_CONTACT_LIST_SORT_ID");
        fields.put("contactListId", "UCLS.CONTACT_LIST_ID");
        fields.put("contactMechId", "UCLS.CONTACT_MECH_ID");
        fields.put("zip5", "UCLS.ZIP5");
        fields.put("zip3", "UCLS.ZIP3");
        fields.put("bmcCode", "UCLS.BMC_CODE");
        fields.put("sortResult", "UCLS.SORT_RESULT");
        fields.put("processedTimestamp", "UCLS.PROCESSED_TIMESTAMP");
fieldMapColumns.put("UspsContactListSortAndPostalAddressView", fields);
}
  public static enum Fields implements EntityFieldInterface<UspsContactListSortAndPostalAddressView> {
    address1("address1"),
    address2("address2"),
    toName("toName"),
    attnName("attnName"),
    city("city"),
    postalCode("postalCode"),
    stateProvinceGeoId("stateProvinceGeoId"),
    uspsContactListSortId("uspsContactListSortId"),
    contactListId("contactListId"),
    contactMechId("contactMechId"),
    zip5("zip5"),
    zip3("zip3"),
    bmcCode("bmcCode"),
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

    
   private String address1;
    
   private String address2;
    
   private String toName;
    
   private String attnName;
    
   private String city;
    
   private String postalCode;
    
   private String stateProvinceGeoId;
    @Id
   private String uspsContactListSortId;
    
   private String contactListId;
    
   private String contactMechId;
    
   private String zip5;
    
   private String zip3;
    
   private String bmcCode;
    
   private String sortResult;
    
   private Timestamp processedTimestamp;

  /**
   * Default constructor.
   */
  public UspsContactListSortAndPostalAddressView() {
      super();
      this.baseEntityName = "UspsContactListSortAndPostalAddressView";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("uspsContactListSortId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("address1");this.allFieldsNames.add("address2");this.allFieldsNames.add("toName");this.allFieldsNames.add("attnName");this.allFieldsNames.add("city");this.allFieldsNames.add("postalCode");this.allFieldsNames.add("stateProvinceGeoId");this.allFieldsNames.add("uspsContactListSortId");this.allFieldsNames.add("contactListId");this.allFieldsNames.add("contactMechId");this.allFieldsNames.add("zip5");this.allFieldsNames.add("zip3");this.allFieldsNames.add("bmcCode");this.allFieldsNames.add("sortResult");this.allFieldsNames.add("processedTimestamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public UspsContactListSortAndPostalAddressView(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param address1 the address1 to set
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }
    /**
     * Auto generated value setter.
     * @param address2 the address2 to set
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }
    /**
     * Auto generated value setter.
     * @param toName the toName to set
     */
    public void setToName(String toName) {
        this.toName = toName;
    }
    /**
     * Auto generated value setter.
     * @param attnName the attnName to set
     */
    public void setAttnName(String attnName) {
        this.attnName = attnName;
    }
    /**
     * Auto generated value setter.
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }
    /**
     * Auto generated value setter.
     * @param postalCode the postalCode to set
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    /**
     * Auto generated value setter.
     * @param stateProvinceGeoId the stateProvinceGeoId to set
     */
    public void setStateProvinceGeoId(String stateProvinceGeoId) {
        this.stateProvinceGeoId = stateProvinceGeoId;
    }
    /**
     * Auto generated value setter.
     * @param uspsContactListSortId the uspsContactListSortId to set
     */
    public void setUspsContactListSortId(String uspsContactListSortId) {
        this.uspsContactListSortId = uspsContactListSortId;
    }
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
    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }
    /**
     * Auto generated value setter.
     * @param zip5 the zip5 to set
     */
    public void setZip5(String zip5) {
        this.zip5 = zip5;
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
     * @param bmcCode the bmcCode to set
     */
    public void setBmcCode(String bmcCode) {
        this.bmcCode = bmcCode;
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
    public String getAddress1() {
        return this.address1;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAddress2() {
        return this.address2;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getToName() {
        return this.toName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAttnName() {
        return this.attnName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCity() {
        return this.city;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPostalCode() {
        return this.postalCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStateProvinceGeoId() {
        return this.stateProvinceGeoId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getUspsContactListSortId() {
        return this.uspsContactListSortId;
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
     * @return <code>String</code>
     */
    public String getContactMechId() {
        return this.contactMechId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getZip5() {
        return this.zip5;
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
    public String getBmcCode() {
        return this.bmcCode;
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
        setAddress1((String) mapValue.get("address1"));
        setAddress2((String) mapValue.get("address2"));
        setToName((String) mapValue.get("toName"));
        setAttnName((String) mapValue.get("attnName"));
        setCity((String) mapValue.get("city"));
        setPostalCode((String) mapValue.get("postalCode"));
        setStateProvinceGeoId((String) mapValue.get("stateProvinceGeoId"));
        setUspsContactListSortId((String) mapValue.get("uspsContactListSortId"));
        setContactListId((String) mapValue.get("contactListId"));
        setContactMechId((String) mapValue.get("contactMechId"));
        setZip5((String) mapValue.get("zip5"));
        setZip3((String) mapValue.get("zip3"));
        setBmcCode((String) mapValue.get("bmcCode"));
        setSortResult((String) mapValue.get("sortResult"));
        setProcessedTimestamp((Timestamp) mapValue.get("processedTimestamp"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("address1", getAddress1());
        mapValue.put("address2", getAddress2());
        mapValue.put("toName", getToName());
        mapValue.put("attnName", getAttnName());
        mapValue.put("city", getCity());
        mapValue.put("postalCode", getPostalCode());
        mapValue.put("stateProvinceGeoId", getStateProvinceGeoId());
        mapValue.put("uspsContactListSortId", getUspsContactListSortId());
        mapValue.put("contactListId", getContactListId());
        mapValue.put("contactMechId", getContactMechId());
        mapValue.put("zip5", getZip5());
        mapValue.put("zip3", getZip3());
        mapValue.put("bmcCode", getBmcCode());
        mapValue.put("sortResult", getSortResult());
        mapValue.put("processedTimestamp", getProcessedTimestamp());
        return mapValue;
    }


}
