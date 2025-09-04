package uifeatures;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import drivermanager.DriverFactory;
import drivermanager.PageFactoryManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utility.ReadProperty;

public class HomePageSteps {

	HomePage homePage;
	

	public HomePageSteps() {

		homePage = new PageFactoryManager().getHomePageObject(DriverFactory.getDriver());
		
	}

	@Given("user is at the landing page")
	public void user_is_at_the_landing_page() throws IOException {

		WebDriver driver = DriverFactory.getDriver();
		driver.get(ReadProperty.getPropertyData("testSiteURL"));
	}

	@Then("page title should contains {string}")
	public void page_title_should_contains(String string) {

		String title = homePage.getTitleOfPage();
		System.out.println("Page title is: " + homePage.getTitleOfPage());
		boolean isPresent = title.contains(string);
		Assert.assertEquals(isPresent, true);

	}

	@Then("cart icon should get displayed")
	public void cart_icon_should_get_displayed() {
		boolean isDisplaying = homePage.isCartIconDisplayed();
		Assert.assertEquals(isDisplaying, true);
	}

	@When("user clicks on deals")
	public void user_clicks_on_deals() {
		homePage.checkoutDealSection();

	}

	@Then("user should redirect to deal page")
	public void user_should_redirect_to_deal_page() {

		boolean isPresent = homePage.brandIsAvailableOnDealSection();
		Assert.assertEquals(isPresent, true);

	}
	
	

}
