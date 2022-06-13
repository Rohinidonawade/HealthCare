package com.pageFactory;

import org.openqa.selenium.By;

import com.generic.BaseTestForHeathCare;

public class LoginPage extends BaseTestForHeathCare{
	
	By name = By.xpath("//input[@id='UserName']");
	By password = By.id("Password");
	By submit = By.xpath("//button[@class='btn btn-lg btn-primary btn-block btn-signin']");  
	
	public void checkUserName(String strUserName) {
    	getDriver().findElement(name).sendKeys(strUserName);		
	}
	
	public void checkUserPassword(String strPassword) {
		getDriver().findElement(password).sendKeys(strPassword);		
	}
	
	public void submitButton() {
		getDriver().findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block btn-signin']")).click();		
	}
}
