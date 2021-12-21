package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelUtility {
	public String readDataFromExcel(String sheet,int row,int cell) throws IOException {
		FileInputStream fis=new FileInputStream(PathConstant.ExcelPath);
		Workbook wb=WorkbookFactory.create(fis);
		String value = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		//String url = wb.getSheet("sheet 1").getRow(1).getCell(0).getStringCellValue();
		//String us = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		//String pwd = wb.getSheet("sheet1").getRow(1).getCell(2).getStringCellValue();		
		return value;
	}

}
