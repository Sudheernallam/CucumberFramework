package myRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features",
		glue = "stepDefinitions",
		dryRun = true,
		monochrome = true,
		format = {"pretty", "html:test-ouput"}, // json:json_Output/cucumber.json
		strict = false
		
		)

public class TestRunner {

}
