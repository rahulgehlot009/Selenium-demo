package seleniumnaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class olxfileupload {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://my.monsterindia.com/create_account.html?spl=G_Adgroup_Single%20Word%20Keyword%20Exact&WT.mc_n=olm_sk_srch_Google_Resume_Goo_Search_India_Brand_AllBrand&gclid=Cj0KCQjwquTbBRCSARIsADzW88z8dszA2Vf3Oy7RrqOTuF45ak_TCffyFhL_1qqP17jndEKm9uPjFt0aAkCuEALw_wcB");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@id='wordresume']")).sendKeys("C:\\Users\\Rahul\\Desktop\\f.jpg");
}
}
