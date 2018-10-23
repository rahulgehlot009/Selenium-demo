package seleniumnaveen;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Handler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowpopuphandler {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://www.popuptest.com/");
	driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/font[8]/b/a")).click();
	Thread.sleep(3000);
	
	//to handle window popup
	Set<String> handler=driver.getWindowHandles();
	Iterator<String> it=handler.iterator();
	
	String PID =it.next();
	System.out.println("parent window id:"+PID);
	
	String CID=it.next();
	System.out.println("child window id:"+CID);
	
	driver.switchTo().window(CID);
	Thread.sleep(3000);
	System.out.println("cild window pop up title"+driver.getTitle());
	driver.close();
	
	driver.switchTo().window(PID);
	Thread.sleep(3000);
	System.out.println("parent window id title"+driver.getTitle());
	
	
}
}
