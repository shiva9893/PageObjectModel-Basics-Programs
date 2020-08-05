package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionPractice {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Revathi\\Downloads\\geckodriver-v0.24.0-win64 (2)\\geckodriver.exe");
		  
		    WebDriver driver=new FirefoxDriver();
			
			driver.get("https://www.google.com");
			
			driver.findElement(By.name("q")).sendKeys(Keys.chord(Keys.SHIFT,"shiva"));
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			
			
			Thread.sleep(3000);
			WebElement search=driver.findElement(By.name("q"));
		  
			Actions ac=new Actions(driver);
			
			ac.moveToElement(search).build().perform();
			
			ac.contextClick(search).build().perform();
			
			
	}

	
}
