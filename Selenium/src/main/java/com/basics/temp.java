package com.basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class temp {
public static void main(String[] args) throws IOException {
	File src=new File("D:\\Testdata\\data.xlsx");
	FileInputStream fis=new FileInputStream(src);
	XSSFWorkbook book =new XSSFWorkbook(fis);//to read .xlsx files
	XSSFSheet sheet=book.getSheet( "Sheet3");
	
//	System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
//	System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
	 int totalrows=sheet.getLastRowNum();
	 System.out.println(totalrows); 
	 Row rowcells=sheet.getRow(0);
	 int totalcols=rowcells.getLastCellNum();
	 System.out.println(totalcols);
}
}
