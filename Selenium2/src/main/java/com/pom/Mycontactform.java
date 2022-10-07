package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseclass.Locators;

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
