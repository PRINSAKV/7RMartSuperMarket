package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageFooterPage;
import utilities.ExcelUtility;

public class ManageFooterTest extends TestBase
{
	HomePage homepage;
	ManageFooterPage managefooterpage;
  @Test
  @Parameters({"username","password"})
  public void verifyTheuserisabletoClickonManageFooterandeditbutton(String username , String password) throws IOException 
  {
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.enterUsername(username,password);
	  homepage = loginpage.clickSignIn();
	  managefooterpage = homepage.clickManageFooterMoreInfo().clickEditButton()
			  .enterAddress(ExcelUtility.getStringData(1, 0, "ManageFooterPage")).enterEmail(ExcelUtility.getStringData(1, 1, "ManageFooterPage"))
			  .enterPhoneNumber(ExcelUtility.getStringData(1, 2, "ManageFooterPage")).clickUpdateButton();
	  boolean editbutton = managefooterpage.iseditButtonIsVisibleAtFooterPage();
	  Assert.assertTrue(editbutton,Constants.ERRORMESSAGEFOREDITBUTTONATFOOTERPAGE);
	  
  }
}