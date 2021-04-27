package com.api.sv.stepdfn;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDfn {
	 @Given("^User is at the login page of the application$")
	    public void user_is_at_the_login_page_of_the_application() throws Throwable {
	        
	    }

	    @When("^User with following username and password$")
	    public void user_with_following_username_and_password(DataTable table ) throws Throwable {
	    /*List<List<String>> data=table.asLists();
	        for(List<String> str :data) {
	        	for(String str1 :str) {
	        		System.out.println("Data value is "+ str1);
	        	}
	        }*/
	    	
	    /*Map<String,String> data=table.asMap(String.class, String.class);
	    for(String key:data.keySet())
	    {
	    	System.out.println(String.format("Key : %s  and value : %s ",key,data.get(key)));
	    }
	    */
	    
	   List<String> dataList= table.asList();
	   for(String key:dataList)
	   {
		   System.out.println(String.format("Key : %s",key));
	   }
	    
	    
	    
	    
	    
	   
	    }

	    @Then("^User should be able to login with correct username and password$")
	    public void user_should_be_able_to_login_with_correct_username_and_password() throws Throwable {
	        
	    }

}
