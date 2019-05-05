package com.acttime.objectepositry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * 
 * @author by Ranjeet Kumar on 5/4/2019
 *
 */
public class ProjectAndCustomer {
	@FindBy(xpath = "//span[text()='Create Customer']")
	private WebElement createCustomerBtn;
	@FindBy(xpath = "//span[@class='successmsg']")
	private WebElement SuccessMsg;

	public void clickoncreateCustomerbtn() {
		createCustomerBtn.click();
	}

	public WebElement getSuccessMsg() {
		return SuccessMsg;
	}
}
