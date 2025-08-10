package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DependancyInjectionStepsClassFirst {

	
	String product;
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		System.out.println("On home page");
	}

	@When("User select product")
	public void user_select_product() {
		System.out.println("sslected product");
	}

	@When("User added in the Cart")
	public void user_added_in_the_cart() {
		 product = "Rolex";
		System.out.println(product);
	}

	public String getProuctName() {
		return product;
	}
}
