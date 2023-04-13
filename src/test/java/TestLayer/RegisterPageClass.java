package TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;

public class RegisterPageClass extends BaseClass {

	private static RegisterPage registerpage;

	@BeforeClass
	public void setUp() {
		BaseClass.initialization();
	}

	@Test(priority = 1)
	public void validateContactInformation() {
		registerpage = new RegisterPage();
		registerpage.contactInformation("Amol", "patil", "909090", "amol@gmail.com");
	}

	
	@Test(priority = 2)
	public void validateMailingInformation() throws InterruptedException
	{
		registerpage.mailingInformation("Pune", "Pune", "MH", "123456", "INDIA");
		
		Thread.sleep(10000);
	}
	
	@Test(priority = 3)
	public void validateUsernameInformation()
	{
		registerpage.userInformation("amol@tcs.com", "Amol123", "Amol123");
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}
