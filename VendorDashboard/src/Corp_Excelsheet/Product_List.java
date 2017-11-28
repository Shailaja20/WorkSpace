package Corp_Excelsheet;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Product_List {
	
	WebDriver driver;
	
  @BeforeTest
  public void beforeTest() {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://corp.xoxoday.com/adventure");
		driver.manage().window().maximize();
	  }

	
  @Test
  public void Product_URL_Title() throws Exception {
	  JavascriptExecutor je= (JavascriptExecutor) driver;
	  WebElement element=driver.findElement(By.xpath(".//*[@id='button-login_load_more']")); 
	  int n=1;
	  for(n=1; n<6; n++){
	  je.executeScript("arguments[0].scrollIntoView(true);", element);
	  je.executeScript("window.scrollBy(0,-300)", "");
   	  Thread.sleep(3000);
	  }
	  
	 List<WebElement> str=driver.findElements(By.tagName("a"));
	 System.out.println("Link size is: "+str.size());
	 
	 for(int i=0; i<str.size(); i++){
		 System.out.println(str.get(i).getAttribute("href"));
	 }
	 
	 int i = 0;
     PrintStream printStream = new PrintStream(new FileOutputStream(new File("D:\\ExcelFile\\Product_Links.xlsx")));
     System.setOut(printStream);
     while(i<1000){
         System.out.print(i+++","+i+++","+i++);
         System.out.println();
     }
  }
  
  
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}