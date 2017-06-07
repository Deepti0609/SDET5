/**
 * CreditScoreCheckServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fanniemae;

public class CreditScoreCheckServiceLocator extends org.apache.axis.client.Service implements com.fanniemae.CreditScoreCheckService {

    public CreditScoreCheckServiceLocator() {
    }


    public CreditScoreCheckServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CreditScoreCheckServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CreditScoreCheckPort
    private java.lang.String CreditScoreCheckPort_address = "http://127.0.0.1:8876/fanniemae";

    public java.lang.String getCreditScoreCheckPortAddress() {
        return CreditScoreCheckPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CreditScoreCheckPortWSDDServiceName = "CreditScoreCheckPort";

    public java.lang.String getCreditScoreCheckPortWSDDServiceName() {
        return CreditScoreCheckPortWSDDServiceName;
    }

    public void setCreditScoreCheckPortWSDDServiceName(java.lang.String name) {
        CreditScoreCheckPortWSDDServiceName = name;
    }

    public com.fanniemae.ICreditScoreCheck getCreditScoreCheckPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CreditScoreCheckPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCreditScoreCheckPort(endpoint);
    }

    public com.fanniemae.ICreditScoreCheck getCreditScoreCheckPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.fanniemae.CreditScoreCheckPortBindingStub _stub = new com.fanniemae.CreditScoreCheckPortBindingStub(portAddress, this);
            _stub.setPortName(getCreditScoreCheckPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCreditScoreCheckPortEndpointAddress(java.lang.String address) {
        CreditScoreCheckPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.fanniemae.ICreditScoreCheck.class.isAssignableFrom(serviceEndpointInterface)) {
                com.fanniemae.CreditScoreCheckPortBindingStub _stub = new com.fanniemae.CreditScoreCheckPortBindingStub(new java.net.URL(CreditScoreCheckPort_address), this);
                _stub.setPortName(getCreditScoreCheckPortWSDDServiceName());
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
        if ("CreditScoreCheckPort".equals(inputPortName)) {
            return getCreditScoreCheckPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://fanniemae.com/", "CreditScoreCheckService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://fanniemae.com/", "CreditScoreCheckPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CreditScoreCheckPort".equals(portName)) {
            setCreditScoreCheckPortEndpointAddress(address);
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
