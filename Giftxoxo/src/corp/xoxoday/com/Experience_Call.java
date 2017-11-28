package corp.xoxoday.com;

import org.testng.annotations.Test;

import selenium_webdriver.Redeem_Experience;

import org.openqa.selenium.WebDriver;

public class Experience_Call {
	WebDriver driver;
	
  @Test
  public void testExperienceCall() throws Exception {
	  Experience_Checkout EC=new Experience_Checkout(driver);
	  Redeem_Experience re=new Redeem_Experience(driver);
	  
	  EC.OpenBrowser();
	  EC.Experience_Redeem(); 
	  re.f2();
  }
  }
