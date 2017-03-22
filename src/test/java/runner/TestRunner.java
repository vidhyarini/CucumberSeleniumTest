package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features",glue ={"stepDefinition"},tags="@SmokeTest",plugin = "html:target/cucumber-html-report")
public class TestRunner {

}
