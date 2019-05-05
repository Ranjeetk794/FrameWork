package com.acttime.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.acttime.objectepositry.Home;
import com.acttime.objectepositry.LoginActitime;

/**
 * 
 * @author by Ranjeet Kumar on 5/4/2019
 *
 */
public class BaseClass {
	public static WebDriver Driver;
	public File_Lib Flib = new File_Lib();
	public WebDriver_CmLib wdcl = new WebDriver_CmLib();

	@BeforeSuite
	public void configBS() {
		Reporter.log("Connect to data base");
	}

	/**
	 * Launch the Browser
	 * 
	 * @throws Throwable
	 */
	@BeforeClass
	public void configBC() throws Throwable {
		Reporter.log("Launch the Browser");
		String Browser = Flib.getProperty("browser");
		if (Browser.equals("Firefox")) {
			Driver = new FirefoxDriver();
		} else if (Browser.equals("Chrome")) {
			Driver = new ChromeDriver();
		}
		Driver.manage().window().maximize();
	}

	/**
	 * Login to application
	 * 
	 * @throws Throwable
	 */
	@BeforeMethod
	public void configBM() throws Throwable {
		Reporter.log("Login");
		wdcl.waitforPageToLoad(Driver);
		Driver.get(Flib.getProperty("url"));
		LoginActitime LP = PageFactory.initElements(Driver, LoginActitime.class);
		LP.loginApp();
	}

	/**
	 * Logout the Application
	 */
	@AfterMethod
	public void configAM() {
		Reporter.log("LogOut");
		Home hp = PageFactory.initElements(Driver, Home.class);
	    wdcl.waitforPageToLoad(Driver);
		hp.clickonlogOut();
		
	}

	/**
	 * Close the Browser
	 */
	public void configAC() {
		Reporter.log("close the browser");
		Driver.close();
	}

}
