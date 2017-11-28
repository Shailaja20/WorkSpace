package Excel_Sheet;

public class ReadExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExcelDataConfig excel=new ExcelDataConfig("D:\\Excel File\\TestData.xlsx");
		
		System.out.println(excel.getdata(1, 0, 0));
		
	}

}
