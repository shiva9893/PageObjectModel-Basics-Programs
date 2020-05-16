package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagePom {
	

@FindBy(name="txtUsername")
public static WebElement username1;

@FindBy(id="txtPassword")
public static WebElement password1;

@FindBy(id="Submit")
public static WebElement submit;
	

}
