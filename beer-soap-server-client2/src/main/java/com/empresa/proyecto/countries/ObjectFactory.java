//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.10.27 a las 06:30:02 PM COT 
//


package com.empresa.proyecto.countries;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.empresa.proyecto.countries package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.empresa.proyecto.countries
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBeerRequest }
     * 
     */
    public GetBeerRequest createGetBeerRequest() {
        return new GetBeerRequest();
    }

    /**
     * Create an instance of {@link GetBeerResponse }
     * 
     */
    public GetBeerResponse createGetBeerResponse() {
        return new GetBeerResponse();
    }

    /**
     * Create an instance of {@link Beer }
     * 
     */
    public Beer createBeer() {
        return new Beer();
    }

}
