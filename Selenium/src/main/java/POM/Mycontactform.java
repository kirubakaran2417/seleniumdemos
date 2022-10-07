package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mycontactform {
	private WebDriver driver;
	
	public Mycontactform(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement subject() {
		WebElement sub=driver.findElement(Locators.subject);
		return sub;
	}
}
