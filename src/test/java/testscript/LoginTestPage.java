package testscript;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

import pages.LoginPage;

public class LoginTestPage extends TestBase {
  @Test(dataProvider = "Scripts")
  public void verifyTheUserIsAbleToSigInWithCorrectUsernameAndCorrectPassword(String username, String password ) 
  {
	  LoginPage pageinclass = new LoginPage(driver);
	  pageinclass.enterUsername("admin","admin");
	  pageinclass.clickSignIn();
  }
  @Test
  public void verifyTheUserIsAbleToSIgnInWithIncorrectUsernameandCorrectPassword()
  {
	  LoginPage pageinclass = new LoginPage(driver);
	  pageinclass.enterUsername("flora","admin");
	  pageinclass.clickSignIn();
	  
  }
  @Test
  public void verifyTheUserIsAbleToSignInWithINcorrectPasswordandCorrectUsername()
  {
	  LoginPage pageinclass = new LoginPage(driver);
	  pageinclass.enterUsername("admin","fona");
	  pageinclass.clickSignIn();
	  
  }
  @Test
  
  public void verifyTheUserIsAbleToSignInWithInCorrectUsernameandPassword()
  {
	  LoginPage pageinclass = new LoginPage(driver);
	  pageinclass.enterUsername("flora","fona");
	  pageinclass.clickSignIn();
  }
  
  @DataProvider(name = "Scripts")
  
	  public Object[][]   testdata()
	  {
	  Object data[][]= {{"admin","admin"},{"flora","fona"}};
	  return data;
	  
	  }
	  
  
  
}
