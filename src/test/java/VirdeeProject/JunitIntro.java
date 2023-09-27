package VirdeeProject;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class JunitIntro {
	
	//webDriver initialization 
	//launch url
	//perform action on basic test case 
	//close the browser
	
	WebDriver driver;
	
  @Before 
  public void setup()
 {
	     driver = new ChromeDriver();  
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");	  
 }
  //Test case /Scenario-1
  @Test
  public void rightClickopration () throws InterruptedException
  {
	 Thread.sleep(3000);
	  WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
	  Actions act = new Actions(driver);
	  act.contextClick(rightclick).build().perform();
	  Thread.sleep(3000);
	//  Assert.assertFalse(driver.findElement((By.xpath("//ul[@class='context-menu-list context-menu-root']")).isSelected()); 
	//  System.out.println(driver.findElement((By.xpath("//ul[@class='context-menu-list context-menu-root']")).isSelected()); 
	  WebElement rightClickBox = driver.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']"));
	  boolean ListShouldDisplayed= true;	
	
	  Assert.assertEquals(ListShouldDisplayed, rightClickBox.isDisplayed());
	  
  }	
//Test case /Scenario-2
// @Test
//  public void doubleclickopration () throws InterruptedException
//  {
//	  Thread.sleep(2000);
//    Actions act = new Actions(driver);
//	WebElement doubleclickbtn = driver.findElement(By.xpath("//span[text()='right click me']"));
//	act.doubleClick(doubleclickbtn).build().perform();
	  

// }
   @After
  public void teardown()
  {  
	  
   driver.quit();
  
  }  
}
  
  
