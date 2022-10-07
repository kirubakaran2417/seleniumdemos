package com.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Browserconfiguration {

	public static void main(String[] args) {
		//to open browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.kirubakaran\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//to maximize browser
		driver.manage().window().maximize();
		//to redirect to web page
		driver.get("https://www.mycontactform.com");

		
	
		
//		element handling
		driver.findElement(By.linkText("Sample Forms")).click();
		driver.findElement(By.id("subject")).sendKeys("kiruba");
		
		WebElement drop1=driver.findElement(By.id("q3"));
		Select s=new Select(drop1);
		s.selectByVisibleText("Third Option");
	}
}
