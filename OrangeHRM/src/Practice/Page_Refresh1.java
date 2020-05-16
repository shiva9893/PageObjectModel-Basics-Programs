package Practice;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Page_Refresh1 {


	public static void main(String[] args) throws AWTException {
		
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Revathi\\Downloads\\geckodriver-v0.24.0-win64 (2)\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  
		//Using Robot class
		/* Robot robot=new Robot();
	    robot.keyPress(KeyEvent.VK_F5);
	    robot.keyRelease(KeyEvent.VK_F5);
		*/
		//driver.navigate().refresh();
		
		
		//Using Get methos
		//driver.get(driver.getCurrentUrl());
		
		//Using JavascriptExecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("location.reload()");
	}

}
