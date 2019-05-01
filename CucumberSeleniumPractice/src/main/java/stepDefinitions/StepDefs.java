package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs {
	
	@Given("^User is on HomePage$")
	public void User_is_on_HomePage(){
		System.out.println("User is on Home Page");
	}
	
	@When("^User enters user ID and password$")
	public void User_enters_userID_and_password(){
		System.out.println("User enters user ID and password");
	}
	
	@And("^Clicks on login button$")
	public void Clicks_on_login_button(){
		System.out.println("Clicks on login button");
	}
	
	@Then("^User should be on Authenticated page$")
	public void User_should_be_on_Authenticated_page(){
		System.out.println("User should be on Authenticated page");
	}

}
