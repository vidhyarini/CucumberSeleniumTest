package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features",glue ={"stepDefinition"},plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json" })
public class TestRunner {

}
