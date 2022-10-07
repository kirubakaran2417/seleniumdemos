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

public class AppTest2 
{
	WebDriver driver;
  @BeforeTest
	public void beforemethod() {
		   driver=Driversetup.getdriver();
	}
    @Test(groups = {"Login"},priority = 0)
    public void Subject_testcase()
    {
    	Mycontactform m=new Mycontactform(driver);
    	m.subject().sendKeys("kiruba");
    	System.out.println("testcase1");
    	
    }
    @Test(groups = {"Login"})
    public void Textboxfield_testcase()
    {
        System.out.println("testcase 2");

    }
    @Test(groups = {"Logout"})
    public void email_testcase()
    {
        System.out.println("testcase 3");

    }
    @Test(groups = {"Logout"})
    public void textmessage_testcase()
    {
        System.out.println("testcase 4");

    }
    @Test(groups = {"Logout","Login"})
    public void dropdown_testcase()
    {
        System.out.println("testcase 5");

    }
    @AfterTest
    public void killbrowser() {
		   driver.close();

	}
}
