package other;

import java.util.Iterator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class allLinksOnPage {

	public static WebDriver driver = null;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Drivers\\Selenium\\chromedriver_win32\\chromedriver.exe");
		String homePage = "http://www.zlti.com";
		String url = "";
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(homePage);

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		Iterator<WebElement> it = allLinks.iterator();

		url = it.next().getAttribute("href");

		while (it.hasNext()) {

			url = it.next().getAttribute("href");

			System.out.println(url);

		}

	}
}
