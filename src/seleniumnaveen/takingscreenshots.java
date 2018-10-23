package seleniumnaveen;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takingscreenshots {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.youtube.com");
	
	//take screenshot
	
TakesScreenshot tke=(TakesScreenshot)driver;
File src=tke.getScreenshotAs(OutputType.FILE);
FileHandler.copy(src,new File("C:\\Users\\Rahul\\Desktop\\naveen\\utube.jpg"));

//now copy the screenshot to the desired location using copy file
	
	//CopyFile(src,new File("C:\\Users\\Rahul\\Desktop\\naveen\\google.png"));

}
}
