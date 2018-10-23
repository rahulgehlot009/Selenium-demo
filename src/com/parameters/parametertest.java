package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametertest {
WebDriver driver;
@Test
@Parameters({"url","emailid"})
public void yahoologintest(String url,String emailid){
	System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\Rahul\\Desktop\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();
driver.get(url);
driver.findElement(By.xpath("//*[@id='login-username']")).clear();
driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys("rahulgehlot");
}

}
