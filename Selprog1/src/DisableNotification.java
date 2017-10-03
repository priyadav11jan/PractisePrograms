import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class DisableNotification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Object> prefs= new HashMap<String,Object>();
		
		prefs.put("profile.default_content_setting_values.notifications", 2);
		
		ChromeOptions options = new ChromeOptions();
		
		options.setExperimentalOption("prefs", prefs);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priyadav\\Downloads\\chromedriver_win32\\chromedriver.exe"); //setting path to the driver
	     
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://timesofindia.indiatimes.com/");
		driver.manage().window().maximize();
		

	}

}
