package corp.xoxoday.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ImageVerify {
	
	public WebDriver driver;
	private int invalidImageCount;
	
	@BeforeTest
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://enterprise.xoxoday.com/home/index/consumerpromotions");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void invalidImageCount()
	{
		List<WebElement> imagelist=driver.findElements(By.xpath(".//*[@id='main-slider ']/img"));
		System.out.println(imagelist.size());
		
		for (WebElement imgElement:imagelist) {
			if(imagelist!=null)
			{
				verifyimageActive(imgElement);
			}
			}
		System.out.println("Total no. of invalid images are "	+ invalidImageCount);
			} 
			
		
		
		public void verifyimageActive(WebElement imgElement) {
			try {
				HttpClient client = HttpClientBuilder.create().build();
				HttpGet request = new HttpGet(imgElement.getAttribute("src"));
				HttpResponse response = client.execute(request);
				// verifying response code he HttpStatus should be 200 if not,
				// increment as invalid images count
				if (response.getStatusLine().getStatusCode() != 200)
					invalidImageCount++;
			} catch (Exception e) {
				e.printStackTrace();
	}

}
}