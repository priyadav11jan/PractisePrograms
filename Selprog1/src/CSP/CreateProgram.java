package CSP;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateProgram {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priyadav\\Downloads\\chromedriver_win32\\chromedriver.exe"); //setting path to the driver
	     
		WebDriver driver = new ChromeDriver();  //launching Chrome
		driver.manage().window().maximize();
		
		
		
		driver.get("https://gso3--deltest3.cs23.my.salesforce.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
	
		driver.findElement(By.id("username")).sendKeys(GetData2.fromExcel("Test1","Sheet1",1, 0));
		
		//driver.findElement(By.id("password")).sendKeys("Test123!");
		
		driver.findElement(By.xpath("//input[starts-with(@id,'pas')]")).sendKeys(GetData2.fromExcel("Test1","sheet1", 1, 1),Keys.ENTER);
		
		Thread.sleep(5000);
		
		driver.get("https://gso3--deltest3.cs23.my.salesforce.com/a1G/e?&nooverride=1&retURL=/a1G/o");
		
		
		Select preferred_Time_of_Day_for_Contact= new Select(driver.findElement(By.xpath("//select[contains(text(),'Preferred Time of Day for Contact')]")));
		
		List<WebElement> options = preferred_Time_of_Day_for_Contact.getOptions();
		for(WebElement ele:options)
		{
			
			String option =ele.getText();
			
			System.out.println(option);
			
		}
		
		preferred_Time_of_Day_for_Contact.selectByValue("Morning");
		
		
		
	}
	
	
		
		
		
		
	}

