package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CampaignHooksSteps {

	
	@Given("User is on campaign day")
	public void user_is_on_campaign_day() {
	System.out.println("campaign day");
	}

	@When("User is travelling to location")
	public void user_is_travelling_to_location() {
		System.out.println("travelling campaign location");

	}

	@When("User reaches at location")
	public void user_reaches_at_location() {
		System.out.println("reached at loaction");

	}

	@Then("User started campaigning")
	public void user_started_campaigning() {
		System.out.println(" Started campaign");

	}

	@Given("User is on campaign day {int}")
	public void user_is_on_campaign_day(Integer int1) {
		System.out.println("campaign day  "+ 2 );

	}

	@When("User is travelling to {int} location")
	public void user_is_travelling_to_location(Integer int1) {
		System.out.println("ravelling campaign location  "+ 2);

	}

	@When("User reaches at {int} location")
	public void user_reaches_at_location(Integer int1) {
		System.out.println("reached at loaction   " + 2);

	}

}
