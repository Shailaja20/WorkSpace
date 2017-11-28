package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Language {
	public static WebDriver driver;
	
	public void OpenUrl(){
		System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
	}
	
	public void Firefox(){
		driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
	}
	
	public void ClickLanguage(String str){
		driver.findElement(By.xpath(str)).click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Google_Language g=new Google_Language();
		g.OpenUrl();
		g.ClickLanguage("//*[@id='_eEe']/a[1]");
		g.ClickLanguage("//*[@id='_eEe']/a[1]");
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println("Successful");

	}

}
