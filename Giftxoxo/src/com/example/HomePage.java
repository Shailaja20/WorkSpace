package com.example;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePage {
	
	WebDriver driver;
	
	@Test
	public void HomePageTest() throws Exception
	{
		
		ExperienceOpen eo = new ExperienceOpen(driver);
		eo.OpenBrowser();
		eo.testExperienceOpen();
		eo.CLoseBrowser();
	}
	

}
