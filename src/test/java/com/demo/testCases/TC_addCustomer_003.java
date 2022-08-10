package com.demo.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demo.pageObjects.AddCustomer_Page;
import com.demo.pageObjects.LoginPage;

public class TC_addCustomer_003 extends baseClass{
	
	@Test
	public void addCustomer() throws IOException, InterruptedException {
		//Login Scenario 
		
		LoginPage lPage = new LoginPage(driver);
		lPage.setUsername(username);
		logger.info("Username entered:");
		lPage.setPassword(password);
		logger.info("Password entered:");
		lPage.clickSubmit();
		logger.info("Susccefully logged in:");
		
		//Thread.sleep(3000);
		
		//Adding New Customer Scenario 
		AddCustomer_Page customer = new AddCustomer_Page(driver);
		customer.clickAddCustomer();
		
		logger.info("Add new customer clicked");
		
		Thread.sleep(9000);
		customer.setCustomerName(customerName);
		logger.info("Customer name entered:");
		customer.setCustomerGender(customerGender);
		logger.info("Customer gender entered:");
		customer.setDOB(customerDob_Month, customerDob_Day, customerDob_Year);
		logger.info("Customer dob entered:");
		customer.setAddress(customerAddress);
		logger.info("Customer address entered:");
		customer.setCity(customerCity);
		logger.info("Customer city entered:");
		customer.setState(customerState);
		logger.info("Customer state entered:");
		customer.setPin(customerPin);
		logger.info("Customer pin entered:");
		customer.setPhone(customerPhoneNo);
		logger.info("Customer phone no entered:");
		customer.setEmail(customerEmail);
		logger.info("Customer email entered:");
		customer.setPassword(cuustomerPassword);
		logger.info("Customer password entered:");
		
		customer.clickSubmit();
		
		logger.info("Submit button clicked");
		
		
	    boolean result= driver.getPageSource().contains("Customer Registered Successfully!!!");
	    if(result) {
	    	logger.info("Add new customer test case passed!\n");
	    	Assert.assertTrue(true);
	    }
	    else {
	    	captureScreen(driver, "AddNewCustomer");
	    	logger.info("Add new customer test case failed!\n");
	    	Assert.assertTrue(false);
	    }
	    
		
	}

}
