//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.03 at 10:42:35 PM CEST 
//


package net.sophis.reporting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for TradeSourceInstrumentSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeSourceInstrumentSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="instrumentCriterium" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="instrumentCriteriumValue" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="alsoWhenUnderlying" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeSourceInstrumentSettings", propOrder = {

})
public class TradeSourceInstrumentSettings {

    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String instrumentCriterium;
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String instrumentCriteriumValue;
    protected Boolean alsoWhenUnderlying;

    /**
     * Gets the value of the instrumentCriterium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrumentCriterium() {
        return instrumentCriterium;
    }

    /**
     * Sets the value of the instrumentCriterium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrumentCriterium(String value) {
        this.instrumentCriterium = value;
    }

    /**
     * Gets the value of the instrumentCriteriumValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrumentCriteriumValue() {
        return instrumentCriteriumValue;
    }

    /**
     * Sets the value of the instrumentCriteriumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrumentCriteriumValue(String value) {
        this.instrumentCriteriumValue = value;
    }

    /**
     * Gets the value of the alsoWhenUnderlying property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlsoWhenUnderlying() {
        return alsoWhenUnderlying;
    }

    /**
     * Sets the value of the alsoWhenUnderlying property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlsoWhenUnderlying(Boolean value) {
        this.alsoWhenUnderlying = value;
    }

}