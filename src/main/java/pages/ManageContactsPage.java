package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageContactsPage {
	public WebDriver driver;
	
	public ManageContactsPage(WebDriver  driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/contact/edit_contact?edit=1']")WebElement actionButton;
	@FindBy(xpath = "//input[@id='phone']")WebElement phonenumber;
	@FindBy(xpath = "//input[@id='email']")WebElement mailid;
	@FindBy(xpath = "//textarea[@placeholder='Enter the Address']")WebElement addressArea;
	@FindBy(xpath = "//textarea[@placeholder='Enter Delivery Time']")WebElement deliveryTime;
	@FindBy(xpath = "//input[@id='del_limit']")WebElement deliverycl;
	@FindBy(xpath = "//button[@name='Update']")WebElement updateButton;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/contact/edit_contact?edit=1']")WebElement actionbuttonvisible;
	
	
	public ManageContactsPage clickActionButton()
	{
		actionButton.click();
		return this;
	}
	
	public  ManageContactsPage enterPhoneNumber(String phno)
	{
		phonenumber.sendKeys(phno);
		return this;
	}
	
	public  ManageContactsPage enterMailid(String mail) 
	{
		mailid.sendKeys(mail);
		return this;
	}
	
	public  ManageContactsPage enterAddress(String address)
	{
		addressArea.sendKeys(address);
		return this;
	}
	
	public  ManageContactsPage enterDeliveryTime(String time)
	{
		deliveryTime.sendKeys(time);
		return this;
	}
	
	public  ManageContactsPage enterDeliveryChargeLimit(String limit)
	{
		deliverycl.sendKeys(limit);
		return this;
	}
	
	public  ManageContactsPage clickUpdateButton()
	{
		updateButton.click();
		return this;
	}
	
	public boolean isActionButtonisVisible()
	{
		return actionbuttonvisible.isDisplayed();
	}
}
