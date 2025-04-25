package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData {

	XSSFWorkbook wb;
	XSSFSheet sheet;
	public TestData(String ExcelPath)
	{
		 	File src = new File(ExcelPath);
			FileInputStream fis;
			try 
			{
				fis = new FileInputStream(src);
				wb = new XSSFWorkbook(fis);
			
				//int rowCount= sheet.getLastRowNum();
//				
//				sheet0.getRow(0).getCell(0).getStringCellValue();
//				
//				wb.close();

			
			} 
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		 
	}
	
	public String getExcelTestData(int sheetNo, int row, int column)
	{
		sheet = wb.getSheetAt(sheetNo);
		return sheet.getRow(row).getCell(column).getStringCellValue();
	}
	
	public int getRowCount(int sheetIndex)
	{
		int row= wb.getSheetAt(sheetIndex).getLastRowNum();
		row = row+ 1;
		return row;
	}
	
	public void closeworkBook()
	{
		try 
		{
			wb.close();
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
