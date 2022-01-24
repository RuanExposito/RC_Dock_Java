package implementations;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

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
	
	public void waitLoadsFinish() {
		int count = 0;
		
		while(count <= 12) { //Wait element 2 minutes before error
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			if(driver.findElements(By.id("LoadingPDF")).size() == 0) {
				break;
			}
			else {
				count += 1;
			}
		}
	}
	
	
	public void validateSuccessFeedback() throws Exception {
		String elementStyle = driver.findElement(By.xpath("//div[@class=\"sa-icon sa-success animate\"]")).getAttribute("style");
		
		if(!"display: block;".equals(elementStyle)) {
			throw new Exception("We aren't seeing the Success Feedback");
		}
		
	}
	
}
