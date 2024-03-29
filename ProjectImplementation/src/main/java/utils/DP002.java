package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DP002 {
	@DataProvider(name="fetchData")
	
	//@Test
	public static String[][] getData() throws IOException{
		String[][] testdata;
		FileInputStream fip = new FileInputStream("./test data/TC002.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fip);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		testdata = new String[rowCount][columnCount];
		for(int i=1;i<=rowCount;i++){
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<columnCount;j++){
				String cellData = row.getCell(j).getStringCellValue();
				//System.out.println(cellData);
				testdata[i-1][j] = cellData;
			}
		}
		return testdata;
		
	}

}
