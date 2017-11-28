package Excel_Sheet;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DemoMainClass {
WebDriver driver;

@Test
public void test() throws Exception
{
/*String excode=excode.getStringCellValue("D:\\Workspace\\VendorDashboard\\TestData\\Upload.xlsx","Youlink",1,0);
String youlink=excode.getCellValue("D:\\Workspace\\VendorDashboard\\TestData\\Upload.xlsx",1,1);*/
YoutubevideoLinks link = new YoutubevideoLinks(driver);
link.OpenBrowser();
link.TestLogin();
//link.updateLink(excode,youlink);
link.TearDown();

}

}