package Cucumber;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import ObjectRepository.PageObjects;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginFeatureStepdefinition {
	static WebDriver driver;
	int productCount = 0;

	@Given("Navigate to home page")
	public void navigateToHomePage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://10.232.237.143:443/TestMeApp/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@When("^user enters username and password$")

	public void userEntersUsernameAndPassword() throws Throwable {
		

		
	}

@Then("user logged in successfully")
	public void userLoggedInSuccessfully() throws Throwable {
		System.out.println("User logged in successfully");
		//Assert.assertEquals(driver.getTitle(), "Admin Home");
        //driver.quit();
	}

	@When("^Lalitha searches below products in the search box$")
	public void lalithaSearchesBelowProductsInTheSearchBox(DataTable productsdata) throws Throwable {
		List<String> productsName = productsdata.asList(String.class);
		
		for (String product : productsName) {
			driver.findElement(By.name("products")).sendKeys(product);

			driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();

			boolean found = isElementPresent("//a[text()[contains(.,'Add to cart')]]");
			if(found) {
				productCount++;
			}

			driver.findElement(By.xpath("//a[text()[contains(.,'Home')]]")).click();

		}
	}

	@Then("^product should be added in the cart if available$")
	public void productShouldBeAddedInTheCartIfAvailable() throws Throwable {
		WebElement addedProductsInCart = driver.findElement((By.xpath("//div[@class='shop-menu pull-right']/ul/a/b")));
		int numberOfelements = Integer.parseInt(addedProductsInCart.getText());
		Assert.assertEquals(productCount, numberOfelements);
		

	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void userEntersAnd(String arg1, String arg2) throws Throwable {
		PageObjects po = PageFactory.initElements(driver, PageObjects.class);

		LoginObjects lo = PageFactory.initElements(driver, LoginObjects.class);

		po.signin.click();

		lo.username.sendKeys("lalitha");

		lo.password.sendKeys("password123");

		lo.Login.click();

		
	}

	

	public static boolean isElementPresent(String locator) {

		int attempts = 0;

		boolean found = false;

		while (attempts < 2) {

			try {

				WebElement element = driver.findElement(By.xpath(locator));

				element.click();

				found = true;

				break;

			} catch (Exception e) {

			}

			attempts++;

		}

		return found;

	}
	@When("^User opens the cart$")
	public void userOpensTheCart() throws Throwable {
		driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
	}
		
	

	@And("^User clicks checkout button$")
	public void userClicksCheckoutButton() throws Throwable {
		driver.findElement(By.xpath("//a[@href='checkout.htm']")).click();
	}

	@And("^User fills address and proceeds to pay button$")
	public void userFillsAddressAndProceedsToPayButton() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
	}
		
	

	@Then("^Payment is Successful$")
	public void paymentIsSuccessful() throws Throwable {
		driver.findElement(By.xpath("//div[@id='swit']/div[1]/div/label/i")).click();
		driver.findElement(By.xpath("//a[@href='#']")).click();
				
				
	}
		
	}

	
	




