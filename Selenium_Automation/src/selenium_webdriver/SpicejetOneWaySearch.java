package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpicejetOneWaySearch {
	public WebDriver driver;
	
	public void openURL(){
	System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://spicejet.com");
	driver.manage().window().maximize();
	}

	public void oneWaySearch() throws Exception{
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	    driver.findElement(By.linkText("Hyderabad (HYD)")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("25")).click();
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("2 Adults");
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child"))).selectByVisibleText("1 Child");
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant"))).selectByVisibleText("1 Infant");
		//driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		//Thread.sleep(1000);
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
	}
	public static void main(String[] args) throws Exception {
     SpicejetOneWaySearch s=new SpicejetOneWaySearch();
     s.openURL();
     s.oneWaySearch();
	}

}
