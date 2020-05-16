package TestSuit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Practice_Windows {

	public static void main(String[] args) {
		
		try
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Revathi\\Downloads\\geckodriver-v0.24.0-win64 (2)\\geckodriver.exe");
		
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");;
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		Actions action = new Actions(driver);
		Thread.sleep(5000);
		//WebElement admin = driver.findElement(By.linkText("Admin"));
		//action.moveToElement(admin).build().perform();
		driver.findElement(By.linkText("Admin")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		driver.findElement(By.linkText("PIM")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		driver.findElement(By.linkText("Leave")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		Thread.sleep(5000);
		String MainWindow = driver.getWindowHandle();
		
		Set<String> set = driver.getWindowHandles();
		
		Iterator<String> itr = set.iterator();
		
		 while(itr.hasNext())
		 {
			 String childWindow =  itr.next();
			 
			 if(!MainWindow.equals(childWindow))
			 {
				 Thread.sleep(5000);
				 
				driver.switchTo().window(childWindow);
				
				Thread.sleep(5000);
				 
				System.out.println(driver.switchTo().window(childWindow).getCurrentUrl()); 
		 }
			 
		}
		 
		}
		catch(Exception e)
		{
			System.out.println("Error is"+e);
		}
		//action.moveToElement(admin).build().perform();
		}

	
	}

