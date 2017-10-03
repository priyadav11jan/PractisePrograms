package CSP;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Picklist {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priyadav\\Downloads\\chromedriver_win32\\chromedriver.exe"); //setting path to the driver
	     
		WebDriver driver = new ChromeDriver();  //launching Chrome
		driver.manage().window().maximize();
		
		
		
		driver.get("https://gso3--deltest3.cs23.my.salesforce.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
	
		driver.findElement(By.id("username")).sendKeys(GetData2.fromExcel("Test1","Sheet1",1, 0));
		
		//driver.findElement(By.id("password")).sendKeys("Test123!");
		
		driver.findElement(By.xpath("//input[starts-with(@id,'pas')]")).sendKeys(GetData2.fromExcel("Test1","sheet1", 1, 1),Keys.ENTER);
		
		Thread.sleep(5000);
		
		driver.get("https://gso3--deltest3.cs23.my.salesforce.com/a1B/e?Name=Autopopulated&nooverride=1&retURL=%2Fa1B%2Fo");
		

		Select PrefContact=new Select(driver.findElement(By.id("00N60000002zkhT")));//Preferred Contact Type
		
		boolean status=PrefContact.isMultiple();
		System.out.println("Is Pref contact Multiselect? : "+status);
		
		
		
		
		
		List<WebElement> options=PrefContact.getOptions();
		for(int i=0;i<options.size();i++)
		{
			String pick=options.get(i).getText();
		    System.out.println(pick);  
		    
			if(pick.equalsIgnoreCase("Email"))
			{
				System.out.println("Email is present");
				break;
			}
		    
			PrefContact.selectByValue("Email");
		}
		
		
	}

}
