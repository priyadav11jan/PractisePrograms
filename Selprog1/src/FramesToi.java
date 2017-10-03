import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesToi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priyadav\\Downloads\\chromedriver_win32\\chromedriver.exe"); //setting path to the driver
	     
		WebDriver driver = new ChromeDriver();  //launching Chrome
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //wait for 30 seconds before timeout
        
        driver.get("https://www.zoho.com/");
        
       // Alert alt = driver.switchTo().alert();
        //alt.dismiss();
        //WebDriverWait wait = new WebDriverWait(driver,30);
        
        //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("indiatimes"));
        driver.switchTo().frame("zlsiframe");	
        //driver.findElement(By.xpath("//a[contains(text(),'Big Data')]")).click();

	}

}
