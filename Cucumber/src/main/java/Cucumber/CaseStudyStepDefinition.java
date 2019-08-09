package Cucumber;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import ObjectRepository.PageObjects;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CaseStudyStepDefinition {
	static WebDriver driver;

	@Given("Navigate to the home page")
	public void navigateToHomePage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://10.232.237.143:443/TestMeApp/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@When("^User clicks on signup button$")
	public void userClicksOnSignupButton() throws Throwable {
		driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();

	}

	@When("^user enters user name as \"([^\"]*)\"$")
	public void userEntersUserNameAs(String arg1) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(arg1);

	}

	@When("^user enters first name as \"([^\"]*)\"$")
	public void userEntersFirstNameAs(String arg1) throws Throwable {
		driver.findElement(By.name("firstName")).sendKeys(arg1);
	}

	@When("^user enters last name as \"([^\"]*)\"$")
	public void userEntersLastNameAs(String arg1) throws Throwable {
		driver.findElement(By.name("lastName")).sendKeys(arg1);

	}

	@When("^user enters password as \"([^\"]*)\"$")
	public void userEntersPasswordAs(String arg1) throws Throwable {
		driver.findElement(By.name("password")).sendKeys(arg1);

	}

	@When("^user enters confirm password as \"([^\"]*)\"$")
	public void userEntersConfirmPasswordAs(String arg1) throws Throwable {
		driver.findElement(By.name("confirmPassword")).sendKeys(arg1);

	}

	@When("^user enters gender as \"([^\"]*)\"$")
	public void userEntersGenderAs(String arg1) throws Throwable {
		if (arg1.equalsIgnoreCase("male")) {
			driver.findElement(By.xpath("//input[@value='Male']")).click();

		} else {
			if (arg1.equalsIgnoreCase("female")) {
				driver.findElement(By.xpath("//input[@value='Female']")).click();
			}
		}
		driver.findElement(By.name("userName")).sendKeys(arg1);

	}

	@When("^user enters email as \"([^\"]*)\"$")
	public void userEntersEmailAs(String arg1) throws Throwable {
		driver.findElement(By.name("emailAddress")).sendKeys(arg1);

	}

	@When("^user enters mobile number as \"([^\"]*)\"$")
	public void userEntersMobileNumberAs(String arg1) throws Throwable {
		driver.findElement(By.name("mobileNumber")).sendKeys(arg1);

	}

	@When("^user enters DOB as \"([^\"]*)\"$")
	public void userEntersDOBAs(String arg1) throws Throwable {
		driver.findElement(By.name("dob")).sendKeys(arg1);

	}

	@When("^user enters address as \"([^\"]*)\"$")
	public void userEntersAddressAs(String arg1) throws Throwable {
		driver.findElement(By.name("address")).sendKeys(arg1);

	}

	@And("^user selects security question as \"([^\"]*)\" and user selects security answer as \"([^\"]*)\"$")
	public void userSelectsSecurityQuestionAsAndUserSelectsSecurityAnswerAs(String arg1, String arg2) throws Throwable {
		Select question = new Select(driver.findElement(By.name("securityQuestion")));
		question.selectByVisibleText(arg1);
		driver.findElement(By.name("answer")).sendKeys(arg2);
	}

	@And("^User clicks on Register$")
	public void userClicksOnRegister() throws Throwable {
		driver.findElement(By.name("Submit")).click();

	}

	
}
	


	
	

	

// @Then("^User Registration is successful$")
// public void userRegistrationIsSuccessful() throws Throwable {
// Assert.assertEquals(driver.getTitle(), expected);
//
	
	
	