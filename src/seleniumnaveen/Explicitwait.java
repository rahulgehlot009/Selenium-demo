package seleniumnaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");
	
	//explicit wait
	WebElement element=driver.findElement(By.xpath("//a[contains(text(),'Forgotten account?')]"));
	//driver.navigate().refresh();
	element.click();
	clickOn(driver,driver.findElement(By.xpath("//*[@id='u_0_2']")),20);

}

public static void clickOn(WebDriver driver,WebElement locator,int timeout){
	new WebDriverWait(driver, 20).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
	
	locator.click();
	
}
}