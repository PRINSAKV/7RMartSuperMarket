package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageNewsPage {
	
	public WebDriver driver;
	
	public ManageNewsPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@onclick='click_button(1)']")WebElement newButton;
	@FindBy(xpath = "//textarea[@id='news']")WebElement enterNews;
	@FindBy(xpath = "//button[@type='submit']")WebElement saveButton;
	@FindBy(xpath = "//h1[@class='m-0 text-dark']")WebElement managenewsheader;
	

	public ManageNewsPage clickNewbutton()
	{
		//driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/list-news");
		newButton.click();
		return this;
	}
	
	public ManageNewsPage printNews(String string)
	{
		//driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/news/add");
		enterNews.sendKeys("The power of unity");
		return this;
	}
	
	public ManageNewsPage clickSaveButton()
	{
		saveButton.click();
		return this;
	}
	
	public boolean isManagenewsheaderisdisplayedcheck()
	{
		return managenewsheader.isDisplayed();
	}
	

}
