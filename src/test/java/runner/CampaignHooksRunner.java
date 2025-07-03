package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



	
	@CucumberOptions (
			
			features = {"src\\test\\resources\\appfeature\\CampaignHooks.feature"},
			
			glue = {"steps", "hooks"},
			
			plugin = {"pretty"},
			
			tags = "@Regression or @Aniket"
			
			)
	
	public class CampaignHooksRunner extends AbstractTestNGCucumberTests{
}
