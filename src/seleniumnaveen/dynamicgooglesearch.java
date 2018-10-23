package seleniumnaveen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicgooglesearch {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("lst-ib")).sendKeys("java");//for search field
	
	List<WebElement> list = driver.findElements(By.xpath("//ul[@class='sbsb_b']/li//descendant::div[@class='sbqs_c']/b"));
	//ul[@class='sbsb_b']//li/descendant::div[@class='sbqs_c']/b
	//ul[@class='sbsb_b']/li//descendant::div[@class='sbqs_c']/b
     //System.out.println(list.size());
System.out.println()
	
	//**PENDING
	
	
}
}
