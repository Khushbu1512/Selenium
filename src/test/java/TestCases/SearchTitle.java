package TestCases;

import Pages.HomePage;

public class SearchTitle {

	public void TC_SearchTitle() {
		HomePage HP = new HomePage();
		
		HP.validateVisibiltyOfIcons();
		HP.searchTitle();
		HP.validateVisibiltyOfTabsAfterSearch();
	}
}
