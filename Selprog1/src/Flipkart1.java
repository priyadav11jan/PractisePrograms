import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class Flipkart1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priyadav\\Downloads\\chromedriver_win32\\chromedriver.exe"); //setting path to the driver
	     
		WebDriver driver =new ChromeDriver();//launching chrome
      
		
	  //Browser specific actions	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/search?q=mobiles%20in%20electronics&otracker=start&as-show=on&as=off");

		WebElement wellcare= driver.findElement(By.xpath("//label[div[contains(text(),'Wellcare')]]/div[@class='_1p7h2j']"));
		wellcare.click();
		  
		
		/*dep_-  div[@class='_1p7h2j']
		ind-//label[div[contains(text(),'Wellcare')]]/div[@class='_1p7h2j']*/
		
		//Thread.sleep(10000);
		
		
		WebDriverWait wait= new WebDriverWait(driver,3000);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[div[contains(text(),'Snapdilla')]]/div[@class='_1p7h2j']")));
		
		WebElement snapdilla= driver.findElement(By.xpath("//label[div[contains(text(),'Snapdilla')]]/div[@class='_1p7h2j']"));
		 System.out.println(snapdilla.getText());
		snapdilla.click();
	}

}
