package Excel_Sheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//Specify the path of the file
		File src=new File("D:\\Excel File\\TestData.xlsx");
		
		//Load File
		FileInputStream fin=new FileInputStream(src);
		
		//Load Workbook
		XSSFWorkbook wb=new XSSFWorkbook(fin);
		
		//Load Sheet -- we are loading first sheet only
		XSSFSheet sheet1=wb.getSheetAt(0);
				
		int rowCount=sheet1.getLastRowNum();
		System.out.println("Total No. of rows is " +rowCount);
		
		for(int i = 0; i<rowCount ; i++){
			String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Data from row "+i+ " is " +data0);
		}
		
		
		
		
		
	}

}
