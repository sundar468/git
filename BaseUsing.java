package org.tes;



import java.io.IOException;

public class BaseUsing extends Baseclass  {
	
	public static void main(String[] args) throws IOException {
		
		CreateExcelFile(0, 0, "Selenium");
		CrCell(0, 1, "Java");
		CrCell(0, 2, "DataDriven");
		CrCell(0, 3, "POM");
		
		CrRow(1, 0, "Appium");
		CrCell(1, 1, "Cucumber");
		CrCell(1, 2, "Junit");
		CrCell(1, 3, "TestNG");
		
		Crsheet("sheetnew", 0, 0, "Sheet123");
		
		
	}

}
