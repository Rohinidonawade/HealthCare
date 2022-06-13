package com.testHealthCare;

import com.generic.BaseTestForHeathCare;
import com.pageFactory.LoginPage;

public class TestLoginPage extends BaseTestForHeathCare{

	public static void main(String[] args) {
		
		LoginPage objLoginPage = new LoginPage();
		objLoginPage.checkUserName("v-khushbut");
        objLoginPage.checkUserPassword("Summer@2018#");
        objLoginPage.submitButton();
	}

}
