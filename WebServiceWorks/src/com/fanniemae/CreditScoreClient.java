package com.fanniemae;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class CreditScoreClient {

	public static void main(String[] args) throws MalformedURLException, RemoteException {
		URL url = new URL("http://127.0.0.1:8876/fanniemae?WSDL");
		
		//url is from WSDL targetNameSpace, Service name from WSDL name
		QName qname = new QName("http://fanniemae.com/","CreditScoreCheckService");
		
		Service service = Service.create(url, qname);
		
		ICreditScoreCheck csc = service.getPort(ICreditScoreCheck.class);
		
		
			System.out.println(csc.checkCreditScore("Harry", 343));
	
	
			System.out.println("Eligibility for 400: " +csc.checkEligible(400) );
		

			System.out.println(csc.sayHi("Harry"));
		
	}
}
