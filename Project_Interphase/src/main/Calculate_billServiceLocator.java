/**
 * Calculate_billServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class Calculate_billServiceLocator extends org.apache.axis.client.Service implements main.Calculate_billService {

    public Calculate_billServiceLocator() {
    }


    public Calculate_billServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Calculate_billServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for calculate_bill
    private java.lang.String calculate_bill_address = "http://localhost:8080/Bill_Calculation_project/services/calculate_bill";

    public java.lang.String getcalculate_billAddress() {
        return calculate_bill_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String calculate_billWSDDServiceName = "calculate_bill";

    public java.lang.String getcalculate_billWSDDServiceName() {
        return calculate_billWSDDServiceName;
    }

    public void setcalculate_billWSDDServiceName(java.lang.String name) {
        calculate_billWSDDServiceName = name;
    }

    public main.Calculate_bill getcalculate_bill() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(calculate_bill_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getcalculate_bill(endpoint);
    }

    public main.Calculate_bill getcalculate_bill(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.Calculate_billSoapBindingStub _stub = new main.Calculate_billSoapBindingStub(portAddress, this);
            _stub.setPortName(getcalculate_billWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setcalculate_billEndpointAddress(java.lang.String address) {
        calculate_bill_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Calculate_bill.class.isAssignableFrom(serviceEndpointInterface)) {
                main.Calculate_billSoapBindingStub _stub = new main.Calculate_billSoapBindingStub(new java.net.URL(calculate_bill_address), this);
                _stub.setPortName(getcalculate_billWSDDServiceName());
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
        if ("calculate_bill".equals(inputPortName)) {
            return getcalculate_bill();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "calculate_billService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "calculate_bill"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("calculate_bill".equals(portName)) {
            setcalculate_billEndpointAddress(address);
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
