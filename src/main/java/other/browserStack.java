package other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class browserStack {
	
	  public static final String USERNAME = "pallavi149"; 
	  public static final String AUTOMATE_KEY = "HrrL43G88RUVVBqa69s3";
      public static final String URL= "https://" + USERNAME + ":" + AUTOMATE_KEY +
	  "@hub-cloud.browserstack.com/wd/hub";
	 
	  
	  @Test
	  public static void test() throws Exception {

		    DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("browserName", "iPhone");
		    caps.setCapability("device", "iPhone 8 Plus");
		    caps.setCapability("realMobile", "true");
		    caps.setCapability("os_version", "11");
		   // caps.setCapability("name", "Bstack-[Java] Sample Test");

		    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		    driver.get("http://dashboard.awaxgroup.co.uk/");
		    Thread.sleep(3000);
		    

		    System.out.println(driver.getTitle());
		    //driver.quit();

		  }
}
