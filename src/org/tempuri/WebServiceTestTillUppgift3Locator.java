/**
 * WebServiceTestTillUppgift3Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class WebServiceTestTillUppgift3Locator extends org.apache.axis.client.Service implements org.tempuri.WebServiceTestTillUppgift3 {

    public WebServiceTestTillUppgift3Locator() {
    }


    public WebServiceTestTillUppgift3Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebServiceTestTillUppgift3Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebServiceTestTillUppgift3Soap
    private java.lang.String WebServiceTestTillUppgift3Soap_address = "http://localhost/WebApp-TestTillUppgift3/WebServiceTestTillUppgift3.asmx";

    public java.lang.String getWebServiceTestTillUppgift3SoapAddress() {
        return WebServiceTestTillUppgift3Soap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebServiceTestTillUppgift3SoapWSDDServiceName = "WebServiceTestTillUppgift3Soap";

    public java.lang.String getWebServiceTestTillUppgift3SoapWSDDServiceName() {
        return WebServiceTestTillUppgift3SoapWSDDServiceName;
    }

    public void setWebServiceTestTillUppgift3SoapWSDDServiceName(java.lang.String name) {
        WebServiceTestTillUppgift3SoapWSDDServiceName = name;
    }

    public org.tempuri.WebServiceTestTillUppgift3Soap getWebServiceTestTillUppgift3Soap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebServiceTestTillUppgift3Soap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebServiceTestTillUppgift3Soap(endpoint);
    }

    public org.tempuri.WebServiceTestTillUppgift3Soap getWebServiceTestTillUppgift3Soap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.WebServiceTestTillUppgift3SoapStub _stub = new org.tempuri.WebServiceTestTillUppgift3SoapStub(portAddress, this);
            _stub.setPortName(getWebServiceTestTillUppgift3SoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebServiceTestTillUppgift3SoapEndpointAddress(java.lang.String address) {
        WebServiceTestTillUppgift3Soap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.WebServiceTestTillUppgift3Soap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.WebServiceTestTillUppgift3SoapStub _stub = new org.tempuri.WebServiceTestTillUppgift3SoapStub(new java.net.URL(WebServiceTestTillUppgift3Soap_address), this);
                _stub.setPortName(getWebServiceTestTillUppgift3SoapWSDDServiceName());
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
        if ("WebServiceTestTillUppgift3Soap".equals(inputPortName)) {
            return getWebServiceTestTillUppgift3Soap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "WebServiceTestTillUppgift3");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "WebServiceTestTillUppgift3Soap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WebServiceTestTillUppgift3Soap".equals(portName)) {
            setWebServiceTestTillUppgift3SoapEndpointAddress(address);
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
