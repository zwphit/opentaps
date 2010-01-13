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
 * Auto generated base entity PortalPortlet.
 */
@javax.persistence.Entity
@Table(name="PORTAL_PORTLET")
public class PortalPortlet extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("portalPortletId", "PORTAL_PORTLET_ID");
        fields.put("portletName", "PORTLET_NAME");
        fields.put("screenName", "SCREEN_NAME");
        fields.put("screenLocation", "SCREEN_LOCATION");
        fields.put("editFormName", "EDIT_FORM_NAME");
        fields.put("editFormLocation", "EDIT_FORM_LOCATION");
        fields.put("description", "DESCRIPTION");
        fields.put("screenshot", "SCREENSHOT");
        fields.put("securityServiceName", "SECURITY_SERVICE_NAME");
        fields.put("securityMainAction", "SECURITY_MAIN_ACTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("PortalPortlet", fields);
}
  public static enum Fields implements EntityFieldInterface<PortalPortlet> {
    portalPortletId("portalPortletId"),
    portletName("portletName"),
    screenName("screenName"),
    screenLocation("screenLocation"),
    editFormName("editFormName"),
    editFormLocation("editFormLocation"),
    description("description"),
    screenshot("screenshot"),
    securityServiceName("securityServiceName"),
    securityMainAction("securityMainAction"),
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

   @org.hibernate.annotations.GenericGenerator(name="PortalPortlet_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="PortalPortlet_GEN")
   @Id
   @Column(name="PORTAL_PORTLET_ID")
   protected String portalPortletId;
   @Column(name="PORTLET_NAME")
   protected String portletName;
   @Column(name="SCREEN_NAME")
   protected String screenName;
   @Column(name="SCREEN_LOCATION")
   protected String screenLocation;
   @Column(name="EDIT_FORM_NAME")
   protected String editFormName;
   @Column(name="EDIT_FORM_LOCATION")
   protected String editFormLocation;
   @Column(name="DESCRIPTION")
   protected String description;
   @Column(name="SCREENSHOT")
   protected String screenshot;
   @Column(name="SECURITY_SERVICE_NAME")
   protected String securityServiceName;
   @Column(name="SECURITY_MAIN_ACTION")
   protected String securityMainAction;
   @Column(name="LAST_UPDATED_STAMP")
   protected Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   protected Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   protected Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   protected Timestamp createdTxStamp;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="portalPortlet", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PORTAL_PORTLET_ID")
   
   protected List<PortalPagePortlet> portalPagePortlets = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="portalPortlet", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PORTAL_PORTLET_ID")
   
   protected List<PortletAttribute> portletAttributes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="portalPortlet", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PORTAL_PORTLET_ID")
   
   protected List<PortletPortletCategory> portletPortletCategorys = null;

  /**
   * Default constructor.
   */
  public PortalPortlet() {
      super();
      this.baseEntityName = "PortalPortlet";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("portalPortletId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("portalPortletId");this.allFieldsNames.add("portletName");this.allFieldsNames.add("screenName");this.allFieldsNames.add("screenLocation");this.allFieldsNames.add("editFormName");this.allFieldsNames.add("editFormLocation");this.allFieldsNames.add("description");this.allFieldsNames.add("screenshot");this.allFieldsNames.add("securityServiceName");this.allFieldsNames.add("securityMainAction");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PortalPortlet(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param portalPortletId the portalPortletId to set
     */
    public void setPortalPortletId(String portalPortletId) {
        this.portalPortletId = portalPortletId;
    }
    /**
     * Auto generated value setter.
     * @param portletName the portletName to set
     */
    public void setPortletName(String portletName) {
        this.portletName = portletName;
    }
    /**
     * Auto generated value setter.
     * @param screenName the screenName to set
     */
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }
    /**
     * Auto generated value setter.
     * @param screenLocation the screenLocation to set
     */
    public void setScreenLocation(String screenLocation) {
        this.screenLocation = screenLocation;
    }
    /**
     * Auto generated value setter.
     * @param editFormName the editFormName to set
     */
    public void setEditFormName(String editFormName) {
        this.editFormName = editFormName;
    }
    /**
     * Auto generated value setter.
     * @param editFormLocation the editFormLocation to set
     */
    public void setEditFormLocation(String editFormLocation) {
        this.editFormLocation = editFormLocation;
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
     * @param screenshot the screenshot to set
     */
    public void setScreenshot(String screenshot) {
        this.screenshot = screenshot;
    }
    /**
     * Auto generated value setter.
     * @param securityServiceName the securityServiceName to set
     */
    public void setSecurityServiceName(String securityServiceName) {
        this.securityServiceName = securityServiceName;
    }
    /**
     * Auto generated value setter.
     * @param securityMainAction the securityMainAction to set
     */
    public void setSecurityMainAction(String securityMainAction) {
        this.securityMainAction = securityMainAction;
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
    public String getPortalPortletId() {
        return this.portalPortletId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPortletName() {
        return this.portletName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getScreenName() {
        return this.screenName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getScreenLocation() {
        return this.screenLocation;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getEditFormName() {
        return this.editFormName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getEditFormLocation() {
        return this.editFormLocation;
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
    public String getScreenshot() {
        return this.screenshot;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSecurityServiceName() {
        return this.securityServiceName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSecurityMainAction() {
        return this.securityMainAction;
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
     * Auto generated method that gets the related <code>PortalPagePortlet</code> by the relation named <code>PortalPagePortlet</code>.
     * @return the list of <code>PortalPagePortlet</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PortalPagePortlet> getPortalPagePortlets() throws RepositoryException {
        if (this.portalPagePortlets == null) {
            this.portalPagePortlets = getRelated(PortalPagePortlet.class, "PortalPagePortlet");
        }
        return this.portalPagePortlets;
    }
    /**
     * Auto generated method that gets the related <code>PortletAttribute</code> by the relation named <code>PortletAttribute</code>.
     * @return the list of <code>PortletAttribute</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PortletAttribute> getPortletAttributes() throws RepositoryException {
        if (this.portletAttributes == null) {
            this.portletAttributes = getRelated(PortletAttribute.class, "PortletAttribute");
        }
        return this.portletAttributes;
    }
    /**
     * Auto generated method that gets the related <code>PortletPortletCategory</code> by the relation named <code>PortletPortletCategory</code>.
     * @return the list of <code>PortletPortletCategory</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PortletPortletCategory> getPortletPortletCategorys() throws RepositoryException {
        if (this.portletPortletCategorys == null) {
            this.portletPortletCategorys = getRelated(PortletPortletCategory.class, "PortletPortletCategory");
        }
        return this.portletPortletCategorys;
    }

    /**
     * Auto generated value setter.
     * @param portalPagePortlets the portalPagePortlets to set
    */
    public void setPortalPagePortlets(List<PortalPagePortlet> portalPagePortlets) {
        this.portalPagePortlets = portalPagePortlets;
    }
    /**
     * Auto generated value setter.
     * @param portletAttributes the portletAttributes to set
    */
    public void setPortletAttributes(List<PortletAttribute> portletAttributes) {
        this.portletAttributes = portletAttributes;
    }
    /**
     * Auto generated value setter.
     * @param portletPortletCategorys the portletPortletCategorys to set
    */
    public void setPortletPortletCategorys(List<PortletPortletCategory> portletPortletCategorys) {
        this.portletPortletCategorys = portletPortletCategorys;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addPortalPagePortlet(PortalPagePortlet portalPagePortlet) {
        if (this.portalPagePortlets == null) {
            this.portalPagePortlets = new ArrayList<PortalPagePortlet>();
        }
        this.portalPagePortlets.add(portalPagePortlet);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removePortalPagePortlet(PortalPagePortlet portalPagePortlet) {
        if (this.portalPagePortlets == null) {
            return;
        }
        this.portalPagePortlets.remove(portalPagePortlet);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearPortalPagePortlet() {
        if (this.portalPagePortlets == null) {
            return;
        }
        this.portalPagePortlets.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addPortletAttribute(PortletAttribute portletAttribute) {
        if (this.portletAttributes == null) {
            this.portletAttributes = new ArrayList<PortletAttribute>();
        }
        this.portletAttributes.add(portletAttribute);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removePortletAttribute(PortletAttribute portletAttribute) {
        if (this.portletAttributes == null) {
            return;
        }
        this.portletAttributes.remove(portletAttribute);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearPortletAttribute() {
        if (this.portletAttributes == null) {
            return;
        }
        this.portletAttributes.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addPortletPortletCategory(PortletPortletCategory portletPortletCategory) {
        if (this.portletPortletCategorys == null) {
            this.portletPortletCategorys = new ArrayList<PortletPortletCategory>();
        }
        this.portletPortletCategorys.add(portletPortletCategory);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removePortletPortletCategory(PortletPortletCategory portletPortletCategory) {
        if (this.portletPortletCategorys == null) {
            return;
        }
        this.portletPortletCategorys.remove(portletPortletCategory);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearPortletPortletCategory() {
        if (this.portletPortletCategorys == null) {
            return;
        }
        this.portletPortletCategorys.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPortalPortletId((String) mapValue.get("portalPortletId"));
        setPortletName((String) mapValue.get("portletName"));
        setScreenName((String) mapValue.get("screenName"));
        setScreenLocation((String) mapValue.get("screenLocation"));
        setEditFormName((String) mapValue.get("editFormName"));
        setEditFormLocation((String) mapValue.get("editFormLocation"));
        setDescription((String) mapValue.get("description"));
        setScreenshot((String) mapValue.get("screenshot"));
        setSecurityServiceName((String) mapValue.get("securityServiceName"));
        setSecurityMainAction((String) mapValue.get("securityMainAction"));
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
        mapValue.put("portalPortletId", getPortalPortletId());
        mapValue.put("portletName", getPortletName());
        mapValue.put("screenName", getScreenName());
        mapValue.put("screenLocation", getScreenLocation());
        mapValue.put("editFormName", getEditFormName());
        mapValue.put("editFormLocation", getEditFormLocation());
        mapValue.put("description", getDescription());
        mapValue.put("screenshot", getScreenshot());
        mapValue.put("securityServiceName", getSecurityServiceName());
        mapValue.put("securityMainAction", getSecurityMainAction());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
