package com.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsexecutor {
public static void main(String[] args) {
	//to open browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.kirubakaran\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//to maximize browser
	driver.manage().window().maximize();
	//to redirect to web page
	driver.get("https://www.myntra.com");
	WebElement ele=driver.findElement(By.xpath("(//a[@href='/contactus'])[3]"));
	JavascriptExecutor jsexeExecutor=(JavascriptExecutor)driver;
	jsexeExecutor.executeScript("arguments[0].scrollIntoView(true);", ele);
	//jsexeExecutor.executeScript("scrollBy(0,2000)");
}
}
