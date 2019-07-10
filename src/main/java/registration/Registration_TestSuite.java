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
import steps.registration_steps;

public class Registration_TestSuite {
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
	public void tearDown() {
		report.flush();
		driver.quit();
	}
	
	/**
	 * Test Case No:2 Test Case Title:check UI of the registration Page.
	 */
	@Test(priority = 2, enabled = true)
	public static void TC_Registration_001() throws Exception {
		try {
			logger = report.startTest("check UI of the registration Page.");
			registration_steps.TC_Registration_002(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "check UI of the registration Page.", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "check UI of the registration Page.", logger,
					report);
		}
	}
	/**
	 * Test Case No:3 Test Case Title:Verify UI of the FNP Application
	 */
	@Test(priority = 3, enabled = true)
	public static void TC_Registration_003() throws Exception {
		try {
			logger = report.startTest("Verify UI of the FNP Application");
			registration_steps.TC_Registration_003(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify UI of the FNP Application", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify UI of the FNP Application", logger,
					report);
		}
	}
	/**
	 * Test Case No:4 Test Case Title:Check for all error msg when all the fields are empty.
	 */
	@Test(priority = 4, enabled = true)
	public static void TC_Registration_004() throws Exception {
		try {
			logger = report.startTest("Check for all error msg when all the fields are empty.");
			registration_steps.TC_Registration_004(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Check for all error msg when all the fields are empty.", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Check for all error msg when all the fields are empty.", logger,
					report);
		}
	}
	/**
	 * Test Case No:5 Test Case Title:check for all error msg when tick box is not ticked for I agree and I confirm msg
	 */
	@Test(priority = 5, enabled = true)
	public static void TC_Registration_005() throws Exception {
		try {
			logger = report.startTest("Test Case Title:check for all error msg when tick box is not ticked for I agree and I confirm msg");
			registration_steps.TC_Registration_005(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "check for all error msg when tick box is not ticked for I agree and I confirm msg", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "check for all error msg when tick box is not ticked for I agree and I confirm msg", logger,
					report);
		}
	}
	/**
	 * Test Case No:6 Test Case Title:check if we can copy paste password
	 */
	@Test(priority = 6, enabled = true)
	public static void TC_Registration_006() throws Exception {
		try {
			logger = report.startTest("check if we can copy paste password");
			registration_steps.TC_Registration_006(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "check if we can copy paste password", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "check if we can copy paste password", logger,
					report);
		}
	}
	/**
	 * Test Case No:7 Test Case Title:Check wether all the Optinal fields get enabled after selecting "Fill in your Profile details now(Optional)" check box.
	 */
	@Test(priority = 7, enabled = true)
	public static void TC_Registration_007() throws Exception {
		try {
			logger = report.startTest("Check wether all the Optinal fields get enabled after selecting \"Fill in your Profile details now(Optional)\" check box.");
			registration_steps.TC_Registration_007(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Check wether all the Optinal fields get enabled after selecting \"Fill in your Profile details now(Optional)\" check box.", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Check wether all the Optinal fields get enabled after selecting \"Fill in your Profile details now(Optional)\" check box.", logger,
					report);
		}
	}
	/**
	 * Test Case No:8 Test Case Title:Check KYC/AML file Submission UI
	 */
	@Test(priority = 8, enabled = true)
	public static void TC_Registration_008() throws Exception {
		try {
			logger = report.startTest("Check KYC/AML file Submission UI");
			registration_steps.TC_Registration_008(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Check KYC/AML file Submission UI", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Check KYC/AML file Submission UI", logger,
					report);
		}
	}
	/**
	 * Test Case No:9 Test Case Title:Positive flow
	 */
	@Test(priority = 9, enabled = true)
	public static void TC_Registration_009() throws Exception {
		try {
			logger = report.startTest("Positive flow");
			registration_steps.TC_Registration_009(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Positive flow", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Positive flow", logger,
					report);
		}
	}
	/**
	 * Test Case No:10 Test Case Title:Negative flow
	 */
	@Test(priority = 10, enabled = true)
	public static void TC_Registration_010() throws Exception {
		try {
			logger = report.startTest("Negative flow");
			registration_steps.TC_Registration_010(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Negative flow", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Negative flow", logger,
					report);
		}
	}
	/**
	 * Test Case No:11 Test Case Title:Negative flow_1
	 */
	@Test(priority = 11, enabled = true)
	public static void TC_Registration_011() throws Exception {
		try {
			logger = report.startTest("Negative flow_1");
			registration_steps.TC_Registration_011(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Negative flow_1", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Negative flow_1", logger,
					report);
		}
	}
	/**
	 * Test Case No:12 Test Case Title:Check for all error msg when all the fields are empty.
	 */
	@Test(priority = 12, enabled = true)
	public static void TC_Registration_012() throws Exception {
		try {
			logger = report.startTest("Check for all error msg when all the fields are empty.");
			registration_steps.TC_Registration_012(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Check for all error msg when all the fields are empty.", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Check for all error msg when all the fields are empty.", logger,
					report);
		}
	}
	/**
	 * Test Case No:13 Test Case Title:check for all error msg when tick box is not ticked for I agree and I confirm
	 */
	@Test(priority = 13, enabled = true)
	public static void TC_Registration_013() throws Exception {
		try {
			logger = report.startTest("check for all error msg when tick box is not ticked for I agree and I confirm");
			registration_steps.TC_Registration_013(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "check for all error msg when tick box is not ticked for I agree and I confirm", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "check for all error msg when tick box is not ticked for I agree and I confirm", logger,
					report);
		}
	}
	/**
	 * Test Case No:14 Test Case Title:check if we can copy paste password
	 */
	@Test(priority = 14, enabled = true)
	public static void TC_Registration_014() throws Exception {
		try {
			logger = report.startTest("check if we can copy paste password");
			registration_steps.TC_Registration_014(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "check if we can copy paste password", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "check if we can copy paste password", logger,
					report);
		}
	}
	/**
	 * Test Case No:15 Test Case Title:check for Optional fields.
	 */
	@Test(priority = 15, enabled = true)
	public static void TC_Registration_015() throws Exception {
		try {
			logger = report.startTest("check for Optional fields.");
			registration_steps.TC_Registration_015(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "check for Optional fields.", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "check for Optional fields.", logger,
					report);
		}
	}
	/**
	 * Test Case No:16 Test Case Title:check for error msg when required documents are not uploaded.
	 */
	@Test(priority = 16, enabled = true)
	public static void TC_Registration_016() throws Exception {
		try {
			logger = report.startTest("check for error msg when required documents are not uploaded.");
			registration_steps.TC_Registration_016(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "check for error msg when required documents are not uploaded.", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "check for error msg when required documents are not uploaded.", logger,
					report);
		}
	}
	/**
	 * Test Case No:17 Test Case Title:Check desired input for newly added Textbox .
	 */
	@Test(priority = 17, enabled = true)
	public static void TC_Registration_017() throws Exception {
		try {
			logger = report.startTest("Check desired input for newly added Textbox .");
			registration_steps.TC_Registration_017(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Check desired input for newly added Textbox .", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Check desired input for newly added Textbox .", logger,
					report);
		}
	}
	/**
	 * Test Case No:18 Test Case Title:Positive flow
	 */
	@Test(priority = 18, enabled = true)
	public static void TC_Registration_018() throws Exception {
		try {
			logger = report.startTest("Positive flow");
			registration_steps.TC_Registration_018(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Positive flow", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Positive flow", logger,
					report);
		}
	}
	/**
	 * Test Case No:19 Test Case Title:Negative flow
	 */
	@Test(priority = 19, enabled = true)
	public static void TC_Registration_019() throws Exception {
		try {
			logger = report.startTest("Negative flow");
			registration_steps.TC_Registration_019(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Negative flow", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Negative flow", logger,
					report);
		}
	}
	/**
	 * Test Case No:20 Test Case Title:Negative flow_1
	 */
	@Test(priority = 20, enabled = true)
	public static void TC_Registration_020() throws Exception {
		try {
			logger = report.startTest("Negative flow_1");
			registration_steps.TC_Registration_020(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Negative flow_1", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Negative flow_1", logger,
					report);
		}
	}
	/**
	 * Test Case No:21 Test Case Title:Check UI of the login Page
	 */
	@Test(priority = 21, enabled = true)
	public static void TC_Registration_021() throws Exception {
		try {
			logger = report.startTest("Check UI of the login Page");
			registration_steps.TC_Registration_021(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Check UI of the login Page", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Check UI of the login Page", logger,
					report);
		}
	}
	/**
	 * Test Case No:22 Test Case Title:Positive flow with correct userID and Password
	 */
	@Test(priority = 22, enabled = true)
	public static void TC_Registration_022() throws Exception {
		try {
			logger = report.startTest("Positive flow with correct userID and Password");
			registration_steps.TC_Registration_022(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Positive flow with correct userID and Password", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Positive flow with correct userID and Password", logger,
					report);
		}
	}
	/**
	 * Test Case No:23 Test Case Title:Negative flow with incorrect EmailID and Password
	 */
	@Test(priority = 23, enabled = true)
	public static void TC_Registration_023() throws Exception {
		try {
			logger = report.startTest("Negative flow with incorrect EmailID and Password");
			registration_steps.TC_Registration_023(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Negative flow with incorrect EmailID and Password", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Negative flow with incorrect EmailID and Password", logger,
					report);
		}
	}
	/**
	 * Test Case No:24 Test Case Title:check error msg for Invalid emailId and valid Password
	 */
	@Test(priority = 24, enabled = true)
	public static void TC_Registration_024() throws Exception {
		try {
			logger = report.startTest("check error msg for Invalid emailId and valid Password");
			registration_steps.TC_Registration_024(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "check error msg for Invalid emailId and valid Password", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "check error msg for Invalid emailId and valid Password", logger,
					report);
		}
	}
	/**
	 * Test Case No:25 Test Case Title:Check Invalid password login and valid emailId.
	 */
	@Test(priority = 25, enabled = true)
	public static void TC_Registration_025() throws Exception {
		try {
			logger = report.startTest("Check Invalid password login and valid emailId.");
			registration_steps.TC_Registration_025(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Check Invalid password login and valid emailId.", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Check Invalid password login and valid emailId.", logger,
					report);
		}
	}
	/**
	 * Test Case No:26 Test Case Title:check functionality of register button on login page
	 */
	@Test(priority = 26, enabled = true)
	public static void TC_Registration_026() throws Exception {
		try {
			logger = report.startTest("check functionality of register button on login page");
			registration_steps.TC_Registration_026(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "check functionality of register button on login page", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "check functionality of register button on login page", logger,
					report);
		}
	}
	/**
	 * Test Case No:27 Test Case Title:check functinality for forgot password along with UI
	 */
	@Test(priority = 27, enabled = true)
	public static void TC_Registration_027() throws Exception {
		try {
			logger = report.startTest("check functinality for forgot password along with UI");
			registration_steps.TC_Registration_027(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "check functinality for forgot password along with UI", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "check functinality for forgot password along with UI", logger,
					report);
		}
	}
	/**
	 * Test Case No:28 Test Case Title:check thwe functionality of reset button on forgot password page.
	 */
	@Test(priority = 28, enabled = true)
	public static void TC_Registration_028() throws Exception {
		try {
			logger = report.startTest("check thwe functionality of reset button on forgot password page.");
			registration_steps.TC_Registration_028(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "check thwe functionality of reset button on forgot password page.", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "check thwe functionality of reset button on forgot password page.", logger,
					report);
		}
	}
	/**
	 * Test Case No:29 Test Case Title:check the functionality of back to login button on forgot password page.
	 */
	@Test(priority = 29, enabled = true)
	public static void TC_Registration_029() throws Exception {
		try {
			logger = report.startTest("check the functionality of back to login button on forgot password page.");
			registration_steps.TC_Registration_029(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "check the functionality of back to login button on forgot password page.", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "check the functionality of back to login button on forgot password page.", logger,
					report);
		}
	}
	/**
	 * Test Case No:30 Test Case Title:Logout and Login back again to verify PIN
	 */
	@Test(priority = 30, enabled = true)
	public static void TC_Registration_030() throws Exception {
		try {
			logger = report.startTest("Logout and Login back again to verify PIN");
			registration_steps.TC_Registration_030(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Logout and Login back again to verify PIN", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Logout and Login back again to verify PIN", logger,
					report);
		}
	}
	
	
}
