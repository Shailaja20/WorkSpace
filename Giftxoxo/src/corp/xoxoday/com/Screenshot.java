package corp.xoxoday.com;

import java.io.File;
import java.io.IOException;

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

public class Screenshot {
	WebDriver driver;
	
	@Test
	public void Screenshot_Class()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("shailja@xoxoday.com");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try 
		{
			FileUtils.copyFile(src, new File("D:/Workspace/Giftxoxo/Screenshot/" +System.currentTimeMillis()+ ".png"));
		} catch (Exception e) {
			
			System.out.println("Error is :" +e.getMessage());
			
		}
	}

}
