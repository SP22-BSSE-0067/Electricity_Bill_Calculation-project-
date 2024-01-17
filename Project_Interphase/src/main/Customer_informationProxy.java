package main;

public class Customer_informationProxy implements main.Customer_information {
  private String _endpoint = null;
  private main.Customer_information customer_information = null;
  
  public Customer_informationProxy() {
    _initCustomer_informationProxy();
  }
  
  public Customer_informationProxy(String endpoint) {
    _endpoint = endpoint;
    _initCustomer_informationProxy();
  }
  
  private void _initCustomer_informationProxy() {
    try {
      customer_information = (new main.Customer_informationServiceLocator()).getCustomer_information();
      if (customer_information != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)customer_information)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)customer_information)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (customer_information != null)
      ((javax.xml.rpc.Stub)customer_information)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Customer_information getCustomer_information() {
    if (customer_information == null)
      _initCustomer_informationProxy();
    return customer_information;
  }
  
  public java.lang.String getcustomer_info(java.lang.String customer_name) throws java.rmi.RemoteException{
    if (customer_information == null)
      _initCustomer_informationProxy();
    return customer_information.getcustomer_info(customer_name);
  }
  
  
}