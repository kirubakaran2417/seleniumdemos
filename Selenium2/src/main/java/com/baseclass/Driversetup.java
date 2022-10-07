package com.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utilities.Utilities;

public class Driversetup {

	public static WebDriver  getdriver() {
		
		System.setProperty("webdriver.chrome.driver", Utilities.propertyFileHandling("driverpath"));
		WebDriver driver=new ChromeDriver();
		//to maximize browser
		driver.manage().window().maximize();
		//to redirect to web page
		driver.get(Utilities.propertyFileHandling("url"));
		return driver;
		
	}
}
