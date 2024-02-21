package com.test2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Exceldata3 {

	public static void main(String[] args) throws Exception {

		String path="C:\\Users\\91976\\eclipse-workspace\\Automation3\\TestData\\data2.xlsx";
		//create object of FileInputStream class 
		FileInputStream fis=new FileInputStream(path);
		
		
		//XSSFWorkbook create object
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		String data1=wb.getSheet("sheet2").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data1);
		
		double data2=wb.getSheet("sheet2").getRow(0).getCell(1).getNumericCellValue();
		String data=String.valueOf(data2);
		System.out.println(data);
		
		String change=data.replace(".0", "");
		System.out.println(change);
		
	}

}
