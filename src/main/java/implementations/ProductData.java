package implementations;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductData {

	WebDriver driver;
	General general;
		
	public ProductData(WebDriver driver) {
		this.driver = driver; 
		this.general = new General(this.driver);
	}
	
	public void addStartDate() {
		String date = general.getFutureDate();
		driver.findElement(By.id("startdate")).sendKeys(date);
	}
	
	public void selectInsuranceSum() {
		WebElement selectInsuranceElement = driver.findElement(By.id("insurancesum"));
		Select selectInsurance = new Select(selectInsuranceElement);
		selectInsurance.selectByValue("3000000");
	}
	
	public void selectMeritRating() {
		WebElement selectMeritRatingElement = driver.findElement(By.id("meritrating"));
		Select selectMeritRating = new Select(selectMeritRatingElement);
		selectMeritRating.selectByValue("Bonus 1");
	}
	
	public void selectDmgInsurance() {
		WebElement selectDmgInsuranceElement = driver.findElement(By.id("damageinsurance"));
		Select selectDmgInsurance = new Select(selectDmgInsuranceElement);
		selectDmgInsurance.selectByValue("Full Coverage");
	}
	
	public void chooseOptionalProducts() {
		driver.findElements(By.className("ideal-check")).get(5).click();
	}
	
	public void selectCourtesyCar() {
		WebElement selectCourtesyCarElement = driver.findElement(By.id("courtesycar"));
		Select selectCourtesyCar = new Select(selectCourtesyCarElement);
		selectCourtesyCar.selectByValue("Yes");
	}
}
