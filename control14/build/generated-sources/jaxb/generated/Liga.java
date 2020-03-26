//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.11.16 a las 06:48:56 PM CET 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partido" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="visitante">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="nome" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="puntos" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="local">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="nome" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="puntos" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="data" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "partido"
})
@XmlRootElement(name = "liga")
public class Liga {

    protected List<Liga.Partido> partido;

    /**
     * Gets the value of the partido property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partido property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartido().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Liga.Partido }
     * 
     * 
     */
    public List<Liga.Partido> getPartido() {
        if (partido == null) {
            partido = new ArrayList<Liga.Partido>();
        }
        return this.partido;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="visitante">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="nome" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="puntos" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="local">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="nome" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="puntos" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="data" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "visitante",
        "local"
    })
    public static class Partido {

        @XmlElement(required = true)
        protected Liga.Partido.Visitante visitante;
        @XmlElement(required = true)
        protected Liga.Partido.Local local;
        @XmlAttribute(name = "data")
        protected String data;

        /**
         * Obtiene el valor de la propiedad visitante.
         * 
         * @return
         *     possible object is
         *     {@link Liga.Partido.Visitante }
         *     
         */
        public Liga.Partido.Visitante getVisitante() {
            return visitante;
        }

        /**
         * Define el valor de la propiedad visitante.
         * 
         * @param value
         *     allowed object is
         *     {@link Liga.Partido.Visitante }
         *     
         */
        public void setVisitante(Liga.Partido.Visitante value) {
            this.visitante = value;
        }

        /**
         * Obtiene el valor de la propiedad local.
         * 
         * @return
         *     possible object is
         *     {@link Liga.Partido.Local }
         *     
         */
        public Liga.Partido.Local getLocal() {
            return local;
        }

        /**
         * Define el valor de la propiedad local.
         * 
         * @param value
         *     allowed object is
         *     {@link Liga.Partido.Local }
         *     
         */
        public void setLocal(Liga.Partido.Local value) {
            this.local = value;
        }

        /**
         * Obtiene el valor de la propiedad data.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getData() {
            return data;
        }

        /**
         * Define el valor de la propiedad data.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setData(String value) {
            this.data = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="nome" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="puntos" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Local {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "nome")
            protected String nome;
            @XmlAttribute(name = "puntos")
            protected String puntos;

            /**
             * Obtiene el valor de la propiedad value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Define el valor de la propiedad value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Obtiene el valor de la propiedad nome.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNome() {
                return nome;
            }

            /**
             * Define el valor de la propiedad nome.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNome(String value) {
                this.nome = value;
            }

            /**
             * Obtiene el valor de la propiedad puntos.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPuntos() {
                return puntos;
            }

            /**
             * Define el valor de la propiedad puntos.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPuntos(String value) {
                this.puntos = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="nome" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="puntos" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Visitante {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "nome")
            protected String nome;
            @XmlAttribute(name = "puntos")
            protected String puntos;

            /**
             * Obtiene el valor de la propiedad value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Define el valor de la propiedad value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Obtiene el valor de la propiedad nome.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNome() {
                return nome;
            }

            /**
             * Define el valor de la propiedad nome.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNome(String value) {
                this.nome = value;
            }

            /**
             * Obtiene el valor de la propiedad puntos.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPuntos() {
                return puntos;
            }

            /**
             * Define el valor de la propiedad puntos.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPuntos(String value) {
                this.puntos = value;
            }

        }

    }

}
