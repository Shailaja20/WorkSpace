package selenium_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Mail_Login {
	public WebDriver driver;
	
	public void chromedriver(){
		System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://google.co.in");
		driver.manage().window().maximize();
	}
	
	public void firefox(){
		driver= new FirefoxDriver();
		driver.get("http://google.co.in");
		driver.manage().window().maximize();
	}
	
	public void ie(){
		System.setProperty("webdriver.ie.driver", "D:\\Lib\\IEDriverServer_x64_2.48.0\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.get("http://google.co.in");
		System.out.println(driver.getTitle());
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Mail_Login m=new Mail_Login();
		m.chromedriver();
		m.firefox();
		m.ie();
		
		
		
	}

}
