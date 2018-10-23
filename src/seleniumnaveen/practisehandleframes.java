package seleniumnaveen;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practisehandleframes {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("http://www.freecrm.com");
	driver.findElement(By.name("username")).sendKeys("rahul009");
	driver.findElement(By.name("password")).sendKeys("rahul009");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	Thread.sleep(5000);
	
	//to get the frames name
	List<WebElement> frame=driver.findElements(By.xpath("//frame"));
	for(int i=0;i<frame.size();i++){
		String str=frame.get(i).getAttribute("name");
		System.out.println(str);
	}
	driver.switchTo().frame("mainpanel");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[text()='Tasks']")).click();
	
}
}
