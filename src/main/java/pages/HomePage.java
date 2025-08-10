package pages;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

	WebDriver driver;

	@FindBy(xpath = "//*[@id='nav-cart']")
	private WebElement cartIcon;

	@FindBy(xpath = "//*[@alt='op']//parent::a")
	private WebElement dealsection;

	@FindBy(xpath = "//*[@id='productTitle']/parent::h1")
	private WebElement noiseBrand;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getTitleOfPage() {
		String title = driver.getTitle();
		return title;

	}

	public boolean isCartIconDisplayed() {
		boolean isDisplaying = cartIcon.isDisplayed();
		return isDisplaying;

	}

	public void checkoutDealSection() {
		waitForVisibilityOfElement(dealsection);
		try {
			dealsection.click(); // normal click
		} catch (ElementClickInterceptedException e) {
			System.out.println("Click intercepted. Trying JS click...");
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dealsection);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", dealsection);
		}
	}

	public boolean brandIsAvailableOnDealSection() {
		waitForVisibilityOfElement(noiseBrand);
		boolean isGettingDisplayed = noiseBrand.isDisplayed();
		return isGettingDisplayed;
	}
}
