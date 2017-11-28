package corp.xoxoday.com;

import org.testng.annotations.Test;

import utility.ConfigReader;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Date_Picker {
	public WebDriver driver;
	
	
  @Test
  public void Choose_Date() throws Exception {
	  driver.findElement(By.id("notincart")).click();
	  
	  Thread.sleep(1000);
	  
	  driver.findElement(By.id("prefered_date")).click();
	  
	  List<WebElement> dates=driver.findElements(By.xpath("//div[@class='datepicker-days']/table/tbody/tr/td"));
	  
	  int total_noofdates=dates.size();
	  
	  for(int i=0; i<total_noofdates; i++)
	  {
		String date=dates.get(i).getText();
		
		if(date.equalsIgnoreCase("23"))
		{
			dates.get(i).click();
			System.out.println("Selected date is: "+date);
			break;
		}
	  }
			  
			  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  ConfigReader config=new ConfigReader();
	  System.setProperty("webdriver.chrome.driver", config.getChromePath());
	  driver=new ChromeDriver();
	  driver.get("http://corp.xoxoday.com/adventure/creek-bird-show-42324");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
