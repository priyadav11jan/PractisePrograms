import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	public static void main(String[] args) {
		

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priyadav\\Downloads\\chromedriver_win32\\chromedriver.exe"); //setting path to the driver
	     WebDriver driver= new ChromeDriver();
	     
	     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     
	     driver.get("http://www.seleniumhq.org/");
	     
	     
	     
	     String jscommand="window.scroll(0,1000)";
	     JavascriptExecutor jwe= (JavascriptExecutor)driver;
	     jwe.executeScript(jscommand);
	     
	     /*WebElement src=driver.findElement(By.xpath("//h1[contains(text(),'Block 1')]"));
	     WebElement dst =driver.findElement(By.xpath("//h1[contains(text(),'Block 3')]"));
	     
	     Actions act = new Actions(driver);
	     
	     act.dragAndDrop(src, dst).perform();
	     
	     
	     
	     
	     
	   
	     
	    /*WebElement ele=  driver.findElement(By.partialLinkText("Gmail"));
	    Actions ac= new Actions(driver);
	    
	    ac.moveToElement(ele).contextClick().sendKeys("t").build().perform();*/
	    
	    
	}

}
