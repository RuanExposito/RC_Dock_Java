package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import implementations.*;
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
		general = new General(driver);
	}
	
	@After
	public void teardown() {
		//driver.close();
		//driver.quit();
	}
	
	@Given("I am at Tricentis page")
	public void i_am_at_tricentis_page() throws Exception {
	    general.mainTricentisPage();
	}

	@When("I enter the vehicle data")
	public void i_enter_the_vehicle_data() {
		VehicleData vehicleData = new VehicleData(driver);
		
	    vehicleData.fillCarModel();
	    vehicleData.fillManufactureDate();
	    vehicleData.fillNumberOfSeats();
	    vehicleData.selectFuelType();
	    vehicleData.fillListPrice();
	    vehicleData.fillLicensePlate();
	    vehicleData.fillAnnualMileage();
	    
	    general.goToNextPage("nextenterinsurantdata");
	}

	@When("I enter the insurant data")
	public void i_enter_the_insurant_data() {
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		InsurantData insurantData = new InsurantData(driver);
	    
	    insurantData.fillName();
	    insurantData.fillBirthdate();
	    insurantData.selectGender();
	    insurantData.fillAddress();
	    insurantData.fillOcupationAndHobbie();
	    insurantData.insertMyWebsite();
	    
	    general.goToNextPage("nextenterproductdata");
	}

	@When("I enter the product data")
	public void i_enter_the_product_data() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		ProductData productData = new ProductData(driver);
		
		productData.addStartDate();
		productData.selectInsuranceSum();
		productData.selectMeritRating();
		productData.selectDmgInsurance();
		productData.chooseOptionalProducts();
		productData.selectCourtesyCar();

		general.goToNextPage("nextselectpriceoption");
		
	}

	@When("I select the price option")
	public void i_select_the_price_option() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElements(By.className("ideal-radio")).get(5).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		general.goToNextPage("nextsendquote");
	}

	@When("I send quote")
	public void i_send_quote() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I see the success feedback")
	public void i_see_the_success_feedback() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	
	
}
