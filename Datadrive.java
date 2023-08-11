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
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadrive {

	public static void main(String[] args) throws IOException {
		
		File m = new File("D:\\eclipse\\eclipse-workspace\\MavenTest\\Excel\\Subjects.xlsx");
		FileInputStream s = new FileInputStream(m);
		Workbook l = new XSSFWorkbook(s);
		Sheet sheet = l.getSheet("sheet1");
		for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j <row.getPhysicalNumberOfCells() ; j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				if (cellType==1) {
					String string = cell.getStringCellValue();
					System.out.println(string);
				
					
				}
				else if (DateUtil.isCellDateFormatted(cell)) {
					Date date = cell.getDateCellValue();
					SimpleDateFormat z = new SimpleDateFormat("dd-MM-yyyy");
					String format = z.format(date);
					System.out.println(format);
					
				}
				else {
					double num = cell.getNumericCellValue();
					long p = (long)num;
					System.out.println(p);
					
					
				}
				
				
				
			}
			
		}
		
	}
}
