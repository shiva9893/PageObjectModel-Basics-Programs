package Practice;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotisEasy {

	public static void main(String[] args) throws AWTException  {
		
	
			 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Revathi\\Downloads\\geckodriver-v0.24.0-win64 (2)\\geckodriver.exe");
			  
			    WebDriver driver=new FirefoxDriver();
				
				driver.get("https://www.google.com");
				driver.findElement(By.name("q")).sendKeys(Keys.chord(Keys.SHIFT,"shiva"));
				driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
				
				Robot rb=new Robot();
				
				rb.keyPress(KeyEvent.VK_PAGE_DOWN);
				rb.keyRelease(KeyEvent.VK_PAGE_DOWN);
			

	}

}
