package seleniumnaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtabletest1 {
public static void main(String[] args) throws InterruptedException {
	//a[contains(text(),'rrr yuy ')]/parent::td//input[@name='contact_id']"))
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.freecrm.com/index.html");
	driver.findElement(By.name("username")).sendKeys("rahul009");
	driver.findElement(By.name("password")).sendKeys("rahul009");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[contains(@value,'Login')]")).click();
	driver.switchTo().frame("mainpanel");
	driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[4]/a")).click();
	
	driver.findElement(By.xpath("//a[contains(text(),'rrr yuy')]//parent::td[@class='datalistrow']//preceding-sibling::td//input[@name='contact_id']")).click();
	////a[contains(text(),'rrr yuy')]//parent::td[@class='datalistrow']//preceding-sibling::td
}
}
