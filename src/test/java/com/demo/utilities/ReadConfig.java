package com.demo.utilities;
// use this file to read the data from configurations
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	public ReadConfig()
	{
		File src = new File("./Configurations/config.propertise");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			
		} catch (Exception e){
			System.out.print("Exception is"+e.getMessage());
		}
	}
	
	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String getUsername() {
		String username = pro.getProperty("username");
		return username;
	}
	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}
	public String getChromePath() {
		String chromePath = pro.getProperty("chromepath");
		return chromePath;
	}
	public String getIEPath() {
		String iePath = pro.getProperty("iepath");
		return iePath;
	}
	public String getFirefoxPath() {
		String firefoxPath = pro.getProperty("firefox");
		return firefoxPath;
	}
	
	public String getCustomerName() {
		String customerName =pro.getProperty("customerName");
		return customerName;
	}
	public String getGender() {
		String customerGender =pro.getProperty("gender");
		return customerGender;
	}
	
	public String getCustomerDOB_Month() {
		String CustomerDOB_Month =pro.getProperty("mm");
		return CustomerDOB_Month;
	}
	public String getCustomerDOB_Day() {
		String CustomerDOB_Day =pro.getProperty("dd");
		return CustomerDOB_Day;
	}
	public String getCustomerDOB_Year() {
		String CustomerDOB_Year =pro.getProperty("yy");
		return CustomerDOB_Year;
	}
	public String getCustomerAddress() {
		String CustomerAddress =pro.getProperty("address");
		return CustomerAddress;
	}
	public String getCustomerCity() {
		String CustomerCity =pro.getProperty("city");
		return CustomerCity;
	}
	public String getCustomerState() {
		String CustomerState =pro.getProperty("state");
		return CustomerState;
	}
	public String getCustomerPin() {
		String CustomerPin =pro.getProperty("pin");
		return CustomerPin;
	}
	public String getCustomerPhoneNo() {
		String CustomerPhoneNo =pro.getProperty("phone");
		return CustomerPhoneNo;
	}
	public String getCustomerEmail() {
		String CustomerEmail =pro.getProperty("email");
		return CustomerEmail;
	}
	public String getCustomerPassword() {
		String CustomerPassword =pro.getProperty("customerPassword");
		return CustomerPassword;
	}

}
