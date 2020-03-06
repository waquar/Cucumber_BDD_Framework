package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {
	
	@Given("^User is on landing page$")
	public void User_is_on_landing_page() throws Throwable {
		//code to login
		System.out.println("Number 1");
	}
    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	//code to put username and password
    	System.out.println("Number 2");
    }

    @Then("^homepage comes to screen$")
    public void homepage_comes_to_screen() throws Throwable {
    	//code to check login successful
    	System.out.println("Number 3");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	//code to display landing page of screen
    	System.out.println("Number 4");
    }

}
