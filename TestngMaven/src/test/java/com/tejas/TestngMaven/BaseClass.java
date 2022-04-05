package com.tejas.TestngMaven;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import com.tejas.util.Testutil;

public class BaseClass {
   WebDriver driver;
	Testutil test=new Testutil();
	Properties prop;
	WebElement email,pass,button;
	
	@BeforeSuite
	public void setup() throws IOException {
		prop=test.readpropData();
		System.setProperty(prop.getProperty("webDriverKey"),prop.getProperty("webDriverValue"));
		driver=new ChromeDriver();
		
		driver.get(prop.getProperty("siteURL"));
		}
	
}