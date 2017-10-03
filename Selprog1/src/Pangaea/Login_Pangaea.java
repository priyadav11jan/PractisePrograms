package Pangaea;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import CSP.GetData2;

public class Login_Pangaea {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priyadav\\Downloads\\chromedriver_win32\\chromedriver.exe"); //setting path to the driver
	     
		WebDriver driver = new ChromeDriver();  //launching Chrome
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://test.salesforce.com/");
		
		
		
		//Login to Pangaea
		driver.findElement(By.id("username")).sendKeys(GetData2.fromExcel("Test1","Sheet1",2, 0));
		driver.findElement(By.xpath("//input[starts-with(@id,'pas')]")).sendKeys(GetData2.fromExcel("Test1","sheet1", 2, 1),Keys.ENTER);
		
		Thread.sleep(5000);
		
		
		//Navigate to Create Request
	
		driver.get("https://gso--pangpcopy.cs89.my.salesforce.com/a3I/e?CF00Nb0000009bfWI=Priyanka+Yadav&CF00Nb0000009bfWI_lkid=005b00000019D1IAAU&ent=01Ib0000000kjJc&nooverride=1&RecordType=012b000000017IW&retURL=%2Fa3I%2Fo");
	 
		
		//Related Study Lookup
		
		
		
		driver.findElement(By.xpath("//img[contains(@alt,'Related Study Lookup')]")).click();
		
		/*WebDriverWait wait= new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("searchFrame"));*/
		Thread.sleep(5000);
		
		
		Set<String> handles=driver.getWindowHandles();
		
		Iterator<String> itr =handles.iterator();
		
		
		String parent= itr.next();
		String child= itr.next();
		
		
		driver.switchTo().window(child);
		
		
		
		driver.switchTo().frame("searchFrame");
		
		
		WebElement srch= driver.findElement(By.id("lksrch"));
		srch.sendKeys("test");
		
		driver.findElement(By.xpath("//input[@class='btn']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("resultsFrame");
		
		
		driver.findElement(By.linkText("TEST - Demo")).click();
		
		
		driver.switchTo().window(parent);
		
		
		//PFO MultiSelect
		WebElement pFO_Consultation_Type=driver.findElement(By.id("00Nb0000009G7Ey_unselected"));
		
		Select pfo_multi=new Select(pFO_Consultation_Type);
		
		 List<WebElement> options =pfo_multi.getOptions();
		for(WebElement ele:options)
		{
			System.out.println(ele.getText());
			
		}
		
		pfo_multi.selectByValue("0");
	
		driver.findElement(By.xpath("//img[@id='00Nb0000009G7Ey_right_arrow']")).click();
	}
	

}
