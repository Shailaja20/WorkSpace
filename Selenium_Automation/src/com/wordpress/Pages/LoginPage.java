/**
 * 
 */
package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Shailaja
 * This class is used to Store the Locators and methods of LoginPage.
 */
public class LoginPage {
	WebDriver driver;
	
	By Username = By.id("user_login");
	By Password = By.id("user_pass");
	By Login = By.id("wp-submit");
	By Forget_Pass = By.linkText("Lost your password?");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void LogintoWordpress(String User, String pas)
	{
		driver.findElement(Username).sendKeys(User);
		driver.findElement(Password).sendKeys(pas);
		driver.findElement(Login).click();
	}
	
	public void typeUsername(String uid)
	{
		
		driver.findElement(Username).sendKeys(uid);
	}
	
	public void typePassword(String pass)
	{
		
		driver.findElement(Password).sendKeys(pass);
	}
	
	public void ClickLoginButton()
	{
		
		driver.findElement(Login).click();
	}
	
	public void forgetPassword()
	{
		
		driver.findElement(Forget_Pass).click();
	}

}
