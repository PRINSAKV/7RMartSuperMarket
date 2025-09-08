package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends TestBase {
	HomePage homepage;
	ManageNewsPage managenewspage;
  @Test
  @Parameters({"username","password"})
  public void verifyTheUserIsAbleToClickManageNewsandPrintNews(String username ,String password) throws IOException
  {
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.enterUsername(username ,password);
	   homepage=loginpage.clickSignIn();
	   managenewspage=homepage.clickManageNewspage();
	   managenewspage.clickNewbutton().printNews(ExcelUtility.getIntegerData(1, 0, "ManageNewsTest")).clickSaveButton();
	   
	    /* ManageNewsPage managenewspage = new ManageNewsPage(driver);
	   managenewspage.clickManageNewspage();
	   managenewspage.clickNewbutton();
	   managenewspage.printNews("the power of unity");
	   managenewspage.clickSaveButton();*/
	   boolean managenewsdisplayed = managenewspage.isManagenewsheaderisdisplayedcheck();
	   Assert.assertTrue(managenewsdisplayed, Constants.ERRORMESSAGEFORMANAGENEWSHEADER);
  }
}
