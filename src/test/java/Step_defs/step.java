package Step_defs;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step {
	WebDriver driver;
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver","/home/qainfotech/Downloads/chromedriver");	
	    driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("http://10.0.1.86/");
	    String title = driver.getTitle();
	    System.out.println(title);
		Assert.assertTrue(true);
	    throw new cucumber.api.PendingException();
	}

	@When("User enters correct Username")
	public void user_enters_correct_Username() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User enters correct password")
	public void user_enters_correct_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("User click signin button")
	public void user_click_signin_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("User redirected to timesheet")
	public void user_redirected_to_timesheet() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


}
