package org.tes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Updatesheet {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\eclipse\\eclipse-workspace\\MavenTest\\Excel\\Subjects.xlsx");
		FileInputStream o = new FileInputStream(f);
		Workbook k = new XSSFWorkbook(o);
		Sheet sheet = k.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String str = cell.getStringCellValue();
		if (str.equals("Science")) {
			cell.setCellValue("Apple");
		}
		
		FileOutputStream r = new FileOutputStream(f);
		k.write(r);
	}

}
