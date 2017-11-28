package selenium_webdriver;

import org.openqa.selenium.WebDriver;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Call_Class{
	public  WebDriver driver;
	 
	
	@Test
  public  void function() throws Exception
  {
		Redeem_Experience Redeem=new Redeem_Experience(driver);
		
		  Redeem.Open();
	      Redeem.f1();
	      Redeem.f2();
	      Redeem.f3();
	      Redeem.f4();
	      Redeem.f5();
	 }

}
