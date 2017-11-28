package corp.xoxoday.com;

import org.testng.annotations.Test;

import selenium_webdriver.Redeem_Experience;
import utility.ConfigReader;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Experience_Checkout {
	WebDriver driver;
	
	By ClickDropdown = By.xpath("//*[@id='top2']/ul/li[1]/a[1]"); 
	By SelectFilter = By.xpath("//*[@id='country_filter_container_new']/span[1]/span[1]/span/ul");
	By ClickExperience = By.xpath("//*[@id='ajax_product_list']/div/div[1]/div/div/div[3]/div/a");
	By BookExperience = By.id("notincart");
	
	
	public Experience_Checkout(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	
	
	
  @BeforeTest
  public void OpenBrowser() {
	  ConfigReader config=new ConfigReader();
	  System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
	  System.setProperty("webdriver.chrome.driver",config.getChromePath());
	  driver=new ChromeDriver();
	  driver.get("http://corp.xoxoday.com");
	  driver.manage().window().maximize();
  
  }
	
  @Test
  public void Experience_Redeem() throws Exception {
	  Actions action = new Actions(driver);
	  WebElement we = driver.findElement(By.xpath("//*[@id='top2']/ul/li[1]/a[1]"));
	  WebElement we1 = driver.findElement(By.xpath("//*[@id='top2']/ul/li[1]/ul/li/div/ul/li[2]/ul/li[3]/a"));
	  action.moveToElement(we).moveToElement(we1).click().build().perform();
	  Thread.sleep(2000);
	 // driver.findElement(SelectFilter).sendKeys("Bangalore");
	  driver.findElement(ClickExperience).click();
	  driver.findElement(BookExperience).click();
	  //driver.findElement(By.id("exp_first_name")).sendKeys("Test");
	 // System.out.println("hjdgsjvk");
	 /* Redeem_Experience re=new Redeem_Experience();
	  re.f2();
	  System.out.println("hjdgsjvk");*/
  }
  
  /*@Test (priority=1)
  public void Redeem_PopUp() throws Exception{
	  Redeem_Experience re=new Redeem_Experience();
	  re.f2();
  }*/

  
  

  @AfterTest
  public void afterTest() {
  }

}
