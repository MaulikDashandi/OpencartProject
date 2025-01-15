package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//PageFactory Design Pattern
public class HomePage extends BasePage{

	
	WebDriver driver;
	
	//Constructor
	public HomePage(WebDriver driver){
		super(driver);
	}
	
	//Locators
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement lnkMyAccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	@FindBy(linkText = "Login")   // Login link added in step5
	WebElement linkLogin;
	
	//Action Methods
	
	public void clickMyAccount() {
		lnkMyAccount.click(); 
		
		
	}
	public void clickRegister() {
		lnkRegister.click();
		
		/*
		 * JavascriptExecutor js = (JavascriptExecutor)driver;
		 * js.executeScript("arguments[0].click()", lnkMyAccount);
		 */
		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * wait.until(ExpectedConditions.elementToBeClickable(lnkMyAccount)).click();
		 */
	}
	
	public void clickLogin() {
		linkLogin.click(); // added in step5
	}
	
}
