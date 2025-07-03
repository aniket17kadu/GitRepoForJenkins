package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {

	@Given("user on sign up page")
	public void user_on_sign_up_page() {
		System.out.println("On sign up page");
	}

	@When("User enter {string} in name")
	public void user_enter_in_name(String name) {
		System.out.println("entered name " + name);
	}

	@When("User select {string} from dropdown")
	public void user_select_from_dropdown(String gender) {
		System.out.println("slecting gender " + gender);
	}

	@When("User select {int} as well {double}")
	public void user_select_as_well(Integer slot, double weight) {
		System.out.println("selecting slot " + slot + " and weight is "+ weight);
	}

	@Then("Successfull sign up")
	public void successfull_sign_up() {
		System.out.println("Successful signed up");
	}

	@Given("user entered on dashboard")
	public void user_entered_on_dashboard() {
		System.out.println("user entered on dashboard");
	}

	@Then("user is able to see options")
	public void user_is_able_to_see_options() {
		System.out.println("user is able to see options");

	}

}
