import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priyadav\\Downloads\\chromedriver_win32\\chromedriver.exe"); //setting path to the driver
	     WebDriver driver= new ChromeDriver();
	     
	     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     
	     
	     
	     driver.get("http://www.tinyupload.com/");
	     
	   
	     
	    //WebDriverWait wait = new WebDriverWait(driver,30);
	     //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'dz-message needsclick'))]")));
	     
	     
	     driver.findElement(By.xpath("//input[contains(@type,'file')]")).click();
	     
	     Runtime.getRuntime().exec("C:\\Users\\priyadav\\Documents\\upload.exe");
		    
	    
	  
	     
	     
	     

	}

}
