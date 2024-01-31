package main;

public class Admin_LoginProxy implements main.Admin_Login {
  private String _endpoint = null;
  private main.Admin_Login admin_Login = null;
  
  public Admin_LoginProxy() {
    _initAdmin_LoginProxy();
  }
  
  public Admin_LoginProxy(String endpoint) {
    _endpoint = endpoint;
    _initAdmin_LoginProxy();
  }
  
  private void _initAdmin_LoginProxy() {
    try {
      admin_Login = (new main.Admin_LoginServiceLocator()).getAdmin_Login();
      if (admin_Login != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)admin_Login)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)admin_Login)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (admin_Login != null)
      ((javax.xml.rpc.Stub)admin_Login)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Admin_Login getAdmin_Login() {
    if (admin_Login == null)
      _initAdmin_LoginProxy();
    return admin_Login;
  }
  
  public java.lang.String login_info(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (admin_Login == null)
      _initAdmin_LoginProxy();
    return admin_Login.login_info(username, password);
  }
  
  
}