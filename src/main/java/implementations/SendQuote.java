package implementations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SendQuote {
	WebDriver driver;
	General general;
	
	public SendQuote(WebDriver driver) {
		this.driver = driver;
		this.general = new General(this.driver);
	}
	
	public void fillEmail() {
		driver.findElement(By.id("email")).sendKeys("ruan.e.carvalho@hotmail.com");
	}
	
	public void fillPhone() {
		driver.findElement(By.id("phone")).sendKeys("11968288530");
	}
	
	public void fillUsername() {
		driver.findElement(By.id("username")).sendKeys("RuanCarvalho");
	}
	
	public void fillPassword() {
		driver.findElement(By.id("password")).sendKeys("123456TestDock");
		driver.findElement(By.id("confirmpassword")).sendKeys("123456TestDock");
	}
	
	public void fillComments() {
		driver.findElement(By.id("Comments")).sendKeys("Hello world! :)");
	}
	
}
