package TestCases;

import Pages.HomePage;

public class SearchTitle {

	public void TC_SearchTitle() {
		HomePage HP = new HomePage();
		
		try {
			System.out.println("Searching video on youtube");
			HP.validateVisibiltyOfIcons();
			HP.searchTitle();
			HP.validateVisibiltyOfTabsAfterSearch();
		} 
		catch (Exception e) {

			e.printStackTrace();
		}
	}
}
