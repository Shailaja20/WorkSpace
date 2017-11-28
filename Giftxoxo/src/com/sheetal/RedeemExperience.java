package com.sheetal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RedeemExperience {
	
	WebDriver driver;
	
	By UserName = By.id("username");
	By Password = By.id("password");
	By SignIn = By.xpath("html/body/section[1]/div[2]/div[2]/div/div/form/input[3]");
	
	public RedeemExperience(WebDriver driver)
	{
		this.driver=driver;
	}
	@BeforeTest
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.giftxoxo.com/vendor/public/login");
		driver.manage().window().maximize();
	}
	@Test
	public void VD_Login(String Uname,String pwd) throws Exception
	{
		driver.findElement(UserName).sendKeys(Uname);
		driver.findElement(Password).sendKeys(pwd);
		driver.findElement(SignIn).click();
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
