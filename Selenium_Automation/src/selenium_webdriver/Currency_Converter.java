package selenium_webdriver;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Currency_Converter {
	public WebDriver driver;
	private String parent="";

	public void OpenURL(){
		System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
	}
	
	public void Spicejet_Search() throws Exception{
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.linkText("Bagdogra (IXB)")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Goa (GOI)")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("15")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("15")).click();
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("9 Adults");;
		//driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		String parent=driver.getWindowHandle();
		System.out.println("Parent Window Id is :" +parent);
		driver.findElement(By.id("popUpConverter")).click();
		Thread.sleep(1000);
	}
	
	public void CurrencyPage(){
		for(String handle: driver.getWindowHandles())
		{
			if(!parent.equals(handle))
			{
				System.out.println(handle);
				driver.switchTo().window(handle);
			}
			
		}
		new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListBaseCurrency"))).selectByValue("AED");
		new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListConversionCurrency"))).selectByValue("INR");
		driver.findElement(By.id("CurrencyConverterCurrencyConverterView_TextBoxAmount")).sendKeys("1000");	
		driver.findElement(By.id("CurrencyConverterCurrencyConverterView_ButtonConvert")).click();
		driver.close();
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//*[@id='wrapper']/div/div[1]/div[3]/h2/a")).click();
		driver.close();
		}
	
	public static void main(String[] args) throws Exception {
		Currency_Converter currency=new Currency_Converter();
		currency.OpenURL();
		currency.Spicejet_Search();
		currency.CurrencyPage();

	}

}
