package com.basics;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listdemo {

	public static void main(String[] args) throws IOException {
		//to open browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.kirubakaran\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				//to maximize browser
				driver.manage().window().maximize();
				//to redirect to web page
				driver.get("https://www.mycontactform.com");
				
		driver.findElement(By.linkText("Sample Forms")).click();
		//using tagname
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links are: "+links.size());
		//using screenshot
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\Workspaces\\TechForum3\\Selenium\\Screenshots\\sample.jpeg"));
		
		
	}

}
