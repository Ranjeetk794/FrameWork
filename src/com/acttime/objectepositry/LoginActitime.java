package com.acttime.objectepositry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.genericlib.File_Lib;

/**
 * 
 * @author by Ranjeet Kumar on 5/4/2019
 *
 */
public class LoginActitime {
	/**
	 * Rule 1:create a separate java class for every page..
	 * 
	 * @findBy AND @FindBys : is available in "WebDriver" , it is traditional way to
	 *         identify the Element in "GUI"
	 */
	@FindBy(name = "username")
	/* Rule 2: identify elements using @ FindBy Annotation.. */
	WebElement userNameEdt;

	@FindBy(name = "pwd")
	WebElement passwordEdt;

	@FindBy(id = "loginButton")
	WebElement loginButton;

	/**
	 * Identify reusable business libraries, which can be used in login class..
	 * 
	 * @throws Throwable
	 */
	public void loginApp() throws Throwable {
		File_Lib flib = new File_Lib();
		userNameEdt.sendKeys(flib.getProperty("username"));
		passwordEdt.sendKeys(flib.getProperty("password"));
		loginButton.click();
	}

	public void loginToApp(String username, String password) {
		userNameEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		loginButton.click();
	}

	/**
	 * Rule 4:- provide getters method to give read access specific WebElement..
	 * 
	 * @return
	 */
	public WebElement getuserNameEdt() {
		return userNameEdt;
	}

	public WebElement getpasswordEdt() {
		return passwordEdt;
	}

	public WebElement getloginButton() {
		return loginButton;
	}
}
