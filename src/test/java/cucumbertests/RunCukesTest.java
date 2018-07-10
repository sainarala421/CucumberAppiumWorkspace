package cucumbertests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import resources.utils.constants.GlobalVariables;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber-html-report","json:cucumber.json"},
		features = GlobalVariables.FEATURES_PATH,
		glue = {GlobalVariables.GLUE_KEYWORDS_PATH}
)
public class RunCukesTest { 	
}
