package testscript;

import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.LoginPage;

public class AdminUserTest extends TestBase {
  @Test
  public void verifyTheUserIsAbleToSignInWithCorrectUsernameandCorrectPasswordClickMoreinfoandLogout()
  {
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.enterUsername("admin", "admin");
	  loginpage.clickSignIn();
	  
	  AdminUserPage homepage = new AdminUserPage(driver);
	 homepage.moreInfoCkick();
	 homepage.clickNewbutton();
	  homepage.adminUser("prinsa", "1234");
	  homepage.userType();
	  homepage.saveInfo();
	
	  
	   }
  
  
}
