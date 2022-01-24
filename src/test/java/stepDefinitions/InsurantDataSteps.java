package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import implementations.General;
import implementations.InsurantData;
import io.cucumber.java.en.When;

public class InsurantDataSteps{
	
	@When("I enter the insurant data")
	public void i_enter_the_insurant_data() {
		GeneralStepDefinitions gsd = new GeneralStepDefinitions();
		General general = new General(gsd.driver);
		
		gsd.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		InsurantData insurantData = new InsurantData(gsd.driver);
	    
	    insurantData.fillName();
	    insurantData.fillBirthdate();
	    insurantData.selectGender();
	    insurantData.fillAddress();
	    insurantData.fillOcupationAndHobbie();
	    insurantData.insertMyWebsite();
	    
	    general.goToNextPage("nextenterproductdata");
	}
	
}
