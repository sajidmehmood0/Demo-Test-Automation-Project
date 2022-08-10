package com.demo.testCases;


import java.io.File;
import java.io.IOException;
//import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.demo.utilities.ReadConfig;


import org.testng.annotations.AfterClass;


public class baseClass {
	ReadConfig readConfig = new ReadConfig();
	
	// Variables for login 
	public String baseURL = readConfig.getApplicationURL();
	public String  username = readConfig.getUsername();
	public String password = readConfig.getPassword();
	
	// Variables for Add Customer
	
	public String customerName =readConfig.getCustomerName();
	public String customerGender = readConfig.getGender();
	public String customerDob_Month = readConfig.getCustomerDOB_Month();
	public String customerDob_Day = readConfig.getCustomerDOB_Day();
	public String customerDob_Year = readConfig.getCustomerDOB_Year();
	public String customerAddress = readConfig.getCustomerAddress();
	public String customerCity = readConfig.getCustomerCity();
	public String customerState = readConfig.getCustomerState();
	public String customerPin = readConfig.getCustomerPin();
	public String customerPhoneNo = readConfig.getCustomerPhoneNo();
	private String emailString = randomestring();
	public String customerEmail = emailString+readConfig.getCustomerEmail();
	public String cuustomerPassword = readConfig.getCustomerPassword();
	
	
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	
//	Simple
	
	
//	public void setup() 
//	{
//		System.setProperty("webdriver.chrome.driver",readConfig.getChromePath());
//		driver = new ChromeDriver();
//		
//		// Log4j Stuff
//		logger= Logger.getLogger("DemoProject");
//		PropertyConfigurator.configure("Log4j.propertise");
//	}
	
//	Runnable testRunnable case for desired Browser
	
	public void setup(String br) {
		
		
		// Log4j Stuff
		
		logger= Logger.getLogger("DemoProject");
		PropertyConfigurator.configure("Log4j.propertise");
		
		if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",readConfig.getChromePath());
			driver = new ChromeDriver();
		}
		else if(br.equals("firefox")){
			System.setProperty("webdriver.gecko.driver",readConfig.getFirefoxPath());
			driver = new FirefoxDriver();
		}
		else if(br.equals("ie")) {
			System.setProperty("webdriver.ie.driver",readConfig.getIEPath());
			driver = new InternetExplorerDriver();
		}
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseURL);

	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver,String tname)throws IOException{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileUtils.copyFile(source,target);
	}
	
	public String randomestring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
	
	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(4);
		return (generatedString2);
	}
}
