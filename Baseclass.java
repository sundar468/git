package org.tes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;
	
	public static void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	public static void max() {
		driver.manage().window().maximize();

	}

	public static void get(String url) {
		driver.get(url);
	}
	
	public static void passkey(WebElement j,String txt ) {
		j.sendKeys(txt);

	}
	public static void close() {
		driver.close();

	}
	
	public static void Checkdata(String url,int rownum,int cellnum) throws IOException {
		File f = new File(url);
		FileInputStream k = new FileInputStream(f);
		Workbook j = new XSSFWorkbook(k);
		Sheet mysheet = j.getSheet(url);
		Row cr = mysheet.getRow(rownum);
		Cell mc = cr.getCell(cellnum);
		int cellType = mc.getCellType();
		String value="";
		if (cellType==1) {
			String str = mc.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(mc)) {
			Date date = mc.getDateCellValue();
			SimpleDateFormat m = new SimpleDateFormat(value);
			String format = m.format(date);
			
		}
		else {
			double numeric = mc.getNumericCellValue();
			long y =(long)numeric;
		}

	}
	
	public static void CreateExcelFile(int rownum,int cellnum,String NewData) throws IOException {
		File f = new File("D:\\eclipse\\eclipse-workspace\\MavenTest\\Excel\\Workbook5.xlsx");
		Workbook j = new XSSFWorkbook();
		Sheet cs = j.createSheet("datas");
		Row cr = cs.createRow(rownum);
		Cell mc = cr.createCell(cellnum);
		mc.setCellValue(NewData);
		FileOutputStream m = new FileOutputStream(f);
		j.write(m);
		

	}
	
	public static void CrCell(int rownum,int cellnum,String NewData) throws IOException {
		File f = new File("D:\\eclipse\\eclipse-workspace\\MavenTest\\Excel\\Workbook5.xlsx");
		FileInputStream g = new FileInputStream(f);
		Workbook j = new XSSFWorkbook(g);
		Sheet gs = j.getSheet("datas");
		Row cr = gs.getRow(rownum);
		Cell cc = cr.createCell(cellnum);
		cc.setCellValue(NewData);
		FileOutputStream m = new FileOutputStream(f);
		j.write(m);
	}
	
	public static void CrRow(int rownum,int cellnum,String NewData) throws IOException {
		File f = new File("D:\\eclipse\\eclipse-workspace\\MavenTest\\Excel\\Workbook5.xlsx");
		FileInputStream g = new FileInputStream(f);
		Workbook j = new XSSFWorkbook(g);
		Sheet gs = j.getSheet("datas");
		Row cr = gs.createRow(rownum);
		Cell cc = cr.createCell(cellnum);
		cc.setCellValue(NewData);
		FileOutputStream s = new FileOutputStream(f);
		j.write(s);
		

	}
	
	public static void Crsheet(String sheetname,int rownum, int colnum,String cellvalue) throws IOException {
		File f = new File("D:\\eclipse\\eclipse-workspace\\MavenTest\\Excel\\sheetname.xlsx");
		Workbook m = new XSSFWorkbook();
		Sheet createSheet = m.createSheet(sheetname);
		Row cr = createSheet.createRow(rownum);
		Cell createCell = cr.createCell(colnum);
		createCell.setCellValue(cellvalue);
		FileOutputStream n = new FileOutputStream(f);
		m.write(n);

	}
	
	public static void Updateparticularcell(int rownum, int colnum,String newvalue,String existingdata) throws IOException {
		File f = new File("D:\\eclipse\\eclipse-workspace\\MavenTest\\Excel\\sheetname.xlsx");
		FileInputStream k = new FileInputStream(f);
		Workbook j = new XSSFWorkbook(k);
		Sheet sheet = j.getSheet("mine");
		Row r = sheet.getRow(rownum);
		Cell c = r.getCell(colnum);
		String str = c.getStringCellValue();
		if (str.equals(existingdata)) {
			c.setCellValue(newvalue);
		}
		FileOutputStream l = new FileOutputStream(f);
		j.write(l);
	}
	

	
}
