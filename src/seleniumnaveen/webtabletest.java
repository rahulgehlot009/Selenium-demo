package seleniumnaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtabletest {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.freecrm.com/index.html");
	driver.findElement(By.name("username")).sendKeys("rahul009");
	driver.findElement(By.name("password")).sendKeys("rahul009");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[contains(@value,'Login')]")).click();
	driver.switchTo().frame("mainpanel");
	driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[4]/a")).click();
	
	
	//*[@id="vContactsForm"]/table/tbody/tr[4]/td[2]
	//*[@id="vContactsForm"]/table/tbody/tr[5]/td[2]
	//*[@id="vContactsForm"]/table/tbody/tr[6]/td[2]
	//*[@id="vContactsForm"]/table/tbody/tr[7]/td[2]
	
	
	//method-1
	String before_xpath="//*[@id='vContactsForm']/table/tbody/tr[";
	String after_xpath="]/td[2]";
	
	for(int i=4;i<=7;i++){
		String name=driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
		System.out.println(name);
		if(name.contains("rrr yuy")){
			////*[@id='vContactsForm']/table/tbody/tr[6]/td[1]/input
			driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr[6]/td[1]/input")).click();
			
		}
		
	}
	
	
	
}
}
