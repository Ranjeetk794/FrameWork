package com.acttime.objectepositry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * 
 * @author by Ranjeet Kumar on 5/4/2019
 *
 */
public class CreateCustomer {
	@FindBy(id = "customerLightBox_nameField")
	private WebElement customerNAme;
	@FindBy(id = "customerLightBox_descriptionField")
	private WebElement customerDescEdt;
	@FindBy(xpath = "//span[@class='buttonTitle' and text()='Create Customer']")
	private WebElement createCustomerBtn;

	public void createCustomer(String customerName) {
		customerNAme.sendKeys(customerName);
		createCustomerBtn.click();
	}

	public void createCustomer(String customerName, String customerDesc) {
		customerNAme.sendKeys(customerName);
		customerDescEdt.sendKeys(customerDesc);
		createCustomerBtn.click();

	}
}
