package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminUserPage {
	
	public WebDriver driver;
	public AdminUserPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@class='small-box-footer']")WebElement moreinfo;
	public void moreInfoCkick()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin");
		moreinfo.click();
	}
	
	@FindBy(xpath = "//a[@onclick='click_button(1)']")WebElement newbutton;
	public void clickNewbutton()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/list-admin");
		newbutton.click();
	}
	
	@FindBy(xpath = "//input[@id='username']")WebElement usernamenew;
	@FindBy(xpath = "//input[@id='password']")WebElement passwordnew;
	public void adminUser(String username ,String password)
	{
		usernamenew.sendKeys(username);
		passwordnew.sendKeys(password);
	}
	
	@FindBy(xpath = "//select[@id='user_type']")WebElement usertype;
	public void userType()
	{
		Select select = new Select(usertype);
		select.selectByIndex(2);
	}
	@FindBy(xpath = "//button[@name='Create']")WebElement saveinfo;
	public void saveInfo()
	{
		saveinfo.click();
	}
	
	
	
	
	
}
