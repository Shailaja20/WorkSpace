package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjaxControl {
	public WebDriver driver;
	
	public void OpenURL(){
		System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://google.co.in");
		driver.manage().window().maximize();
	}
	
	public void Dynamic_Content(){
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		String str;
		str=driver.findElement(By.xpath(".//*[@id='gsr']/div[2]/div[2]/div[1]")).getText();
		System.out.println(str);
		String s[]=str.split("\n");
		System.out.println(s.length);
		for(int i=0; i<s.length; i++){
			if(s[i].equalsIgnoreCase("Selenium Tutorial")){
				System.out.println(s[i]);
		   }else{
			   System.out.println("String is not present");
			   driver.findElement(By.id("lst-ib")).clear();
			   driver.findElement(By.id("lst-ib")).sendKeys(s[i]);
		   }
			   
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AjaxControl a=new AjaxControl();
		a.OpenURL();
		a.Dynamic_Content();

	}

}
