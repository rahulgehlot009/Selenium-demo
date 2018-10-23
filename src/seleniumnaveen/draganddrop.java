package seleniumnaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.navigate().to("http://jqueryui.com/droppable");
	
	driver.switchTo().frame(0);
	
	Actions action=new Actions(driver);
	action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']/p"))).moveToElement(driver.findElement(By.xpath("//*[@id='droppable']")))
	.release()
	.build().perform();
	
}
}
