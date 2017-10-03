import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver; 
public class LaunchChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priyadav\\Downloads\\chromedriver_win32\\chromedriver.exe"); //setting path to the driver
     
		WebDriver driver =new ChromeDriver();//launching chrome
      
		
	  //Browser specific actions	
		driver.manage().window().maximize();
	  driver.get("https://www.google.co.in/?gfe_rd=cr&ei=c_kzWemhIvLx8Afr267IDQ&gws_rd=ssl");
      driver.navigate().to("http://www.seleniumhq.org/");
      driver.navigate().refresh();
      
      driver.navigate().back();
      driver.navigate().forward();
      driver.close();
      
      
      
      
      
	}

}
