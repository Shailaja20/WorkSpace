package com.example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExperienceOpen {
	WebDriver driver;
	
	By ClickDropdown = By.xpath("//*[@id='top2']/ul/li[1]/a");
    By clickAdventure = By.xpath("//*[@id='top2']/ul/li[1]/ul/li[1]/a");
	By ClickExperience = By.xpath("//*[@id='ajax_product_list']/div/div[1]/div/div/div[3]/a/div[1]/h3");
	
	public ExperienceOpen(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@BeforeMethod
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://corp.xoxoday.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void testExperienceOpen() throws Exception
	{
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//*[@id='top2']/ul/li[1]/a[1]"));
		action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//*[@id='top2']/ul/li[1]/ul/li/div/ul/li[2]/ul/li[2]/a"))).click().build().perform();
	    Thread.sleep(1000);
		//driver.findElement(ClickDropdown).click();
		//Thread.sleep(1000);
		//driver.findElement(clickAdventure).click();
		driver.findElement(ClickExperience).click();
		System.out.println("Pass");
	}
	@AfterMethod
	public void CLoseBrowser()
	{
		//driver.close();
	}
	
}
