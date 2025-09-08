package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.reactivex.rxjava3.functions.Action;

public class PageUtility {
	public WebDriver driver;
	
	public PageUtility(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void selectByIndex(WebElement element , int intex)
	{
		Select select = new Select(element);
		select.selectByIndex(intex);
	}
	
	public void selectByVisibleText(WebElement element , String text)
	{
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	public void selectByvalue(WebElement element , String value)
	{
		Select select = new Select(element);
		select.selectByValue(value);
	}
	public void dragAndDrop(WebDriver driver,WebElement source,WebElement target)
	{
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();
	}
	public void sendKeys(WebDriver driver , WebElement element , String text)
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().sendKeys(text).perform();
	}
	
	
	
	

}
