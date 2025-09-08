package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageContactsPage;
import utilities.ExcelUtility;

public class ManageContactTest extends TestBase{
	HomePage homepage;
	ManageContactsPage managecontactspage;
  @Test
  @Parameters({"username","password"})
  public void VerifyTheUserIsAbletoUseManageContactPage(String username,String password) throws IOException
  {
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.enterUsername(username,password);
	  homepage =  loginpage.clickSignIn();
	  managecontactspage = homepage.clickMoreInfoAtManageContacts();
	  managecontactspage.clickActionButton().enterPhoneNumber(ExcelUtility.getStringData(1, 0, "ManageContactspage")).enterMailid(ExcelUtility.getStringData(1, 1, "ManageContactspage"))
	  .enterAddress(ExcelUtility.getStringData(1, 2, "ManageContactspage")).enterDeliveryTime(ExcelUtility.getStringData(1, 3, "ManageContactspage")).enterDeliveryChargeLimit(ExcelUtility.getStringData(1, 4, "ManageContactspage")).clickUpdateButton();
	  boolean actionbutton = managecontactspage.isActionButtonisVisible();
	  Assert.assertTrue(actionbutton, Constants.ERRORMESSAGEFORACTIONBUTTONATMANAGECONTACTSPAGE);
  }
}
