package com.fanniemae;

import javax.xml.ws.Endpoint;

public class CreditScoreHost {
	
	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:8876/fanniemae", new CreditScoreCheck());
		System.out.println("Hosted ..........");
		System.out.println("http://127.0.0.1.8876/fanniemae");
	}

}
