package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomeObject {
	@FindBy(name="products")
	 
	public static WebElement searchtextbox;

	 
	@FindBy(how = How.XPATH, using = "//input[@value=''FIND DETAILS']")
	 
	public static WebElement finddetailsbutton;

}
