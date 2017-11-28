package corp.xoxoday.com;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author Admin
 * This clas will capture Screenshot for the Executed Testcases.
 */

public class Multiple_Screenshot {
	WebDriver driver;
	
	@Test
	public void Screenshot_Class()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		Multiple_Screenshot.ScreenshotLibrary(driver);
		driver.findElement(By.id("email")).sendKeys("shailja@xoxoday.com");
		Multiple_Screenshot.ScreenshotLibrary(driver);
		System.out.println(System.currentTimeMillis());
	}
	
	public static void ScreenshotLibrary(WebDriver driver)
	{
      File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try 
		{
			FileUtils.copyFile(src, new File("D:/Workspace/Giftxoxo/Screenshot/"+System.currentTimeMillis()+".png"));
		} catch (Exception e) {
			
			System.out.println("Error is :" +e.getMessage());
			
	}
		
		}
	}


