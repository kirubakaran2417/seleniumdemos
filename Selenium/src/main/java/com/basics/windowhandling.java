package com.basics;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandling {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.kirubakaran\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//to maximize browser
		driver.manage().window().maximize();
		//to redirect to web page
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		//window handling methods
//		getwindowhandle()
//		getwindowhandles()
//		switchto()
		driver.findElement(By.name("newbrowserwindow123")).click();
		//Get all window handles and hold them in a list
		Set<String> windowhandles=driver.getWindowHandles();
		List<String> windowslist=new ArrayList<>(windowhandles);
		//write total window handle number to console
		System.out.println("Total window number: "+windowslist.size());
		driver.switchTo().window(windowslist.get(1));
		driver.manage().window().maximize();
		driver.switchTo().window(windowslist.get(0));
        
	}

}
