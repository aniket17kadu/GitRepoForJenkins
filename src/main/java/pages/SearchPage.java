package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage{
	
	WebDriver driver;
	
	@FindBy (xpath = "//*[@id='twotabsearchtextbox']")
	WebElement searchField;
	
	@FindBy (xpath ="//*[@id='nav-search-submit-button']")
	WebElement searchButton;
	
	@FindBy (xpath = "//*[@id='brandsRefinements']")
	WebElement mobilePhone;
	
	public SearchPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void searchProduct (String productToBeSearch) {
		clearAndSendKeys(searchField, productToBeSearch);
		click(searchButton);
	}
	
	public boolean isMobilePhoneDisplayed() {
		waitForElementToBeClickable(mobilePhone);
		boolean isDisplaying =mobilePhone.isDisplayed();
		return isDisplaying;
	}

}
