/**
 * Customer_informationServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class Customer_informationServiceLocator extends org.apache.axis.client.Service implements main.Customer_informationService {

    public Customer_informationServiceLocator() {
    }


    public Customer_informationServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Customer_informationServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Customer_information
    private java.lang.String Customer_information_address = "http://localhost:8080/Bill_Calculation_project/services/Customer_information";

    public java.lang.String getCustomer_informationAddress() {
        return Customer_information_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Customer_informationWSDDServiceName = "Customer_information";

    public java.lang.String getCustomer_informationWSDDServiceName() {
        return Customer_informationWSDDServiceName;
    }

    public void setCustomer_informationWSDDServiceName(java.lang.String name) {
        Customer_informationWSDDServiceName = name;
    }

    public main.Customer_information getCustomer_information() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Customer_information_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCustomer_information(endpoint);
    }

    public main.Customer_information getCustomer_information(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.Customer_informationSoapBindingStub _stub = new main.Customer_informationSoapBindingStub(portAddress, this);
            _stub.setPortName(getCustomer_informationWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCustomer_informationEndpointAddress(java.lang.String address) {
        Customer_information_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Customer_information.class.isAssignableFrom(serviceEndpointInterface)) {
                main.Customer_informationSoapBindingStub _stub = new main.Customer_informationSoapBindingStub(new java.net.URL(Customer_information_address), this);
                _stub.setPortName(getCustomer_informationWSDDServiceName());
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
        if ("Customer_information".equals(inputPortName)) {
            return getCustomer_information();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "Customer_informationService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "Customer_information"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Customer_information".equals(portName)) {
            setCustomer_informationEndpointAddress(address);
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
