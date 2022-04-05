package com.tejas.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Testutil {

	public Properties readpropData() throws IOException {
		FileInputStream fs=new FileInputStream("src\\test\\resources\\config.properties");
		Properties prop=new Properties();
		prop.load(fs);
		return prop;
	}
	
	
	
}
