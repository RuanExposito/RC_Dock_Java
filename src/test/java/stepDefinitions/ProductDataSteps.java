package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import implementations.General;
import implementations.ProductData;
import io.cucumber.java.en.When;

public class ProductDataSteps {
	@When("I enter the product data")
	public void i_enter_the_product_data() {
		GeneralStepDefinitions gsd = new GeneralStepDefinitions();
		General general = new General(gsd.driver);
		
		gsd.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		ProductData productData = new ProductData(gsd.driver);
		
		productData.addStartDate();
		productData.selectInsuranceSum();
		productData.selectMeritRating();
		productData.selectDmgInsurance();
		productData.chooseOptionalProducts();
		productData.selectCourtesyCar();

		general.goToNextPage("nextselectpriceoption");
		
	}
}
