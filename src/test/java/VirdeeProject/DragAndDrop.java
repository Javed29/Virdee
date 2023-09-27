package VirdeeProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	@SuppressWarnings("deprecation")
	public static  void  main (String args[]) throws InterruptedException
	{
		
       WebDriver driver = new ChromeDriver();  
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/droppable ");
		
		WebElement firstele = driver.findElement(By.id("draggable"));
		WebElement seconedele = driver.findElement(By.id("droppable"));
		
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		act.dragAndDrop(firstele,seconedele).build().perform();
	}

}

