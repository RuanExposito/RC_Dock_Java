package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import implementations.General;
import io.cucumber.java.en.When;

public class PriceOptionSteps {
	@When("I select the price option")
	public void i_select_the_price_option() {
		GeneralStepDefinitions gsd = new GeneralStepDefinitions();
		General general = new General(gsd.driver);
		
		gsd.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		gsd.driver.findElements(By.className("ideal-radio")).get(5).click();
		
		gsd.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		general.goToNextPage("nextsendquote");
	}
}
