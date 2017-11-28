package Excel_Sheet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YoutubevideoLinks {
WebDriver driver;

By Username = By.id("username");
By Password = By.id("password");
By SignIn = By.xpath("html/body/section[1]/div[2]/div[2]/div/div/form/input[3]");
By SelectExperience = By.className("icon-diamond");
By Searchbox = By.xpath(".//*[@id='explist_filter']/label/input");
By ClickExperience = By.xpath(".//*[@id='explist']/tbody/tr/td[5]/a");
By YoutubeLinkBox = By.id("exp_video_link");
By Update = By.xpath(".//*[@id='activityEdit']/div[25]/div[12]/input");

public YoutubevideoLinks(WebDriver driver)
{
this.driver=driver;
}

@BeforeTest
public void OpenBrowser()
{
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
driver = new ChromeDriver();
driver.get("http://www.giftxoxo.com/vendor/public/login");
driver.manage().window().maximize();
}

@Test
public void TestLogin()
{
driver.findElement(Username).sendKeys("sheetal@giftxoxo.com");
driver.findElement(Password).sendKeys("Sheetal@12345");
driver.findElement(SignIn).click();
}

@Test
public void updateLink(String excode,String youlink) throws InterruptedException
{
driver.findElement(SelectExperience).click();
driver.findElement(Searchbox).sendKeys(excode);
Thread.sleep(1000);
driver.findElement(ClickExperience).click();
driver.findElement(YoutubeLinkBox).clear();
driver.findElement(YoutubeLinkBox).sendKeys(youlink);
driver.findElement(Update).click();
}

@AfterTest
public void TearDown()
{
driver.close();
}

}