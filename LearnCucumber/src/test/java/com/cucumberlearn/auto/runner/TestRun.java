package com.cucumberlearn.auto.runner;
import org.junit.runner.Runwith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty","html:target/cucumber","json:target/cucumber.json","rerun:target/failed_scenarios.txt"},
		features = "src/test/resorces/com",
		glue = "com.cucumberlearn.auto.step",
		tags= {@IMSH_WGS},
		strict = true
		
		
)


public class TestRun {

}
