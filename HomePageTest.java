package com.testHealthCare;

import com.generic.BaseTestForHeathCare;
import com.pageFactory.HomePage;

public class HomePageTest extends BaseTestForHeathCare{

	
	public static void main(String[] args) {

		HomePage objHomePage = new HomePage();
		objHomePage.checkNotificatin();
	    objHomePage.checkPortFolio();
	    objHomePage.checkinsidePortFolioProductBuild();
	    objHomePage.checkinsidePortFolioPackageBuild();
	    objHomePage.checkebsConfigPortPolio();
	    objHomePage.checkQuotes();
	    objHomePage.selectQuotes();
	    objHomePage.selectQuotesForModeLoad();
	    objHomePage.checkSearchButton();
	    objHomePage.createAccount();
	}
}
