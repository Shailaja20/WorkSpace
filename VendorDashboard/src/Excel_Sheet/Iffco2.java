package Excel_Sheet;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Iffco2 {
	public WebDriver driver;
	ExcelDataConfig excel=new ExcelDataConfig("D:\\Excel File\\Automate.xlsx");
	
	String voucher="C0916f7c";
	
	@BeforeTest
	public void Open_Browser(){
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://52.74.236.98/iffco");
		  driver.manage().window().maximize();
	}
	

	@Test 
	public void Select_Product() throws Exception{
		System.out.println("Test started");
		driver.findElement(By.xpath("//*[@id='book_exp_submit']/input")).sendKeys(voucher);
		Thread.sleep(1000);
		driver.findElement(By.id("redeem_btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='gift_']/a")).click();
		driver.findElement(By.xpath("//*[@id='gift']/div/div[3]/div/div[2]/div/div[2]/div/a")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("selectedvoucher"))).selectByValue("5303");
		System.out.println("Test successful");
		driver.findElement(By.xpath("//*[@id='product-info'	]/div/div[2]/div[4]/button")).click();
		Thread.sleep(2000);
		String str;
		str=driver.getWindowHandle();
		driver.switchTo().window(str);
		System.out.println(str);
		//Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*
		
		*/
	}
	
	@Test (priority=1)
	public void Quantity_Validation() throws Exception{
           // for (int Quantity = 0; Quantity<=3 ; Quantity++>)
			driver.findElement(By.xpath(".//*[@id='final_quantity']")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='final_quantity']")).sendKeys("3");
			Thread.sleep(1000);
			driver.findElement(By.name("firstname")).sendKeys("Shailaja");
			driver.findElement(By.xpath("//*[@id='shipping_details']/div/div[5]/span/input")).sendKeys("shailja@xoxoday.com");
			driver.findElement(By.xpath("//*[@id='shipping_details']/div/div[6]/span/input")).sendKeys("7829276849");
			driver.findElement(By.id("voucher_submit")).click();
          // }
			}
	
	
	
	@AfterTest
	
public void Close_Broser(){
		//driver.close();
	}
	

}
