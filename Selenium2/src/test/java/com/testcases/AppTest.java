package com.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseclass.Driversetup;
import com.pom.Mycontactform;
import com.Utilities.Utilities;

public class AppTest 
{
	WebDriver driver;
  @BeforeTest
	public void beforemethod() {
		   driver=Driversetup.getdriver();
	}
    @Test(priority = 0)
    public void Subject_testcase()
    {
    	Mycontactform m=new Mycontactform(driver);
    	m.subject().sendKeys("kiruba");
    	
    }
    @Test(dependsOnMethods = "Subject_testcase")
    public void Textboxfield_testcase()
    {
        System.out.println("testcase 2");

    }
    @Test(dependsOnMethods = "Textboxfield_testcase")
    public void email_testcase()
    {
        System.out.println("testcase 3");

    }
    @Test(dependsOnMethods = "email_testcase")
    public void textmessage_testcase()
    {
        System.out.println("testcase 4");

    }
    @AfterTest
    public void killbrowser() {
		   driver.close();

	}
}
