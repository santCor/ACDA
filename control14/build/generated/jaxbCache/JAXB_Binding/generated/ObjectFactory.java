//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.11.16 a las 06:48:56 PM CET 
//


package generated;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Liga }
     * 
     */
    public Liga createLiga() {
        return new Liga();
    }

    /**
     * Create an instance of {@link Liga.Partido }
     * 
     */
    public Liga.Partido createLigaPartido() {
        return new Liga.Partido();
    }

    /**
     * Create an instance of {@link Liga.Partido.Visitante }
     * 
     */
    public Liga.Partido.Visitante createLigaPartidoVisitante() {
        return new Liga.Partido.Visitante();
    }

    /**
     * Create an instance of {@link Liga.Partido.Local }
     * 
     */
    public Liga.Partido.Local createLigaPartidoLocal() {
        return new Liga.Partido.Local();
    }

}
