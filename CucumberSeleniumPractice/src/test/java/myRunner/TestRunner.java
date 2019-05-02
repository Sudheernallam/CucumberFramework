package myRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "//CucumberSeleniumPractice//src//main//java//features///Register.feature",
		glue = "//CucumberSeleniumPractice//src//main//java//stepDefinitions//StepDefs.java",
		dryRun = true,
		monochrome = true,
		tags = {"@sudheer"},
		format = {"pretty", "html:test-ouput"}, // json:json_Output/cucumber.json
		strict = false
		)

public class TestRunner {


}
