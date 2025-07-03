package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginBackgroundSteps {

	@Given("I am at the login page")
	public void i_am_at_the_login_page() {
	   System.out.println("i_am_at_the_login_page");
	}

	@When("Enter valid username")
	public void enter_valid_username() {
		  System.out.println("enter_valid_username");
	}

	@When("Enter valid password")
	public void enter_valid_password() {
		  System.out.println("enter_valid_password");
	}

	@When("Click on login button")
	public void click_on_login_button() {
		  System.out.println("click_on_login_button");
	}

	@Then("User should be successfully logged in")
	public void user_should_be_successfully_logged_in() {
		  System.out.println("user_should_be_successfully_logged_in");
	}

	@Then("Validate user is on Dashboard page")
	public void validate_user_is_on_dashboard_page() {
		  System.out.println("validate_user_is_on_dashboard_page");
	}

	@Then("Validate title of the page")
	public void validate_title_of_the_page() {
		  System.out.println("validate_title_of_the_page");
	}
}
