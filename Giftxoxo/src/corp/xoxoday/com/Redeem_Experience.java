package corp.xoxoday.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Redeem_Experience{
	public  WebDriver driver;
	
	
    public Redeem_Experience(WebDriver driver) 
    {
		this.driver=driver;
	}
    
    @BeforeTest
    public void Open(){
   	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://www.giftxoxo.com/");
		  driver.manage().window().maximize();
   }

	@Test
    public  void f1() throws Exception{
    	Actions action = new Actions(driver);
  	    WebElement we = driver.findElement(By.xpath("//*[@id='top2']/ul/li[1]/a[1]"));
  	    action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//*[@id='top2']/ul/li[1]/ul/li/div/ul/li[2]/ul/li[2]/a"))).click().build().perform();
        Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id='ajax_product_list']/div/div[2]/div/div/div[3]/div/a[1]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.id("notincart")).click();
    	Thread.sleep(1000);
    	String str;
		str=driver.getWindowHandle();
		driver.switchTo().window(str);
		System.out.println(str);
		
    }
    
   @Test
    public void f2() throws Exception{
    	Thread.sleep(2000);
    	driver.findElement(By.id("exp_first_name")).sendKeys("Test");
    	driver.findElement(By.id("exp_email")).sendKeys("shailja@giftxoxo.com");
    	driver.findElement(By.id("prefered_date")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/div[18]/div[1]/table/tbody/tr[3]/td[7]")).click();
    	driver.findElement(By.id("optional_date")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div[18]/div[1]/table/tbody/tr[4]/td[1]")).click();
    	driver.findElement(By.id("weight")).sendKeys("34");
    	driver.findElement(By.xpath("//*[@id='adventure_radio_div']/div/input[2]")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.id("exp_contact")).sendKeys("78292768490");;
    	driver.findElement(By.id("voucher_submit")).click();
     }
    
    @Test
    public void f3() throws Exception{
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id='mycart']/div[2]/div/div[2]/div[1]/a/button")).click();
    	driver.findElement(By.xpath("//*[@id='login']/div/div[3]/div[2]/div/a[2]/img")).click();
     }
    
    @Test
    public void f4() throws Exception{
    	//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("shailja@giftxoxo.com");
		driver.findElement(By.id("next")).click();
		Thread.sleep(1000);
		//driver.findElement(By.id("Passwd")).sendKeys("9595566654");
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("9595566654");
		driver.findElement(By.id("signIn")).click();
		//Thread.sleep(2000);
			}
    
    @Test
    public void f5() throws Exception{
    	Thread.sleep(1000);
    	driver.findElement(By.id("phone_number")).sendKeys("7829276849");
    	driver.findElement(By.id("generate-otp")).click();
    	//driver.findElement(By.id("otp")).sendKeys("463883");
    	driver.findElement(By.id("verify-otp")).click();
    	driver.findElement(By.id("button-confirm")).click();
    	driver.findElement(By.id("payuvoucher")).click();
    	driver.findElement(By.xpath("//*[@id='loadpayment_form']/div/div/div[3]/div/div[1]/div[1]/input")).sendKeys("fytdtr");
    	driver.findElement(By.id("redeem_voucher")).click();
    }
    
   


  @AfterTest
  public void afterTest() {
	  driver.close();
  }
    
    

}
