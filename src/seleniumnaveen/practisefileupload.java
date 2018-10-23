package seleniumnaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class practisefileupload {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions chrome=new ChromeOptions();
	chrome.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(chrome);
	driver.get("https://www.facebook.com");
	//driver.findElement(By.xpath("//input[@name='proceed']")).click();
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("93jaindivya@gmail.com");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("rahul009");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value='Log In']")).click();
	//Thread.sleep(5000);
	//Actions action = new Actions(driver);
	//action.sendKeys(Keys.ESCAPE).build().perform();
	//Thread.sleep(5000);
	//Alert alert=driver.switchTo().alert();
	//System.out.println(alert.getText());
	//String text=alert.getText();
	/*if(text.equals("Please enter a valid user name")){
		System.out.println("correct");
		
	}
	else{
		System.out.println("incorrect alert message");
		
	}
	Thread.sleep(5000);
	alert.accept();
	//alert.dismiss();*/
}
}
