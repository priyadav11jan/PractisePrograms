import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload1File {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priyadav\\Downloads\\chromedriver_win32\\chromedriver.exe"); //setting path to the driver
	     WebDriver driver= new ChromeDriver();
	     
	     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     
	     driver.get("file:///C:/Users/priyadav/Desktop/Fileupload.html");
	     driver.findElement(By.xpath("//input[@type='File']")).click();
	     
	     
	     
	     Runtime.getRuntime().exec("C:\\Users\\priyadav\\Documents\\upload.exe");
	}

}
