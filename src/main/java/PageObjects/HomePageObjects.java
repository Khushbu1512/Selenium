package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common.BasePage;

public class HomePageObjects extends BasePage{

	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//button[text()='Continue shopping']")
	public WebElement btn_ContinueShopping;
	
	@FindBy(xpath="//input[@class='ytSearchboxComponentInput yt-searchbox-input title']")
	public WebElement searchBox;
	
	@FindBy(xpath="//button[@class='ytSearchboxComponentSearchButton']")
	public WebElement searchButton;
	
	@FindBy(xpath="//button[@aria-label='Guide']")
	public WebElement icon_Guide;
	
	@FindBy(xpath="//ytd-topbar-logo-renderer[@class='style-scope ytd-masthead']")
	public WebElement icon_YouTube;
	
	@FindBy(xpath="//a[@role='link' and @title='Home']")
	public WebElement icon_Home;
	
	@FindBy(xpath="//a[@role='link' and @title='Shorts']")
	public WebElement icon_Shorts;
	
	@FindBy(xpath="//a[@role='link' and @aria-label='Subscriptions. New content available.']")
	public WebElement icon_Subscriptions;
	
	public WebElement tabs(String tab) {
		WebElement ele = driver.findElement(By.xpath("//div[text()='"+tab+"']"));
		return ele;
	}
}
