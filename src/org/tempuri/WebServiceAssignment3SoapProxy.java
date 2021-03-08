package org.tempuri;

public class WebServiceAssignment3SoapProxy implements org.tempuri.WebServiceAssignment3Soap {
  private String _endpoint = null;
  private org.tempuri.WebServiceAssignment3Soap webServiceAssignment3Soap = null;
  
  public WebServiceAssignment3SoapProxy() {
    _initWebServiceAssignment3SoapProxy();
  }
  
  public WebServiceAssignment3SoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebServiceAssignment3SoapProxy();
  }
  
  private void _initWebServiceAssignment3SoapProxy() {
    try {
      webServiceAssignment3Soap = (new org.tempuri.WebServiceAssignment3Locator()).getWebServiceAssignment3Soap();
      if (webServiceAssignment3Soap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webServiceAssignment3Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webServiceAssignment3Soap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webServiceAssignment3Soap != null)
      ((javax.xml.rpc.Stub)webServiceAssignment3Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.WebServiceAssignment3Soap getWebServiceAssignment3Soap() {
    if (webServiceAssignment3Soap == null)
      _initWebServiceAssignment3SoapProxy();
    return webServiceAssignment3Soap;
  }
  
  public java.lang.String fileReader(java.lang.String file) throws java.rmi.RemoteException{
    if (webServiceAssignment3Soap == null)
      _initWebServiceAssignment3SoapProxy();
    return webServiceAssignment3Soap.fileReader(file);
  }
  
  
}