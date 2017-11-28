package Excel_Sheet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login_MultipleData {
	public WebDriver driver;
	ExcelDataConfig excel1=new ExcelDataConfig("D:\\Excel File\\TestData.xlsx");
	

	
	public void Browser() {
			  System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver_win32\\chromedriver.exe");
			  driver=new ChromeDriver();
			  driver.get("http://www.giftxoxo.com/");
			  driver.manage().window().maximize();
			  }
	
	public void Hover() throws Exception{
		driver.findElement(By.xpath("//*[@id='top']/div/div/div[3]/div/ul/li[3]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		Thread.sleep(1000);
		/*
		int data1=excel1.sheet1.getLastRowNum();
		System.out.println(data1);*/
		
		for(int i = 0; i<14 ; i++){
			
			
			for(int j = 1; j<2 ; j++ ){
				driver.findElement(By.id("login_username")).sendKeys(excel1.getdata(0, i, 0));
			    driver.findElement(By.id("password")).sendKeys(excel1.getdata(0, i, j));
		      	driver.findElement(By.id("button-login1")).click();	
		      	Thread.sleep(1000);
		      	driver.findElement(By.id("login_username")).clear();
		      	driver.findElement(By.id("password")).clear();
			}
		}
		
        excel1.wb.close();      	
      
	}
	

public static void main(String[] args) throws Exception {

	Login_MultipleData login=new Login_MultipleData();
	login.Browser();
	login.Hover();
}
}

