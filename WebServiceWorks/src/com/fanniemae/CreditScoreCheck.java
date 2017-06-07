package com.fanniemae;

import javax.jws.WebService;


/**
* The @WebService property endpointInterface links the
* SIB (this class) to the SEI (com.fanniemae.CreditScoreCheck).
* Note that the method implementations are not annotated
* as @WebMethods.
*/


@WebService(endpointInterface="com.fanniemae.ICreditScoreCheck")
public class CreditScoreCheck implements ICreditScoreCheck {

	@Override
	public String sayHi(String name) {
		// TODO Auto-generated method stub
		return "Hi " + name + "this is for testing";
	}

	@Override
	public String checkCreditScore(String name, int score) {
		// TODO Auto-generated method stub
		if(score < 400){
			return "Sorry loan process is not done Mr/Mrs/Ms : " +name;
		
		}else if (score >=400 && score < 600){
			return "Your processing shall take some time now please wait Mr/Mrs/Ms : " + name;
		}else {
			return "Congrats loan procession in progress Mr/Mrs/Ms :" + name;
		}
	}

	@Override
	public boolean checkEligible(int score) {
		// TODO Auto-generated method stub
		return score > 600;
	}

}
