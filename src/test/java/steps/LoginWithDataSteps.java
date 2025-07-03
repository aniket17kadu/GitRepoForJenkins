package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataSteps {

	@Given("User should be on login page")
	public void user_should_be_on_login_page() {
		System.out.println("on login page");
	}

	@When("enter username {string}")
	public void enter_username(String username) {
		System.out.println("entering username " + username);
	}

	@When("enter passward {int} or {string}")
	public void enter_passward(Integer passward1,  String passward2) {
		System.out.println("entering username " + passward1 + " or " + passward2);
	}

	@When("click on {int} login button")
	public void click_on_login_button( Integer xyz) {
		System.out.println("Clicked on 2nd login button "+ xyz);
	}

	@Then("User should be successfully logged in to the system")
	public void user_should_be_successfully_logged_in_to_the_system() {
		System.out.println("Successfully logged in");
	}

}
