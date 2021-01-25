package org.excelpractise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void main(String[] args) throws IOException {
		File loc =new File("C:\\Users\\Sasi\\eclipse-workspace\\MavenTask\\src\\test\\resources\\newfb.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet sheet = w.createSheet("Sheet1");
		Row row = sheet.createRow(1);
		Cell cell = row.createCell(2);
		cell.setCellValue("sasi");
		System.out.println(cell);
		
		FileOutputStream o = new FileOutputStream(loc) ;	
		w.write(o);
		System.out.println("done");
		}
	}

