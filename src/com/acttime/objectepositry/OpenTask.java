package com.acttime.objectepositry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * 
 * @author by Ranjeet Kumar on 5/4/2019
 *
 */
public class OpenTask {
	@FindBy(linkText = "Projects & Customers")

	private WebElement projectsAndCustomers;

	public void clickonProjectAndCustomer() {
		projectsAndCustomers.click();
	}

}
