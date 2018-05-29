
package com.redsun.bos.ws.impl;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WaybillWsService", targetNamespace = "http://impl.ws.bos.redsun.com/", wsdlLocation = "http://localhost:9090/bos/cxf/waybill?wsdl")
public class WaybillWsService
    extends Service
{

    private final static URL WAYBILLWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException WAYBILLWSSERVICE_EXCEPTION;
    private final static QName WAYBILLWSSERVICE_QNAME = new QName("http://impl.ws.bos.redsun.com/", "WaybillWsService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9090/bos/cxf/waybill?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WAYBILLWSSERVICE_WSDL_LOCATION = url;
        WAYBILLWSSERVICE_EXCEPTION = e;
    }

    public WaybillWsService() {
        super(__getWsdlLocation(), WAYBILLWSSERVICE_QNAME);
    }

    public WaybillWsService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WAYBILLWSSERVICE_QNAME, features);
    }

    public WaybillWsService(URL wsdlLocation) {
        super(wsdlLocation, WAYBILLWSSERVICE_QNAME);
    }

    public WaybillWsService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WAYBILLWSSERVICE_QNAME, features);
    }

    public WaybillWsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WaybillWsService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IWaybillWs
     */
    @WebEndpoint(name = "WaybillWsPort")
    public IWaybillWs getWaybillWsPort() {
        return super.getPort(new QName("http://impl.ws.bos.redsun.com/", "WaybillWsPort"), IWaybillWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IWaybillWs
     */
    @WebEndpoint(name = "WaybillWsPort")
    public IWaybillWs getWaybillWsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.ws.bos.redsun.com/", "WaybillWsPort"), IWaybillWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WAYBILLWSSERVICE_EXCEPTION!= null) {
            throw WAYBILLWSSERVICE_EXCEPTION;
        }
        return WAYBILLWSSERVICE_WSDL_LOCATION;
    }

}
