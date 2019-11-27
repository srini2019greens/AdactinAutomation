package com.cucumber.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition {

	@Given("^User launch the browser and hit the facebook application$")
	public void user_launch_the_browser_and_hit_the_facebook_application() throws Throwable {
		System.out.println("Hit FB App");
	}

	@When("^User enter the user name or email id$")
	public void user_enter_the_user_name_or_email_id() throws Throwable {
		System.out.println("Entered testuser@gmail.com");
	}

	@When("^User enter the password$")
	public void user_enter_the_password() throws Throwable {
		System.out.println("entered password123");
	}

	@When("^User click on the login button$")
	public void user_click_on_the_login_button() throws Throwable {
		System.out.println("Clicked on login");
	}

	@Then("^User Verify the user name in the header$")
	public void user_Verify_the_user_name_in_the_header() throws Throwable {
		System.out.println("Test user present in the header");
	}

	@When("^User enter the user name or email id \"([^\"]*)\"$")
	public void user_enter_the_user_name_or_email_id(String arg1) throws Throwable {
		System.out.println("Entered email is "+ arg1);
	}

	@When("^User enter the password \"([^\"]*)\"$")
	public void user_enter_the_password(String arg1) throws Throwable {
		System.out.println("Entered password "+ arg1);
	}

	@Then("^User verify the user name \"([^\"]*)\" in the header$")
	public void user_verify_the_user_name_in_the_header(String arg1) throws Throwable {
		System.out.println("User displayed is "+ arg1);
	}
	
	@When("^User logout the application$")
	public void user_logout_the_application() {
		System.out.println("User logout the application");
	}
}
