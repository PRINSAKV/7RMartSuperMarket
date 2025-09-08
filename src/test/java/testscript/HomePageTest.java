package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constants;
import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends TestBase{
	HomePage homepage;
  @Test
  @Parameters({"username","password"})
  public void VerifytheUsercanAbleToLogout(String username , String password) 
  {
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.enterUsername(username ,password);
	  homepage = loginpage.clickSignIn();
	  homepage.Clickadmin().logOut();
	  
	 /* HomePage homepage = new HomePage(driver);
	  homepage.Clickadmin();
	  homepage.logOut();*/
	  
	  
	  /*String title = driver.getTitle();
	  System.out.println(title);*/
	  String expectedtitle = "Login | 7rmart supermarket";
	  String actualtitle = driver.getTitle();
	  Assert.assertEquals(expectedtitle,actualtitle,Constants.ERRORMESSAGEFORINCORRECTTITLE );
	  
	  
	 
	  
	 
	  
	  
  }
}
