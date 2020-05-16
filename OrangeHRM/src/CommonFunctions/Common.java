package CommonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Common {
	
	public static WebDriver driver;
	public static Properties properties;
	


	//public static Properties prop;
	
	public static Properties loadProperty() throws IOException 
	{
		FileInputStream fis=new FileInputStream("config.Properties");
		
		properties.load(fis);
		
		return properties;
		
	
		
	}
	/*@BeforeSuite
	
	public static void launchBrowser() throws IOException
	{
		loadProperty();
		
	String url1=prop.getProperty("url");
	
	String browser1=prop.getProperty("browser");
	
	String DriverLocation1=prop.getProperty("Driverlocation");
	
	if(browser1.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", DriverLocation1+"chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.get(url1);
		
		driver.manage().window().maximize();
	}
	driver.get(url1);
	
	driver.manage().window().maximize();
}*/
	@BeforeSuite
	
	public static void loadpage() throws IOException
	{
		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Revathi\\Downloads\\geckodriver-v0.24.0-win64 (2)\\geckodriver.exe");
	
	driver=new FirefoxDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	loadProperty();
	
	}
	
/*@AfterSuite
public static void close()
{
	driver.quit();
}*/
}
