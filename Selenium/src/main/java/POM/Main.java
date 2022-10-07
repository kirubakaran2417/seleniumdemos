package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Main {	
	static WebDriver driver;	
	
	@Test
	public void testcase() throws IOException {
		driver=Driversetup.getdriver();		
		Mycontactform m=new Mycontactform(driver);
		String data[]=	Utilities.readexceldata(0);

		m.subject().sendKeys(data[1]);
	}
	
	
}
