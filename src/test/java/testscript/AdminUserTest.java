package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constants;
import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUserTest extends TestBase {
	HomePage homepage;
	AdminUserPage adminuserpage;
	FakerUtility faker = new FakerUtility();
  @Test
  @Parameters({"username","password"})
  public void verifyTheUserIsAbleToSignInWithCorrectUsernameandCorrectPasswordClickMoreinfoandLogout(String username, String password) throws IOException
  {
	
	  
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.enterUsername(username , password);
	   homepage = loginpage.clickSignIn();
	  adminuserpage = homepage.moreInfoClick();
	   //String adminname = faker.getFakeCityName();
	 // String adminpass = faker.getPassword();
	  adminuserpage.clickNewbutton().enterUsername(ExcelUtility.getStringData(1, 0, "Adminusertest"))
	  .enterPasword(ExcelUtility.getStringData(1, 1, "Adminusertest")).userType(ExcelUtility.getStringData(1, 2, "Adminusertest")).clickSave();
	  
	    /* AdminUserPage adminpage= new AdminUserPage(driver);
	  adminpage.clickAdminUserMoreInfo();
	  adminpage.clickNewbutton();
	  adminpage.adminUser("prinsa", "12345");
	  adminpage.userType();
	  adminpage.clickSave();*/
	  boolean searchicon=adminuserpage.isDisplayed();
	  Assert.assertTrue(searchicon , Constants.ERRORMESSAGEFORSEARCHICON);
	  
	  
	 
	
  } 
}

