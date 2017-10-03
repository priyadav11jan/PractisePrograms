
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Backend {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priyadav\\Downloads\\chromedriver_win32\\chromedriver.exe"); //setting path to the driver
	     
		WebDriver driver =new ChromeDriver();//launching chrome
      
		
	  //Browser specific actions	
		driver.manage().window().maximize();
		driver.get("https://test.salesforce.com/");
		
		WebElement un =driver.findElement(By.id("username"));
		un.sendKeys("thakurvsingh@gso3.lly.deltest1");
		
		WebElement pwd =driver.findElement(By.id("password"));
		pwd.sendKeys("Password!111");
		
		WebElement login =driver.findElement(By.id("Login"));
		login.click();
		
		Thread.sleep(5000);
		
		WebElement claudia =driver.findElement(By.linkText("UK_Test_ BackOffice_Claudia"));
		claudia.click();
		
		WebElement allTab =driver.findElement(By.className("allTabsArrow"));
		allTab.click();
		
		WebElement programs =driver.findElement(By.xpath("//img[@title='Programs']"));
		programs.click();
		
		WebElement newPatient = driver.findElement(By.xpath("//input[@title='New']"));
		newPatient.click();
		
		
		//List<WebElement> textFields = driver.findElements(By.xpath("//td[contains(@class,'dataCol')]"));
		
		/*for (int i=0;i<textFields.size();i++)
			
				{
		        WebElement textfield= textFields.get(i);
		        
		        textfield.sendKeys("test1");
		        }	
		
		
		WebElement aff = driver.findElement(By.id("00N60000002zkgm"));
		 Select set=new Select(aff);
	        s
	        et.selectByIndex(2);
		Iterator<WebElement> it= textFields.iterator();
		
		while(it.hasNext())
		{
			
			System.out.println(it.next());
			WebElement textfield=it.next();
			
              textfield.sendKeys("test2");
        }
		*/
		
		//driver.findElement(By.xpath("//img[contains(@title,'Patient Lookup')]"))
}
}


