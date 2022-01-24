package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import implementations.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GeneralStepDefinitions {
	
	static public WebDriver driver = null;
	static public General general = null;
	
	@Before
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		driver.manage().window().maximize();
		general = new General(driver);
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
	
	@Given("I am at Tricentis page")
	public void i_am_at_tricentis_page() throws Exception {
	    general.mainTricentisPage();
	}

	@Then("I see the success feedback")
	public void i_see_the_success_feedback() throws Exception {
		general.waitLoadsFinish();
		general.validateSuccessFeedback();
	}
}
