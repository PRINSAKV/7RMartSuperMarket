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
	
	public void enterUsername(String usernamefield, String passwordfield)
	{
		username.sendKeys(usernamefield);
		password.sendKeys(passwordfield);
		
		
	}
	
	public void clickSignIn()
	{
		signin.click();
	}

}
