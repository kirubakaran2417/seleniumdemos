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

public class Links {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.kirubakaran\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//to maximize browser
		driver.manage().window().maximize();
		//to redirect to web page
		driver.get("https://www.mycontactform.com");
		driver.findElement(By.linkText("Sample Forms")).click();
		List<WebElement> links=driver.findElements(By.xpath("//*[@id='left_col_top']/ul/li/a"));
		System.out.println(links.size());
		for(int i=1;i<links.size();i++) {
			List<WebElement> links2=driver.findElements(By.xpath("//*[@id='left_col_top']/ul["+i+"]/li/a"));
			for(int j=1;j<links2.size();j++) {
				driver.findElement(By.xpath("//*[@id='left_col_top']/ul["+i+"]/li["+j+"]/a")).click();
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("D:\\Workspaces\\TechForum3\\Selenium\\Screenshots\\sample["+i+"]["+j+"].jpeg"));
			}
		}

	}

}
