package com.Data.driven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_driven {
	
	public static void main(String[] args) throws Throwable {
		File f = new File("C:\\Users\\ajayk\\eclipse-workspace\\adactin\\credential.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook b = new XSSFWorkbook(fis);
		Sheet sheetAt = b.getSheetAt(0);
		int rowsize = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < rowsize; i++) {
			Row row = sheetAt.getRow(i);
			
			int cellsize = row.getPhysicalNumberOfCells();
			for (int j = 0; j < cellsize; j++) {
				Cell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();
				if (cellType.equals(cellType.STRING)) {
					String value = cell.getStringCellValue();
					System.out.println(value);
					
				}
				else if (cellType.equals(cellType.NUMERIC)) {
					double cellValue = cell.getNumericCellValue();
					System.out.println(cellValue);
					
				}
				
			}
			
		}
		
	}

}
