//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.16 at 06:44:29 PM IST 
//

package org.icm.jaxb.util;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}hns1"/>
 *         &lt;element ref="{}hns2"/>
 *         &lt;element ref="{}hns3"/>
 *         &lt;element ref="{}hns4"/>
 *         &lt;element ref="{}hns5"/>
 *         &lt;element ref="{}hns6"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "hns1", "hns2", "hns3", "hns4", "hns5",
		"hns6" })
@XmlRootElement(name = "header")
public class Header {

	@XmlElement(required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "NCName")
	protected String hns1;
	@XmlElement(required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "NCName")
	protected String hns2;
	@XmlElement(required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "NCName")
	protected String hns3;
	@XmlElement(required = true)
	protected String hns4;
	@XmlElement(required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "NCName")
	protected String hns5;
	@XmlElement(required = true)
	protected String hns6;

	/**
	 * Gets the value of the hns1 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHns1() {
		return hns1;
	}

	/**
	 * Sets the value of the hns1 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHns1(String value) {
		this.hns1 = value;
	}

	/**
	 * Gets the value of the hns2 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHns2() {
		return hns2;
	}

	/**
	 * Sets the value of the hns2 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHns2(String value) {
		this.hns2 = value;
	}

	/**
	 * Gets the value of the hns3 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHns3() {
		return hns3;
	}

	/**
	 * Sets the value of the hns3 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHns3(String value) {
		this.hns3 = value;
	}

	/**
	 * Gets the value of the hns4 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHns4() {
		return hns4;
	}

	/**
	 * Sets the value of the hns4 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHns4(String value) {
		this.hns4 = value;
	}

	/**
	 * Gets the value of the hns5 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHns5() {
		return hns5;
	}

	/**
	 * Sets the value of the hns5 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHns5(String value) {
		this.hns5 = value;
	}

	/**
	 * Gets the value of the hns6 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHns6() {
		return hns6;
	}

	/**
	 * Sets the value of the hns6 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHns6(String value) {
		this.hns6 = value;
	}

}
