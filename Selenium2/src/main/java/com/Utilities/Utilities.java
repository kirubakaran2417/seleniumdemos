package com.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utilities {
public static String propertyFileHandling(String key) {
	try {
	FileInputStream fis=new FileInputStream("D:\\Workspaces\\TechForum3\\Selenium\\Resources\\Configuration.properties");
	Properties p=new Properties();
    p.load(fis);
    return p.getProperty(key);
}catch(IOException e) {
	System.out.println(e.getMessage());
}
	return key;}

public static String[] readexceldata(int sheetNumber) throws IOException{
	File src=new File("D:\\Testdata\\Testdata.xlsx");
	FileInputStream fis=new FileInputStream(src);
	XSSFWorkbook book =new XSSFWorkbook(fis);//to read .xlsx files
	XSSFSheet sheet=book.getSheetAt(sheetNumber);
	 int totalrows=sheet.getLastRowNum();
	 System.out.println(totalrows); 
	 Row rowcells=sheet.getRow(0);
	 int totalcols=rowcells.getLastCellNum();
	 System.out.println(totalcols);
	 DataFormatter format =new DataFormatter();//to display the content as exactly in excel sheet
	 String  testdata[]=new String[totalrows+1];
	 for(int i=0;i<=totalrows;i++) {
		 testdata[i]=format.formatCellValue(sheet.getRow(i).getCell(0));
	 }
	return testdata;
		 
}

	


}



