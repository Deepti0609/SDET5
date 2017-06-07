package com.fanniemae.model;

import com.fanniemae.bean.LoginBean;

public class LoginBL {

	public boolean validateLogin(LoginBean lb){
		//this will be connected to JDBC
		if(lb.getuName().equals("fannie")&&lb.getPassword().equals("hello")){
		return true;
		} else {
			return false;
		}
	}
}
