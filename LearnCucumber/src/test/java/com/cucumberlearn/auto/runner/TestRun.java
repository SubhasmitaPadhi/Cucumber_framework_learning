package com.cucumberlearn.auto.runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty","html:target/cucumber","json:target/cucumber.json","rerun:target/failed_scenarios.txt"},
		features = "src/test/java/com/cucumberlearn/auto/feature",
		glue = "com.cucumberlearn.auto.step",
		tags= {"@tag"},
		dryRun = true
		
		
)


public class TestRun {

}
