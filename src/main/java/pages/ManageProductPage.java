package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageProductPage {
	public WebDriver driver;
	
	
	public ManageProductPage(WebDriver  driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Product/add']")WebElement newButton;
	@FindBy(xpath = "//input[@id='title']")WebElement entertitle;
	@FindBy(xpath = "//input[@value='Nonveg']")WebElement enterTag;
	@FindBy(xpath = "//input[@value='Nonveg']")WebElement productType;
	@FindBy(xpath = "//input[@id='tag']")WebElement enterTagType;
	@FindBy(xpath = "//select[@id='cat_id']")WebElement category;
	@FindBy(xpath = "//select[@id='sub_id']")WebElement subCategory;
	@FindBy(xpath = "//select[@id='grp_id']")WebElement group;
	@FindBy(xpath = "//label[@onclick='myFunction_piece()']")WebElement priceType;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-product']")WebElement resetButton;
	
	
	
	public ManageProductPage clickNewButton()
	{
		newButton.click();
		return this;
	}
	
	public ManageProductPage enterTitle(String pro)
	{
		
		entertitle.sendKeys(pro);
		return this;
	}
	
	public ManageProductPage selectProductType()
	{
		productType.click();
		return this;
	}
	public ManageProductPage selectTag(String nonveg)
	{
		enterTagType.sendKeys(nonveg);
		return this;
	}
	
	public ManageProductPage selectCategory()
	{
		category.click();
		return this;
	}
	
	public ManageProductPage selectSubCategory()
	{
		subCategory.click();
		return this;
	}
	
	public ManageProductPage selectGroup()
	{
		Select select=new Select(group);
		select.selectByIndex(2);
		select.selectByVisibleText("discount");
		return this;
	}
	public ManageProductPage selectPriceType()
	{
		priceType.click();
		return this;
	}
	
	public boolean isResetButtonIsDisplayedAtManageProductPage()
	{
		return resetButton.isDisplayed();
	}
	
	
	

}
