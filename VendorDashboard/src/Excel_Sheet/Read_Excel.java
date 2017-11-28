package Excel_Sheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel {

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
		
		String data0=sheet1.getRow(0).getCell(1).getStringCellValue();
		
		int rowCount=sheet1.getLastRowNum();
		System.out.println("Total No. of rows is " +rowCount+ "+1");
		
		System.out.println("Data from Excel is " +data0);
		
		// here we need to specify where you want to save file
		FileOutputStream fout=new FileOutputStream("D:\\Excel File\\TestData.xlsx");
		
		sheet1.getRow(2).createCell(2).setCellValue("7886325");
		sheet1.getRow(3).createCell(2).setCellValue("788t5443");
		
		
		
		//write content
		wb.write(fout);
		
		//close the file
		fout.close();
		
		
		
		
		
		
	}

}
