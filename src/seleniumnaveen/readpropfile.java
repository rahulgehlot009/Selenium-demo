package seleniumnaveen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readpropfile {
	static WebDriver driver;
public static void main(String[] args) throws IOException {
	Properties prop=new Properties();
	FileInputStream ip=new FileInputStream("D:\\eclipse\\eclipsedata\\seleniumnaveen\\src\\seleniumnaveen\\config.properties");
	prop.load(ip);
	
	System.out.println(prop.getProperty("name"));
	System.out.println(prop.getProperty("age"));
	
	String url=prop.getProperty("url");
	System.out.println(url);
	String browsername=prop.getProperty("browser");
	System.out.println(browsername);//chrome
	
	if(browsername.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rahul\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	else if(browsername.equals("FF")){
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		driver=new ChromeDriver();
	

}
	else if(browsername.equals("FF")){
		System.setProperty("webdriver.ie.driver", "D:\\internetexplorerdriver.exe");
		driver=new ChromeDriver();	
	}
driver.get(url);
driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstname"));
driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastname"));
driver.findElement(By.xpath(prop.getProperty("mobile_email_xpath"))).sendKeys("city");
}
}
	
	
	
	
	
	
	
