package Corp_Excelsheet;

import Excel_Sheet.ExcelDataConfig;
import java.io.File;
import java.io.FileInputStream;
import java.net.HttpURLConnection;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Broken_Links {
	static WebDriver driver;
	
	
	public static void main(String[] args) throws Exception{
		
		XSSFWorkbook wb;
		XSSFSheet sheet1;
		ExcelDataConfig Excel=new ExcelDataConfig("D:\\Excel File\\errors-giftxoxo.xlsx");
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://google.co.in");
		driver.manage().window().maximize();
		
		File src=new File("D:\\Excel File\\errors-giftxoxo.xlsx");
		FileInputStream fin=new FileInputStream(src);
	    wb=new XSSFWorkbook(fin);
	    sheet1=wb.getSheetAt(3);
		int rowCount=sheet1.getLastRowNum();
		System.out.println("Total no. of rows in an Excel Data Sheet is "+rowCount);
		
		for(int i=1; i<rowCount; i++)
		{
		String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
		System.out.println("Link is "+data0);
		System.out.println("Ctrl is started");
		  
						
		VerifyLinks(Excel.getdata(3, i, 0));
		System.out.println("Ctrl is Ended");
		
		wb.close();
		}
		}
	

 // @Test (dependsOnMethods= "Excel_Read" )
  public static void VerifyLinks(String linkUrl) throws Exception {
	  System.out.println("Loop started");
	 
	  
	  ExcelDataConfig exccel=new ExcelDataConfig(linkUrl);
	  System.out.println("Loop started1");
	  	
	 HttpURLConnection httpurlconnect=(HttpURLConnection)exccel.openConnection();
	 System.out.println("Loop started2");
	 httpurlconnect.setConnectTimeout(20000);
	 System.out.println("Loop started3");
	 httpurlconnect.connect();
	 System.out.println("Loop started4");
	 
	 if(httpurlconnect.getResponseCode()==200)
	 {
		 System.out.println(linkUrl+" - "+httpurlconnect.getResponseMessage());
		 System.out.println("Loop started5");
	 }
	 if(httpurlconnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
	 {
		 System.out.println(linkUrl+" - "+httpurlconnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
		 System.out.println("Loop started6");
	 }
   
  }
}
  
  