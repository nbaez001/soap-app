//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.10.27 a las 06:30:02 PM COT 
//


package com.empresa.proyecto.countries;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beer" type="{http://proyecto.empresa.com/beer}beer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "beer"
})
@XmlRootElement(name = "getBeerResponse")
public class GetBeerResponse {

    @XmlElement(required = true)
    protected Beer beer;

    /**
     * Obtiene el valor de la propiedad beer.
     * 
     * @return
     *     possible object is
     *     {@link Beer }
     *     
     */
    public Beer getBeer() {
        return beer;
    }

    /**
     * Define el valor de la propiedad beer.
     * 
     * @param value
     *     allowed object is
     *     {@link Beer }
     *     
     */
    public void setBeer(Beer value) {
        this.beer = value;
    }

}
