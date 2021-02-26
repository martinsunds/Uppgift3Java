/**
 * WebServiceAssignment3Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class WebServiceAssignment3Locator extends org.apache.axis.client.Service implements org.tempuri.WebServiceAssignment3 {

    public WebServiceAssignment3Locator() {
    }


    public WebServiceAssignment3Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebServiceAssignment3Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebServiceAssignment3Soap
    private java.lang.String WebServiceAssignment3Soap_address = "http://localhost/WebApplicationAssignment3/WebServiceAssignment3.asmx";

    public java.lang.String getWebServiceAssignment3SoapAddress() {
        return WebServiceAssignment3Soap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebServiceAssignment3SoapWSDDServiceName = "WebServiceAssignment3Soap";

    public java.lang.String getWebServiceAssignment3SoapWSDDServiceName() {
        return WebServiceAssignment3SoapWSDDServiceName;
    }

    public void setWebServiceAssignment3SoapWSDDServiceName(java.lang.String name) {
        WebServiceAssignment3SoapWSDDServiceName = name;
    }

    public org.tempuri.WebServiceAssignment3Soap getWebServiceAssignment3Soap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebServiceAssignment3Soap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebServiceAssignment3Soap(endpoint);
    }

    public org.tempuri.WebServiceAssignment3Soap getWebServiceAssignment3Soap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.WebServiceAssignment3SoapStub _stub = new org.tempuri.WebServiceAssignment3SoapStub(portAddress, this);
            _stub.setPortName(getWebServiceAssignment3SoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebServiceAssignment3SoapEndpointAddress(java.lang.String address) {
        WebServiceAssignment3Soap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.WebServiceAssignment3Soap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.WebServiceAssignment3SoapStub _stub = new org.tempuri.WebServiceAssignment3SoapStub(new java.net.URL(WebServiceAssignment3Soap_address), this);
                _stub.setPortName(getWebServiceAssignment3SoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WebServiceAssignment3Soap".equals(inputPortName)) {
            return getWebServiceAssignment3Soap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "WebServiceAssignment3");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "WebServiceAssignment3Soap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WebServiceAssignment3Soap".equals(portName)) {
            setWebServiceAssignment3SoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
