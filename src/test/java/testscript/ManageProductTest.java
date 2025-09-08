package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageProductPage;
import utilities.ExcelUtility;

public class ManageProductTest extends TestBase  {
	HomePage homepage;
	ManageProductPage manageproduct;
	
  @Test
  @Parameters({"username","password"})
  public void verifyTheUserIsAbleToProvideProductDetails(String username ,String password) throws IOException 
  {
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.enterUsername(username,password);
	 homepage = loginpage.clickSignIn();
	 manageproduct = homepage.clickManageProduct();
	 manageproduct.clickNewButton().enterTitle(ExcelUtility.getStringData(1, 0, "ManageProductTest")).selectProductType()
	 .selectTag(ExcelUtility.getStringData(1, 1, password)).selectCategory() .selectSubCategory();
	  
	  
	 /* ManageProductPage manageproduct = new ManageProductPage(driver);
	  manageproduct.clickManageProduct();
	  manageproduct.clickNewButton();
	  manageproduct.enterTitle();
	  manageproduct.selectProductType();
	  manageproduct.selectTag();
	  manageproduct.selectCategory();
	  manageproduct.selectSubCategory();*/
	 boolean resetButton = manageproduct.isResetButtonIsDisplayedAtManageProductPage();
	   Assert.assertTrue(resetButton,Constants.ERRORMESSAGEFORRESTTBUTTONATMANAGEPRODUCTPAGE);
	  
  }
}
