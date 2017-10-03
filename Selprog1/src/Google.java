
	import java.util.List;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class Google {

		public static void main(String[] args) throws InterruptedException 
		
		{
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\priyadav\\Desktop\\Selenium Downloads and extracts\\chromeDriver.exe" );
			System.setProperty("webdriver.chrome.driver","C:\\Users\\priyadav\\Downloads\\chromedriver_win32\\chromedriver.exe"); //setting path to the driver
		     
			WebDriver driver = new ChromeDriver();  //launching Chrome
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //wait for 30 seconds before timeout
	        
	        driver.get("https://www.google.com");
	        
	        driver.findElement(By.id("lst-ib")).sendKeys("Selenium",Keys.ENTER); //Searching for Selenium Keyword
	        
	       List<WebElement> links = driver.findElements(By.xpath("//h3/a")); //all matching links
	       
	             for(int i=0;i<links.size();i++)
	       
	             {
	    	         
	            	 WebDriverWait wait= new WebDriverWait(driver,30);
	            	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3/a")));
	 
	            	 links=driver.findElements(By.xpath("//h3/a")) ;
	       
	            	 WebElement link =links.get(i);
	            	 link.click();
	       
	       
	            	 Thread.sleep(5000);
	       
	       
	       
	       
	            	 List<WebElement> lists = driver.findElements(By.xpath("//*[contains(text(),'Selenium')]"));
	            	 System.out.println(lists.size());
	           
	       
	   
	       
	       				for(int j=0;j<lists.size();j++)
	       				{	
	       					lists =driver.findElements(By.xpath("//*[contains(text(),'Selenium')]"));
	       			             WebElement list = lists.get(j);
	       						
	       						System.out.println(list.getText());
	       				
	              
		}
	       				driver.navigate().back();
	       }
		}
	}



