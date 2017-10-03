import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popupAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\priyadav\\Downloads\\chromedriver_win32\\chromedriver.exe"); //setting path to the driver
	     WebDriver driver= new ChromeDriver();
	     
	     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     
	     
	     
	     driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
	     
	     driver.findElement(By.id("alert")).click();
	     
	     Alert alt =driver.switchTo().alert();
	     alt.dismiss();
	     
	     

	}

}
