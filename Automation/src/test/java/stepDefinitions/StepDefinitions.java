package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import implementations.General;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	
	WebDriver driver = null;
	General general = null;
	
	@Before
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		driver.manage().window().maximize();
		general = new General();
	}
	
	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}
	
	@Given("I am at Tricentis page")
	public void i_am_at_tricentis_page() throws Exception {
	    general.mainTricentisPage(driver);
	}

	@When("I enter the vehicle data")
	public void i_enter_the_vehicle_data() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I enter the insurant data")
	public void i_enter_the_insurant_data() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I enter the product data")
	public void i_enter_the_product_data() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I select the price option")
	public void i_select_the_price_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I send quote")
	public void i_send_quote() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I see the success feedback")
	public void i_see_the_success_feedback() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	
	
}
