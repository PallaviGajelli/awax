package implementations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import genericInterface.GenericActions;

public abstract class ActionsImplementation implements GenericActions{
	static WebElement element;
	static WebDriver driver;

	// This method is to click element with any locator types
	public static void clickOnLocator(WebDriver driver, String locatorType, String[] locatorValue)
	{
		int Locators = locatorValue.length, i = 0;
		boolean isActionPerformed = false;
		for (String val : locatorValue)
		{
			if (!isActionPerformed)
			{
				i++;
				switch (locatorType)
				{
				case "id":
					if (val != null)
					{
						try
						{
							WebDriverWait wait = new WebDriverWait(driver, 20);
							TestWebDriverMethodImplementations.syncSleep(driver);
							By ele = By.id(val);
							WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(ele));
							element = driver.findElement(By.id(val));
							try
							{
								TestWebDriverMethodImplementations.syncSleep(driver);
								element.click();
								isActionPerformed = true;
								break;
							}
							catch (Exception e)
							{
								try
								{
									TestWebDriverMethodImplementations.syncSleep(driver);
									JavascriptExecutor jse = (JavascriptExecutor) driver;
									jse.executeScript("arguments[0].click()", element);
									// Java Script
									isActionPerformed = true;
									break;
								}
								catch (Exception e1)
								{
									TestWebDriverMethodImplementations.syncSleep(driver);
									Actions action = new Actions(driver);
									element.click();
									action.build().perform();
									// Actions
									isActionPerformed = true;
									break;
								}
							}
						}
						catch (Exception e2)
						{
							if (i == Locators)
							{
								throw e2;
							}
						}
					}
					break;
				case "name":
					if (val != null)
					{
						try
						{
							element = driver.findElement(By.name(val));
							try
							{
								TestWebDriverMethodImplementations.syncSleep(driver);
								element.click();
								isActionPerformed = true;
								break;
							}
							catch (Exception e)
							{
								try
								{
									TestWebDriverMethodImplementations.syncSleep(driver);
									JavascriptExecutor jse = (JavascriptExecutor) driver;
									jse.executeScript("arguments[0].click()", element);
									// Java Script
									isActionPerformed = true;
									break;
								}
								catch (Exception e1)
								{
									TestWebDriverMethodImplementations.syncSleep(driver);
									Actions action = new Actions(driver);
									element.click();
									action.build().perform();
									// Actions
									isActionPerformed = true;
									break;
								}
							}
						}
						catch (Exception e2)
						{
							if (i == Locators)
							{
								throw e2;
							}
						}
					}
					break;
				case "xpath":
					if (val != null)
					{
						try
						{
							TestWebDriverMethodImplementations.syncSleep(driver);
							WebDriverWait wait = new WebDriverWait(driver, 20);
							TestWebDriverMethodImplementations.syncSleep(driver);
							By ele = By.xpath(val);
							WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(ele));
							try
							{
								TestWebDriverMethodImplementations.syncSleep(driver);
								element.click();
								isActionPerformed = true;
								break;
							}
							catch (Exception e)
							{
								try
								{
									TestWebDriverMethodImplementations.syncSleep(driver);
									JavascriptExecutor jse = (JavascriptExecutor) driver;
									jse.executeScript("arguments[0].click()", element);
									// Java Script
									isActionPerformed = true;
									break;
								}
								catch (Exception e1)
								{
									TestWebDriverMethodImplementations.syncSleep(driver);
									Actions action = new Actions(driver);
									element.click();
									action.build().perform();
									// Actions
									isActionPerformed = true;
									break;
								}
							}
						}
						catch (Exception e2)
						{
							if (i == Locators)
							{
								throw e2;
							}
						}
					}
					break;
				case "css":
					if (val != null)
					{
						try
						{
							element = driver.findElement(By.cssSelector(val));
							try
							{
								TestWebDriverMethodImplementations.syncSleep(driver);
								element.click();
								isActionPerformed = true;
								break;
							}
							catch (Exception e)
							{
								try
								{
									TestWebDriverMethodImplementations.syncSleep(driver);
									JavascriptExecutor jse = (JavascriptExecutor) driver;
									jse.executeScript("arguments[0].click()", element);
									// Java Script
									isActionPerformed = true;
									break;
								}
								catch (Exception e1)
								{
									TestWebDriverMethodImplementations.syncSleep(driver);
									Actions action = new Actions(driver);
									element.click();
									action.build().perform();
									// Actions
									isActionPerformed = true;
									break;
								}
							}
						}
						catch (Exception e2)
						{
							if (i == Locators)
							{
								throw e2;
							}
						}
					}
					break;
				case "linkText":
					if (val != null)
					{
						try
						{
							element = driver.findElement(By.linkText(val));
							try
							{
								TestWebDriverMethodImplementations.syncSleep(driver);
								element.click();
								isActionPerformed = true;
								break;
							}
							catch (Exception e)
							{
								try
								{
									TestWebDriverMethodImplementations.syncSleep(driver);
									JavascriptExecutor jse = (JavascriptExecutor) driver;
									jse.executeScript("arguments[0].click()", element);
									// Java Script
									isActionPerformed = true;
									break;
								}
								catch (Exception e1)
								{
									TestWebDriverMethodImplementations.syncSleep(driver);
									Actions action = new Actions(driver);
									element.click();
									action.build().perform();
									// Actions
									isActionPerformed = true;
									break;
								}
							}
						}
						catch (Exception e2)
						{
							if (i == Locators)
							{
								throw e2;
							}
						}
					}
					break;
				case "partialLinkText":
					if (val != null)
					{
						try
						{
							element = driver.findElement(By.partialLinkText(val));
							try
							{
								TestWebDriverMethodImplementations.syncSleep(driver);
								element.click();
								isActionPerformed = true;
								break;
							}
							catch (Exception e)
							{
								try
								{
									TestWebDriverMethodImplementations.syncSleep(driver);
									JavascriptExecutor jse = (JavascriptExecutor) driver;
									jse.executeScript("arguments[0].click()", element);
									// Java Script
									isActionPerformed = true;
									break;
								}
								catch (Exception e1)
								{
									TestWebDriverMethodImplementations.syncSleep(driver);
									Actions action = new Actions(driver);
									element.click();
									action.build().perform();
									// Actions
									isActionPerformed = true;
									break;
								}
							}
						}
						catch (Exception e2)
						{
							if (i == Locators)
							{
								throw e2;
							}
						}
					}
					break;
				} // switch
			} // if
		} // for
	}

	// This method is to sendKeys to element with any locator type
	public static void sendKeysLocator(WebDriver driver, String locatorType, String[] locatorValue, String testData)
	{
		int Locators = locatorValue.length, i = 0;
		// System.out.println(Locators);
		boolean isActionPerformed = false;
		for (String val : locatorValue)
		{
			if (!isActionPerformed)
			{
				i++;
				switch (locatorType)
				{
				case "id":
					if (val != null)
					{
						try
						{
							WebDriverWait wait = new WebDriverWait(driver, 20);
							TestWebDriverMethodImplementations.syncSleep(driver);
							WebElement element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(val))));
							try
							{
								TestWebDriverMethodImplementations.syncSleep(driver);
								element.sendKeys(testData);
								isActionPerformed = true;
								break;
							}
							catch (Exception e)
							{
								try
								{
									TestWebDriverMethodImplementations.syncSleep(driver);
									JavascriptExecutor jse = (JavascriptExecutor) driver;
									jse.executeScript("arguments[0].sendKeys()", element);
									// Java Script
									isActionPerformed = true;
									break;
								}
								catch (Exception e1)
								{
									TestWebDriverMethodImplementations.syncSleep(driver);
									Actions action = new Actions(driver);
									element.sendKeys(testData);
									action.build().perform();
									// Actions
									isActionPerformed = true;
									break;
								}
							}
						}
						catch (Exception e3)
						{
						}
					}
					break;
				case "name":
					if (val != null)
					{
						try
						{
							element = driver.findElement(By.name(val));
							try
							{
								TestWebDriverMethodImplementations.syncSleep(driver);
								element.sendKeys(testData);
								isActionPerformed = true;
								break;
							}
							catch (Exception e)
							{
								try
								{
									TestWebDriverMethodImplementations.syncSleep(driver);
									JavascriptExecutor jse = (JavascriptExecutor) driver;
									jse.executeScript("arguments[0].sendKeys()", element);
									// Java Script
									isActionPerformed = true;
									break;
								}
								catch (Exception e1)
								{
									TestWebDriverMethodImplementations.syncSleep(driver);
									Actions action = new Actions(driver);
									element.sendKeys(testData);
									action.build().perform();
									// Actions
									isActionPerformed = true;
									break;
								}
							}
						}
						catch (Exception e2)
						{
						}
					}
					break;
				case "xpath":
					if (val != null)
					{
						try
						{
							WebDriverWait wait = new WebDriverWait(driver, 20);
							TestWebDriverMethodImplementations.syncSleep(driver);
							WebElement element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(val))));
							try
							{
								TestWebDriverMethodImplementations.syncSleep(driver);
								element.sendKeys(testData);
								isActionPerformed = true;
								break;
							}
							catch (Exception e)
							{
								try
								{
									TestWebDriverMethodImplementations.syncSleep(driver);
									JavascriptExecutor jse = (JavascriptExecutor) driver;
									jse.executeScript("arguments[0].sendKeys()", element);
									// Java Script
									isActionPerformed = true;
									break;
								}
								catch (Exception e1)
								{
									TestWebDriverMethodImplementations.syncSleep(driver);
									Actions action = new Actions(driver);
									element.sendKeys(testData);
									action.build().perform();
									// Actions
									isActionPerformed = true;
									break;
								}
							}
						}
						catch (Exception e2)
						{
							if (i == Locators)
							{
								throw e2;
							}
						}
					}
					break;
				case "css":
					if (val != null)
					{
						try
						{
							element = driver.findElement(By.cssSelector(val));
							try
							{
								TestWebDriverMethodImplementations.syncSleep(driver);
								element.sendKeys(testData);
								isActionPerformed = true;
								break;
							}
							catch (Exception e)
							{
								try
								{
									TestWebDriverMethodImplementations.syncSleep(driver);
									JavascriptExecutor jse = (JavascriptExecutor) driver;
									jse.executeScript("arguments[0].sendKeys()", element);
									// Java Script
									isActionPerformed = true;
									break;
								}
								catch (Exception e1)
								{
									TestWebDriverMethodImplementations.syncSleep(driver);
									Actions action = new Actions(driver);
									element.sendKeys(testData);
									action.build().perform();
									// Actions
									isActionPerformed = true;
									break;
								}
							}
						}
						catch (Exception e2)
						{
						}
					}
					break;
				case "linkText":
					if (val != null)
					{
						try
						{
							element = driver.findElement(By.linkText(val));
							try
							{
								TestWebDriverMethodImplementations.syncSleep(driver);
								element.sendKeys(testData);
								isActionPerformed = true;
								break;
							}
							catch (Exception e)
							{
								try
								{
									TestWebDriverMethodImplementations.syncSleep(driver);
									JavascriptExecutor jse = (JavascriptExecutor) driver;
									jse.executeScript("arguments[0].sendKeys()", element);
									// Java Script
									isActionPerformed = true;
									break;
								}
								catch (Exception e1)
								{
									TestWebDriverMethodImplementations.syncSleep(driver);
									Actions action = new Actions(driver);
									element.sendKeys(testData);
									action.build().perform();
									// Actions
									isActionPerformed = true;
									break;
								}
							}
						}
						catch (Exception e2)
						{
						}
					}
					break;
				case "partialLinkText":
					if (val != null)
					{
						try
						{
							element = driver.findElement(By.partialLinkText(val));
							try
							{
								TestWebDriverMethodImplementations.syncSleep(driver);
								element.sendKeys(testData);
								isActionPerformed = true;
								break;
							}
							catch (Exception e)
							{
								try
								{
									TestWebDriverMethodImplementations.syncSleep(driver);
									JavascriptExecutor jse = (JavascriptExecutor) driver;
									jse.executeScript("arguments[0].sendKeys()", element);
									// Java Script
									isActionPerformed = true;
									break;
								}
								catch (Exception e1)
								{
									TestWebDriverMethodImplementations.syncSleep(driver);
									Actions action = new Actions(driver);
									element.sendKeys(testData);
									action.build().perform();
									// Actions
									isActionPerformed = true;
									break;
								}
							}
						}
						catch (Exception e2)
						{
						}
					}
					break;
				} // switch
			} // if
		} // for
	}
}
