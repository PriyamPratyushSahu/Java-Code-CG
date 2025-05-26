package _1_introduction;

import java.io.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;

public class ReadExcel {
	@SuppressWarnings("resource")
	public static void main(String args[]) throws Exception
	{
		
		String excelFilePath = System.getProperty("user.dir") + File.separator + "src" 
				+ File.separator + "test" + File.separator + "resources" +  File.separator + "excelFiles"+  File.separator + "TestData.xlsx";
		System.out.println(excelFilePath);
		
		FileInputStream fs = new FileInputStream(excelFilePath);
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		System.out.println(sheet.getRow(0).getCell(0));
		
		for(int i = 0; i <= sheet.getLastRowNum(); i++)
		{
			for(int j = 0 ; j < sheet.getRow(i).getPhysicalNumberOfCells() - 1 ; j++)
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