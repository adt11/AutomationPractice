package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/Features/",
glue="steps",
dryRun=false,
strict = true,
monochrome = true,
tags = {"@Smoke"},
plugin= {"pretty","html:target/site/cucmber-pretty", "json:target/cucumber/cucumber.json","rerun:rerun/failed_scenarios.txt",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class TestRunner {
	
	
}
