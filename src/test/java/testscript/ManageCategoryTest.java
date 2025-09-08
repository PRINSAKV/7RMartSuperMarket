package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.scanner.Constant;

import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;

public class ManageCategoryTest extends TestBase{
	HomePage homepage;
	 ManageCategoryPage managecategory;
  @Test
  @Parameters({"username","password"})
  public void verifyTheUserIsAbleToClickManageCategoriesAndChangeAccordingly(String username , String password) throws IOException
  {
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.enterUsername(username,password);
	  homepage = loginpage.clickSignIn();
	   managecategory =homepage.clickMoreInfoAtCatagory();
	   managecategory.clickNewButton().enterCatgoryItems(ExcelUtility.getStringData(1, 0, "ManageCategoryPage"))
	   .clickDiscount().clickChooseFile().clickTopMenuButton()
	  .clickLeftMenuButton().clickSave();
	   /* ManageCategoryPage managecategory  =new ManageCategoryPage(driver);
	  managecategory.clickMoreInfoAtCatagory();
	  managecategory.clickNewButton();
	  managecategory.enterCatgoryItems();
	  managecategory.clickChooseFile();
	  managecategory.clickTopMenuButton();
	  managecategory.clickLeftMenuButton();
	  managecategory.clickSave();*/
	  boolean searchbutton = managecategory.searchButtonVisible();
	  Assert.assertTrue(searchbutton,Constants.ERRORMESSAGEFORSEARCHATCATEGORY);
  }
}
