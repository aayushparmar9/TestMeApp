package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
	WebDriver driver;
	public PageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


@FindBy(xpath="//a[@href='login.htm']")
 
public static WebElement signin;

 
@FindBy(name="userName")
 
public static WebElement username;

 
@FindBy(name="password")
 
public static WebElement password;

 
@FindBy(name="Login")
 
public static WebElement Login;










}
