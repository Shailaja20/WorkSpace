package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet_Alert {
	public WebDriver driver;
	
	public void OpenURL(){
	System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://spicejet.com");
	
	driver.manage().window().maximize();
	}
	
	public void OnewaySearch() throws Exception{
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.linkText("Guwahati (GAU)")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
		driver.findElement(By.linkText("16")).click();
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("9 Adults");
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child"))).selectByVisibleText("4 Children");
 	//driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}
	
	public void Java_Alert() throws Exception{
		String str;
		str=driver.switchTo().alert().getText();
		System.out.println(str);
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Spicejet_Alert s=new Spicejet_Alert();
		s.OpenURL();
		s.OnewaySearch();
		s.Java_Alert();

	}

}
