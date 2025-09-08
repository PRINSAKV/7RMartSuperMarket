package testscript;

import org.testng.annotations.Test;

import constants.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ScreenshotUtility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class TestBase {
	public Properties properties;
	public FileInputStream fis;
	

  public  WebDriver driver;
  @BeforeMethod(alwaysRun = true)
  @Parameters("browser")
 public void beforeMethod(String browser) throws Exception
  {
	  try {
			properties = new Properties();
			fis = new FileInputStream(Constants.CONFIGFILE);
			properties.load(fis);

		} catch (FileNotFoundException exception) {
			exception.printStackTrace();
		}
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
} else if (browser.equalsIgnoreCase("edge")) {
	WebDriverManager.edgedriver()
    .clearResolutionCache()
    .forceDownload()
    .setup();
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			throw new Exception("invalid browser");
		}
	  //driver = new ChromeDriver();
	  driver.get(properties.getProperty("url"));
	   driver.manage().window().maximize();
	  
  }

  @AfterMethod(alwaysRun = true)
  public void afterMethod(ITestResult itResult) throws IOException 
  {
	  if (itResult.getStatus() == ITestResult.FAILURE) {
			ScreenshotUtility sc = new ScreenshotUtility();
			sc.captureFailureScreenShot(driver, itResult.getName());
		}
		if (driver != null) {
			//driver.quit();
		
	  //driver.close();
	 // driver.quit();
	  
  }
  }
}
  


