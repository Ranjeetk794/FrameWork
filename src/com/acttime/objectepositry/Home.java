package com.acttime.objectepositry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * 
 * @author by Ranjeet Kumar on 5/4/2019
 *
 */
public class Home {
	@FindBy(xpath = "//a[@class='content tasks']")
	private WebElement taskImg;

	@FindBy(xpath = "//div[text()='USERS']")
	private WebElement userImg;

	@FindBy(xpath = "//a[@class='logout']")
	private WebElement logOutLnk;

	public void clickontaskImage() {
		taskImg.click();
	}

	public void clickonuserImage() {
		userImg.click();
	}

	public void clickonlogOut() {
		
		logOutLnk.click();
	}
}
