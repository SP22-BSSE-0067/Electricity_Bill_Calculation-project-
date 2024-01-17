package main;

public class Add_new_customerProxy implements main.Add_new_customer {
  private String _endpoint = null;
  private main.Add_new_customer add_new_customer = null;
  
  public Add_new_customerProxy() {
    _initAdd_new_customerProxy();
  }
  
  public Add_new_customerProxy(String endpoint) {
    _endpoint = endpoint;
    _initAdd_new_customerProxy();
  }
  
  private void _initAdd_new_customerProxy() {
    try {
      add_new_customer = (new main.Add_new_customerServiceLocator()).getAdd_new_customer();
      if (add_new_customer != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)add_new_customer)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)add_new_customer)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (add_new_customer != null)
      ((javax.xml.rpc.Stub)add_new_customer)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Add_new_customer getAdd_new_customer() {
    if (add_new_customer == null)
      _initAdd_new_customerProxy();
    return add_new_customer;
  }
  
  public void add_customerinfo(int customer_id, java.lang.String customer_name, java.lang.String adress, java.lang.String email, java.lang.String ph_no) throws java.rmi.RemoteException{
    if (add_new_customer == null)
      _initAdd_new_customerProxy();
    add_new_customer.add_customerinfo(customer_id, customer_name, adress, email, ph_no);
  }
  
  
}