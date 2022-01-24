package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import implementations.General;
import implementations.SendQuote;
import io.cucumber.java.en.When;

public class SendQuoteDefinitions {
	@When("I send quote")
	public void i_send_quote() {
		GeneralStepDefinitions gsd = new GeneralStepDefinitions();
		General general = new General(gsd.driver);
		
		gsd.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		SendQuote sendQuote = new SendQuote(gsd.driver);
		
		sendQuote.fillEmail();
		sendQuote.fillPhone();
		sendQuote.fillUsername();
		sendQuote.fillPassword();
		sendQuote.fillComments();
	    
		general.goToNextPage("sendemail");
	}
}
