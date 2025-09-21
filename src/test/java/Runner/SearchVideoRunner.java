package Runner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Common.BasePage;
import TestCases.SearchTitle;

public class SearchVideoRunner {



	@BeforeTest
	public void startTest() throws Exception {
		BasePage.instantiateWebBrowser();
	}

	@Test
	public void Test() {
		SearchTitle objTC = new SearchTitle();
		objTC.TC_SearchTitle();
	}

	@AfterTest
	public void endTest() {
		BasePage.quitBroswer();
	}

}
