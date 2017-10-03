import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priyadav\\Downloads\\chromedriver_win32\\chromedriver.exe"); //setting path to the driver
	     WebDriver driver= new ChromeDriver();
	     
	     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     
	     
	     
	     driver.get("http://www.irctc.co.in");
	     
	     driver.findElement(By.xpath("//a[contains(@href,'wChairhome')]")).click();
	     
	     Set<String> handles = driver.getWindowHandles();
	     Iterator<String> itr=handles.iterator();
	     
	     
	    	 String parentId= itr.next();
	    	 String childId= itr.next(); 
	    	 
	    	 driver.switchTo().window(childId);
	    	 driver.findElement(By.xpath("//a[contains(text(),'Flights')]")).click();
	    	 
	    	 driver.switchTo().window(parentId);
	    	 driver.findElement(By.partialLinkText("Mahila E-Haat")).click();
	    	 
	    	 
	    	 Set<String> handles1 = driver.getWindowHandles();
	    	 
	    	 Iterator<String> itr1=handles1.iterator();
	    	 
	    	 while(itr1.hasNext())
	    	 {
	    	 
	    	 System.out.println(itr1.next());
	    	 
	    	 }
	    	 
	    	 
	    	 
	    	 
	    	 
	    
	     
	     

	}

}
