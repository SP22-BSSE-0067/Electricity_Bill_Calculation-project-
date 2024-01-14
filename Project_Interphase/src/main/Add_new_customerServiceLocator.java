/**
 * Add_new_customerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class Add_new_customerServiceLocator extends org.apache.axis.client.Service implements main.Add_new_customerService {

    public Add_new_customerServiceLocator() {
    }


    public Add_new_customerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Add_new_customerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Add_new_customer
    private java.lang.String Add_new_customer_address = "http://localhost:8080/Bill_Calculation_project/services/Add_new_customer";

    public java.lang.String getAdd_new_customerAddress() {
        return Add_new_customer_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Add_new_customerWSDDServiceName = "Add_new_customer";

    public java.lang.String getAdd_new_customerWSDDServiceName() {
        return Add_new_customerWSDDServiceName;
    }

    public void setAdd_new_customerWSDDServiceName(java.lang.String name) {
        Add_new_customerWSDDServiceName = name;
    }

    public main.Add_new_customer getAdd_new_customer() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Add_new_customer_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAdd_new_customer(endpoint);
    }

    public main.Add_new_customer getAdd_new_customer(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.Add_new_customerSoapBindingStub _stub = new main.Add_new_customerSoapBindingStub(portAddress, this);
            _stub.setPortName(getAdd_new_customerWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAdd_new_customerEndpointAddress(java.lang.String address) {
        Add_new_customer_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Add_new_customer.class.isAssignableFrom(serviceEndpointInterface)) {
                main.Add_new_customerSoapBindingStub _stub = new main.Add_new_customerSoapBindingStub(new java.net.URL(Add_new_customer_address), this);
                _stub.setPortName(getAdd_new_customerWSDDServiceName());
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
        if ("Add_new_customer".equals(inputPortName)) {
            return getAdd_new_customer();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "Add_new_customerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "Add_new_customer"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Add_new_customer".equals(portName)) {
            setAdd_new_customerEndpointAddress(address);
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
