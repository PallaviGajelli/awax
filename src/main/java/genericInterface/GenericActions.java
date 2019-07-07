package genericInterface;

public interface GenericActions {
	
	// Send text to text box
			public void sendKeysLocator();

			// Perform click action
			public void clickOnLocator();

			// Before Test Methods
			public void breforeTest_PreRequesite_BeforeTestSetup();

			public void breforeTest_PreRequesite_PostBrowserLaunch();

			// Browser Selection methods
			public void browserSelection_Browser();

			public void browserSelection_GetParameter();

			// Reading Excel File
			public void excelDataConfig();

			// File Reading
			public void fileReader();

			// Random String Methods
			public void randomString();

			public void randomString_Int();

			public void random_Alpha_String();

			public void random_Alpha_Numeric();

			// Screenshot method
			public void createScreenshot();

			public void createFullScreenshot();

			// Test case status
			public void testCaseStatus_Pass();

			public void testCaseStatus_Fail();

			// Upload File
			public void uploadFile_SetClipboardData();

			public void uploadFile_UploadFile1();

			// WebDriver methods
			public void testWebDriverMethod();

			public void setBaseURL();

			public void findElement();

			public void get();

			public void getUrl();

			public void navigateUrl();

			public void getDriver();

			public void getCurrentUrl();

			public String getPageSource();

			public void setImplicitWait();

			public void quitDriver();

			public void maximizeBrowser();

			public void zoomWindowTo100Perc();

			public void refresh();

			public void waitForElementsToAppear();

			public void handleScroll();

			public void handleScrollByPixels();

			public void selectByVisibleText();

			public void selectByValue();

			public void selectByIndex();

			public void getFirstSelectedOption();

			public void getElementById();

			public void getElementByName();

			public void getElementByXpath();

			public void getElementsByXpath();

			public void getElementsByLinkText();

			public void getElementsSizeByXpath();

			public void getSelectedOptionDefault();

			public void getAllSelectedOptions();

			public void getOptions();

			public void getText();

			public void getAttribute();

			public void sleep();

			public void click();

			public void clickForRadio();

			public void moveToElement();

			public byte[] getScreenshot();

			public void scrollToElement();

			public void closeBrowser();

			public void switchWindow();

			public void switchWindowByTitle();

			public void switchToFrame();

			public void syncSleep();

			public void smallSleep();

			public void mediumSleep();

			public void longSleep();

			// Event Listners methods
			public void beforeAlertAccept();

			public void afterAlertAccept();

			public void afterAlertDismiss();

			public void afterChangeValueOf();

			public void afterClickOn();

			public void afterFindBy();

			public void afterNavigateBack();

			public void afterNavigateForward();

			public void afterNavigateTo();

			public void afterScript();

			public void beforeChangeValueOf();

			public void beforeClickOn();

			public void beforeFindBy();

			public void beforeNavigateBack();

			public void beforeNavigateForward();

			public void beforeNavigateTo();

			public void beforeScript();

			public void onException();

			// Sikuli methods
			public void clickOnElement();

			public void rightClickOnElement();

			public void findAnElement();

			public void doubleClickOnElement();

			public void checkAnElementPresent();

			public void sendKeysToElement();

			public void wheelingAction();

			public void dragAndDrop();

			public void rollHover();

			public void pasteCopiedString();

			// OCR Methods for reading text from image
			public String crackImage(String filePath);

			public String readStringFromWebpageImage();

			// API Validations
			public void api_Validations();

			// DB Validations
			public void db_Validations();

			// Client Notifications
			public void sendMail();

			public void sms();

			// Bug Posting
			public void bugPost();

			// TimeStamp
			public void timeStamp();

			// Log4j to generate log reports
			public void logReport();
			
			// Upload image
			public void uploadImage();

}
