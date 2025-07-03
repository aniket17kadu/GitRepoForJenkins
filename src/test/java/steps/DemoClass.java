package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoClass {
	
	@Given("login page")
	public void login_page() {
		System.out.println("login page");
	}
	
@When("entered")
public void enteredpage() {
	System.out.println("entered");
	
}

@Then ("done")
public void thenPage() {
	System.out.println("Done");
}

}
