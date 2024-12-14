
package com.mycompany.emissionserviceclient;

import java.util.List;
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
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EmissionService", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EmissionService {


    /**
     * 
     * @param region
     * @return
     *     returns java.util.List<com.mycompany.emissionserviceclient.Emission>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEmissionsByRegion", targetNamespace = "http://ws/", className = "com.mycompany.emissionserviceclient.GetEmissionsByRegion")
    @ResponseWrapper(localName = "getEmissionsByRegionResponse", targetNamespace = "http://ws/", className = "com.mycompany.emissionserviceclient.GetEmissionsByRegionResponse")
    @Action(input = "http://ws/EmissionService/getEmissionsByRegionRequest", output = "http://ws/EmissionService/getEmissionsByRegionResponse")
    public List<Emission> getEmissionsByRegion(
        @WebParam(name = "region", targetNamespace = "")
        String region);

    /**
     * 
     * @param sector
     * @return
     *     returns java.util.List<com.mycompany.emissionserviceclient.Emission>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEmissionsBySector", targetNamespace = "http://ws/", className = "com.mycompany.emissionserviceclient.GetEmissionsBySector")
    @ResponseWrapper(localName = "getEmissionsBySectorResponse", targetNamespace = "http://ws/", className = "com.mycompany.emissionserviceclient.GetEmissionsBySectorResponse")
    @Action(input = "http://ws/EmissionService/getEmissionsBySectorRequest", output = "http://ws/EmissionService/getEmissionsBySectorResponse")
    public List<Emission> getEmissionsBySector(
        @WebParam(name = "sector", targetNamespace = "")
        String sector);

    /**
     * 
     * @return
     *     returns java.util.List<com.mycompany.emissionserviceclient.Emission>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllEmissions", targetNamespace = "http://ws/", className = "com.mycompany.emissionserviceclient.GetAllEmissions")
    @ResponseWrapper(localName = "getAllEmissionsResponse", targetNamespace = "http://ws/", className = "com.mycompany.emissionserviceclient.GetAllEmissionsResponse")
    @Action(input = "http://ws/EmissionService/getAllEmissionsRequest", output = "http://ws/EmissionService/getAllEmissionsResponse")
    public List<Emission> getAllEmissions();

}
