/**
 * ICreditScoreCheck.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fanniemae;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public interface ICreditScoreCheck extends java.rmi.Remote {
    public java.lang.String sayHi(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String checkCreditScore(java.lang.String arg0, int arg1) throws java.rmi.RemoteException;
    public boolean checkEligible(int arg0) throws java.rmi.RemoteException;
}
