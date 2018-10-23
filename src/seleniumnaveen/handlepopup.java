package seleniumnaveen;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlepopup {
public static void main(String[] args) throws InterruptedException {
	//System.setProperty(key, value)
WebDriver driver = new ChromeDriver();
driver.get("http://www.facebook.com");
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id='u_0_j']")).sendKeys("copper");
driver.findElement(By.xpath("//*[@id='u_0_l']")).sendKeys("kettle");
driver.findElement(By.xpath("//*[@id='u_0_o']")).sendKeys("7348847128");
driver.findElement(By.xpath("//*[@id='u_0_v']")).sendKeys("rahul@123");
Select select=new Select(driver.findElement(By.xpath("//*[@id='day']")));
select.selectByValue("25");
Select select1=new Select(driver.findElement(By.name("birthday_month")));
select1.selectByVisibleText("Nov");
Select select2=new Select(driver.findElement(By.xpath("//*[@id='year']")));
select2.selectByValue("1947");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@type='radio'][contains(@value,'2')]")).click();;
//radio.click();
driver.findElement(By.xpath("//*[@id='u_0_11']")).click();

Thread.sleep(5000);
//Alert alert =driver.switchTo().alert();
//System.out.println(alert.getText());
//alert.dismiss();

//Alert alert=driver.switchTo().alert();
//System.out.println(alert.getText());
//String text=alert.getText()
//alert.accept();//to click on OK button
//alert.dismiss();//to click on CANCEL button
}
}
