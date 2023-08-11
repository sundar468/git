package org.tes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\eclipse\\eclipse-workspace\\MavenTest\\Excel\\Book2.xlsx");
		
		FileInputStream k = new FileInputStream(f);
		
		Workbook m = new XSSFWorkbook(k);
		
		Sheet mysheet = m.getSheet("Sheet1");
		
		for (int i = 0; i < mysheet.getPhysicalNumberOfRows(); i++) {
			Row p = mysheet.getRow(i);
			
			
			for (int j = 0; j < p.getPhysicalNumberOfCells(); j++) {
				Cell cell = p.getCell(j);
				int cellType = cell.getCellType();
				
				if (cellType==1) {
					String str = cell.getStringCellValue();
					System.out.println(str);
				}
				else if (DateUtil.isCellDateFormatted(cell)) {
					Date date = cell.getDateCellValue();
					SimpleDateFormat l = new SimpleDateFormat("dd-MM-YYYY");
					 String format = l.format(date);
					System.out.println(format);
				}
				else {
					double nume = cell.getNumericCellValue();
					long l =(long) nume;
					System.out.println(l);
					
				}
			}
		}
		
		
		
	}

}
