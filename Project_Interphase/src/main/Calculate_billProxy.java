package main;

public class Calculate_billProxy implements main.Calculate_bill {
  private String _endpoint = null;
  private main.Calculate_bill calculate_bill = null;
  
  public Calculate_billProxy() {
    _initCalculate_billProxy();
  }
  
  public Calculate_billProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculate_billProxy();
  }
  
  private void _initCalculate_billProxy() {
    try {
      calculate_bill = (new main.Calculate_billServiceLocator()).getcalculate_bill();
      if (calculate_bill != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculate_bill)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculate_bill)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculate_bill != null)
      ((javax.xml.rpc.Stub)calculate_bill)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Calculate_bill getCalculate_bill() {
    if (calculate_bill == null)
      _initCalculate_billProxy();
    return calculate_bill;
  }
  
  public double calculate_billing(int meter_No) throws java.rmi.RemoteException{
    if (calculate_bill == null)
      _initCalculate_billProxy();
    return calculate_bill.calculate_billing(meter_No);
  }
  
  
}