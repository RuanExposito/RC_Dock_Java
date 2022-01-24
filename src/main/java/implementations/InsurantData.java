package implementations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class InsurantData {
	WebDriver driver;
	
	public InsurantData(WebDriver driver) {
		this.driver = driver; 
	}
	
	public void fillName() {
		driver.findElement(By.id("firstname")).sendKeys("Ruan");
		driver.findElement(By.id("lastname")).sendKeys("Carvalho");
	}
	
	public void fillBirthdate() {
		driver.findElement(By.id("birthdate")).sendKeys("03/06/1999");
	}
	
	public void selectGender() {
		driver.findElements(By.className("ideal-radio")).get(2).click();
	}
	
	public void fillAddress() {
		driver.findElement(By.id("streetaddress")).sendKeys("Rua Maria Concessa de Medeiros");
		
		WebElement selectCountryElement = driver.findElement(By.id("country"));
		Select selectCountry = new Select(selectCountryElement);
		selectCountry.selectByValue("Brazil");
		
		driver.findElement(By.id("zipcode")).sendKeys("06704290");
		driver.findElement(By.id("city")).sendKeys("Taboão da Serra");
	}
	
	public void fillOcupationAndHobbie() {
		WebElement selectOccupationElement = driver.findElement(By.id("occupation"));
		Select selectOccupation = new Select(selectOccupationElement);
		selectOccupation.selectByValue("Employee");
		
		driver.findElements(By.className("ideal-check")).get(0).click();
		driver.findElements(By.className("ideal-check")).get(2).click();
	}
	
	public void insertMyWebsite() {
		driver.findElement(By.id("website")).sendKeys("https://www.linkedin.com/in/ruan-exposito-de-carvalho-4a1642b0/");
	}
	
	
}
