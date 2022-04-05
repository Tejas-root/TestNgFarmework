package com.tejas.TestngMaven;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class Login extends BaseClass {

	
	@BeforeMethod
	public void getxpath() {
		email=driver.findElement(By.xpath((prop.getProperty("emailXpath"))));
		pass=driver.findElement(By.xpath(prop.getProperty("passXpath")));
		button=driver.findElement(By.xpath(prop.getProperty("buttonXpath")));
	}
	
	@org.testng.annotations.Test
	public void login() {
		email.sendKeys("queuecods@gmail.com");
		pass.sendKeys("123456");
		button.click();
		
	}
	
	@AfterSuite
	public void teardown() {
		driver.close();
	}
}
