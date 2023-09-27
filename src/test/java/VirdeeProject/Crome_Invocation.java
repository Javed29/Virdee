package VirdeeProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Crome_Invocation {
	
	
	public static  void  main (String args[]) throws InterruptedException
	{
		System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	//	Actions act = new Actions(driver);
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		String titleOfPage =driver .getTitle();
		System.out.println("Title of page is :"+titleOfPage);
		
		if (titleOfPage.equals("Index"))
		{
			System.out.println("Title of page is correct test pass");
		}
		else 
		{
			System.out.println("Title of page is incarrect test fail");
		}
		WebElement email =driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		email.sendKeys("natasa"+Keys.ENTER + "ram"+ Keys.ENTER);
		
//		 Thread.sleep(3000);
//		 
//		// Register
//		if (driver.getTitle().equals("Register")) 
//		{
//			System.out.println("new page for registration is open ");
//		}
//		else
//			System.out.println("test fail");
		
	//driver.quit();
}
	
	
	
	
	
	
}