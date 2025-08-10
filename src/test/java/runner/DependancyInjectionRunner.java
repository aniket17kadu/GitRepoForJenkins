package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src/test/resources/appfeature/DependancyInjectionRunner.feature"},
		
		glue = {"steps"},
		
		plugin = {"pretty"},
		
		publish = true
		)

public class DependancyInjectionRunner extends AbstractTestNGCucumberTests {

}
