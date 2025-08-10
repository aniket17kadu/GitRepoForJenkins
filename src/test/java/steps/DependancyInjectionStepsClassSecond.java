package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DependancyInjectionStepsClassSecond {
	
	DependancyInjectionStepsClassFirst refVar;
	
	public DependancyInjectionStepsClassSecond(DependancyInjectionStepsClassFirst refVar){
		this.refVar = refVar;
	}
	

	@When("User buys product")
	public void user_buys_product() {
		System.out.println("Buys product");
	}

	@Then("Order placed succrssfully")
	public void order_placed_succrssfully() {
		
		String ref= refVar.getProuctName();
		System.out.println(ref);
		
	}

}
