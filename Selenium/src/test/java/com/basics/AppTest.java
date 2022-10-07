package com.basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest 
{
  @BeforeTest
	public void beforemethod() {
		   System.out.println("Opening Browser");
	}
    @Test
    public void Testcase1()
    {
       System.out.println("testcase 1");
    }
    @Test
    public void Testcase2()
    {
        System.out.println("testcase 2");

    }
    @AfterTest
    public void aftermethod() {
		   System.out.println("Closing Browser");

	}
}
