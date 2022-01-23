package implementations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class VehicleData {
	
	General general = new General();
	
	public void fillCarModel(WebDriver driver) {
		WebElement selectMakeElement = driver.findElement(By.id("make"));
		Select selectMake = new Select(selectMakeElement);
		selectMake.selectByValue("Audi");
		
		if (general.elementIsPresent(driver, "model")) {
			WebElement selectModelElement = driver.findElement(By.id("model"));
			Select selectModel = new Select(selectModelElement);
			selectModel.selectByValue("Scooter");
			
			driver.findElement(By.id("cylindercapacity")).sendKeys("1234");
		}
		
		driver.findElement(By.id("engineperformance")).sendKeys("1234");
	}
	
	public void fillManufactureDate(WebDriver driver) {
		driver.findElement(By.id("dateofmanufacture")).sendKeys("12/12/2012");
	}
	
	public void fillNumberOfSeats(WebDriver driver) {
		WebElement selectSeatsElement = driver.findElement(By.id("numberofseats"));
		Select selectSeats = new Select(selectSeatsElement);
		selectSeats.selectByValue("4");
		
		if(general.elementIsPresent(driver, "righthanddriveyes")) {
			driver.findElements(By.className("ideal-radio")).get(0).click();
			
			WebElement selectSeatsMotorcycleElement = driver.findElement(By.id("numberofseatsmotorcycle"));
			Select selectSeatsMotorcycle = new Select(selectSeatsMotorcycleElement);
			selectSeatsMotorcycle.selectByValue("2");
		}
	}
	
	public void selectFuelType(WebDriver driver) {
		WebElement selectFuelElement = driver.findElement(By.id("fuel"));
		Select selectFuel = new Select(selectFuelElement);
		selectFuel.selectByValue("Petrol");
		
		if(general.elementIsPresent(driver, "payload")) {
			driver.findElement(By.id("payload")).sendKeys("123");
			driver.findElement(By.id("totalweight")).sendKeys("123");
		}
	}
	
	public void fillListPrice(WebDriver driver) {
		driver.findElement(By.id("listprice")).sendKeys("1234");
	}
	
	public void fillLicensePlate(WebDriver driver) {
		driver.findElement(By.id("licenseplatenumber")).sendKeys("1234");
	}
	
	public void fillAnnualMileage(WebDriver driver) {
		driver.findElement(By.id("annualmileage")).sendKeys("1234");
	}
}
