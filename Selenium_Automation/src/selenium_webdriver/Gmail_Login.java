package selenium_webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ConfigReader;

public class Gmail_Login {
	public WebDriver driver;
	
	public void OpenURL(){
		ConfigReader config=new ConfigReader();
		System.setProperty("webdriver.chrome.driver", config.getChromePath());
		driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();		
	}
	
	public void Login() throws Exception{
		driver.findElement(By.id("Email")).sendKeys("sharmashailja20@gmail.com");
		driver.findElement(By.id("next")).click();
		Thread.sleep(1000);
		//driver.findElement(By.id("Passwd")).sendKeys("9595566654");
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("Shailaja1!@");
		driver.findElement(By.id("signIn")).click();
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}
	
	public void Compose() throws Exception{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=':j2']/div/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.id(":om")).sendKeys("shailja@giftxoxo.com");
		Thread.sleep(1000);
		//driver.findElement(By.id(":oa")).sendKeys("shailja@giftxoxo.com");
		driver.findElement(By.id(":pb")).sendKeys("ALL IS WELL");
		Thread.sleep(1000);
		//driver.findElement(By.id(":n3")).click();
		driver.findElement(By.xpath("//*[@id=':nw']")).click();
		
	}
	
	public void SignOut() throws Exception{
		driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Sign out")).click();
	   	System.out.println("Successfull");
	}

	public static void main(String[] args) throws Exception {
     Gmail_Login g=new Gmail_Login();
     g.OpenURL();
     g.Login();
     g.Compose();
     g.SignOut();

	}

}
