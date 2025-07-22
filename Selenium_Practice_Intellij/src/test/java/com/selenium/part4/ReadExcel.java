package com.selenium.part4;


import java.io.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;

import com.basicRequirements.PathProperties;

public class ReadExcel {
	public static void main(String args[]) throws Exception
	{
		
		PathProperties pp = new PathProperties();
		//System.setProperty("webdriver.chrome.driver",pp.obj.getProperty("chromeDriverLocation"));
		String filePath = System.getProperty("user.dir") + pp.obj.getProperty("excelFileLocation");
		
		//Testing path through output
		//System.out.println(filePath);
		//System.out.println("C:\\Users\\priyamps\\Downloads\\Eclipse\\Eclipse-Workspace\\Selenium_Practice_Next_Platform\\src\\test\\resources\\Excel\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(filePath);
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		for(int i = 0; i <= sheet.getLastRowNum(); i++)
		{
			for(int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells() - 1;j++)
			{
				Row row = sheet.getRow(i);
				Cell cell = row.getCell(j);
				System.out.print(cell.getStringCellValue());
				System.out.print("   |   ");
			}
			System.out.println();
		}
		
//		System.out.println("Last row number: " + sheet.getLastRowNum());
//		System.out.println(sheet.getRow(0).getPhysicalNumberOfCells());
//		System.out.println(sheet.getRow(1).getPhysicalNumberOfCells());
//		System.out.println(sheet.getRow(2).getPhysicalNumberOfCells());
		
	}

}
