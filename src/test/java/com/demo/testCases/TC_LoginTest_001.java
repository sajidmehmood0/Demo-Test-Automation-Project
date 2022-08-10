package com.demo.testCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.demo.pageObjects.LoginPage;

public class TC_LoginTest_001 extends baseClass
{
	@Test
	public void loginTest() throws IOException
	{
		
		
		// adding logs
		
		logger.info("URL is opened");
		
		LoginPage lPage = new LoginPage(driver);
		lPage.setUsername(username);
		logger.info("Entered username:"); // adding logs
		
		lPage.setPassword(password);
		logger.info("Entered password:"); // adding logs
		
		lPage.clickSubmit();
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login Test passed\n");
			
		}
		else 
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login Test Failed\n");
		}
		
		
	}
}
