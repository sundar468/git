package org.tes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MavenTest {

	public static void main(String[] args) throws IOException {
		
		File m = new File("D:\\eclipse\\eclipse-workspace\\MavenTest\\Excel\\Book1.xlsx");
		
		FileInputStream k = new FileInputStream(m);
		
		Workbook b = new XSSFWorkbook(k);
		
		Sheet sh = b.getSheet("sheet1");
		
		
		
		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
			 Row row = sh.getRow(i);
			
			for (int j = 1; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(0);
				System.out.println(cell);
			}
			
		}
		
		
	}
}
