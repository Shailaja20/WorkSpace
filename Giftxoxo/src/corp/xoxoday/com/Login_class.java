package corp.xoxoday.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utility.ConfigReader;

@Listeners(corp.xoxoday.com.ListenerDemo.class)

public class Login_class {
	public WebDriver driver;
	
  @Test
  public void Login() {
	  ConfigReader config=new ConfigReader();
	  System.setProperty("webdriver.chrome.driver", config.getChromePath());
	  driver=new ChromeDriver();
	  driver.get(config.getApplicationURL());
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//a[@class='dropdown-toggle'][@href='#']")).click();
	  driver.findElement(By.linkText("Sign In")).click();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.findElement(By.id("login_username")).sendKeys("shailja@xoxoday.com");
	  driver.findElement(By.id("password")).sendKeys("9595566654");
	  driver.findElement(By.id("button-login1")).click();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	  WebElement Actual_Error = driver.findElement(By.xpath("//*[@id='login-form1']/div[2]/div"));
	  
	  
	 String Expected_Error="Email and password mismatch please try it again";
	 
	 Assert.assertEquals(Actual_Error, Expected_Error);
	  
	System.out.println("Error displayed");
  }
  
  
}
