package implementations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import implementations.TestWebDriverMethodImplementations;
import genericInterface.GenericActions;

public abstract class TestWebDriverMethodImplementations implements GenericActions{

	private static final OutputType<byte[]> BYTES = null;
	static WebDriver driver;
    private static String BASE_URL;
	private int DEFAULT_WAIT_TIME = 10;
	

	public void testWebDriverMethod(WebDriver driver)
	{
		TestWebDriverMethodImplementations.driver= driver;
		maximizeBrowser(driver);
	}

	public void setBaseURL(WebDriver driver, String BASE_URL)
	{
		driver.manage().deleteAllCookies();
		TestWebDriverMethodImplementations.BASE_URL=BASE_URL;
		get();
	}

	public WebElement findElement(WebDriver driver, By by)
	{
		return driver.findElement(by);
	}

	public void get(WebDriver driver)
	{
		driver.get(BASE_URL);
	}

	public static WebDriver getUrl(WebDriver driver, String url)
	{
		driver.get(url);
		return driver;
	}

	public void navigateUrl(WebDriver driver, String url)
	{
		driver.navigate().to(url);
	}

	public static WebDriver getDriver(WebDriver driver)
	{
		return driver;
	}

	public static String getCurrentUrl(WebDriver driver)
	{
		return driver.getCurrentUrl();
	}

	public String getPageSource(WebDriver driver)
	{
		return driver.getPageSource();
	}

	public void setImplicitWait(WebDriver driver, int defaultTimeToWait)
	{
		driver.manage().timeouts().implicitlyWait(defaultTimeToWait, TimeUnit.SECONDS);
	}

	public void quitDriver(WebDriver driver)
	{
		driver.quit();
	}

	public static WebDriver maximizeBrowser(WebDriver driver)
	{
		driver.manage().window().maximize();
		return driver;
	}

	public void zoomWindowTo100Perc(WebDriver driver)
	{
		WebElement html = driver.findElement(By.tagName("html"));
		html.sendKeys(Keys.chord(Keys.CONTROL, "0"));
	}

	public static void refresh(WebDriver driver)
	{
		driver.navigate().refresh();
	}

	public void waitForElementsToAppear(WebDriver driver, final WebElement element, final WebElement elementSecond, final WebElement elementThird)
	{
		(new WebDriverWait(driver, DEFAULT_WAIT_TIME)).until(new ExpectedCondition<Boolean>()
		{
			public Boolean apply(WebDriver d)
			{
				return (element.isDisplayed() || elementSecond.isDisplayed() || elementThird.isDisplayed());
			}
		});
	}

	public void handleScroll(WebDriver driver)
	{
		((org.openqa.selenium.JavascriptExecutor) driver).executeScript("scroll(0,1000);");
	}

	public void handleScrollByPixels(WebDriver driver, int x, int y)
	{
		((org.openqa.selenium.JavascriptExecutor) driver).executeScript("scroll(" + x + "," + y + ");");
	}

	public void selectByVisibleText(WebDriver driver, WebElement element, String visibleText)
	{
		new Select(element).selectByVisibleText(visibleText);
	}

	public void selectByValue(WebDriver driver, WebElement element, String value)
	{
		new Select(element).selectByValue(value);
	}

	public void selectByIndex(WebDriver driver, WebElement element, int index)
	{
		new Select(element).selectByIndex(index);
	}

	public WebElement getFirstSelectedOption(WebDriver driver, WebElement element)
	{
		return new Select(element).getFirstSelectedOption();
	}

	public WebElement getElementById(WebDriver driver, String Id)
	{
		return driver.findElement(By.id(Id));
	}

	public WebElement getElementByName(WebDriver driver, String Name)
	{
		return driver.findElement(By.name(Name));
	}

	public WebElement getElementByXpath(WebDriver driver, String Xpath)
	{
		return driver.findElement(By.xpath(Xpath));
	}

	public static List<WebElement> getElementsByLinkText(WebDriver driver, String linkText)
	{
		return driver.findElements(By.xpath(linkText));
	}
	public static List<WebElement> getElementsByxpath(WebDriver driver, String xpath)
	{
		return driver.findElements(By.xpath(xpath));
	}

	public int getElementsSizeByXpath(WebDriver driver, String Xpath)
	{
		return driver.findElements(By.xpath(Xpath)).size();
	}

	public List<WebElement> getAllSelectedOptions(WebDriver driver, WebElement element)
	{
		return new Select(element).getAllSelectedOptions();
	}

	public List<WebElement> getOptions(WebDriver driver, WebElement element)
	{
		return new Select(element).getOptions();
	}

	public static String getText(WebDriver driver, String element)
	{
		WebElement ele = driver.findElement(By.xpath(element));
		return ele.getText();
	}

	public String getAttribute(WebDriver driver, WebElement element, String value)
	{
		return element.getAttribute(value);
	}

	public void sleep(WebDriver driver, long timeToSleep)
	{
		try
		{
			Thread.sleep(timeToSleep);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	public void click(WebDriver driver, final WebElement element)
	{
		Actions action = new Actions(driver);
		action.click(element).perform();
	}

	public static void doubleClick(WebDriver driver, String value)
	{
		WebElement element = driver.findElement(By.xpath(value));
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	}

	public void clickForRadio(WebDriver driver, final WebElement element)
	{
		element.click();
		if (!element.isSelected())
		{
			Actions action = new Actions(driver);
			action.click(element).perform();
		}
	}

	public void moveToElement(WebDriver driver, WebElement element)
	{
		new Actions(driver).moveToElement(element).perform();
	}

	public byte[] getScreenshot(WebDriver driver)
	{
		return ((TakesScreenshot) driver).getScreenshotAs(BYTES);
	}

	public void scrollToElement(WebDriver driver, WebElement elementToClick)
	{
		// Scroll the browser to the element's Y position
		((org.openqa.selenium.JavascriptExecutor) driver).executeScript(String.format("window.scrollTo(0, %s);", elementToClick.getLocation().getY()));
	}

	public static void closeBrowser(WebDriver driver)
	{
		driver.close();
	}

	public static void switchWindow(WebDriver driver)
	{
		String base = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		set.remove(base);
		if (set.size() >= 1)
		{
			driver.switchTo().window((String) set.toArray()[0]);
		}
		
	}
	public static void switchWindow_CloseParentWindow(WebDriver driver)
	{
		String mainWindow=driver.getWindowHandle();
		 // It returns no. of windows opened by WebDriver and will return Set of Strings
		 Set<String> set =driver.getWindowHandles();
		 // Using Iterator to iterate with in windows
		 Iterator<String> itr= set.iterator();
		 while(itr.hasNext()){
		 String childWindow=itr.next();
		    // Compare whether the main windows is not equal to child window. If not equal, we will close.
		 if(!mainWindow.equals(childWindow)){
		 driver.switchTo().window(childWindow);
		 System.out.println(driver.switchTo().window(childWindow).getTitle());
		 driver.switchTo().window(mainWindow);
		 driver.close();
		 driver.switchTo().window(childWindow);
		 }
		 }
		 
	}
	
	public static void switchDefaultWindow(WebDriver driver)
	{
			driver.switchTo().defaultContent();
	}

	public Boolean switchWindowByTitle(WebDriver driver, String title)
	{
		String currentWindow = driver.getWindowHandle();
		List<String> availableWindows = new ArrayList<String>(driver.getWindowHandles());
		for (String w : availableWindows)
		{
			if (w != currentWindow)
			{
				driver.switchTo().window(w);
				if (driver.getTitle().equalsIgnoreCase(title))
					return true;
				else
				{
					driver.switchTo().window(currentWindow);
				}
			}
		}
		return false;
	}

	public void switchToFrame(WebDriver driver, int index)
	{
		if (index == -1)
		{
			driver.switchTo().defaultContent();
		} else
		{
			driver.switchTo().frame(index);
		}
	}

	public static void syncSleep(WebDriver driver)
	{
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	public static void smallSleep(WebDriver driver)
	{
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	public static void mediumSleep(WebDriver driver)
	{
		try
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	public static void longSleep(WebDriver driver)
	{
		try
		{
			Thread.sleep(10000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	public static void highlightElement(WebDriver driver, String Val)
	{
		TestWebDriverMethodImplementations.smallSleep(driver);
		WebElement ele = driver.findElement(By.xpath(Val));
		// Create object of a JavascriptExecutor interface
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// use executeScript() method and pass the arguments
		// Here i pass values based on css style. Yellow background color with
		// solid red color border.
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid green;');", ele);
		String val=ele.getText();
		System.out.println("Available element text is: "+ val);
	}
	public static void mouseHoverToElement(WebDriver driver, String Val)
	{
		WebElement element=driver.findElement(By.xpath(Val));
		Actions action=new Actions(driver);
		action.moveToElement(element);
	}
	public static void assertEquals(WebDriver driver, String Val,String Testdata)
	{
		String element=driver.findElement(By.xpath(Val)).getText();
		Assert.assertEquals(element, Testdata);
	}
	public static void alertAccept(WebDriver driver)
	{
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public static void clearText(WebDriver driver,String val)
	{
		try{
		WebElement element=driver.findElement(By.xpath(val));
		element.clear();
		}
		catch(Exception e2)
		{
			throw e2;
		}
		
	}
	public void verifyBoolean(WebDriver driver, final String element)
	{
		Boolean ele=driver.findElement(By.xpath(element)).isEnabled();
		
		
	}
	public static Boolean verifyisDisplayed(WebDriver driver, String element)
	{
		boolean ele=driver.findElement(By.xpath(element)).isDisplayed();
		return ele;
		
	}
	
	
}
