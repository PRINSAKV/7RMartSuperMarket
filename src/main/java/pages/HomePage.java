package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@class='small-box-footer']")WebElement moreinfo;
	public AdminUserPage moreInfoClick()
	{
		
		moreinfo.click();
		return new  AdminUserPage(driver);
	}
	@FindBy(xpath ="//a[@data-toggle='dropdown']")WebElement admin;
	public HomePage Clickadmin()
	{
		admin.click();
		return this;
	}
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']")WebElement logout;
	
	public HomePage logOut()
	{
		
		logout.click();
		return this;
	}
	@FindBy(xpath="//img[@src='https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png']")WebElement image;
	
	public boolean isAdminIconImageIsDisplayed()
	{
		return image.isDisplayed();
	}
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category']")WebElement moreInfo;
	public ManageCategoryPage clickMoreInfoAtCatagory()
	{
		moreInfo.click();
		return new ManageCategoryPage(driver);
	}
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")WebElement manageNews;
	public ManageNewsPage clickManageNewspage()
	{
		manageNews.click();
		return new ManageNewsPage (driver);
	}
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-product']")WebElement manageProduct;
	public ManageProductPage clickManageProduct()
	{
			manageProduct.click();
			return new ManageProductPage(driver);
	}
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext'and@class='small-box-footer']")WebElement managefootermoreinfo;
	public ManageFooterPage clickManageFooterMoreInfo()
	{
		managefootermoreinfo.click();
		return new ManageFooterPage(driver);
	}
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact']")WebElement managemoreInfo;
	public  ManageContactsPage clickMoreInfoAtManageContacts()
	{
		managemoreInfo.click();
		return new ManageContactsPage(driver);
	}
	
}
