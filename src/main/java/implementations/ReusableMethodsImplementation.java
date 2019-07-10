package implementations;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import genericInterface.GenericActions;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public abstract class ReusableMethodsImplementation implements GenericActions{
	
	static Properties prop = new Properties();
	static String imageLocation = "images/";
	static String reportLocation;
	public static String timeStamp = null;
	public static int count = 0;

	public static void breforeTest_PreRequesite_BeforeTestSetup(WebDriver driver, Properties prop, Properties Rootprop)
	{
		ReusableMethodsImplementation.fileReader(driver, "./Data.properties", prop);
		ReusableMethodsImplementation.fileReader(driver, "../RootData.properties", Rootprop);
	}

	public static void breforeTest_PreRequesite_BeforeTestSetup_IndividualModule(WebDriver driver, Properties prop)
	{
		ReusableMethodsImplementation.fileReader(driver, "./Data.properties", prop);
	}

	public static void breforeTest_PreRequesite_PostBrowserLaunch(WebDriver driver, Properties Rootprop)
	{
		TestWebDriverMethodImplementations.maximizeBrowser(driver);
		TestWebDriverMethodImplementations.getUrl(driver, Rootprop.getProperty("URL"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static WebDriver browserSelection_Browser(WebDriver driver, Properties Prop, String browserName)
	{
		if (browserName.equalsIgnoreCase("chrome"))
		{
			
			driver = new ChromeDriver();
		}
		if (browserName.equalsIgnoreCase("firefox"))
		{
			
			driver = new FirefoxDriver();
		}
		if (browserName.equalsIgnoreCase("ie"))
		{ 
			driver = new InternetExplorerDriver();
		}
		return driver;
	}

	public static String browserSelection_GetParameter(String name)
	{
		String value = System.getProperty(name);
		if (value == null)
			throw new RuntimeException(name + " is not a parameter!");
		if (value.isEmpty())
			throw new RuntimeException(name + " is empty!");
		return value;
	}

	public static String[][] excelDataConfig(WebDriver driver, String fileName, String sheetName)
	{
		String[][] arrayExcelData = null;
		try
		{
			FileInputStream fs = new FileInputStream(fileName);
			Workbook wb =Workbook.getWorkbook(fs);
			jxl.Sheet sh = wb.getSheet(sheetName);
			int totalNoOfCols = sh.getColumns();
			int totalNoOfRows = sh.getRows();
			arrayExcelData = new String[totalNoOfRows - 1][totalNoOfCols];
			for (int i = 1; i < totalNoOfRows; i++)
			{
				for (int j = 0; j < totalNoOfCols; j++)
				{
					arrayExcelData[i - 1][j] = sh.getCell(j, i).getContents();
				}
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (BiffException e)
		{
			e.printStackTrace();
		}
		return arrayExcelData;
	}

	public static FileInputStream fileReader(WebDriver driver, String FilePath, Properties prop)
	{
		File file = new File(FilePath);
		FileInputStream fileInput = null;
		try
		{
			fileInput = new FileInputStream(file);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
			prop.load(fileInput);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return fileInput;
	}

	public static String randomString(WebDriver driver)
	{
		int leftLimit = 97;
		int rightLimit = 122;
		int targetStringLength = 4;
		Random random = new Random();
		StringBuilder buffer = new StringBuilder(targetStringLength);
		for (int i = 0; i < targetStringLength; i++)
		{
			int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
			buffer.append((char) randomLimitedInt);
		}
		String RandomString = buffer.toString();
		System.out.println(RandomString);
		return RandomString;
	}

	public static String randomString_Int(WebDriver driver, String RandomStr)
	{
		int length = 5;
		boolean useLetters = true;
		boolean useNumbers = false;
		String RandomString = RandomStringUtils.random(length, useLetters, useNumbers);
		System.out.println(RandomString);
		return RandomString;
	}

	public static String random_Alpha_String(WebDriver driver)
	{
		String RandomString = RandomStringUtils.randomAlphabetic(4);
		System.out.println(RandomString);
		return RandomString;
	}

	public static String random_Alpha_Numeric(WebDriver driver)
	{
		String RandomString = RandomStringUtils.randomAlphanumeric(4);
		System.out.println(RandomString);
		return RandomString;
	}

	public static String createScreenshot(WebDriver driver)
	{
		File file = new File("./Data.properties");
		FileInputStream fileInput = null;
		try
		{
			fileInput = new FileInputStream(file);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
			prop.load(fileInput);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		UUID uuid = UUID.randomUUID();
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try
		{
			FileUtils.copyFile(scrFile, new File(prop.getProperty("ExtentReports") + ".html" + imageLocation + uuid + ".png"));
		}
		catch (IOException e)
		{
			System.out.println("Error while generating screenshot:\n" + e.toString());
		}
		return "./" + prop.getProperty("ExtentReportReferenceImages") + ".html" + imageLocation + uuid + ".png";
	}

	public static ExtentReports testCaseStatus_Pass(WebDriver driver, String Message, ExtentTest logger, ExtentReports report)
	{
		String URL = driver.getCurrentUrl();
		logger.log(LogStatus.INFO, "Current URL: " + URL);
		String screenshot_path = createScreenshot(driver);
		String image = logger.addScreenCapture(screenshot_path);
		logger.log(LogStatus.PASS, "Passed " + Message, image);
		report.endTest(logger);
		return report;
	}

	public static ExtentReports testCaseStatus_Fail(WebDriver driver, Exception e, String Message, ExtentTest logger, ExtentReports report) throws Exception
	{
		try
		{
			count++;
			String URL = driver.getCurrentUrl();
			logger.log(LogStatus.INFO, "Current URL: " + URL);
			e.printStackTrace();
			String screenshot_path = createScreenshot(driver);
			String image = logger.addScreenCapture(screenshot_path);
			logger.log(LogStatus.FAIL, Message, image);
			report.endTest(logger);
		}
		catch (Exception E)
		{
		}
		throw e;
	}

	public static ExtentReports testCaseInfo_WithScreenshot(WebDriver driver, String Message, ExtentTest logger, ExtentReports report)
	{
		String screenshot_path = createScreenshot(driver);
		String image = logger.addScreenCapture(screenshot_path);
		logger.log(LogStatus.INFO, Message, image);
		report.endTest(logger);
		return report;
	}

	public static ExtentReports testCaseInfo(WebDriver driver, String Message, ExtentTest logger, ExtentReports report)
	{
		logger.log(LogStatus.INFO, Message);
		report.endTest(logger);
		return report;
	}

	public static void uploadFile_SetClipboardData(WebDriver driver, String string)
	{
		// StringSelection is a class that can be used for copy and paste
		// operations.
		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}

	public static void uploadFile_UploadFile1(WebDriver driver, String fileLocation)
	{
		try
		{
			// Setting clipboard with file location
			uploadFile_SetClipboardData(driver, fileLocation);
			// native key strokes for CTRL, V and ENTER keys
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
		catch (Exception exp)
		{
			exp.printStackTrace();
		}
	}

	public static String createFullScreenshot(WebDriver driver) throws IOException
	{
		String Stamp = new SimpleDateFormat("dd_MMM_yyyy_H_mm_ss").format(new Date());
		String path = "D:///FullPageScreenshot" + Stamp;
		Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
		ImageIO.write(fpScreenshot.getImage(), "PNG", new File(path + ".png"));
		return path + ".png";
	}

	public static String DateNtime(WebDriver driver)
	{
		timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()).toString();
		return timeStamp;
	}
}