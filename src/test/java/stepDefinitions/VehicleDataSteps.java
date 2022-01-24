package stepDefinitions;

import org.openqa.selenium.WebDriver;

import implementations.General;
import implementations.VehicleData;
import io.cucumber.java.en.When;

public class VehicleDataSteps{

	@When("I enter the vehicle data")
	public void i_enter_the_vehicle_data() {
		GeneralStepDefinitions gsd = new GeneralStepDefinitions();
		General general = new General(gsd.driver);
		
		VehicleData vehicleData = new VehicleData(gsd.driver);
		
	    vehicleData.fillCarModel();
	    vehicleData.fillManufactureDate();
	    vehicleData.fillNumberOfSeats();
	    vehicleData.selectFuelType();
	    vehicleData.fillListPrice();
	    vehicleData.fillLicensePlate();
	    vehicleData.fillAnnualMileage();
	    
	    general.goToNextPage("nextenterinsurantdata");
	}
	
}
