package drivermanager;

import org.openqa.selenium.WebDriver;

import pages.HomePage;
import pages.SearchPage;

public class PageFactoryManager {

	public HomePage homePage;

	public SearchPage searchPage;

	public HomePage  getHomePageObject(WebDriver driver) {

		if (homePage == null) {
		return homePage = new HomePage(driver);
			 
		}

		else {
			return homePage;
		}

	}

	public SearchPage getSearchPageObject(WebDriver driver) {

		if (searchPage == null) {
			return searchPage = new SearchPage(driver);

		}

		else {
			return searchPage;
		}

	}
}