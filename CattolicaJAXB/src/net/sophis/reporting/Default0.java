//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.03 at 10:42:35 PM CEST 
//


package net.sophis.reporting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Default0 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Default0">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="tradeSourceSettings" type="{http://www.sophis.net/reporting}TradeSourceSettings" minOccurs="0"/>
 *         &lt;element name="header" type="{http://www.sophis.net/reporting}Header" minOccurs="0"/>
 *         &lt;element name="result" type="{http://www.sophis.net/reporting}Result" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Default0", propOrder = {

})
public class Default0 {

    protected TradeSourceSettings tradeSourceSettings;
    protected Header header;
    protected Result result;
    @XmlAttribute(name = "type", namespace = "http://www.sophis.net/reporting")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String type;

    /**
     * Gets the value of the tradeSourceSettings property.
     * 
     * @return
     *     possible object is
     *     {@link TradeSourceSettings }
     *     
     */
    public TradeSourceSettings getTradeSourceSettings() {
        return tradeSourceSettings;
    }

    /**
     * Sets the value of the tradeSourceSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeSourceSettings }
     *     
     */
    public void setTradeSourceSettings(TradeSourceSettings value) {
        this.tradeSourceSettings = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Header }
     *     
     */
    public Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header }
     *     
     */
    public void setHeader(Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setResult(Result value) {
        this.result = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}