package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class googletestassert {
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
@Test()
public void googletitletest(){
	String title=driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "goggle123","title is not matched");
}
@AfterMethod
public void teardown(){
	driver.quit();
}

}
