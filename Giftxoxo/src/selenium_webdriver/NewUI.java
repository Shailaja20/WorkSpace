package selenium_webdriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewUI {
	public  WebDriver driver;
	
	
	
  @Test
  public void S1() throws Exception {
	  Hover hover=new Hover();
	  Redeem_Experience redeem=new Redeem_Experience(driver); 
	  	  
	  hover.beforeTest();
	  hover.MouseHover();
	  redeem.f1();
	  /*driver.findElement(By.xpath("//*[@id='ajax_product_list']/div/div[2]/div/div/div[3]/div/a[1]")).click();
	  System.out.println("test passed");
	  driver.findElement(By.id("notincart")).click();
	  redeem.f2();*/
	  }
  
  /*@Test
  public void S2() throws Exception{
	  Thread.sleep(1000);
	  System.out.println("test passed");
	  driver.findElement(By.xpath("//*[@id='ajax_product_list']/div/div[1]/div/div/div[3]/div/a[1]")).click();
	  System.out.println("test passed");
	  driver.findElement(By.id("notincart")).click();
	  redeem.f2();  
  }
  */
  
  
  /*@BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.giftxoxo.com/");
	  driver.manage().window().maximize();
  }*/

  /*@AfterClass
  public void afterClass() {
	  driver.close();
  }*/

}
