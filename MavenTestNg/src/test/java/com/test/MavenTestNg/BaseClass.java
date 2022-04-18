package com.test.MavenTestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.asserts.SoftAssert;

import com.test.utils.TestUtils;

public class BaseClass extends TestUtils {
 TestUtils util=new TestUtils();
 Properties prop;
 SoftAssert asrt=new SoftAssert();
 
public  WebDriver driver;
 
 
	@BeforeSuite
	public void setup() throws IOException {
		prop=util.readPropdata();
		System.setProperty(prop.getProperty("webDriverKey"),prop.getProperty("webDriverValue"));
		driver=new ChromeDriver();
		driver.get(prop.getProperty("siteURL"));
	
	}	
		
	
	
	
	
}
