package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Anni\\eclipse-workspace\\SeleniumDemo\\src\\test\\java\\features\\RemoveAllListItems.feature", glue = {
		"steps" })
public class AlIItemRemoveRunners {

}
