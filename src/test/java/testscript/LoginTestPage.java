package testscript;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

import pages.LoginPage;

public class LoginTestPage extends TestBase {
  @Test
  @org.testng.annotations.Parameters({"username","password"})
  public void verifyTheUserIsAbleToSigInWithCorrectUsernameAndCorrectPassword(String username, String password ) 
  {
	  LoginPage pageinclass = new LoginPage(driver);
	  pageinclass.enterUsername("admin","admin");
	  pageinclass.clickSignIn();
	  boolean isHomepageisloaded= pageinclass.isDashBoardIsDisplayed();
	  Assert.assertTrue(isHomepageisloaded, "homepage is not loaded");
  }
  @Test(dataProvider = "Scripts")
  public void verifyTheUserIsAbleToSIgnInWithIncorrectUsernameandCorrectPassword()
  {
	  LoginPage pageinclass = new LoginPage(driver);
	  pageinclass.enterUsername("flora","admin");
	  pageinclass.clickSignIn();
	  boolean isAlertMessageisDisplayed=pageinclass.isAlertIsDisplayed();
	  Assert.assertTrue(isAlertMessageisDisplayed,"Alert message not displayed");
	  
  }
  @Test
  public void verifyTheUserIsAbleToSignInWithINcorrectPasswordandCorrectUsername()
  {
	  LoginPage pageinclass = new LoginPage(driver);
	  pageinclass.enterUsername("admin","fona");
	  pageinclass.clickSignIn();
	  boolean isAlertMessageisDisplayed=pageinclass.isAlertIsDisplayed();
	  Assert.assertTrue(isAlertMessageisDisplayed,"Alert message not displayed");
	  
	  
  }
  @Test
  
  public void verifyTheUserIsAbleToSignInWithInCorrectUsernameandPassword()
  {
	  LoginPage pageinclass = new LoginPage(driver);
	  pageinclass.enterUsername("flora","fona");
	  pageinclass.clickSignIn();
	  boolean isAlertMessageisDisplayed=pageinclass.isAlertIsDisplayed();
	  Assert.assertTrue(isAlertMessageisDisplayed,"Alert message not displayed");
  }
  
  @DataProvider(name = "Scripts")
  
	  public Object[][]   testdata()
	  {
	  Object data[][]= {{"admin","admin"},{"flora","fona"}};
	  return data;
	  
	  }
	  
  
  
}
