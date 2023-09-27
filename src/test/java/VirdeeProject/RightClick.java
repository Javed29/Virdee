package VirdeeProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static  void  main (String args[]) throws InterruptedException {
	
		  WebDriver driver = new ChromeDriver();  
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			
			Thread.sleep(3000);
			
			
			WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
			
			Actions act = new Actions(driver);
			act.contextClick(rightclick).build().perform();
			
		//  And doubleclick action
		//	Actions act = new Actions(driver);
		//	WebElement doubleclickbtn = driver.findElement(By.xpath("//span[text()='right click me']"));
		//	act.doubleClick(doubleclickbtn).build().perform();
			
			Thread.sleep(3000);
			driver.quit();
}
}