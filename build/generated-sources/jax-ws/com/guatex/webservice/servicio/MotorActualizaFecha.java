
package com.guatex.webservice.servicio;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MotorActualizaFecha", targetNamespace = "http://actualifecha.guatex.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MotorActualizaFecha {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://actualifecha.guatex.com/", className = "com.guatex.webservice.servicio.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://actualifecha.guatex.com/", className = "com.guatex.webservice.servicio.HelloResponse")
    @Action(input = "http://actualifecha.guatex.com/MotorActualizaFecha/helloRequest", output = "http://actualifecha.guatex.com/MotorActualizaFecha/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @return
     *     returns com.guatex.webservice.servicio.Fechs
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultadatos", targetNamespace = "http://actualifecha.guatex.com/", className = "com.guatex.webservice.servicio.Consultadatos")
    @ResponseWrapper(localName = "consultadatosResponse", targetNamespace = "http://actualifecha.guatex.com/", className = "com.guatex.webservice.servicio.ConsultadatosResponse")
    @Action(input = "http://actualifecha.guatex.com/MotorActualizaFecha/consultadatosRequest", output = "http://actualifecha.guatex.com/MotorActualizaFecha/consultadatosResponse")
    public Fechs consultadatos();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "verificarConexion", targetNamespace = "http://actualifecha.guatex.com/", className = "com.guatex.webservice.servicio.VerificarConexion")
    @ResponseWrapper(localName = "verificarConexionResponse", targetNamespace = "http://actualifecha.guatex.com/", className = "com.guatex.webservice.servicio.VerificarConexionResponse")
    @Action(input = "http://actualifecha.guatex.com/MotorActualizaFecha/verificarConexionRequest", output = "http://actualifecha.guatex.com/MotorActualizaFecha/verificarConexionResponse")
    public String verificarConexion();

}