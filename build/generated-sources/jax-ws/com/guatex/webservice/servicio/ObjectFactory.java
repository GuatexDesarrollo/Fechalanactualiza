
package com.guatex.webservice.servicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.guatex.webservice.servicio package. 
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

    private final static QName _VerificarConexion_QNAME = new QName("http://actualifecha.guatex.com/", "verificarConexion");
    private final static QName _VerificarConexionResponse_QNAME = new QName("http://actualifecha.guatex.com/", "verificarConexionResponse");
    private final static QName _Hello_QNAME = new QName("http://actualifecha.guatex.com/", "hello");
    private final static QName _ConsultadatosResponse_QNAME = new QName("http://actualifecha.guatex.com/", "consultadatosResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://actualifecha.guatex.com/", "helloResponse");
    private final static QName _Consultadatos_QNAME = new QName("http://actualifecha.guatex.com/", "consultadatos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.guatex.webservice.servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Consultadatos }
     * 
     */
    public Consultadatos createConsultadatos() {
        return new Consultadatos();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link VerificarConexion }
     * 
     */
    public VerificarConexion createVerificarConexion() {
        return new VerificarConexion();
    }

    /**
     * Create an instance of {@link VerificarConexionResponse }
     * 
     */
    public VerificarConexionResponse createVerificarConexionResponse() {
        return new VerificarConexionResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link ConsultadatosResponse }
     * 
     */
    public ConsultadatosResponse createConsultadatosResponse() {
        return new ConsultadatosResponse();
    }

    /**
     * Create an instance of {@link Fechs }
     * 
     */
    public Fechs createFechs() {
        return new Fechs();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarConexion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://actualifecha.guatex.com/", name = "verificarConexion")
    public JAXBElement<VerificarConexion> createVerificarConexion(VerificarConexion value) {
        return new JAXBElement<VerificarConexion>(_VerificarConexion_QNAME, VerificarConexion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarConexionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://actualifecha.guatex.com/", name = "verificarConexionResponse")
    public JAXBElement<VerificarConexionResponse> createVerificarConexionResponse(VerificarConexionResponse value) {
        return new JAXBElement<VerificarConexionResponse>(_VerificarConexionResponse_QNAME, VerificarConexionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://actualifecha.guatex.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultadatosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://actualifecha.guatex.com/", name = "consultadatosResponse")
    public JAXBElement<ConsultadatosResponse> createConsultadatosResponse(ConsultadatosResponse value) {
        return new JAXBElement<ConsultadatosResponse>(_ConsultadatosResponse_QNAME, ConsultadatosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://actualifecha.guatex.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Consultadatos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://actualifecha.guatex.com/", name = "consultadatos")
    public JAXBElement<Consultadatos> createConsultadatos(Consultadatos value) {
        return new JAXBElement<Consultadatos>(_Consultadatos_QNAME, Consultadatos.class, null, value);
    }

}
