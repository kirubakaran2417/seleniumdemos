package com.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerthandling {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.kirubakaran\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//to maximize browser
	driver.manage().window().maximize();
	//to redirect to web page
	driver.get("https://demo.automationtesting.in/Alerts.html");
	/*
	 * tagname.classname
	 * tagname#id
	 * tagname[attribute=attributevalue] 	
	 */
	driver.findElement(By.cssSelector("button.btn.btn-danger")).click();
	//Handling alert
	Alert a=driver.switchTo().alert();
	a.accept();
//	a.dismiss();
//	a.sendKeys("batman");
//	a.getText();
	WebElement text=driver.findElement(By.xpath("//p[@id='demo']"));
	System.out.println(text.getText());
}
}
