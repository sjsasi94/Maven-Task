package org.excelpractise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException {
		File loc =new File("C:\\Users\\Sasi\\eclipse-workspace\\MavenTask\\src\\test\\resources\\facebook.xlsx");
		FileInputStream st = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(st);
		Sheet sheet = w.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(2);
		System.out.println(cell);
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row1 = sheet.getRow(i);
			for (int j = 0; j < row1.getPhysicalNumberOfCells(); j++) {
				Cell cell2 = row1.getCell(j);
				System.out.print(cell2+"\t");
			}
			System.out.println();
			
		}
	}

}
