package selenium_webdriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Red_Bus {
	public WebDriver driver;
	
	By FROM= By.xpath("//input[@id='src']");
	By From_Click =By.xpath("//*[text()='Bangalore']");
	By TO=By.xpath("//input[@id='dest']");
	By To_Click=By.xpath("//*[text()='Nagpur']");
	
	
	
  @Test
  public void Select_Bus() throws Exception {
	  Thread.sleep(1000);
	  driver.findElement(FROM).sendKeys("Banga");
	  Thread.sleep(1000);
	  driver.findElement(From_Click).click();
	  driver.findElement(TO).sendKeys("Nag");
	  Thread.sleep(1000);
	  driver.findElement(To_Click).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//label[text()='Onward Date']")).click();
	  
	  System.out.println("Selected a date");
	  
	  List<WebElement> Dates=driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr/td"));
	  int Total_count=Dates.size();
	  System.out.println("Selected a datesize is :"+Total_count);
	  for(int i=0; i<Total_count; i++)
	  {
		  String date=Dates.get(i).getText();
		  System.out.println("Selected a date is :"+date);
		  if(date.equalsIgnoreCase("30"))
		  {
			  Dates.get(i).click();
			  System.out.println("Final Selected date is :"+date);
			  break;
		  }
	  }
	  
	  driver.findElement(By.id("search_btn")).click();
  }
  
  @BeforeTest
  public void setup() {
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.redbus.in");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
