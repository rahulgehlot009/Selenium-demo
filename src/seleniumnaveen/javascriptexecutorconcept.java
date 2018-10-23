package seleniumnaveen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class javascriptexecutorconcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rahul009");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("rahul009");
		
		
		
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@value='Login']")).click();
		//Thread.sleep(5000);
		//Execute Script:to execute java script
		
		WebElement loginbtn = driver.findElement(By.xpath("//input[contains(@value,'Login')]"));
		flash(loginbtn,driver);

	}
	public static void flash(WebElement element,WebDriver driver){
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String bgcolor=element.getCssValue("background color");
		for(int i=0;i<1000;i++){
			changecolor("rgb(0,200,0)",element,driver);
			changecolor(bgcolor,element,driver);
			
		}
		
	}

public static void changecolor(String color,WebElement element,WebDriver driver){
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("arguments[0].style.backgroundcolor = '"+color+"'", element);
	
	try{
		Thread.sleep(1000);
	}
	catch(InterruptedException e){
		}
	
}
}