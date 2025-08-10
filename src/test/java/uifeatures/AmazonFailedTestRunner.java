package uifeatures;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		//features = {"src\\test\\resources\\uifeatures"},
		
		features = {"target/failedrun.txt"},
		glue = {"uifeatures"},
		
		plugin = {"pretty",
			 "html:target/MyReports/Amazon.html",
			 "rerun:target/failedrun.txt"},
		
		publish = true
		)


public class AmazonFailedTestRunner extends AbstractTestNGCucumberTests{

}
