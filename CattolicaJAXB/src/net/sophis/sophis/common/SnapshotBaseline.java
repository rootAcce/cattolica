//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.03 at 10:42:35 PM CEST 
//


package net.sophis.sophis.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Baseline used to snap market data. A baseline is represented by a date and a timestamp (time+timezon). Timestamp Id can also be provided.
 * 
 * <p>Java class for SnapshotBaseline complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SnapshotBaseline">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="snapshotDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="snapshotId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;element name="snapshotTimestamp" type="{http://sophis.net/sophis/common}SnapshotTimestamp"/>
 *         &lt;/choice>
 *         &lt;element name="saveInHistoTable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnapshotBaseline", propOrder = {
    "snapshotDate",
    "snapshotId",
    "snapshotTimestamp",
    "saveInHistoTable"
})
public class SnapshotBaseline {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar snapshotDate;
    protected Integer snapshotId;
    protected SnapshotTimestamp snapshotTimestamp;
    protected Boolean saveInHistoTable;

    /**
     * Gets the value of the snapshotDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSnapshotDate() {
        return snapshotDate;
    }

    /**
     * Sets the value of the snapshotDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSnapshotDate(XMLGregorianCalendar value) {
        this.snapshotDate = value;
    }

    /**
     * Gets the value of the snapshotId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSnapshotId() {
        return snapshotId;
    }

    /**
     * Sets the value of the snapshotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSnapshotId(Integer value) {
        this.snapshotId = value;
    }

    /**
     * Gets the value of the snapshotTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link SnapshotTimestamp }
     *     
     */
    public SnapshotTimestamp getSnapshotTimestamp() {
        return snapshotTimestamp;
    }

    /**
     * Sets the value of the snapshotTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnapshotTimestamp }
     *     
     */
    public void setSnapshotTimestamp(SnapshotTimestamp value) {
        this.snapshotTimestamp = value;
    }

    /**
     * Gets the value of the saveInHistoTable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaveInHistoTable() {
        return saveInHistoTable;
    }

    /**
     * Sets the value of the saveInHistoTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaveInHistoTable(Boolean value) {
        this.saveInHistoTable = value;
    }

}
