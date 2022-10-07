package com.basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exelhandling {
public static void main(String[] args) throws IOException {
	//workbook-org.apache.poi.ss.usermodel
	/*
	 * HSSFWORKBOOK--.xls
	 * XSSFWORKBOOK--.xlsx
	 */
	Exelhandling e=new Exelhandling();
	e.getdata("Sheet1");
}

public String[][] getdata(String sheetname) throws IOException {
	File src=new File("D:\\Testdata\\data.xlsx");
	FileInputStream fis=new FileInputStream(src);
	XSSFWorkbook book =new XSSFWorkbook(fis);//to read .xlsx files
	XSSFSheet sheet=book.getSheet( sheetname);
	
//	System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
//	System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
	 int totalrows=sheet.getLastRowNum();
	 System.out.println(totalrows); 
//	 Row rowcells=sheet.getRow(0);
//	 int totalcols=rowcells.getLastCellNum();
//	 System.out.println(totalcols);
//	 
//	 DataFormatter format =new DataFormatter();//to display the content as exactly in excel sheet
//	 
//	 String  testdata[][]=new String[totalrows][totalcols+1];
//	 
//	 for(int i=1;i<=totalrows;i++) {
//		 for(int j=0;j<=totalcols;j++) {
//			 testdata[i-1 ][j]=format.formatCellValue(sheet.getRow(i).getCell(j));
//			 System.out.print(testdata[i-1][j]+" ");
//		 }
//		 System.out.println();
//	 }
	return testdata;
//}

}}
