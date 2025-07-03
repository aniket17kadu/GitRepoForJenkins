package steps;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BankAccountDataTableSteps {

	@Given("User is on account page")
	public void user_is_on_account_page() {
		System.out.println("on account page");
	}

	@When("User enters valid info")
	public void user_enters_valid_info(DataTable dataTable) {
		List<Map<String, String>> getData = dataTable.asMaps();
//		List<String> data =getData.get(0);
//		String value =data.get(1);
//		System.out.println("Valid info entered  "+  value);
		for (Map<String, String> e : getData) {
			System.out.println(e.get("Name"));
			System.out.println(e.get("Lastname"));
			System.out.println(e.get("Age"));
			System.out.println(e.get("Email"));
			System.out.println(e.get("Gender"));

		
		}
		
	}

	@When("user click on submit")	
	public void user_click_on_submit() {
		System.out.println("clicked submit btn");
	}

	@Then("Successfull")
	public void successfull() {
		System.out.println("Account created successfully");
	}

}
