package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class googletest {
WebDriver driver; 
@BeforeMethod
public void setup(){
	System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\Rahul\\Desktop\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.get("http://www.google.com");
}
@Test(priority=1,groups="title")
public void googletitletest(){
	String title=driver.getTitle();
	System.out.println(title);
}
	
@Test(priority=3,groups="logo")
public void googlelogotest(){
	boolean b=driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
}
@Test(priority=2,groups="gmail")
public void maillinktest(){
	boolean b=driver.findElement(By.linkText("mail")).isDisplayed();
	
}
@AfterMethod
public void teardown(){
	driver.quit();
}
}
