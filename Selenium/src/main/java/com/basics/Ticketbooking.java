package com.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ticketbooking {
	public static String[] getmonthyear(String monthyear) {
		return monthyear.split(" ");
	}
public static void main(String[] args) throws InterruptedException {
	//to open browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.kirubakaran\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	ChromeOptions c=new ChromeOptions();
	c.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(c);
	//to maximize browser
	driver.manage().window().maximize();
	//to redirect to web page
	driver.get("https://www.goibibo.com");
	WebElement from=driver.findElement(By.xpath("//div[contains(@class,'sc-bkkeKt')]//p"));
	from.click();
	WebElement fromtext=driver.findElement(By.xpath("//div[contains(@class,'sc-cidDSM dOEpbS')]//input"));
	fromtext.sendKeys("chennai");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//ul[@id='autoSuggest-list']//li)[1]")).click();
	WebElement totext=driver.findElement(By.xpath("//div[contains(@class,'sc-cidDSM dOEpbS')]//input"));
	totext.sendKeys("bangalore");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//ul[@id='autoSuggest-list']//li)[1]")).click();
	
	while(true) {
		String datecaption=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption']//div)[1]")).getText();
		if(getmonthyear(datecaption)[0].equals("November")) {
			break;
		}else {
			driver.findElement(By.xpath("(//div[@class='DayPicker-NavBar']//span)[2]")).click();

		}
		
	}
}
}
