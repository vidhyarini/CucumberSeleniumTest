package stepDefinition;

import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	WebDriver driver;
	@Given("^Open facebook and login$")
	public void open_facebook_and_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	}

	@When("^I enter username as \"(.*?)\" and password as \"(.*?)\"$")
	public void i_enter_username_as_and_password_as(String username, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(ById.id("email")).sendKeys(username);
		driver.findElement(ById.id("pass")).sendKeys(password);
	}

	@Then("^login should be successful$")
	public void login_should_be_successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(ById.id("loginbutton")).click();
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
	    driver.quit();
	}

}
