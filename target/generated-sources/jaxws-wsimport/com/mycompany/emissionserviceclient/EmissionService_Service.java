
package com.mycompany.emissionserviceclient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EmissionService", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8281/EmissionService?wsdl")
public class EmissionService_Service
    extends Service
{

    private final static URL EMISSIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException EMISSIONSERVICE_EXCEPTION;
    private final static QName EMISSIONSERVICE_QNAME = new QName("http://ws/", "EmissionService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8281/EmissionService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EMISSIONSERVICE_WSDL_LOCATION = url;
        EMISSIONSERVICE_EXCEPTION = e;
    }

    public EmissionService_Service() {
        super(__getWsdlLocation(), EMISSIONSERVICE_QNAME);
    }

    public EmissionService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), EMISSIONSERVICE_QNAME, features);
    }

    public EmissionService_Service(URL wsdlLocation) {
        super(wsdlLocation, EMISSIONSERVICE_QNAME);
    }

    public EmissionService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EMISSIONSERVICE_QNAME, features);
    }

    public EmissionService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmissionService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EmissionService
     */
    @WebEndpoint(name = "EmissionServicePort")
    public EmissionService getEmissionServicePort() {
        return super.getPort(new QName("http://ws/", "EmissionServicePort"), EmissionService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmissionService
     */
    @WebEndpoint(name = "EmissionServicePort")
    public EmissionService getEmissionServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "EmissionServicePort"), EmissionService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EMISSIONSERVICE_EXCEPTION!= null) {
            throw EMISSIONSERVICE_EXCEPTION;
        }
        return EMISSIONSERVICE_WSDL_LOCATION;
    }

}
