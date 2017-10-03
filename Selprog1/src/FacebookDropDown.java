import java.util.List;
import org.openqa.selenium.TakesScreenshot;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class FacebookDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priyadav\\Downloads\\chromedriver_win32\\chromedriver.exe"); //setting path to the driver
	     
		WebDriver driver = new ChromeDriver();  //launching Chrome
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //wait for 30 seconds before timeout
        
        driver.get("https://www.facebook.com");
        Select ddl=new Select(driver.findElement(By.id("day")));
        List<WebElement> options =ddl.getOptions();
        for(int i=0;i<options.size();i++)
        {
        	
        	WebElement option = options.get(i);
        	System.out.println(option.getText());
        }
        
      System.out.println(ddl.isMultiple());
      
      ddl.selectByIndex(1);
	}

}
