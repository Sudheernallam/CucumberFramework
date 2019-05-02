package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs {
	
	@Given("^User is on HomePage$")
    public void user_is_on_homepage() throws Throwable {
		System.out.println("User is on Home Page");
    }

    @When("^User enters user ID and password$")
    public void user_enters_user_id_and_password() throws Throwable {
    	System.out.println("User enters user ID and password");
    }

    @Then("^User should be on Authenticated page$")
    public void user_should_be_on_authenticated_page() throws Throwable {
    	System.out.println("Clicks on login button");
    }

    @And("^Clicks on login button$")
    public void clicks_on_login_button() throws Throwable {
    	System.out.println("User should be on Authenticated page");
    }

}
