package seleniumnaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popuppractisealert {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.findElement(By.xpath("")).sendKeys("Rahul");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Gehlot");

}
}
