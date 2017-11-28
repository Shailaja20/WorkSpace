package com.sheetal;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class VerifyRedeemExperience {
	WebDriver driver;
	
	@Test
	public void testVerifyRedeemExperience() throws Exception
	{
		RedeemExperience RE = new RedeemExperience(driver);
		RE.OpenBrowser();
		/*String Uname = Excel.getCellValue();
		RE.VD_Login(Uname, pwd);*/
		RE.tearDown();
	}

}
