package uifeatures;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\uifeatures"},
		
		glue = {"uifeatures"},
		
		plugin = {"pretty",
			 "html:target/MyReports/Amazon.html"},
		
		publish = true
		)


public class AmazonTestRunner extends AbstractTestNGCucumberTests{

}
