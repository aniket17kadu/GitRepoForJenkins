package uifeatures;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import drivermanager.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utility.ReadProperty;

public class ApplicationHooks {
	static WebDriver driver;

	@BeforeAll

	public static void launchBrowser() throws IOException {

		DriverFactory df = new DriverFactory();
		String browserData = ReadProperty.getPropertyData("browser");
// reading data from command prompt
		String valueFromCommandPrompt = System.getProperty("cliBrowser");
		if (valueFromCommandPrompt != null) {
			browserData = valueFromCommandPrompt;

		}
		driver = df.initBrowser(browserData);
		driver.manage().window().maximize();
	}

	@After(order = 2)
	public void tearDown(Scenario scenario) {

		boolean isScenarioFailed = scenario.isFailed();

		if (isScenarioFailed) {
			TakesScreenshot ts = (TakesScreenshot) driver;

			byte[] source = ts.getScreenshotAs(OutputType.BYTES);

			scenario.attach(source, "image/png", scenario.getName());

		}

	}

	@AfterAll(order = 1)

	public static void closeBrowser() {
		driver.quit();
	}

}
