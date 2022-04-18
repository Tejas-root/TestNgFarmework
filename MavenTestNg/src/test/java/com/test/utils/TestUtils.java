package com.test.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.DataProvider;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class TestUtils {
	
	public Properties readPropdata() throws IOException {
		FileInputStream fs= new FileInputStream("src\\test\\resources\\config.properties");
		Properties prop=new Properties();
	
		prop.load(fs);
		return prop;
		}
	
@DataProvider(name="logindata")	
	
	public Object [][] readExcelFile() throws BiffException, IOException{
		FileInputStream fs=new FileInputStream("src\\test\\resources\\ReadData.xls");
		Workbook wb=Workbook.getWorkbook(fs);
		
		Sheet sh=wb.getSheet("Sheet1");
		int Rows=sh.getRows();
		int Columns=sh.getColumns();
		
		String data[][]=new String [Rows-1][Columns];
		int count=0;
		
		
		for(int i=1;i<Rows;i++) {
			for(int j=0;j<Columns;j++) {
				Cell cell=sh.getCell(j,i);
				
				data[count][j]=cell.getContents();
			}
			count++;
}
		fs.close();
		return data;
	}
	
}
