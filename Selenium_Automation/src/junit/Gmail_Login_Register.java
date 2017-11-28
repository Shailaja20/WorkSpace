package junit;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login_Register {
	public WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws Exception {
		driver.findElement(By.id("Email")).sendKeys("sharmashailja20@gmail.com");
		driver.findElement(By.id("next")).click();
		Thread.sleep(1000);
		//driver.findElement(By.id("Passwd")).sendKeys("9595566654");
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("9595566654");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Sign out")).click();
	   	System.out.println("Successfull");
		}

	@Test     //(description="Test register of Gmail")
	public void test1() throws Exception{
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
		driver.findElement(By.id("SkipCaptcha")).click();
		driver.findElement(By.id("TermsOfService")).click();
		driver.findElement(By.id("submitbutton")).click();
		
	}
}
