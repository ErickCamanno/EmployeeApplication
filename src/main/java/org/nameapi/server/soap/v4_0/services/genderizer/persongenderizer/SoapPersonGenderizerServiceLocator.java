/**
 * SoapPersonGenderizerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer;

public class SoapPersonGenderizerServiceLocator extends org.apache.axis.client.Service implements org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapPersonGenderizerService {

    public SoapPersonGenderizerServiceLocator() {
    }


    public SoapPersonGenderizerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SoapPersonGenderizerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SoapPersonGenderizerPort
    private java.lang.String SoapPersonGenderizerPort_address = "http://api.nameapi.org/soap/v4.0/genderizer/persongenderizer";

    public java.lang.String getSoapPersonGenderizerPortAddress() {
        return SoapPersonGenderizerPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SoapPersonGenderizerPortWSDDServiceName = "SoapPersonGenderizerPort";

    public java.lang.String getSoapPersonGenderizerPortWSDDServiceName() {
        return SoapPersonGenderizerPortWSDDServiceName;
    }

    public void setSoapPersonGenderizerPortWSDDServiceName(java.lang.String name) {
        SoapPersonGenderizerPortWSDDServiceName = name;
    }

    public org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapPersonGenderizer getSoapPersonGenderizerPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SoapPersonGenderizerPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSoapPersonGenderizerPort(endpoint);
    }

    public org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapPersonGenderizer getSoapPersonGenderizerPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapPersonGenderizerPortBindingStub _stub = new org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapPersonGenderizerPortBindingStub(portAddress, this);
            _stub.setPortName(getSoapPersonGenderizerPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSoapPersonGenderizerPortEndpointAddress(java.lang.String address) {
        SoapPersonGenderizerPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapPersonGenderizer.class.isAssignableFrom(serviceEndpointInterface)) {
                org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapPersonGenderizerPortBindingStub _stub = new org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapPersonGenderizerPortBindingStub(new java.net.URL(SoapPersonGenderizerPort_address), this);
                _stub.setPortName(getSoapPersonGenderizerPortWSDDServiceName());
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
        if ("SoapPersonGenderizerPort".equals(inputPortName)) {
            return getSoapPersonGenderizerPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "SoapPersonGenderizerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://persongenderizer.genderizer.services.v4_0.soap.server.nameapi.org/", "SoapPersonGenderizerPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SoapPersonGenderizerPort".equals(portName)) {
            setSoapPersonGenderizerPortEndpointAddress(address);
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
