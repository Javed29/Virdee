package VirdeeProject;


import java.util.Collections;

import javax.sound.midi.Sequence;

import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Stepfuntion {


	private static final Thread Thered = null;

	@Test
	public static void web () throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver.exe");  
	//	Dimension.d =new Dimension(480,620);
		WebDriver driver = new ChromeDriver();  

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Actions act = new Actions(driver);

	driver.get(" https://Amazon.com");
//		Thread.sleep(2000);
//
//		WebElement fullname = driver.findElement(By.xpath("//input[@name='email']"));
//		fullname.sendKeys("balram@virdee.co");
/*		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("password");                             
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(4000);                                                  
				driver.findElement(By.xpath("//button[@data-path='/users']")).click();
				Thread.sleep(2000);               
				driver.findElement(By.xpath("(//div[@class='Container-sc-1x12whn-0 Tooltip___StyledContainer-sc-1v0noqi-0 TBebM dbpLuV'][1])")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Balram Kumar");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@type='email']")).sendKeys("balramK1@virdee.co");
				Thread.sleep(2000);
		
				driver.findElement(By.xpath("//div[@class='arrow down']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//li[@data-dial-code='91']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9009009004");
				Thread.sleep(3000);
		
				driver.findElement(By.xpath("//div[@class='SelectInputStyle__value-container css-1hwfws3']")).click();
				Thread.sleep(1000);
				driver.findElement(By.cssSelector("div[id='react-select-4-option-2']")).click();
				driver.findElement(By.xpath("//div[@class='SelectInputStyle__option SelectInputStyle__option--is-focused css-1n7v3ny-option']")).click();
			    driver.findElement(By.xpath("(//*[text()='USER'])[7]")).click();
				Thread.sleep(3000);
				
			
				WebElement password = driver.findElement(By.xpath("//inut[@name='password']"));
				password.sendKeys("balram789@");
				Thread.sleep(1000);
				WebElement password1 = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
				password1.sendKeys("balram789@");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				Thread.sleep(4000);
				WebElement location = driver.findElement(By.cssSelector("div[class='AsyncSelectInputStyle__value-container AsyncSelectInputStyle__value-container--is-multi css-1hwfws3']"));
				location.click();
				Thread.sleep(4000);
				WebElement location1 = driver.findElement(By.xpath("//input[@autocomplete='off']"));
		
				location1.sendKeys("Hotel Virdee");
				
				Thread.sleep(3000);
				WebElement location2= driver.findElement(By.xpath("//div[@id='react-select-5-option-1']"));
			//	WebElement location2= driver.findElement(By.xpath("(//div[normalize-space()='Hotel Virdee'])[6]"));
				location2.click();
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("svg[class='yes-icon']")).click();
				
				Thread.sleep(3000);
		   //  Access task 
		driver.findElement(By.xpath("//button[@data-path='/access']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class=\"Container-sc-1x12whn-0 Tooltip___StyledContainer-sc-1v0noqi-0 TBebM dbpLuV\"][1]")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//div[@class='AsyncSelectInputStyle__placeholder css-1wa3eu0-placeholder']")).click();
		Thread.sleep(1000);
		WebElement users= driver.findElement(By.xpath("//input[@id='react-select-4-input']"));
		users.sendKeys("Balram Kumar");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='react-select-4-option-0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='date-picker-start']")).sendKeys("01/04/2023");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='date-picker-end']")).sendKeys("01/05/2023");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='react-select-5-input']")).sendKeys("bangalore");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[id='react-select-5-option-0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='sc-hiKfjK farDTs']")).sendKeys("1245");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='Button-sc-1c6b8h1-0 lmmTCm']")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("(//div[@class='Container-sc-1x12whn-0 SelectInput___StyledContainer-sc-4f7n4n-0 TBebM bMNOmR'])[1]")).click();
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//div[@id='react-select-8-option-2']")).click();
	    Thread.sleep(1000);	
		driver.findElement(By.xpath("(//div[@class='Container-sc-1x12whn-0 SelectInput___StyledContainer-sc-4f7n4n-0 TBebM bMNOmR'])[2]")).click();
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//div[@id='react-select-9-option-0']")).click();
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//input[@class='sc-hiKfjK farDTs']")).sendKeys("24");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='AsyncSelectInputStyle__indicators css-1wy0on6']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='room 12']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='AsyncSelectInputStyle__placeholder css-1wa3eu0-placeholder']")).click();
		Thread.sleep(1000);
		WebElement users1= driver.findElement(By.xpath("//input[@id='react-select-11-input']"));
		users1.sendKeys("BALRAM KUMAR");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='react-select-11-option-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Submit']")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("svg[class='yes-icon']")).click(); 
		
		 //Reporting task
		driver.findElement(By.xpath("//button[@data-path='/reporting']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Guest']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Input']")).sendKeys("Balram Kumar");
		
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Input']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	//	System.out.println();*/
	//
		
		
	
	    
		          
	 }	
}
