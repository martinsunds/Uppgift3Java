package org.tempuri;

public class WebServiceTestTillUppgift3SoapProxy implements org.tempuri.WebServiceTestTillUppgift3Soap {
  private String _endpoint = null;
  private org.tempuri.WebServiceTestTillUppgift3Soap webServiceTestTillUppgift3Soap = null;
  
  public WebServiceTestTillUppgift3SoapProxy() {
    _initWebServiceTestTillUppgift3SoapProxy();
  }
  
  public WebServiceTestTillUppgift3SoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebServiceTestTillUppgift3SoapProxy();
  }
  
  private void _initWebServiceTestTillUppgift3SoapProxy() {
    try {
      webServiceTestTillUppgift3Soap = (new org.tempuri.WebServiceTestTillUppgift3Locator()).getWebServiceTestTillUppgift3Soap();
      if (webServiceTestTillUppgift3Soap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webServiceTestTillUppgift3Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webServiceTestTillUppgift3Soap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webServiceTestTillUppgift3Soap != null)
      ((javax.xml.rpc.Stub)webServiceTestTillUppgift3Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.WebServiceTestTillUppgift3Soap getWebServiceTestTillUppgift3Soap() {
    if (webServiceTestTillUppgift3Soap == null)
      _initWebServiceTestTillUppgift3SoapProxy();
    return webServiceTestTillUppgift3Soap;
  }
  
  public java.lang.String helloWorld() throws java.rmi.RemoteException{
    if (webServiceTestTillUppgift3Soap == null)
      _initWebServiceTestTillUppgift3SoapProxy();
    return webServiceTestTillUppgift3Soap.helloWorld();
  }
  
  public int addNumbers(int a, int b) throws java.rmi.RemoteException{
    if (webServiceTestTillUppgift3Soap == null)
      _initWebServiceTestTillUppgift3SoapProxy();
    return webServiceTestTillUppgift3Soap.addNumbers(a, b);
  }
  
  
}