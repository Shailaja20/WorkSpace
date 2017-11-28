package corp.xoxoday.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;

@Listeners(corp.xoxoday.com.ListenerDemo.class)

public class Wait_Class {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		
		//WebElement element=driver.findElement(By.xpath("//p[text()='WebDriver']"));
		
		Boolean status=element.isDisplayed();
		
		if(status)
		{
			System.out.println("Element is Displayed");
			System.out.println("Test Passed.");
		}
		else{
			System.out.println("Element is not Displayed");
	}
	}
}
