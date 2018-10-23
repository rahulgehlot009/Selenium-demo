package seleniumnaveen;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class practiefileupload {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(option);
	driver.get("http://www.facebook.com");
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("93jaindivya@gmail.com");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("rahul009");
	//Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value='Log In']")).click();
	Thread.sleep(2000);
	WebElement element=driver.findElement(By.xpath("//*[@id='js_y']"));
	element.click();
	element.sendKeys("C:\\Users\\Rahul\\Desktop\\f.jpg");
}
}
