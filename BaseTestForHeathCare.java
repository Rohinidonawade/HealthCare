package com.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestForHeathCare {

    private WebDriver driver;
	
	public void initilizeOfWebDriver(String strURL) {
		
//	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohin\\Downloads\\eclipse-jee-2021-12-R-win32-x86_64\\github workspace\\.metadata\\.mylyn\\contexts\\HealthCare\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		this.setDriver(driver);
		driver.get("https://ebs4-qa2.simplifyhealthcare.com/");
		driver.manage().window().maximize();		
	}
	
/*	public void checkUserName() {
		getDriver().findElement(By.xpath("//input[@id='UserName']")).sendKeys("v-khushbut");
		getDriver().findElement(By.id("Password")).sendKeys("Summer@2018#");
		getDriver().findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block btn-signin']")).click();	*/	
	
	
	public void implicitlyWait() {
		getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public void tearDown() {
		getDriver().quit();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}	
}
