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
 * Auto generated base entity ShipmentPackageRouteSeg.
 */
@javax.persistence.Entity
@Table(name="SHIPMENT_PACKAGE_ROUTE_SEG")
public class ShipmentPackageRouteSeg extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("shipmentId", "SHIPMENT_ID");
        fields.put("shipmentPackageSeqId", "SHIPMENT_PACKAGE_SEQ_ID");
        fields.put("shipmentRouteSegmentId", "SHIPMENT_ROUTE_SEGMENT_ID");
        fields.put("trackingCode", "TRACKING_CODE");
        fields.put("boxNumber", "BOX_NUMBER");
        fields.put("labelImage", "LABEL_IMAGE");
        fields.put("labelIntlSignImage", "LABEL_INTL_SIGN_IMAGE");
        fields.put("labelHtml", "LABEL_HTML");
        fields.put("labelPrinted", "LABEL_PRINTED");
        fields.put("packageTransportCost", "PACKAGE_TRANSPORT_COST");
        fields.put("packageServiceCost", "PACKAGE_SERVICE_COST");
        fields.put("packageOtherCost", "PACKAGE_OTHER_COST");
        fields.put("codAmount", "COD_AMOUNT");
        fields.put("insuredAmount", "INSURED_AMOUNT");
        fields.put("currencyUomId", "CURRENCY_UOM_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ShipmentPackageRouteSeg", fields);
}
  public static enum Fields implements EntityFieldInterface<ShipmentPackageRouteSeg> {
    shipmentId("shipmentId"),
    shipmentPackageSeqId("shipmentPackageSeqId"),
    shipmentRouteSegmentId("shipmentRouteSegmentId"),
    trackingCode("trackingCode"),
    boxNumber("boxNumber"),
    labelImage("labelImage"),
    labelIntlSignImage("labelIntlSignImage"),
    labelHtml("labelHtml"),
    labelPrinted("labelPrinted"),
    packageTransportCost("packageTransportCost"),
    packageServiceCost("packageServiceCost"),
    packageOtherCost("packageOtherCost"),
    codAmount("codAmount"),
    insuredAmount("insuredAmount"),
    currencyUomId("currencyUomId"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.ShipmentPackageRouteSegPkBridge.class)
     protected ShipmentPackageRouteSegPk id = new ShipmentPackageRouteSegPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>ShipmentPackageRouteSegPk</code>
     */
      public ShipmentPackageRouteSegPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>ShipmentPackageRouteSegPk</code> value to set
    */   
      public void setId(ShipmentPackageRouteSegPk id) {
         this.id = id;
      }
   @Column(name="TRACKING_CODE")
   protected String trackingCode;
   @Column(name="BOX_NUMBER")
   protected String boxNumber;
   @Column(name="LABEL_IMAGE")
   protected byte[] labelImage;
   @Column(name="LABEL_INTL_SIGN_IMAGE")
   protected byte[] labelIntlSignImage;
   @Column(name="LABEL_HTML")
   protected String labelHtml;
   @Column(name="LABEL_PRINTED")
   protected String labelPrinted;
   @Column(name="PACKAGE_TRANSPORT_COST")
   protected BigDecimal packageTransportCost;
   @Column(name="PACKAGE_SERVICE_COST")
   protected BigDecimal packageServiceCost;
   @Column(name="PACKAGE_OTHER_COST")
   protected BigDecimal packageOtherCost;
   @Column(name="COD_AMOUNT")
   protected BigDecimal codAmount;
   @Column(name="INSURED_AMOUNT")
   protected BigDecimal insuredAmount;
   @Column(name="CURRENCY_UOM_ID")
   protected String currencyUomId;
   @Column(name="LAST_UPDATED_STAMP")
   protected Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   protected Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   protected Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   protected Timestamp createdTxStamp;
   private transient ShipmentPackage shipmentPackage = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SHIPMENT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected Shipment shipment = null;
   private transient ShipmentRouteSegment shipmentRouteSegment = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CURRENCY_UOM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   protected Uom currencyUom = null;

  /**
   * Default constructor.
   */
  public ShipmentPackageRouteSeg() {
      super();
      this.baseEntityName = "ShipmentPackageRouteSeg";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("shipmentId");this.primaryKeyNames.add("shipmentPackageSeqId");this.primaryKeyNames.add("shipmentRouteSegmentId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("shipmentId");this.allFieldsNames.add("shipmentPackageSeqId");this.allFieldsNames.add("shipmentRouteSegmentId");this.allFieldsNames.add("trackingCode");this.allFieldsNames.add("boxNumber");this.allFieldsNames.add("labelImage");this.allFieldsNames.add("labelIntlSignImage");this.allFieldsNames.add("labelHtml");this.allFieldsNames.add("labelPrinted");this.allFieldsNames.add("packageTransportCost");this.allFieldsNames.add("packageServiceCost");this.allFieldsNames.add("packageOtherCost");this.allFieldsNames.add("codAmount");this.allFieldsNames.add("insuredAmount");this.allFieldsNames.add("currencyUomId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ShipmentPackageRouteSeg(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param shipmentId the shipmentId to set
     */
    public void setShipmentId(String shipmentId) {
        id.setShipmentId(shipmentId);
    }
    /**
     * Auto generated value setter.
     * @param shipmentPackageSeqId the shipmentPackageSeqId to set
     */
    public void setShipmentPackageSeqId(String shipmentPackageSeqId) {
        id.setShipmentPackageSeqId(shipmentPackageSeqId);
    }
    /**
     * Auto generated value setter.
     * @param shipmentRouteSegmentId the shipmentRouteSegmentId to set
     */
    public void setShipmentRouteSegmentId(String shipmentRouteSegmentId) {
        id.setShipmentRouteSegmentId(shipmentRouteSegmentId);
    }
    /**
     * Auto generated value setter.
     * @param trackingCode the trackingCode to set
     */
    public void setTrackingCode(String trackingCode) {
        this.trackingCode = trackingCode;
    }
    /**
     * Auto generated value setter.
     * @param boxNumber the boxNumber to set
     */
    public void setBoxNumber(String boxNumber) {
        this.boxNumber = boxNumber;
    }
    /**
     * Auto generated value setter.
     * @param labelImage the labelImage to set
     */
    public void setLabelImage(byte[] labelImage) {
        this.labelImage = labelImage;
    }
    /**
     * Auto generated value setter.
     * @param labelIntlSignImage the labelIntlSignImage to set
     */
    public void setLabelIntlSignImage(byte[] labelIntlSignImage) {
        this.labelIntlSignImage = labelIntlSignImage;
    }
    /**
     * Auto generated value setter.
     * @param labelHtml the labelHtml to set
     */
    public void setLabelHtml(String labelHtml) {
        this.labelHtml = labelHtml;
    }
    /**
     * Auto generated value setter.
     * @param labelPrinted the labelPrinted to set
     */
    public void setLabelPrinted(String labelPrinted) {
        this.labelPrinted = labelPrinted;
    }
    /**
     * Auto generated value setter.
     * @param packageTransportCost the packageTransportCost to set
     */
    public void setPackageTransportCost(BigDecimal packageTransportCost) {
        this.packageTransportCost = packageTransportCost;
    }
    /**
     * Auto generated value setter.
     * @param packageServiceCost the packageServiceCost to set
     */
    public void setPackageServiceCost(BigDecimal packageServiceCost) {
        this.packageServiceCost = packageServiceCost;
    }
    /**
     * Auto generated value setter.
     * @param packageOtherCost the packageOtherCost to set
     */
    public void setPackageOtherCost(BigDecimal packageOtherCost) {
        this.packageOtherCost = packageOtherCost;
    }
    /**
     * Auto generated value setter.
     * @param codAmount the codAmount to set
     */
    public void setCodAmount(BigDecimal codAmount) {
        this.codAmount = codAmount;
    }
    /**
     * Auto generated value setter.
     * @param insuredAmount the insuredAmount to set
     */
    public void setInsuredAmount(BigDecimal insuredAmount) {
        this.insuredAmount = insuredAmount;
    }
    /**
     * Auto generated value setter.
     * @param currencyUomId the currencyUomId to set
     */
    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
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
    public String getShipmentId() {
        return this.id.getShipmentId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShipmentPackageSeqId() {
        return this.id.getShipmentPackageSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShipmentRouteSegmentId() {
        return this.id.getShipmentRouteSegmentId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTrackingCode() {
        return this.trackingCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getBoxNumber() {
        return this.boxNumber;
    }
    /**
     * Auto generated value accessor.
     * @return <code>byte[]</code>
     */
    public byte[] getLabelImage() {
        return this.labelImage;
    }
    /**
     * Auto generated value accessor.
     * @return <code>byte[]</code>
     */
    public byte[] getLabelIntlSignImage() {
        return this.labelIntlSignImage;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLabelHtml() {
        return this.labelHtml;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLabelPrinted() {
        return this.labelPrinted;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getPackageTransportCost() {
        return this.packageTransportCost;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getPackageServiceCost() {
        return this.packageServiceCost;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getPackageOtherCost() {
        return this.packageOtherCost;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getCodAmount() {
        return this.codAmount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInsuredAmount() {
        return this.insuredAmount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCurrencyUomId() {
        return this.currencyUomId;
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
     * Auto generated method that gets the related <code>ShipmentPackage</code> by the relation named <code>ShipmentPackage</code>.
     * @return the <code>ShipmentPackage</code>
     * @throws RepositoryException if an error occurs
     */
    public ShipmentPackage getShipmentPackage() throws RepositoryException {
        if (this.shipmentPackage == null) {
            this.shipmentPackage = getRelatedOne(ShipmentPackage.class, "ShipmentPackage");
        }
        return this.shipmentPackage;
    }
    /**
     * Auto generated method that gets the related <code>Shipment</code> by the relation named <code>Shipment</code>.
     * @return the <code>Shipment</code>
     * @throws RepositoryException if an error occurs
     */
    public Shipment getShipment() throws RepositoryException {
        if (this.shipment == null) {
            this.shipment = getRelatedOne(Shipment.class, "Shipment");
        }
        return this.shipment;
    }
    /**
     * Auto generated method that gets the related <code>ShipmentRouteSegment</code> by the relation named <code>ShipmentRouteSegment</code>.
     * @return the <code>ShipmentRouteSegment</code>
     * @throws RepositoryException if an error occurs
     */
    public ShipmentRouteSegment getShipmentRouteSegment() throws RepositoryException {
        if (this.shipmentRouteSegment == null) {
            this.shipmentRouteSegment = getRelatedOne(ShipmentRouteSegment.class, "ShipmentRouteSegment");
        }
        return this.shipmentRouteSegment;
    }
    /**
     * Auto generated method that gets the related <code>Uom</code> by the relation named <code>CurrencyUom</code>.
     * @return the <code>Uom</code>
     * @throws RepositoryException if an error occurs
     */
    public Uom getCurrencyUom() throws RepositoryException {
        if (this.currencyUom == null) {
            this.currencyUom = getRelatedOne(Uom.class, "CurrencyUom");
        }
        return this.currencyUom;
    }

    /**
     * Auto generated value setter.
     * @param shipmentPackage the shipmentPackage to set
    */
    public void setShipmentPackage(ShipmentPackage shipmentPackage) {
        this.shipmentPackage = shipmentPackage;
    }
    /**
     * Auto generated value setter.
     * @param shipment the shipment to set
    */
    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }
    /**
     * Auto generated value setter.
     * @param shipmentRouteSegment the shipmentRouteSegment to set
    */
    public void setShipmentRouteSegment(ShipmentRouteSegment shipmentRouteSegment) {
        this.shipmentRouteSegment = shipmentRouteSegment;
    }
    /**
     * Auto generated value setter.
     * @param currencyUom the currencyUom to set
    */
    public void setCurrencyUom(Uom currencyUom) {
        this.currencyUom = currencyUom;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setShipmentId((String) mapValue.get("shipmentId"));
        setShipmentPackageSeqId((String) mapValue.get("shipmentPackageSeqId"));
        setShipmentRouteSegmentId((String) mapValue.get("shipmentRouteSegmentId"));
        setTrackingCode((String) mapValue.get("trackingCode"));
        setBoxNumber((String) mapValue.get("boxNumber"));
        setLabelImage((byte[]) mapValue.get("labelImage"));
        setLabelIntlSignImage((byte[]) mapValue.get("labelIntlSignImage"));
        setLabelHtml((String) mapValue.get("labelHtml"));
        setLabelPrinted((String) mapValue.get("labelPrinted"));
        setPackageTransportCost(convertToBigDecimal(mapValue.get("packageTransportCost")));
        setPackageServiceCost(convertToBigDecimal(mapValue.get("packageServiceCost")));
        setPackageOtherCost(convertToBigDecimal(mapValue.get("packageOtherCost")));
        setCodAmount(convertToBigDecimal(mapValue.get("codAmount")));
        setInsuredAmount(convertToBigDecimal(mapValue.get("insuredAmount")));
        setCurrencyUomId((String) mapValue.get("currencyUomId"));
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
        mapValue.put("shipmentId", getShipmentId());
        mapValue.put("shipmentPackageSeqId", getShipmentPackageSeqId());
        mapValue.put("shipmentRouteSegmentId", getShipmentRouteSegmentId());
        mapValue.put("trackingCode", getTrackingCode());
        mapValue.put("boxNumber", getBoxNumber());
        mapValue.put("labelImage", getLabelImage());
        mapValue.put("labelIntlSignImage", getLabelIntlSignImage());
        mapValue.put("labelHtml", getLabelHtml());
        mapValue.put("labelPrinted", getLabelPrinted());
        mapValue.put("packageTransportCost", getPackageTransportCost());
        mapValue.put("packageServiceCost", getPackageServiceCost());
        mapValue.put("packageOtherCost", getPackageOtherCost());
        mapValue.put("codAmount", getCodAmount());
        mapValue.put("insuredAmount", getInsuredAmount());
        mapValue.put("currencyUomId", getCurrencyUomId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
