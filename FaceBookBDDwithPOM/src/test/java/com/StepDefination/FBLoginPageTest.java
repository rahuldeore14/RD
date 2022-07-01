package com.StepDefination;

import BaseLayer.BaseClassFB;
import PageLayer.LoginPageFB;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FBLoginPageTest extends BaseClassFB{
	LoginPageFB loginpageFB;
	
	@Given("User On Create Page")
	public void user_on_create_page() {
		BaseClassFB.initialization();
		
	   
	}
	@When("User Enter Valid Credentials")
	public void user_enter_valid_credentials() {
		loginpageFB = new LoginPageFB();
		 loginpageFB.LoginPageFunctionality(prop.getProperty("username"),prop.getProperty("lastname"), prop.getProperty("email"), prop.getProperty("confirmpassword"));
		
		
	   
	}
	@Then("User On Home Page")
	public void user_on_home_page() {
		System.out.println(driver.getTitle());
	    
	}

}
