package TestSuit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CommonFunctions.Common;
import PageObjectModel.LoginPagePom;



public class HomePage extends Common{
		
  WebDriver driver;
//public static Properties properties;
	

	@Test
	public void loginHomepage() {
		
   // Common.loadProperyFile();
	try
	{

	PageFactory.initElements(driver,LoginPagePom.class);	
	Thread.sleep(3000);
	
	LoginPagePom.username1.sendKeys("Admin");
	LoginPagePom.password1.sendKeys(properties.getProperty("password"));
	LoginPagePom.submit.click();
	
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}

  @Test
  public void Vivo()
  {
	  try {
		  System.out.println("vivo mobiles");
	  }
	  catch(Exception e )
	  {
		  System.out.println(e);
	  }
  }
}
