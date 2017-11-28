package selenium_webdriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.AfterTest;

public class Login {
	public WebDriver driver;
	
	By Username = By.xpath("//*[@id='login_username']");
	By Password = By.xpath("//*[@id='password']");
	By Submit = By.xpath("//*[@value='Login']");
	
	
  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://www.giftxoxo.com/");
		  driver.manage().window().maximize();
		  }
  
	
  @Test (priority=1)
  public void Login_Page()  throws Exception  {
	  driver.findElement(Username).sendKeys("shailja@giftxoxo.com");
	  driver.findElement(Password).sendKeys("7de6b05fe609");
	  driver.findElement(Submit).click();
	  Thread.sleep(3000);
      if(driver.findElement(By.xpath("//*[@id='modal-register-label']")).isDisplayed()){
    	  System.out.println("available");
    	  //driver.findElement(By.xpath(".//*[@id='login-modal']/div/div/div[1]/button")).click();
    	  Thread.sleep(2000);
      }else{
    	  System.out.println("Not Available");
      }
  }
  
  @Test /*(priority=0)*/
 public void Hover() throws Exception{
	  Actions action = new Actions(driver);
	  WebElement we = driver.findElement(By.xpath("//a[contains(text(),'Account')][@class='dropdown-toggle']"));
	  action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//*[@id='top']/div/div/div[3]/div/ul/li[3]/ul/li[1]/a"))).click().build().perform();
      Thread.sleep(1000);
	//  driver.findElement(By.xpath("//*[@id='top']/div/div/div[3]/div/ul/li[3]/ul/li[1]/a")).click();
  }
  
  
  @Test (dependsOnMethods = { "Login_Page" })
  public void Forgot_Password() throws Exception{
	  /*Login l=new Login();
	  l.Hover();*/
	  driver.findElement(By.id("forgotpwd_checkacct")).click();
  }
  
  
  
 
  /*@AfterTest
  public void afterTest() {
	  driver.close();
	  }*/

}
