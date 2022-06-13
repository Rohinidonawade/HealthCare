package com.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends com.generic.BaseTestForHeathCare{
	
	By notification = By.xpath("//div[@id='messages']");
	By portFoliaPage = By.xpath("//div[@class='cardpanel']");
	By portFolioProductBuild = By.xpath("//a[@class='PortFolioProductBuild ui-tabs-anchor']");
	By portFolioPackageBuild = By.xpath("//a[@class='PortFolioPackageBuild ui-tabs-anchor']");
	By eBSConfig = By.xpath("//div[@class='bluetext']");
	By quotes = By.xpath("//div[@class='col-sm-12 pl-0 pr-0 pb10 pt10 brdrbtm']");
    By QuotesSelectForFilter = By.xpath("//select[@id='drpsearchTypeFilter']");
    By QuotesSelectForModeLoad = By.xpath("//select[@id='drpViewModeLoad']");
    By QuotesSearchButton = By.xpath("//button[@id='switchToadvanceSearch']");
    By QuotesSearch = By.xpath("//input[@class='search-field']");
    By QuotesAccount = By.xpath("//button[@id='btnManageAccountAdd']");
    By QuotesAccountName = By.xpath("//input[@id='accountname']");
    By QuotesAccountSave = By.xpath("//button[@id='accountname']");

	public void checkNotificatin() {
		getDriver().findElement(notification).click();
	}
	
	public void checkPortFolio() {
		getDriver().findElement(portFoliaPage).click();
	}
	public void checkinsidePortFolioProductBuild() {
		Actions actions = new Actions(getDriver());
	    WebElement element=	getDriver().findElement(portFolioProductBuild);
	    element.click();
	    actions.moveToElement(element);
	}
	public void checkinsidePortFolioPackageBuild() {
		getDriver().findElement(portFolioPackageBuild).click();
	}
	
	public void checkebsConfigPortPolio() {
		getDriver().findElement(eBSConfig).click();		
	}
	
	public void checkQuotes() {
		getDriver().findElement(quotes).click();
	}
	
	public void selectQuotes() {
	WebElement element = getDriver().findElement(QuotesSelectForFilter);
	Select selectFilter = new Select(element);
	selectFilter.selectByVisibleText("Account");  
	}
	
	public void selectQuotesForModeLoad() {
		WebElement element = getDriver().findElement(QuotesSelectForModeLoad);
		Select selectLoad = new Select(element);
		selectLoad.selectByVisibleText("Summary");
   }
	
	public void checkSearchButton() {
		getDriver().findElement(QuotesSearchButton).click();
	
		WebElement elementSearch = getDriver().findElement(QuotesSearch);
		elementSearch.sendKeys("Search_inf");
		elementSearch.click();
	}
	
	public void createAccount() {
		getDriver().findElement(QuotesAccount).click();
		
		getDriver().findElement(QuotesAccountName).sendKeys("Name");
		
		getDriver().findElement(QuotesAccountSave).click();

	}
}

		
		
	
	
	
	
	


