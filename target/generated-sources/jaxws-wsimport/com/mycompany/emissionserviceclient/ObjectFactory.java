
package com.mycompany.emissionserviceclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.emissionserviceclient package. 
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

    private final static QName _GetEmissionsByRegionResponse_QNAME = new QName("http://ws/", "getEmissionsByRegionResponse");
    private final static QName _GetEmissionsBySector_QNAME = new QName("http://ws/", "getEmissionsBySector");
    private final static QName _GetEmissionsByRegion_QNAME = new QName("http://ws/", "getEmissionsByRegion");
    private final static QName _Emission_QNAME = new QName("http://ws/", "Emission");
    private final static QName _GetEmissionsBySectorResponse_QNAME = new QName("http://ws/", "getEmissionsBySectorResponse");
    private final static QName _GetAllEmissions_QNAME = new QName("http://ws/", "getAllEmissions");
    private final static QName _GetAllEmissionsResponse_QNAME = new QName("http://ws/", "getAllEmissionsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.emissionserviceclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEmissionsByRegionResponse }
     * 
     */
    public GetEmissionsByRegionResponse createGetEmissionsByRegionResponse() {
        return new GetEmissionsByRegionResponse();
    }

    /**
     * Create an instance of {@link GetEmissionsBySector }
     * 
     */
    public GetEmissionsBySector createGetEmissionsBySector() {
        return new GetEmissionsBySector();
    }

    /**
     * Create an instance of {@link GetEmissionsByRegion }
     * 
     */
    public GetEmissionsByRegion createGetEmissionsByRegion() {
        return new GetEmissionsByRegion();
    }

    /**
     * Create an instance of {@link Emission }
     * 
     */
    public Emission createEmission() {
        return new Emission();
    }

    /**
     * Create an instance of {@link GetEmissionsBySectorResponse }
     * 
     */
    public GetEmissionsBySectorResponse createGetEmissionsBySectorResponse() {
        return new GetEmissionsBySectorResponse();
    }

    /**
     * Create an instance of {@link GetAllEmissions }
     * 
     */
    public GetAllEmissions createGetAllEmissions() {
        return new GetAllEmissions();
    }

    /**
     * Create an instance of {@link GetAllEmissionsResponse }
     * 
     */
    public GetAllEmissionsResponse createGetAllEmissionsResponse() {
        return new GetAllEmissionsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmissionsByRegionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getEmissionsByRegionResponse")
    public JAXBElement<GetEmissionsByRegionResponse> createGetEmissionsByRegionResponse(GetEmissionsByRegionResponse value) {
        return new JAXBElement<GetEmissionsByRegionResponse>(_GetEmissionsByRegionResponse_QNAME, GetEmissionsByRegionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmissionsBySector }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getEmissionsBySector")
    public JAXBElement<GetEmissionsBySector> createGetEmissionsBySector(GetEmissionsBySector value) {
        return new JAXBElement<GetEmissionsBySector>(_GetEmissionsBySector_QNAME, GetEmissionsBySector.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmissionsByRegion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getEmissionsByRegion")
    public JAXBElement<GetEmissionsByRegion> createGetEmissionsByRegion(GetEmissionsByRegion value) {
        return new JAXBElement<GetEmissionsByRegion>(_GetEmissionsByRegion_QNAME, GetEmissionsByRegion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Emission }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Emission")
    public JAXBElement<Emission> createEmission(Emission value) {
        return new JAXBElement<Emission>(_Emission_QNAME, Emission.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmissionsBySectorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getEmissionsBySectorResponse")
    public JAXBElement<GetEmissionsBySectorResponse> createGetEmissionsBySectorResponse(GetEmissionsBySectorResponse value) {
        return new JAXBElement<GetEmissionsBySectorResponse>(_GetEmissionsBySectorResponse_QNAME, GetEmissionsBySectorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEmissions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllEmissions")
    public JAXBElement<GetAllEmissions> createGetAllEmissions(GetAllEmissions value) {
        return new JAXBElement<GetAllEmissions>(_GetAllEmissions_QNAME, GetAllEmissions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEmissionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllEmissionsResponse")
    public JAXBElement<GetAllEmissionsResponse> createGetAllEmissionsResponse(GetAllEmissionsResponse value) {
        return new JAXBElement<GetAllEmissionsResponse>(_GetAllEmissionsResponse_QNAME, GetAllEmissionsResponse.class, null, value);
    }

}
