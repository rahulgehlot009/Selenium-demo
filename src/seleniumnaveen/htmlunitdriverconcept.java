package seleniumnaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class htmlunitdriverconcept {
public static void main(String[] args) {
	//WebDriver driver=new ChromeDriver();
	WebDriver driver=new HtmlUnitDriver();
	driver.get("http://www.freecrm.com");
	System.out.println("page title before launch"+driver.getTitle());
	driver.findElement(By.name("username")).sendKeys("rahul009");
	driver.findElement(By.name("password")).sendKeys("rahul009");
	
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	System.out.println("page title after launch"+driver.getTitle());
}
}
