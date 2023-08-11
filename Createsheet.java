package org.tes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Createsheet extends Baseclass {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\eclipse\\eclipse-workspace\\MavenTest\\Excel\\Book10.xlsx");
		
		Workbook b = new XSSFWorkbook();
		
		Sheet cs = b.createSheet("Values");
		
		Row cr = cs.createRow(0);
		
		
		
	
			Cell cc = cr.createCell(0);
			
			
				cc.setCellValue("Selenium");
				
				Cell c1 = cr.createCell(1);
				c1.setCellValue("Java");
				Cell c2 = cr.createCell(2);
				c2.setCellValue("DataDriven");
				Cell c3 = cr.createCell(3);
				c3.setCellValue("POM");
				
			Row row2 = cs.createRow(1)	;
			
			Cell cell1 = row2.createCell(0);
			cell1.setCellValue("Appium");
			
			Cell cell2 = row2.createCell(1);
			cell2.setCellValue("Cucumber");
			Cell cell3 = row2.createCell(2);
			cell3.setCellValue("Junit");
			Cell cell4 = row2.createCell(3);
			cell4.setCellValue("TestNG");
			
			
			
		
		
	
		
		FileOutputStream m = new FileOutputStream(f);
		b.write(m);
		
	}

}
