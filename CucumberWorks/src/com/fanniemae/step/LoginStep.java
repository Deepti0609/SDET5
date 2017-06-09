package com.fanniemae.step;


import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {


@Given("^username and password$")
public void username_and_password(DataTable dataTable) throws Throwable {
	
	
	System.out.println("--------User Name and Passsword got from the Data Table----------");
	// we try getting the values which are passed in the feature file, all values are passed as data table
	
	
	
	
	List<Map <String,String>> dataList = 
			        dataTable.asMaps(String.class, String.class);
	
	for(Map<String,String> temp : dataList){
		
		System.out.println(temp.get("login") + " -> " + temp.get("pwd")+" -> " + temp.get("accesslevel"));

//	
//	System.out.println("User Name " + dataList.get(0).get("login"));
//	System.out.println("Password " + dataList.get(0).get("pwd"));
//	
//	
//	System.out.println("----------------------------------------------------");
//	
//	System.out.println("User Name " + dataList.get(1).get("login"));
//	System.out.println("Password " + dataList.get(1).get("pwd"));
	
	System.out.println("----------------------------------------------------");
	
}
}
@When("^login successful$")
public void login_successful() throws Throwable {
	System.out.println("*******login successful*********");
}

@Then("^show inbox$")
public void show_inbox() throws Throwable {
	System.out.println("*******Inbox********");
}


}
