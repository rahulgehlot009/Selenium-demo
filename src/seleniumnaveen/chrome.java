package seleniumnaveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {
public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.facebook.com");
driver.getTitle();
System.out.println(driver.getTitle());
if(driver.getTitle().equals("Facebook – log in or sign up"))
{
	System.out.println("correct");
}
else
	{
		System.out.println("incorrect");
	}

}
}

