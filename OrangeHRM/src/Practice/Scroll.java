package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Scroll {
  @Test
  public void f() throws InterruptedException, AWTException {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Revathi\\Downloads\\geckodriver-v0.24.0-win64 (2)\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("selenium");
		driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.ENTER);
		//WebElement link=driver.findElement(By.id("pnnext"));		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		/*js.executeScript("arguments[0].scrollIntoView(true)",link);
		Thread.sleep(3000);*/
		/*js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);*/
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
		Thread.sleep(3000);
		/*Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		rb.keyRelease(KeyEvent.VK_PAGE_DOWN);
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		rb.keyRelease(KeyEvent.VK_PAGE_DOWN);
		*/
  }
}
