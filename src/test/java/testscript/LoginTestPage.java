package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTestPage extends TestBase {
	HomePage homepage;
  @Test(groups = {"smoke test"})
  @Parameters({"username","password"})
  public void verifyTheUserIsAbleToSigInWithCorrectUsernameAndCorrectPassword(String username, String password ) 
  {
	  LoginPage pageinclass = new LoginPage(driver);
	  pageinclass.enterUsername(username,password);
	  homepage = pageinclass.clickSignIn();
	  boolean isHomepageisloaded= pageinclass.isDashBoardIsDisplayed();
	  Assert.assertTrue(isHomepageisloaded, Constants.ERRORMESSAGEFORLOGIN);
  }
  @Test(dataProvider = "Scripts")
  public void verifyTheUserIsAbleToSIgnInWithIncorrectUsernameandCorrectPassword(String username ,String password)
  {
	  LoginPage pageinclass = new LoginPage(driver);
	  pageinclass.enterUsername(username , password);
	  pageinclass.clickSignIn();
	  boolean isAlertMessageisDisplayed=pageinclass.isAlertIsDisplayed();
	  Assert.assertTrue(isAlertMessageisDisplayed,Constants.ERRORMESSAGEFORINCORRECTUSERNAME);
	  
  }
  @Test(groups={"smoke test"})
  public void verifyTheUserIsAbleToSignInWithINcorrectPasswordandCorrectUsername() throws IOException
  {
	  String username = ExcelUtility.getStringData(1, 0,"LoginPageTest");
	  String password = ExcelUtility.getStringData(1, 1, "LoginPageTest");
	  LoginPage pageinclass = new LoginPage(driver);
	  pageinclass.enterUsername("admin","fona");
	  pageinclass.clickSignIn();
	  boolean isAlertMessageisDisplayed=pageinclass.isAlertIsDisplayed();
	  Assert.assertTrue(isAlertMessageisDisplayed,Constants.ERRORMESSAGEFORINCORRECTPASSWORDANDCORRECTUSERNAME);
	  
	  
  }
  @Test
  
  public void verifyTheUserIsAbleToSignInWithInCorrectUsernameandPassword() throws IOException
  {
	  String username = ExcelUtility.getStringData(2, 0, "LoginPageTest");
	  String password = ExcelUtility.getStringData(2, 1, "LoginPageTest");
	  LoginPage pageinclass = new LoginPage(driver);
	  pageinclass.enterUsername("flora","fona");
	  pageinclass.clickSignIn();
	  boolean isAlertMessageisDisplayed=pageinclass.isAlertIsDisplayed();
	  Assert.assertTrue(isAlertMessageisDisplayed,Constants.ERRORMESSAGEFORINCORRECTPASSWORDANDUSERNAME);
  }
  
  @DataProvider(name = "Scripts")
  
	  public Object[][]   testdata()
	  {
	  Object data[][]= {{"admin","admin"},{"flora","fona"}};
	  return data;
	  
	  }
	  
  
  
}
