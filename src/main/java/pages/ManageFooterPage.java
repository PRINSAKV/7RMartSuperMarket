package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterPage {
	
public WebDriver driver;
	
	
	public ManageFooterPage(WebDriver  driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1']")WebElement editButton;
	@FindBy(xpath = "//textarea[@id='content']")WebElement addressarea;
	@FindBy(xpath = "//input[@id='email']")WebElement emailArea;
	@FindBy(xpath ="//input[@id='phone']")WebElement phonenumberArea;
	@FindBy(xpath = "//button[@name='Update']")WebElement updateButton;
	@FindBy(xpath ="//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1']")WebElement editButtonVisible;
	
	public ManageFooterPage clickEditButton()
	{
		editButton.click();
		return this;
	}
	
	public ManageFooterPage enterAddress(String addr)
	{
		
		addressarea.clear();
		addressarea.sendKeys(addr);
		return this;
	}
	
	public ManageFooterPage enterEmail(String mail)
	{
		emailArea.clear();
		 emailArea.sendKeys(mail);
		 return this;
	}
	
	public ManageFooterPage enterPhoneNumber(String phno)
	{
		phonenumberArea.clear();
		phonenumberArea.sendKeys(phno);
		return this;
	}
	
	public ManageFooterPage clickUpdateButton()
	{
		updateButton.click();
		return this;
	}
	
	public boolean iseditButtonIsVisibleAtFooterPage() 
	{
		return editButtonVisible.isDisplayed();
	}
}

