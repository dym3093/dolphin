/**
 * YmGeneReportServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dayton.dolphin.webservice.clientGene;

public class YmGeneReportServiceImplServiceLocator extends org.apache.axis.client.Service implements com.dayton.dolphin.webservice.clientGene.YmGeneReportServiceImplService {

    public YmGeneReportServiceImplServiceLocator() {
    }


    public YmGeneReportServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public YmGeneReportServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for YmGeneReportServiceImplPort
    private java.lang.String YmGeneReportServiceImplPort_address = "http://localhost:7280/websGene/geneReport";

    public java.lang.String getYmGeneReportServiceImplPortAddress() {
        return YmGeneReportServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String YmGeneReportServiceImplPortWSDDServiceName = "YmGeneReportServiceImplPort";

    public java.lang.String getYmGeneReportServiceImplPortWSDDServiceName() {
        return YmGeneReportServiceImplPortWSDDServiceName;
    }

    public void setYmGeneReportServiceImplPortWSDDServiceName(java.lang.String name) {
        YmGeneReportServiceImplPortWSDDServiceName = name;
    }

    public com.dayton.dolphin.webservice.clientGene.YmGeneReportServiceImpl getYmGeneReportServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(YmGeneReportServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getYmGeneReportServiceImplPort(endpoint);
    }

    public com.dayton.dolphin.webservice.clientGene.YmGeneReportServiceImpl getYmGeneReportServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.dayton.dolphin.webservice.clientGene.YmGeneReportServiceImplServiceSoapBindingStub _stub = new com.dayton.dolphin.webservice.clientGene.YmGeneReportServiceImplServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getYmGeneReportServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setYmGeneReportServiceImplPortEndpointAddress(java.lang.String address) {
        YmGeneReportServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.dayton.dolphin.webservice.clientGene.YmGeneReportServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.dayton.dolphin.webservice.clientGene.YmGeneReportServiceImplServiceSoapBindingStub _stub = new com.dayton.dolphin.webservice.clientGene.YmGeneReportServiceImplServiceSoapBindingStub(new java.net.URL(YmGeneReportServiceImplPort_address), this);
                _stub.setPortName(getYmGeneReportServiceImplPortWSDDServiceName());
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
        if ("YmGeneReportServiceImplPort".equals(inputPortName)) {
            return getYmGeneReportServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.webservice.hpin.org/", "YmGeneReportServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.webservice.hpin.org/", "YmGeneReportServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("YmGeneReportServiceImplPort".equals(portName)) {
            setYmGeneReportServiceImplPortEndpointAddress(address);
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
