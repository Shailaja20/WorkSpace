package corp.xoxoday.com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class Refresh_Webpage {
	public WebDriver driver;

	@BeforeMethod
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://corp.xoxoday.com");
		driver.manage().window().maximize();
	  }
	
  @Test (priority=0)
  public void Refresh() throws Exception {
	  Thread.sleep(3000);
	  driver.navigate().refresh();
  }
  
  @Test (priority=1)
  public void Key_Refresh() throws Exception{
	  Thread.sleep(3000);
	  driver.findElement(By.id("header_search_field_desktop")).sendKeys(Keys.PAGE_DOWN);
	  String selectAll = Keys.chord(Keys.CONTROL, "a");
	 // driver.findElement(By.W)
  }
  

  @AfterMethod
  public void afterTest() {
	  driver.close();
  }

}
