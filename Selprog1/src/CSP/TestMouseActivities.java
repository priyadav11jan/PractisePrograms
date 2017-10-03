package CSP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestMouseActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priyadav\\Downloads\\chromedriver_win32\\chromedriver.exe"); //setting path to the driver
	     
		WebDriver driver = new ChromeDriver();  //launching Chrome
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://google.com");
		
		Actions act=new Actions(driver);
		
		// act.contextClick(driver.findElement(By.linkText("Gmail"))).perform();
		
		act.doubleClick(driver.findElement(By.linkText("Gmail"))).perform();
		
		
		
		

	}

}
