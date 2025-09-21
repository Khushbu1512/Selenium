package Common;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class BasePage {

	public static WebDriver driver;
	
	public BasePage() {
		
	}
	
	public static void instantiateWebBrowser() throws Exception
	{
	 driver = new ChromeDriver();
	 driver.get("https://www.youtube.com");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5000));
	}
	
	public static void waitUntilElementIsVisible(WebElement element) throws Exception
	{
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	 wait.until(ExpectedConditions.visibilityOf(element));
	 
	}
	
	public static void elementIsVisible(WebElement element, String message) throws Exception
	{
	Assert.assertEquals(element.isDisplayed(), true, message);
	 
	}
	
	public static void quitBroswer() {		
		driver.quit();
	}
}
