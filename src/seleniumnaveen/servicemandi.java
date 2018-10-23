package seleniumnaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class servicemandi {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.servicemandi.com/#third");
	
	driver.findElement(By.xpath("//a[text()='Terms & Conditions']")).click();
}
}
