package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.PageUtility;
import utilities.WaitUtility;

public class AdminUserPage {
	
	public WebDriver driver;
	PageUtility utility = new PageUtility(driver);
	WaitUtility util = new WaitUtility();

	
	public AdminUserPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin'and@class='small-box-footer']")WebElement adminuser;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")WebElement newbutton;
	@FindBy(xpath = "//input[@id='username']")WebElement usernamenew;
	@FindBy(xpath = "//input[@id='password']")WebElement passwordnew;
	@FindBy(xpath = "//select[@id='user_type']")WebElement adminusertype;
	@FindBy(xpath = "//button[@name='Create']")WebElement saveinfo;
	@FindBy(xpath = "//a[@onclick='click_button(2)']")WebElement searchButton;
	
	public AdminUserPage clickAdminUserMoreInfo()
	{
		 adminuser.click();
		 return new AdminUserPage (driver);
	}
	public AdminUserPage clickNewbutton()
	{
		newbutton.click();
		return this;
	}
	public AdminUserPage enterUsername(String username)
	{
		usernamenew.sendKeys(username);
		
		return this;
	}
	public AdminUserPage enterPasword(String password)
	{
		passwordnew.sendKeys(password);	
		return this;
	}
	
	public AdminUserPage userType()
	{
		Select select = new Select(adminusertype);
		select.selectByIndex(2);
		return this;
	}
		
	public AdminUserPage clickSave()
	{
		saveinfo.click();
		return this;
	}
	
	public boolean isDisplayed()
	{
		return searchButton.isDisplayed();
	}
	
	
	}
