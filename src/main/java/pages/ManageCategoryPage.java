package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Constants;
import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageCategoryPage {
	PageUtility utility ;
	WaitUtility util;
	
	public WebDriver driver;
	
	public ManageCategoryPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
		util = new WaitUtility();
	}
	
	@FindBy(xpath = "//a[@onclick='click_button(1)']")WebElement newbutton;
	@FindBy(xpath = "//input[@id='category']")WebElement enteritem;
	@FindBy(xpath = "//li[@id='134-selectable']")WebElement discount;
	@FindBy(xpath = "//input[@id='main_img']")WebElement choosefile;
	@FindBy(xpath = "//input[@name='top_menu']")WebElement topMenu;
	@FindBy(xpath = "//input[@name='show_home']")WebElement leftMenu;
	@FindBy(xpath = "//button[@class='btn btn-danger']")WebElement saveButton;
	@FindBy(xpath = "//a[@onclick='click_button(2)']")WebElement searchbutton;
	
	public ManageCategoryPage clickNewButton()
	{
		newbutton.click();
		return this;
	}
	
	public ManageCategoryPage enterCatgoryItems(String item)
	{
		util.waitUntilElementIsVisible(driver, enteritem);
		enteritem.clear();
		enteritem.sendKeys(item);
		return this;
	}
	public ManageCategoryPage clickDiscount()
	{
		util.waitForElementToBeClickabe(driver, discount);
		discount.click();
		return this;
	}
	
	public ManageCategoryPage clickChooseFile()
	{
	choosefile.sendKeys(Constants.IMAGEPATH);
	return this;
	}
	
	public ManageCategoryPage clickTopMenuButton()
	{
		util.waitUntilElementIsVisible(driver, topMenu);
		topMenu.click();
		return this;
	}
	
	public ManageCategoryPage clickLeftMenuButton()
	{
		util.waitUntilElementIsVisible(driver,leftMenu );
		leftMenu.click();
		return this;
	}
	
	public ManageCategoryPage clickSave()
	{
		util.waitForElementToBeClickabe(driver,saveButton );
		saveButton.click();
		return this;
	}
	
	public boolean searchButtonVisible()
	{
		return searchbutton.isDisplayed();
	}

	


	}

