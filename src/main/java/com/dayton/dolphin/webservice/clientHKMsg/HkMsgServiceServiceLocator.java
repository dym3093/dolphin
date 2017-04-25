/**
 * HkMsgServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dayton.dolphin.webservice.clientHKMsg;

public class HkMsgServiceServiceLocator extends org.apache.axis.client.Service implements com.dayton.dolphin.webservice.clientHKMsg.HkMsgServiceService {

    public HkMsgServiceServiceLocator() {
    }


    public HkMsgServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HkMsgServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HkMsgServicePort
    private java.lang.String HkMsgServicePort_address = "http://web.healthlink.cn:8088/services/HkMsgService";

    public java.lang.String getHkMsgServicePortAddress() {
        return HkMsgServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HkMsgServicePortWSDDServiceName = "HkMsgServicePort";

    public java.lang.String getHkMsgServicePortWSDDServiceName() {
        return HkMsgServicePortWSDDServiceName;
    }

    public void setHkMsgServicePortWSDDServiceName(java.lang.String name) {
        HkMsgServicePortWSDDServiceName = name;
    }

    public com.dayton.dolphin.webservice.clientHKMsg.HkMsgService getHkMsgServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HkMsgServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHkMsgServicePort(endpoint);
    }

    public com.dayton.dolphin.webservice.clientHKMsg.HkMsgService getHkMsgServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.dayton.dolphin.webservice.clientHKMsg.HkMsgServicePortBindingStub _stub = new com.dayton.dolphin.webservice.clientHKMsg.HkMsgServicePortBindingStub(portAddress, this);
            _stub.setPortName(getHkMsgServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHkMsgServicePortEndpointAddress(java.lang.String address) {
        HkMsgServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.dayton.dolphin.webservice.clientHKMsg.HkMsgService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.dayton.dolphin.webservice.clientHKMsg.HkMsgServicePortBindingStub _stub = new com.dayton.dolphin.webservice.clientHKMsg.HkMsgServicePortBindingStub(new java.net.URL(HkMsgServicePort_address), this);
                _stub.setPortName(getHkMsgServicePortWSDDServiceName());
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
        if ("HkMsgServicePort".equals(inputPortName)) {
            return getHkMsgServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://web.healthlink.cn/", "HkMsgServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://web.healthlink.cn/", "HkMsgServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HkMsgServicePort".equals(portName)) {
            setHkMsgServicePortEndpointAddress(address);
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
