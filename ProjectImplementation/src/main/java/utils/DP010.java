package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DP010 {
	@SuppressWarnings("resource")
	@DataProvider(name="fetchData")
	public static String[][] getData() throws IOException{
		String[][] testData;
		FileInputStream fis = new FileInputStream("./test data/TC010.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		testData = new String[rowCount][columnCount];
		for(int i=1;i<=rowCount;i++){
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<columnCount;j++){
				String cellData = row.getCell(j).getStringCellValue();
				testData[i-1][j] = cellData;
			}
		}
		return testData;
		
	}

}
