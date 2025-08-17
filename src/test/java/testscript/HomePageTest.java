package testscript;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends TestBase{
  @Test
  public void VerifytheUsercanAbleToLogout() 
  {
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.enterUsername("admin", "admin");
	  loginpage.clickSignIn();
	  
	  HomePage homepage = new HomePage(driver);
	  homepage.Clickadmin();
	  homepage.logOut();
  }
}
