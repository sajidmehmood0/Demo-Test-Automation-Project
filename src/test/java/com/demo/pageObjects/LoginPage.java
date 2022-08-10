package com.demo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver localDriver;
	
	public LoginPage(WebDriver remoteDriver) 
	{
		localDriver = remoteDriver;
		PageFactory.initElements(remoteDriver,this);
		
	}
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUsername;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement btnLogout;
	
	public void setUsername(String uname)
	{
		txtUsername.sendKeys(uname);
	}
	public void setPassword(String passwrod)
	{
		txtPassword.sendKeys(passwrod);
	}
	public void clickSubmit() 
	{
		btnLogin.click();
	}
	
	public void clickLogout() 
	{
		btnLogout.click();
	}
	

}
