package objectRepository;

import org.openqa.selenium.WebDriver;

public class registration_obj {
	
	public static String validate_Account(WebDriver driver)
	{
		String val = "//span[@id='user-name']";
		return val;
	}
	
	public static String clickOn_AnniversaryFlowers(WebDriver driver)
	{
		String val = "//a[text()='Anniversary Flowers']";
		return val;
	}
	
	public static String sendKeys_Areatextbox(WebDriver driver)
	{
		String val = "//input[@id='destlookup']";
		return val;
	}

}
