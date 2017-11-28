package selenium_webdriver;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Register {
	public WebDriver driver;
	
	public void OpenURL(){
		System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
	}
	
	public void Register(){
		//driver.findElement(By.linkText("Create account")).click();
		driver.findElement(By.xpath(".//*[@id='link-signup']/a")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Shailaja");
		driver.findElement(By.id("LastName")).sendKeys("Sharma");
		driver.findElement(By.xpath(".//*[@id='GmailAddress']")).sendKeys("shailaja");
		driver.findElement(By.id("Passwd")).sendKeys("Shailaja20");
		driver.findElement(By.id("username-suggestions")).click();
		driver.findElement(By.id("PasswdAgain")).sendKeys("Shailaja20");
		// as the dropdown here does not contain select tag so we have used driver.findelement and sendkeys instead of select by visible text
		driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[1]")).sendKeys("November");
		driver.findElement(By.id("BirthDay")).sendKeys("01");
		driver.findElement(By.id("BirthYear")).sendKeys("1993");
		driver.findElement(By.xpath(".//*[@id='Gender']/div")).sendKeys("Female");
		driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("7829276849");
		//driver.findElement(By.id("SkipCaptcha")).click();
		//driver.findElement(By.id("TermsOfService")).click();
		driver.findElement(By.id("submitbutton")).click();
		String str;
		str=driver.getWindowHandle();
		driver.switchTo().window(str);
		System.out.println(str);
		/*JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript(str.scrollBy(0,2500));*/
		/*driver.findElement(By.xpath("//*[@id='tos-scroll']")).click();
		driver.findElement(By.id("signupidvmethod-sms")).click();
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("verify-phone-input")).sendKeys("787451");
        driver.findElement(By.xpath(".//*[@id='signupidv']/div[1]/div[2]/input[2]")).click();
        driver.findElement(By.id("submitbutton")).click();*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gmail_Register g=new Gmail_Register();
		g.OpenURL();
		g.Register();
	}

}