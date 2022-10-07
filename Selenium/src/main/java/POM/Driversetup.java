package POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driversetup {

	public static WebDriver  getdriver() throws IOException {
		FileInputStream fis=new FileInputStream("D:\\Workspaces\\TechForum3\\Selenium\\Resources\\Configuration.properties");
		Properties p=new Properties();
		p.load(fis);
		
		System.setProperty("webdriver.chrome.driver", p.getProperty("driverpath"));
		WebDriver driver=new ChromeDriver();
		//to maximize browser
		driver.manage().window().maximize();
		//to redirect to web page
		driver.get(p.getProperty("url"));
		return driver;
		
	}
}
