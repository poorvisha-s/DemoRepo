package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DP {
	@SuppressWarnings("resource")
	@DataProvider(name="fetchData")
	//@Test
	public static String[][] getData() throws IOException{
		String[][] testdata;
/*		testdata[0][0] = "poorvi_s";
		testdata[0][1] = "test@123";
		testdata[0][2] = "test@123";
		testdata[0][3] = "2";
		testdata[0][4] = "Test Answer";
		testdata[1][0] = "poorvisha";
		testdata[1][1] = "testing@123";
		testdata[1][2] = "testing@123";
		testdata[1][3] = "3";
		testdata[1][4] = "testing answer";*/
		FileInputStream fip = new FileInputStream("./test data/TC001.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fip);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		//System.out.println("rowCount = "+rowCount+" columnCount = "+columnCount);
		testdata = new String[rowCount][columnCount];
		for(int i=1;i<=rowCount;i++){
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<columnCount;j++){
				 String cellData  = row.getCell(j).getStringCellValue();
				//System.out.println("Value at Row "+i+" column "+j+" is "+cellData);
				testdata[i-1][j] = cellData;
			}
		}
		return testdata;
	}
}