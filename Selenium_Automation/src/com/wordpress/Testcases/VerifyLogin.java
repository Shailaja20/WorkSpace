package com.wordpress.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wordpress.Pages.LoginPage;


/**
 * @author Admin
 *
 */
public class VerifyLogin {
	WebDriver driver;
	

	@Test (priority=0)
	public void LoginWordpress(){
		
		LoginPage login=new LoginPage(driver);

				
		login.LogintoWordpress("admin", "demo123");
				
		/*login.typeUsername("admin");
		login.typePassword("demo123");
		login.ClickLoginButton();*/
			
		WebDriverWait wait=new WebDriverWait(driver, 30);
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Howdy, admin']")));
        Boolean status=element.isDisplayed();
		
		if(status)
		{
			System.out.println("Element is Displayed :" +element);
			System.out.println("Test Passed.");
		}
		else{
			System.out.println("Element is not Displayed");
	}
	}
	
	@Test (priority=1)
	public void GeneratePassword()
	{
		LoginPage login=new LoginPage(driver);

		login.forgetPassword();
	}
		
    @BeforeMethod	
    public void beforemethod()
    {
    	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.demosite.center/wordpress/wp-login.php");
		driver.manage().window().maximize();
    }
		
    @AfterMethod
    public void aftermethod()
    {
    	driver.close();
    }



}
