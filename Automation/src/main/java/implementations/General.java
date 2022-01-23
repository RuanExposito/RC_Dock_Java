package implementations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class General {

	public boolean elementIsPresent(WebDriver driver, String elementId) {
		boolean isPresent = driver.findElements(By.id(elementId)).size() > 0;
		return isPresent;
	}
	
	public void mainTricentisPage(WebDriver driver) throws Exception {
		boolean verifyHearderImage = elementIsPresent(driver, "tricentis_logo");
	    boolean verifyPageName = elementIsPresent(driver, "entervehicledata");
	    
	    //Checking if I've been redirected to right page. If not, return an error
	    if (!verifyHearderImage && !verifyPageName) {
	    	throw new Exception("Page isn't valid");
	    }
	}
	
}
