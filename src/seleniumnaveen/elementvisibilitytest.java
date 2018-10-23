package seleniumnaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementvisibilitytest {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.freecrm.com/register/");
	
	//isDisplayed() method: Applicable for all the elements
	boolean b1=driver.findElement(By.name("submitButton")).isDisplayed();
	System.out.println(b1);
	
	//isEnabled() method
	boolean b2=driver.findElement(By.name("submitButton")).isEnabled();
	System.out.println(b2);
	
	//select I agree checkbox
	driver.findElement(By.name("agreeTerms")).click();
	boolean b3=driver.findElement(By.name("submitButton")).isEnabled();
	System.out.println(b3);
	
	//isSelected() method: only applicable for check box,drop down,radio button
	
	boolean b4=driver.findElement(By.name("agreeTerms")).isSelected();
	System.out.println(b4);
	
	//deselect the check box
	
	driver.findElement(By.name("agreeTerms")).click();
	boolean b5=driver.findElement(By.name("agreeTerms")).isSelected();
	System.out.println(b5);
	
	
	
}
}
