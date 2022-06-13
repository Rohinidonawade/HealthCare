package com.testHealthCare;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.generic.BaseTestForHeathCare;
import com.pageFactory.HomePage;
import com.pageFactory.LoginPage;

public class TestHeathCare extends BaseTestForHeathCare{

   private LoginPage objLoginPage;
   private HomePage objHomePage;
		
		public void initializeOfTheEnv() {
		objLoginPage = new LoginPage();
		objHomePage = new HomePage();
	}
		@BeforeClass
		public void checkLoginPage() {
		this.initilizeOfWebDriver("https://ebs4-qa2.simplifyhealthcare.com/");
		this.initializeOfTheEnv();
		
		}
		@Test
		public void checkTheLoginPage() {
		objLoginPage.checkUserName("v-khushbut");
        objLoginPage.checkUserPassword("Summer@2018#");
        objLoginPage.submitButton();
        
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
