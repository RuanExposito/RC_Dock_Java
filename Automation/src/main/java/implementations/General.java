package implementations;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class General {
	WebDriver driver;
	
	public General(WebDriver driver) {
		this.driver = driver; 
	}

	public boolean elementIsPresent(String elementId) {
		boolean isPresent = driver.findElements(By.id(elementId)).size() > 0;
		return isPresent;
	}
	
	public void mainTricentisPage() throws Exception {
		boolean verifyHearderImage = elementIsPresent("tricentis_logo");
	    boolean verifyPageName = elementIsPresent("entervehicledata");
	    
	    //Checking if I've been redirected to right page. If not, return an error
	    if (!verifyHearderImage && !verifyPageName) {
	    	throw new Exception("Page isn't valid");
	    }
	}
	
	public void goToNextPage(String nextPageId) {
		driver.findElement(By.id(nextPageId)).click();
	}
	
	public String getFutureDate() {
		String futureDate = "";
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String formatedDate = date.format(formatter);
		
		String currentDay = formatedDate.split("-")[0];
		String currentMonth = formatedDate.split("-")[1];
		String currentYear = formatedDate.split("-")[2];
		
		int currentMonthToInt = Integer.parseInt(currentMonth);
		
		
		if (currentMonthToInt + 2 <= 12) {
			futureDate = String.valueOf(currentMonthToInt + 2) + "/" + currentDay + "/" + currentYear;
		}
		else if(currentMonthToInt + 2 == 13) {
			int currentYearToInt = Integer.parseInt(currentYear);
			futureDate = "01/" + currentDay + "/" + String.valueOf(currentYearToInt + 1);
		}
		else {
			int currentYearToInt = Integer.parseInt(currentYear);
			futureDate = "02/" + currentDay + "/" + String.valueOf(currentYearToInt + 1);
		}
		
		return futureDate;
	}
}
