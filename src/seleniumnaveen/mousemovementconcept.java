package seleniumnaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousemovementconcept {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.spicejet.com");
	//for mouse movement
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Add-Ons')]"))).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'SpiceMax')]")).click();
}
}
