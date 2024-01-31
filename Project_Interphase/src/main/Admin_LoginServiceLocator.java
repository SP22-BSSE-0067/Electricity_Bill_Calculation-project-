/**
 * Admin_LoginServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class Admin_LoginServiceLocator extends org.apache.axis.client.Service implements main.Admin_LoginService {

    public Admin_LoginServiceLocator() {
    }


    public Admin_LoginServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Admin_LoginServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Admin_Login
    private java.lang.String Admin_Login_address = "http://localhost:8080/Bill_Calculation_project/services/Admin_Login";

    public java.lang.String getAdmin_LoginAddress() {
        return Admin_Login_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Admin_LoginWSDDServiceName = "Admin_Login";

    public java.lang.String getAdmin_LoginWSDDServiceName() {
        return Admin_LoginWSDDServiceName;
    }

    public void setAdmin_LoginWSDDServiceName(java.lang.String name) {
        Admin_LoginWSDDServiceName = name;
    }

    public main.Admin_Login getAdmin_Login() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Admin_Login_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAdmin_Login(endpoint);
    }

    public main.Admin_Login getAdmin_Login(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.Admin_LoginSoapBindingStub _stub = new main.Admin_LoginSoapBindingStub(portAddress, this);
            _stub.setPortName(getAdmin_LoginWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAdmin_LoginEndpointAddress(java.lang.String address) {
        Admin_Login_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Admin_Login.class.isAssignableFrom(serviceEndpointInterface)) {
                main.Admin_LoginSoapBindingStub _stub = new main.Admin_LoginSoapBindingStub(new java.net.URL(Admin_Login_address), this);
                _stub.setPortName(getAdmin_LoginWSDDServiceName());
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
        if ("Admin_Login".equals(inputPortName)) {
            return getAdmin_Login();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "Admin_LoginService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "Admin_Login"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Admin_Login".equals(portName)) {
            setAdmin_LoginEndpointAddress(address);
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
