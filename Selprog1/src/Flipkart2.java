import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priyadav\\Downloads\\chromedriver_win32\\chromedriver.exe"); //setting path to the driver
	     WebDriver driver= new ChromeDriver();
	     
	     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.flipkart.com");
	     driver.findElement(By.xpath("//a[@title='Electronics']")).click();
	     
	     WebDriverWait wait= new WebDriverWait(driver,30);
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Lenovo']")));
	     driver.findElement(By.xpath("//a[@title='Lenovo']")).click();

	}

}
