package CSP;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreatePatient {

	public static void main(String[] args) throws Exception {
		
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
		
		Actions act=new Actions(driver);
		WebElement tooltip =driver.findElement(By.xpath("//label[contains(text(),'Phone 1 Details')]//following::img[1]"));
		act.moveToElement(tooltip).perform();
		Thread.sleep(5000);
		
		String tiptext= driver.findElement(By.xpath("//span[@id='01I600000006r4B.00N60000002zkhE-_help']")).getText();

	System.out.println(tiptext);
		
		
		
		
		
		
		
		
		
		
		/*driver.findElement(By.name("00N60000002zkgz")).sendKeys(GetData2.fromExcel("Test1","sheet1", 1, 2));
		
		driver.findElement(By.name("00N60000002zkh4")).sendKeys(GetData2.fromExcel("Test1","sheet1", 1, 3));
		
		driver.findElement(By.name("00N60000002zkgy")).sendKeys(GetData2.fromExcel("Test1","sheet1", 1, 4)); //DOB
		
		Select gender=new Select(driver.findElement(By.name("00N60000002zkh1")));//Gender
		
		gender.selectByValue("F");
		
		driver.findElement(By.name("00N60000002zkhA")).sendKeys(GetData2.fromExcel("Test1","sheet1", 1, 5)); //email
		
		
		
		driver.findElement(By.name("00N60000002zkhY")).sendKeys("0000000000");
		
		Select phtype= new Select(driver.findElement(By.name("00N60000002zkhS")));
		
		phtype.selectByValue("Cell");
		
		WebDriverWait wait=new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='Name']//following::input[@name='save']")));
		
		driver.findElement(By.xpath("//input[@id='Name']//following::input[@name='save']")).click();
		
String eror= driver.findElement(By.xpath("//div[@id='errorDiv_ep']")).getText();
System.out.println(eror);

*/
	}
	
	
		
		
		
		
	}

