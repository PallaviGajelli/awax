package other;

import java.lang.reflect.Method;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SourceLab {
	private WebDriver driver;
	 
	@Parameters({"username", "key", "browser", "browserVersion"})
	@BeforeMethod
	public void setUp(@Optional("yourusername") String username,
	                    @Optional("youraccesskey") String key,
	                     @Optional("iphone") String browser,
	                     @Optional("5.0") String browserVersion,
	                     Method method) throws Exception {
	 
	// Choose the browser, version, and platform to test
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setBrowserName(browser);
	capabilities.setCapability("version", browserVersion);
	capabilities.setCapability("platform", Platform.MAC);
	capabilities.setCapability("name", method.getName());
	// Create the connection to SauceLabs to run the tests
	this.driver = new RemoteWebDriver(
	new URL("http://" + username + ":" + key + "@ondemand.saucelabs.com:80/wd/hub"), capabilities);
	}
	 
	@Test
	public void Selenium_Essentials() throws Exception {
	   // Make the browser get the page and check its title
	driver.get("http://www.google.com");
	System.out.println("Page title is: " + driver.getTitle());
	Assert.assertEquals("Google", driver.getTitle());
	WebElement element = driver.findElement(By.name("q"));
	element.sendKeys("Selenium Essentials");
	element.submit();
	Thread.sleep(4000);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
	driver.quit();
	}
	}
