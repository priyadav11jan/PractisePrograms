import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priyadav\\Downloads\\chromedriver_win32\\chromedriver.exe"); //setting path to the driver
	     
		WebDriver driver =new ChromeDriver();//launching chrome
      
		
	  //Browser specific actions	
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement cart =driver.findElement(By.cssSelector("._218svP/span"));
		cart.click();
		
		
		
		
		WebElement icon =driver.findElement(By.tagName("a"));
		icon.click();
		
		
		WebElement mob =driver.findElement(By.linkText("Refrigerators"));
		mob.click();
		
		WebElement search = driver.findElement(By.className("LM6RPg"));
		search.sendKeys("Phone");
		
      //WebElement mob =driver.findElement(By.linkText("Mobiles"));
      //mob.click();
	}

}
