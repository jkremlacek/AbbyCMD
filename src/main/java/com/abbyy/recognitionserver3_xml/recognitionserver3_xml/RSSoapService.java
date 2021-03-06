package com.abbyy.recognitionserver3_xml.recognitionserver3_xml;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.1.9
 * 2017-04-24T11:07:32.495+02:00
 * Generated source version: 3.1.9
 * 
 */
@WebServiceClient(name = "RSSoapService", 
                  wsdlLocation = "file:/usr/abby/RSSoapService.wsdl",
                  targetNamespace = "http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml") 
public class RSSoapService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml", "RSSoapService");
    public final static QName RSSoapServiceSoap12 = new QName("http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml", "RSSoapServiceSoap12");
    public final static QName RSSoapServiceSoap = new QName("http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml", "RSSoapServiceSoap");
    static {
        URL url = null;
        try {
            url = new URL("file:/usr/abby/RSSoapService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(RSSoapService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/usr/abby/RSSoapService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RSSoapService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RSSoapService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RSSoapService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public RSSoapService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public RSSoapService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public RSSoapService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns RSSoapServiceSoap
     */
    @WebEndpoint(name = "RSSoapServiceSoap12")
    public RSSoapServiceSoap getRSSoapServiceSoap12() {
        return super.getPort(RSSoapServiceSoap12, RSSoapServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RSSoapServiceSoap
     */
    @WebEndpoint(name = "RSSoapServiceSoap12")
    public RSSoapServiceSoap getRSSoapServiceSoap12(WebServiceFeature... features) {
        return super.getPort(RSSoapServiceSoap12, RSSoapServiceSoap.class, features);
    }


    /**
     *
     * @return
     *     returns RSSoapServiceSoap
     */
    @WebEndpoint(name = "RSSoapServiceSoap")
    public RSSoapServiceSoap getRSSoapServiceSoap() {
        return super.getPort(RSSoapServiceSoap, RSSoapServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RSSoapServiceSoap
     */
    @WebEndpoint(name = "RSSoapServiceSoap")
    public RSSoapServiceSoap getRSSoapServiceSoap(WebServiceFeature... features) {
        return super.getPort(RSSoapServiceSoap, RSSoapServiceSoap.class, features);
    }

}
