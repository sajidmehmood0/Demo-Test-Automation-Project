package com.demo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomer_Page {
	WebDriver localDriver;
	
	public AddCustomer_Page(WebDriver remoteDriver) {
		localDriver = remoteDriver;
		PageFactory.initElements(remoteDriver,this);
	}
	@FindBy(how=How.XPATH, using = "/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement btnAddNewCustomer;
	
	@FindBy(how=How.NAME, using = "name")
	@CacheLookup
	WebElement txtCustomerName;
	
	@FindBy(how=How.NAME, using = "rad1")
	@CacheLookup
	WebElement txtGender;
	
	@FindBy(how=How.NAME, using = "dob")
	@CacheLookup
	WebElement txtDOB;
	
	@FindBy(how=How.NAME, using = "addr")
	@CacheLookup
	WebElement txtAddress;
	
	@FindBy(how=How.NAME, using = "city")
	@CacheLookup
	WebElement txtCity;
	
	@FindBy(how=How.NAME, using = "state")
	@CacheLookup
	WebElement txtState;
	
	@FindBy(how=How.NAME, using = "pinno")
	@CacheLookup
	WebElement txtPinNo;
	
	@FindBy(how=How.NAME, using = "telephoneno")
	@CacheLookup
	WebElement txtPhone;
	
	@FindBy(how=How.NAME, using = "emailid")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(how=How.NAME, using = "password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(how=How.NAME, using = "sub")
	@CacheLookup
	WebElement btnSubmit;
	
	@FindBy(how=How.NAME, using = "res")
	@CacheLookup
	WebElement btnReset;
	
	public void clickAddCustomer()
	{
		btnAddNewCustomer.click();
	}
	public void setCustomerName(String cname)
	{
		txtCustomerName.sendKeys(cname);
	}
	public void setCustomerGender(String cgender)
	{
		txtGender.sendKeys(cgender);
	}
	public void setDOB(String mm, String dd, String yy)
	{
		txtDOB.sendKeys(mm);
		txtDOB.sendKeys(dd);
		txtDOB.sendKeys(yy);
		
	}
	public void setAddress(String caddress)
	{
		txtAddress.sendKeys(caddress);
	}
	public void setCity(String ccity)
	{
		txtCity.sendKeys(ccity);
	}
	public void setState(String cstate)
	{
		txtState.sendKeys(cstate);
	}
	
	public void setPin(String cpin)
	{
		txtPinNo.sendKeys(String.valueOf(cpin));
	}
	public void setPhone(String cphone)
	{
		txtPhone.sendKeys(cphone);
	}
	public void setEmail(String cemail)
	{
		txtEmail.sendKeys(cemail);
	}
	public void setPassword(String cpassword)
	{
		txtPassword.sendKeys(cpassword);
	}
	public void clickSubmit()
	{
		btnSubmit.click();
	}
	public void clickReset()
	{
		btnReset.click();
	}
}
