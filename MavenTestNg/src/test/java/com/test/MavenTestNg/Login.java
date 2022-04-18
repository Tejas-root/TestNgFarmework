
  package com.test.MavenTestNg;
  
  
  import org.openqa.selenium.By; import org.openqa.selenium.WebElement;  import org.testng.annotations.AfterSuite;
  import org.testng.annotations.AfterTest; import
  org.testng.annotations.BeforeMethod; import org.testng.annotations.Test;
  
  public class Login extends BaseClass{
  
  WebElement username,pass,button,Logoutbtn,Logout;
  
  
  @BeforeMethod public void getXpath() {
  username=driver.findElement(By.xpath(prop.getProperty("usernameXpath")));
  pass=driver.findElement(By.xpath(prop.getProperty("passXpath")));
  button=driver.findElement(By.xpath(prop.getProperty("buttonXpath")));
  
  }
  
  @Test(dataProvider = "logindata") public void login(String uname,String
  Pass1) { username.sendKeys(uname); pass.sendKeys(Pass1); button.click(); }
  
  @AfterTest public void logout() throws InterruptedException {
  
  
  String Expected="a"; String actual= driver.getTitle(); if(Expected!=actual) {
  System.out.println("after test");
  Logoutbtn=driver.findElement(By.xpath("//a[@class='panelTrigger']"));
  Logoutbtn.click(); Thread.sleep(2000);
  Logout=driver.findElement(By.linkText("Logout")); Logout.click(); } else {
  System.out.println("Error Occoured"); } }
  
  
  @AfterSuite public void teardown() { driver.close(); }
  
  
  
  
  }
 