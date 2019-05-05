package com.acttime.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author by Ranjeet Kumar on 5/4/2019
 *
 */
public class WebDriver_CmLib {
	/**
	 * it's used to implicitly wait for target entire page load before perform
	 * action on Element maximum time unit 15 seconds
	 * 
	 * @param Driver
	 */
	public void waitforPageToLoad(WebDriver Driver) {
		Driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	/**
	 * it's used to Explicitly wait for Target specific element
	 * 
	 * @param Driver
	 * @param Element
	 */
	public void WaitforElementPresent(WebDriver Driver, WebElement Element) {
		WebDriverWait wait = new WebDriverWait(Driver, 10);
		wait.until(ExpectedConditions.visibilityOf(Element));
	}
	/**
	 * it;s used to custom wait
	 * @param element
	 */
	public void waitandclick(WebElement element)
	{
		try
		{
			element.click();
		}
		catch(Throwable e) 
		{
		}
	}

	/**
	 * it's used to handle for select Drop-down ,select the value based on option
	 * data..
	 * 
	 * @param element
	 * @param option
	 */
	public void select(WebElement element, String option) {
		Select sel = new Select(element);
		sel.selectByVisibleText(option);
	}

	/**
	 * it's used to handle for select Drop-down ,select the value based on option
	 * index..
	 * 
	 * @param element
	 * @param index
	 */
	public void Select(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	/**
	 * it's used to handle for mouseHover at sub-manue ,Action the value of
	 * WebElement
	 * 
	 * @param driver
	 * @param wb
	 */
	public void mouseHover(WebDriver driver, WebElement wb) {
		Actions act = new Actions(driver);
		act.moveToElement(wb);
	}

}
