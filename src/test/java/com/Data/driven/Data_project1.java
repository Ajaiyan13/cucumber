package com.Data.driven;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_project1 {

	public static void main(String[] args) throws Throwable {
		File f = new File("C:\\Users\\ajayk\\eclipse-workspace\\adactin\\credential.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook e = new XSSFWorkbook(fis);
		Sheet sheetAt = e.getSheetAt(0);
		int rowsize = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < rowsize; i++) {
			Row row = sheetAt.getRow(i);

			int numberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < numberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();

				if (cellType.equals(cellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.print(" " +  "  "   +    stringCellValue);
				
				} else if (cellType.equals(cellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					long data = (long) numericCellValue;
					System.out.println(" " + data);

				}

			}
		}

	}

}
