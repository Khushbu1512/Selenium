package Pages;

import Common.BasePage;
import PageObjects.HomePageObjects;

public class HomePage extends BasePage{

	HomePageObjects HomePO;

	public HomePage() {
		HomePO= new HomePageObjects();
	}

	public void searchTitle() {
		try {
			HomePO.searchBox.click();
			HomePO.searchBox.sendKeys("automation testing");
			HomePO.searchButton.click();
			Thread.sleep(5000);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void validateVisibiltyOfIcons() {
		try {
			waitUntilElementIsVisible(HomePO.icon_Guide);
			elementIsVisible(HomePO.icon_Guide,"Guide icon is visible");
			elementIsVisible(HomePO.icon_YouTube,"YouTube icon is visible");
			elementIsVisible(HomePO.icon_Home,"Home icon is visible");
			elementIsVisible(HomePO.icon_Shorts,"Shorts icon is visible");
			//elementIsVisible(HomePO.icon_Subscriptions,"Subscriptions icon is visible");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void validateVisibiltyOfTabsAfterSearch() {
		try {
			waitUntilElementIsVisible(HomePO.tabs("Shorts"));
			elementIsVisible(HomePO.tabs("Shorts"),"Shorts icon is visible");
			elementIsVisible(HomePO.tabs("Videos"),"Videos icon is visible");
//			elementIsVisible(HomePO.icon_Home,"Home icon is visible");
//			elementIsVisible(HomePO.icon_Shorts,"Shorts icon is visible");
//			elementIsVisible(HomePO.icon_Subscriptions,"Subscriptions icon is visible");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
