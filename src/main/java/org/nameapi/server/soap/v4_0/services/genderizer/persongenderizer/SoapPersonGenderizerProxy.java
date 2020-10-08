package org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer;

public class SoapPersonGenderizerProxy implements org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapPersonGenderizer {
  private String _endpoint = null;
  private org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapPersonGenderizer soapPersonGenderizer = null;
  
  public SoapPersonGenderizerProxy() {
    _initSoapPersonGenderizerProxy();
  }
  
  public SoapPersonGenderizerProxy(String endpoint) {
    _endpoint = endpoint;
    _initSoapPersonGenderizerProxy();
  }
  
  private void _initSoapPersonGenderizerProxy() {
    try {
      soapPersonGenderizer = (new org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapPersonGenderizerServiceLocator()).getSoapPersonGenderizerPort();
      if (soapPersonGenderizer != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)soapPersonGenderizer)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)soapPersonGenderizer)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (soapPersonGenderizer != null)
      ((javax.xml.rpc.Stub)soapPersonGenderizer)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapPersonGenderizer getSoapPersonGenderizer() {
    if (soapPersonGenderizer == null)
      _initSoapPersonGenderizerProxy();
    return soapPersonGenderizer;
  }
  
  public org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapPersonGenderizerResult assess(org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapContext context, org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapSimpleNaturalPerson person) throws java.rmi.RemoteException, org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.FaultBean, org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.FaultBean, org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.FaultBean{
    if (soapPersonGenderizer == null)
      _initSoapPersonGenderizerProxy();
    return soapPersonGenderizer.assess(context, person);
  }
  
  
}