package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Hover {
	public WebDriver driver;
	
	
  @Test
  public void MouseHover() throws Exception {
	 	Actions action = new Actions(driver);
	  WebElement we = driver.findElement(By.xpath("//*[@id='top2']/ul/li[1]/a[1]"));
	  action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//*[@id='top2']/ul/li[1]/ul/li/div/ul/li[2]/ul/li[2]/a"))).click().build().perform();
      Thread.sleep(1000);
	//driver.findElement(By.xpath("//*[@id='top']/div/div/div[3]/div/ul/li[3]/ul/li[1]/a")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
	  System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.giftxoxo.com/");
	  driver.manage().window().maximize();
  }
  
  @AfterTest
  public void aftertest(){
	  driver.close();
  }

}
