//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.03 at 10:42:35 PM CEST 
//


package net.sophis.sophis.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessDayConventionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessDayConventionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="PRECEDING"/>
 *     &lt;enumeration value="FOLLOWING"/>
 *     &lt;enumeration value="MODFOLLOWING"/>
 *     &lt;enumeration value="MODPRECEDING"/>
 *     &lt;enumeration value="FRN"/>
 *     &lt;enumeration value="NotApplicable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BusinessDayConventionEnum")
@XmlEnum
public enum BusinessDayConventionEnum {


    /**
     * The date will not be adjusted if it falls on a day that is
     * 					not a business day.
     * 
     */
    NONE("NONE"),

    /**
     * The non-business day will be adjusted to the first preceding
     * 					day that is a business day.
     * 
     */
    PRECEDING("PRECEDING"),

    /**
     * The non-business date will be adjusted to the first following
     * 					day that is a business day.
     * 
     */
    FOLLOWING("FOLLOWING"),

    /**
     * The non-business date will be adjusted to the first following
     * 					day that is a business day unless that day falls in the next
     * 					calendar month, in which case that date will be the first
     * 					preceding day that is a business day.
     * 
     */
    MODFOLLOWING("MODFOLLOWING"),

    /**
     * The non-business date will be adjusted to the first preceding
     * 					day that is a business day unless that day falls in the
     * 					previous calendar month, in which case that date will be the
     * 					first following day that us a business day.
     * 
     */
    MODPRECEDING("MODPRECEDING"),

    /**
     * Per 2000 ISDA Definitions, Section 4.11. FRN Convention;
     * 					Eurodollar Convention.
     * 
     */
    FRN("FRN"),

    /**
     * The date adjustments conventions are defined elsewhere, so it
     * 					is not required to specify them here.
     * 
     */
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable");
    private final String value;

    BusinessDayConventionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusinessDayConventionEnum fromValue(String v) {
        for (BusinessDayConventionEnum c: BusinessDayConventionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
