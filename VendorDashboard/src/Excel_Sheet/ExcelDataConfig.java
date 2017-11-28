package Excel_Sheet;

import java.io.File;
import java.io.FileInputStream;
import java.net.HttpURLConnection;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {

	    XSSFWorkbook wb;
	    XSSFSheet sheet1;
	
	public ExcelDataConfig(String ExcelPath){
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");

		
		try {
			//Specify the path of the file
			File src=new File(ExcelPath);
			
			//Load File
			FileInputStream fin=new FileInputStream(src);
			
			//Load Workbook
			 wb=new XSSFWorkbook(fin);
					
	} catch (Exception e) {
		
			System.out.println(e.getMessage());
		}
	}

	
	public String getdata(int sheetnumber,int row, int column){
		
		//Load Sheet -- we are loading first sheet only
		 sheet1=wb.getSheetAt(sheetnumber);
	
		String data=sheet1.getRow(row).getCell(column).getStringCellValue();
		
		return data;

    }


	public HttpURLConnection openConnection() {
		// TODO Auto-generated method stub
		return null;
	}
}
