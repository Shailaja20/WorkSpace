package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Admin
 * This class will store all the locators and the elements of the HomePage.
 *
 */
public class HomePage {
	WebDriver driver;
	
	By ClickPost = By.xpath("html/body/div/div[2]/ul/li[3]/a");
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void Navigate()
	{
		driver.findElement(ClickPost).click();
	}

}
