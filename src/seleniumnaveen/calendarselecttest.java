package seleniumnaveen;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class calendarselecttest {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.freecrm.com/index.html");
	
	driver.findElement(By.name("username")).sendKeys("rahul009");
	driver.findElement(By.name("password")).sendKeys("rahul009");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	driver.switchTo().frame("mainpanel");
	
	String date="33-August-2018";
	String datearr[]=date.split("-");
	String day=datearr[0];
	String month=datearr[1];
	String year=datearr[2];
	
	Select select=new Select(driver.findElement(By.name("slctMonth")));
	select.selectByVisibleText(month);
	Select select1=new Select(driver.findElement(By.name("slctYear")));
	select1.selectByVisibleText(year);
	
	//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
	//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]
	//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[4]
	
	String before_xpath="//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
	String after_xpath="]/td[";
	
	final int totalweekdays=7;
	boolean flag=false;
	String dayval=null;
	
	for(int i=2;i<=7;i++){
		for(int j=1;j<=7;j++){
			try{
				dayval=driver.findElement(By.xpath(before_xpath+i+after_xpath+j+"]")).getText();
			}
			
		catch(NoSuchElementException e){
		System.out.println("please enter a valid date");
		flag=false;
		break;
		
		}
		System.out.println(dayval);	
		if(dayval.equals(day)){
			driver.findElement(By.xpath(before_xpath+i+after_xpath+j+"]")).click();
			flag=true;
			break;
			
			
			}
		}
			if(flag){break;
	}
	 
	}
	
	
	
	
	
}
}
