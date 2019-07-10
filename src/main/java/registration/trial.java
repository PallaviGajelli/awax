package registration;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import implementations.ReusableMethodsImplementation;

public class trial {
	public static String TimeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime())
			.toString();
	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest logger;
	static Properties prop = new Properties();
	static Properties Rootprop = new Properties();
	static String reportLocation = prop.getProperty("ExtentReports");
	static String imageLocation = "images/";
	public static int count = 0;
	public static String extentReport;
	static String Browser=null;

	
	@BeforeTest
	@Parameters("BrowserName")
	public void Setup(String BrowserName) throws Exception {
		ReusableMethodsImplementation.breforeTest_PreRequesite_BeforeTestSetup_IndividualModule(driver, prop);
		extentReport = prop.getProperty("ExtentReports") + TimeStamp + ".html";
		report = new ExtentReports(extentReport);
		
	   // logger.log(LogStatus.INFO, "URL in Browser Launched Successfully");
	    
		if (BrowserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", prop.getProperty("ChromeDriver"));
		driver = new ChromeDriver();
		Browser= "chrome";
		//driver = implementations.ReusableMethodsImplementation.browserSelection_Browser(driver, prop, "chrome");
		}
		else if (BrowserName.equalsIgnoreCase("FF")) {
			System.setProperty("webdriver.gecko.driver", prop.getProperty("FirefoxDriver"));
			 driver = new FirefoxDriver();
			 Browser= "FireFox";
			//driver = implementations.ReusableMethodsImplementation.browserSelection_Browser(driver, prop, "firefox");
			}
		else if (BrowserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", prop.getProperty("IEdriver"));
			driver= new InternetExplorerDriver();
			Browser= "IE";
			//driver = implementations.ReusableMethodsImplementation.browserSelection_Browser(driver, prop, "ie");
			}
		
		
		long start = System.currentTimeMillis();
		ReusableMethodsImplementation.breforeTest_PreRequesite_PostBrowserLaunch(driver, prop);
		long finish = System.currentTimeMillis();
		long Total_Time = (finish - start) / 1000;
		System.out.println("Page Load Time: " + Total_Time + " Seconds");
		
		logger = report.startTest("Verifying Browser Launch for : "+Browser);
		logger.log(LogStatus.INFO, "Application in Browser Launched Successfully");
		if (Total_Time <= 3) {

			logger.log(LogStatus.INFO, "Application is loading as per expected responce time");
			System.err.println("Application is loading as per expected responce time");
			logger.log(LogStatus.INFO, "Page Load Time: " + Total_Time);
		} else {
			logger.log(LogStatus.WARNING, "Application is not loading as per expected responce time");
			System.err.println("Application is not loading as per expected responce time");
			logger.log(LogStatus.WARNING, "Page Load Time: " + Total_Time);
		}
		System.out.println("Extent report path: " + extentReport);
	}

	@AfterTest
	public void tearDown() throws InterruptedException {
		report.flush();
		//driver.close();
		driver.quit();
		Thread.sleep(2000);
	}
	
	/**
	 * Test Case No:2 Test Case Title:check UI of the registration Page.
	 */
	@Test(priority = 1, enabled = true)
	public static void TC_Registration_001() throws Exception {
		try {
			logger = report.startTest("check UI of the registration Page on :"+Browser);
			driver.get("https://dashboard.awaxgroup.co.uk/");
			Thread.sleep(2000);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "check UI of the registration Page.", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "check UI of the registration Page.", logger,
					report);
		}
	}
}
