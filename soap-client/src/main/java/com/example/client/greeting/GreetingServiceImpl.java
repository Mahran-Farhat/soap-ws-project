
package com.example.client.greeting;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GreetingServiceImpl", targetNamespace = "http://server.example.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GreetingServiceImpl {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://server.example.com/", className = "com.example.client.greeting.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://server.example.com/", className = "com.example.client.greeting.SayHelloResponse")
    @Action(input = "http://server.example.com/GreetingServiceImpl/sayHelloRequest", output = "http://server.example.com/GreetingServiceImpl/sayHelloResponse")
    public String sayHello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
