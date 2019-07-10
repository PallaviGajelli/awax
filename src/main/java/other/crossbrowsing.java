package other;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import net.bytebuddy.implementation.bytecode.Throw;


public class crossbrowsing {
	WebDriver driver= null;

	
	@BeforeTest
	@Parameters("BrowserName")
	public void setup(String BrowserName) {
		System.out.println("Browser name is :"+BrowserName);
		System.out.println("Thread id: "+Thread.currentThread().getId());
		
		if (BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Testing\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if (BrowserName.equalsIgnoreCase("FF")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Testing\\geckodriver-v0.24.0-win64\\geckodriver.exe");
					  driver = new FirefoxDriver(); 
			
		}else if (BrowserName.equalsIgnoreCase("IE")) {
			 System.setProperty("webdriver.ie.driver",
					  "C:\\Testing\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");  
			driver= new InternetExplorerDriver();
		}
		else if (BrowserName.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.opera.driver", "C:\\Testing\\operadriver_win64\\operadriver.exe");
			driver = new OperaDriver();
		}
		else if (BrowserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Testing\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
	}
	
	@Test
	public void test() {
		try {
		driver.get("http://dashboard.awaxgroup.co.uk/");
		}catch (Throwable e) {
		     System.out.println("error is : "+e);
		}
	}
	
//	@AfterTest
//	public void teardown() {
//		driver.close();
//	}

}
