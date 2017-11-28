package Excel_Sheet;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Numeric_Data {
	public WebDriver driver;
	
	ExcelDataConfig excel=new ExcelDataConfig("D:\\ExcelFile\\TestData.xlsx");
	
	
  @Test
  public void Numeral_Data() {
	  driver.findElement(By.xpath("//a[@class='dropdown-toggle'][@href='#']")).click();
	  driver.findElement(By.linkText("Sign In")).click();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  //excel.
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://corp.xoxoday.com");
	  driver.manage().window().maximize();
  }

}
