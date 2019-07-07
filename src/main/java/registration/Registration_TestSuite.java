package registration;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
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

	@BeforeTest
	public void Setup() throws Exception {
		ReusableMethodsImplementation.breforeTest_PreRequesite_BeforeTestSetup_IndividualModule(driver, prop);
		extentReport = prop.getProperty("ExtentReports") + TimeStamp + ".html";
		report = new ExtentReports(extentReport);
		logger = report.startTest("Verifying Browser Launch");
		logger.log(LogStatus.INFO, "URL in Browser Launched Successfully");
		System.setProperty("webdriver.chrome.driver", prop.getProperty("ChromeDriver"));
		driver = implementations.ReusableMethodsImplementation.browserSelection_Browser(driver, prop, "chrome");
		long start = System.currentTimeMillis();
		ReusableMethodsImplementation.breforeTest_PreRequesite_PostBrowserLaunch(driver, prop);
		long finish = System.currentTimeMillis();
		long Total_Time = (finish - start) / 1000;
		System.out.println("Page Load Time: " + Total_Time + " Seconds");
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
	 * Test Case No:2 check UI of the registration Page.
	 */
	@Test(priority = 2, enabled = true)
	public static void TC_Registration_001() throws Exception {
		try {
			logger = report.startTest("");
			registration_steps.TC_Registration_002(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "check UI of the registration Page.", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "", logger,
					report);
		}
	}
	/**
	 * Test Case No:3 Test Case Title:Verify UI of the FNP Application
	 */
	@Test(priority = 3, enabled = true)
	public static void TC_Registration_003() throws Exception {
		try {
			logger = report.startTest("");
			registration_steps.TC_Registration_003(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "", logger,
					report);
		}
	}
	/**
	 * Test Case No:4 Test Case Title:Verify UI of the FNP Application
	 */
	@Test(priority = 4, enabled = true)
	public static void TC_Registration_004() throws Exception {
		try {
			logger = report.startTest("");
			registration_steps.TC_Registration_004(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "", logger,
					report);
		}
	}
	/**
	 * Test Case No:5 Test Case Title:Verify UI of the FNP Application
	 */
	@Test(priority = 5, enabled = true)
	public static void TC_Registration_005() throws Exception {
		try {
			logger = report.startTest("");
			registration_steps.TC_Registration_005(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "", logger,
					report);
		}
	}
	/**
	 * Test Case No:6 Test Case Title:Verify UI of the FNP Application
	 */
	@Test(priority = 6, enabled = true)
	public static void TC_Registration_006() throws Exception {
		try {
			logger = report.startTest("");
			registration_steps.TC_Registration_006(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "", logger,
					report);
		}
	}
	/**
	 * Test Case No:7 Test Case Title:Verify UI of the FNP Application
	 */
	@Test(priority = 7, enabled = true)
	public static void TC_Registration_007() throws Exception {
		try {
			logger = report.startTest("");
			registration_steps.TC_Registration_007(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "", logger,
					report);
		}
	}
	/**
	 * Test Case No:8 Test Case Title:Verify UI of the FNP Application
	 */
	@Test(priority = 8, enabled = true)
	public static void TC_Registration_008() throws Exception {
		try {
			logger = report.startTest("");
			registration_steps.TC_Registration_008(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "", logger,
					report);
		}
	}
	/**
	 * Test Case No:9 Test Case Title:Verify UI of the FNP Application
	 */
	@Test(priority = 9, enabled = true)
	public static void TC_Registration_009() throws Exception {
		try {
			logger = report.startTest("");
			registration_steps.TC_Registration_009(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "", logger,
					report);
		}
	}
	/**
	 * Test Case No:10 Test Case Title:Verify UI of the FNP Application
	 */
	@Test(priority = 10, enabled = true)
	public static void TC_Registration_010() throws Exception {
		try {
			logger = report.startTest("");
			registration_steps.TC_Registration_010(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "", logger,
					report);
		}
	}
	/**
	 * Test Case No:11 Test Case Title:Verify UI of the FNP Application
	 */
	@Test(priority = 11, enabled = true)
	public static void TC_Registration_011() throws Exception {
		try {
			logger = report.startTest("");
			registration_steps.TC_Registration_011(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "", logger,
					report);
		}
	}
	/**
	 * Test Case No:12 Test Case Title:Verify UI of the FNP Application
	 */
	@Test(priority = 12, enabled = true)
	public static void TC_Registration_012() throws Exception {
		try {
			logger = report.startTest("");
			registration_steps.TC_Registration_012(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "", logger,
					report);
		}
	}
	/**
	 * Test Case No:13 Test Case Title:Verify UI of the FNP Application
	 */
	@Test(priority = 13, enabled = true)
	public static void TC_Registration_013() throws Exception {
		try {
			logger = report.startTest("");
			registration_steps.TC_Registration_013(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "", logger,
					report);
		}
	}
	/**
	 * Test Case No:14 Test Case Title:Verify UI of the FNP Application
	 */
	@Test(priority = 14, enabled = true)
	public static void TC_Registration_014() throws Exception {
		try {
			logger = report.startTest("");
			registration_steps.TC_Registration_014(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "", logger,
					report);
		}
	}
	/**
	 * Test Case No:15 Test Case Title:Verify UI of the FNP Application
	 */
	@Test(priority = 15, enabled = true)
	public static void TC_Registration_015() throws Exception {
		try {
			logger = report.startTest("");
			registration_steps.TC_Registration_015(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "", logger,
					report);
		}
	}
	/**
	 * Test Case No:16 Test Case Title:Verify UI of the FNP Application
	 */
	@Test(priority = 16, enabled = true)
	public static void TC_Registration_016() throws Exception {
		try {
			logger = report.startTest("");
			registration_steps.TC_Registration_016(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "", logger,
					report);
		}
	}
	/**
	 * Test Case No:17 Test Case Title:Verify UI of the FNP Application
	 */
	@Test(priority = 17, enabled = true)
	public static void TC_Registration_017() throws Exception {
		try {
			logger = report.startTest("");
			registration_steps.TC_Registration_017(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "", logger,
					report);
		}
	}
	/**
	 * Test Case No:18 Test Case Title:Verify UI of the FNP Application
	 */
	@Test(priority = 18, enabled = true)
	public static void TC_Registration_018() throws Exception {
		try {
			logger = report.startTest("");
			registration_steps.TC_Registration_018(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "", logger,
					report);
		}
	}
	/**
	 * Test Case No:19 Test Case Title:Verify UI of the FNP Application
	 */
	@Test(priority = 19, enabled = true)
	public static void TC_Registration_019() throws Exception {
		try {
			logger = report.startTest("");
			registration_steps.TC_Registration_019(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "", logger,
					report);
		}
	}
	/**
	 * Test Case No:20 Test Case Title:Verify UI of the FNP Application
	 */
	@Test(priority = 20, enabled = true)
	public static void TC_Registration_020() throws Exception {
		try {
			logger = report.startTest("");
			registration_steps.TC_Registration_020(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "", logger,
					report);
		}
	}
	/**
	 * Test Case No:21 Test Case Title:Verify UI of the FNP Application
	 */
	@Test(priority = 21, enabled = true)
	public static void TC_Registration_021() throws Exception {
		try {
			logger = report.startTest("");
			registration_steps.TC_Registration_021(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "", logger,
					report);
		}
	}
	/**
	 * Test Case No:22 Test Case Title:Verify UI of the FNP Application
	 */
	@Test(priority = 22, enabled = true)
	public static void TC_Registration_022() throws Exception {
		try {
			logger = report.startTest("");
			registration_steps.TC_Registration_022(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "", logger,
					report);
		}
	}
	/**
	 * Test Case No:23 Test Case Title:Verify UI of the FNP Application
	 */
	@Test(priority = 23, enabled = true)
	public static void TC_Registration_023() throws Exception {
		try {
			logger = report.startTest("");
			registration_steps.TC_Registration_023(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "", logger,
					report);
		}
	}
	/**
	 * Test Case No:24 Test Case Title:Verify UI of the FNP Application
	 */
	@Test(priority = 24, enabled = true)
	public static void TC_Registration_024() throws Exception {
		try {
			logger = report.startTest("");
			registration_steps.TC_Registration_024(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "", logger,
					report);
		}
	}
	/**
	 * Test Case No:25 Test Case Title:Verify UI of the FNP Application
	 */
	@Test(priority = 25, enabled = true)
	public static void TC_Registration_025() throws Exception {
		try {
			logger = report.startTest("");
			registration_steps.TC_Registration_025(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "", logger,
					report);
		}
	}
	/**
	 * Test Case No:26 Test Case Title:Verify UI of the FNP Application
	 */
	@Test(priority = 26, enabled = true)
	public static void TC_Registration_026() throws Exception {
		try {
			logger = report.startTest("");
			registration_steps.TC_Registration_026(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "", logger,
					report);
		}
	}
	/**
	 * Test Case No:27 Test Case Title:Verify UI of the FNP Application
	 */
	@Test(priority = 27, enabled = true)
	public static void TC_Registration_027() throws Exception {
		try {
			logger = report.startTest("");
			registration_steps.TC_Registration_027(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "", logger,
					report);
		}
	}
	/**
	 * Test Case No:28 Test Case Title:Verify UI of the FNP Application
	 */
	@Test(priority = 28, enabled = true)
	public static void TC_Registration_028() throws Exception {
		try {
			logger = report.startTest("");
			registration_steps.TC_Registration_028(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "", logger,
					report);
		}
	}
	/**
	 * Test Case No:29 Test Case Title:Verify UI of the FNP Application
	 */
	@Test(priority = 29, enabled = true)
	public static void TC_Registration_029() throws Exception {
		try {
			logger = report.startTest("");
			registration_steps.TC_Registration_029(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "", logger,
					report);
		}
	}
	/**
	 * Test Case No:30 Test Case Title:Verify UI of the FNP Application
	 */
	@Test(priority = 30, enabled = true)
	public static void TC_Registration_030() throws Exception {
		try {
			logger = report.startTest("");
			registration_steps.TC_Registration_030(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "", logger, report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "", logger,
					report);
		}
	}
	
	
}
