package com.test.MavenTestNg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.naming.directory.SearchResult;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Register extends BaseClass {

	
	WebElement username,pass,button,
	            regstrpage,Addbtn,
	            Name1,Lname,Email,Number,Save,
	            Logoutbtn,Logout;
	
	@BeforeSuite
	public void setup1() throws IOException {
		setup();
		//driver.get(prop.getProperty("siteURL"));
	}
	
	@BeforeMethod
	public void xpath() {
		
		
		username=driver.findElement(By.xpath(prop.getProperty("usernameXpath")));
		pass=driver.findElement(By.xpath(prop.getProperty("passXpath")));
		button=driver.findElement(By.xpath(prop.getProperty("buttonXpath")));
	}
	@Test
	public void getin() throws InterruptedException {
		username.sendKeys("Admin");
		pass.sendKeys("admin123");
		Thread.sleep(500);
		button.click();

		
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		 
		regstrpage=driver.findElement(By.linkText("Recruitment"));
		regstrpage.click();
		
		Addbtn=driver.findElement(By.xpath("//input[@name='btnAdd']"));
		Addbtn.click();
		
	 Name1=driver.findElement(By.xpath("//input[@name='addCandidate[firstName]']"));
	 Lname=driver.findElement(By.xpath("//input[@name='addCandidate[lastName]']")); 
	 Email=driver.findElement(By.xpath("//input[@name='addCandidate[email]']"));
	 Number=driver.findElement(By.xpath("//input[@name='addCandidate[contactNo]']")); 
	 Save=driver.findElement(By.xpath("//input[@id='btnSave']"));
	 
	 
		
////////////
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Name1.sendKeys("Tejas");
	Lname.sendKeys("M");
	Number.sendKeys("1234567898");
	Email.sendKeys("Tejas123@gmail.com");
	Save.click();
		
	}
	
	
	  @AfterTest 
	  public void logout() throws InterruptedException {
		  
		  
		  Logoutbtn=driver.findElement(By.xpath("//a[@class='panelTrigger']"));
		  Logoutbtn.click();
		  Logout=driver.findElement(By.partialLinkText("Logout")); 		  
		 Logout.click();
		  
		  }
	 
	
	@AfterSuite
	public void close() {
		driver.close();
	}
}