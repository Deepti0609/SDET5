package com.fanniemae;

public class ICreditScoreCheckProxy implements com.fanniemae.ICreditScoreCheck {
  private String _endpoint = null;
  private com.fanniemae.ICreditScoreCheck iCreditScoreCheck = null;
  
  public ICreditScoreCheckProxy() {
    _initICreditScoreCheckProxy();
  }
  
  public ICreditScoreCheckProxy(String endpoint) {
    _endpoint = endpoint;
    _initICreditScoreCheckProxy();
  }
  
  private void _initICreditScoreCheckProxy() {
    try {
      iCreditScoreCheck = (new com.fanniemae.CreditScoreCheckServiceLocator()).getCreditScoreCheckPort();
      if (iCreditScoreCheck != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iCreditScoreCheck)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iCreditScoreCheck)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iCreditScoreCheck != null)
      ((javax.xml.rpc.Stub)iCreditScoreCheck)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.fanniemae.ICreditScoreCheck getICreditScoreCheck() {
    if (iCreditScoreCheck == null)
      _initICreditScoreCheckProxy();
    return iCreditScoreCheck;
  }
  
  public java.lang.String sayHi(java.lang.String arg0) throws java.rmi.RemoteException{
    if (iCreditScoreCheck == null)
      _initICreditScoreCheckProxy();
    return iCreditScoreCheck.sayHi(arg0);
  }
  
  public java.lang.String checkCreditScore(java.lang.String arg0, int arg1) throws java.rmi.RemoteException{
    if (iCreditScoreCheck == null)
      _initICreditScoreCheckProxy();
    return iCreditScoreCheck.checkCreditScore(arg0, arg1);
  }
  
  public boolean checkEligible(int arg0) throws java.rmi.RemoteException{
    if (iCreditScoreCheck == null)
      _initICreditScoreCheckProxy();
    return iCreditScoreCheck.checkEligible(arg0);
  }
  
  
}