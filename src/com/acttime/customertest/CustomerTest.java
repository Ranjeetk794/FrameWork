package com.acttime.customertest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.acttime.genericlib.BaseClass;
import com.acttime.objectepositry.CreateCustomer;
import com.acttime.objectepositry.Home;
import com.acttime.objectepositry.OpenTask;
import com.acttime.objectepositry.ProjectAndCustomer;

/**
 * 
 * @author by Ranjeet Kumar on 5/4/2019
 *
 */
public class CustomerTest extends BaseClass {
	@Test
	public void createCustomerTest() throws Throwable {
		/* read data from Excel */
		String CustomerName = Flib.getExcelData("Sheet2",1, 3);
		/* navigate to task page */
		Home hp = PageFactory.initElements(Driver, Home.class);
		hp.clickontaskImage();
		/* navigate to project and Customer */
		OpenTask op = PageFactory.initElements(Driver, OpenTask.class);
		op.clickonProjectAndCustomer();
		/* navigate create customer page */
		ProjectAndCustomer PandC = PageFactory.initElements(Driver, ProjectAndCustomer.class);
		PandC.clickoncreateCustomerbtn();
		/* create Customer */
		CreateCustomer cp = PageFactory.initElements(Driver, CreateCustomer.class);
		cp.createCustomer(CustomerName);
		/* verify */
		String actSussMSG = PandC.getSuccessMsg().getText();
		boolean status = actSussMSG.contains("successfully created.");
		Assert.assertTrue(status);
	}

	@Test
	public void createCustomerWithDescTest() throws Throwable {
		/* read the Data from Excel */
		String customerName = Flib.getExcelData("Sheet2", 1, 2);
		String customerDesc = Flib.getExcelData("Sheet1", 2, 3);
		/* Navigate to task page */
		Home hp = PageFactory.initElements(Driver, Home.class);
		hp.clickontaskImage();
		/* navigate to project and Customer page */
		OpenTask op = PageFactory.initElements(Driver, OpenTask.class);
		op.clickonProjectAndCustomer();
		/* navigate to create customer page */
		ProjectAndCustomer PandC = PageFactory.initElements(Driver, ProjectAndCustomer.class);
		PandC.clickoncreateCustomerbtn();
		/* create customer with description */
		CreateCustomer cp = PageFactory.initElements(Driver, CreateCustomer.class);
		cp.createCustomer(customerName, customerDesc);
		/* Verify */
		String actSussMSG = PandC.getSuccessMsg().getText();
		boolean status = actSussMSG.contains("successfully created.");
		Assert.assertTrue(status);

	}
}
