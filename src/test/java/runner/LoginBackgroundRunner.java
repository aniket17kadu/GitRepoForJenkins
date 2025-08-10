package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
		
		features = {"src\\test\\resources\\appfeature\\loginBackground.feature"},
		
		glue = {"steps"},
		
		plugin = {"pretty",
				"json:target/MyReports/report.json",
				"junit:target/MyReports/report.xml"},
		monochrome = false,
		dryRun = true
		
		)

public class LoginBackgroundRunner extends AbstractTestNGCucumberTests{

}
