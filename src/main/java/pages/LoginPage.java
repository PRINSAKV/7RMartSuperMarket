package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	public WebDriver driver;
	public LoginPage (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@class='form-control']")WebElement username;
	@FindBy(xpath = "//input[@type='password']")WebElement password;
	@FindBy(xpath = "//button[@class='btn btn-dark btn-block']")WebElement signin;
	@FindBy(xpath = "//p[text()='Dashboard']")WebElement dashboard;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")WebElement alert;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")WebElement alert2;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")WebElement alert3;
	
	
	
	public LoginPage enterUsername(String usernamefield, String passwordfield)
	{
		
		username.sendKeys(usernamefield);
		password.sendKeys(passwordfield);
		return this;
		
		
	}
	
	public HomePage clickSignIn()
	{
		signin.click();
		return new HomePage(driver);// to give connection for home page and login page
	}
	
	public boolean isDashBoardIsDisplayed()
	{
		return dashboard.isDisplayed();
	}
	
	public boolean isAlertIsDisplayed()
	{
		return alert.isDisplayed();
	}
	
	public boolean isAlert2IsDisplayed()
	
	{
		return alert2.isDisplayed();
		
	}
	
	public boolean IsAlert3IsDisplayed()
	{
		return alert3.isDisplayed();
				
	}

	

}
