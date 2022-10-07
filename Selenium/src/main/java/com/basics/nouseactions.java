package com.basics;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class nouseactions {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.kirubakaran\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//to maximize browser
		driver.manage().window().maximize();
		//to redirect to web page
		driver.get("https://jqueryui.com/droppable/");
		//window handling methods
//		getwindowhandle()
//		getwindowhandles()
//		switchto()
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement element1= driver.findElement(By.id("draggable"));
		WebElement element2= driver.findElement(By.id("droppable"));
		Actions a=new Actions(driver);
		a.clickAndHold(element1).moveToElement(element2).release(element2).build().perform();
		a.contextClick(element2).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER)
        
	}

}
