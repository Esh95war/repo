package com.qsp.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy (xpath = "//a[text()='Calendar']")
	private WebElement calenderButton;
	
	@FindBy (xpath = "//a[text()='Leads']")
	private WebElement leadsButton;
	
	public WebElement getAdministratorHover() {
		return administratorHover;
	}

	@FindBy (xpath = "//a[text()='Organizations']")
	private WebElement organizationButton;
	
	@FindBy (xpath = "//a[text()='Contacts']")
	private WebElement contactsButton;
	
	@FindBy (xpath = "//a[text()='Opportunities']")
	private WebElement opportunitiesButton;
	
	@FindBy (xpath = "(//td[@class='small' and @valign='bottom'])[1]")
	private WebElement administratorHover;

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getCalenderButton() {
		return calenderButton;
	}

	public WebElement getLeadsButton() {
		return leadsButton;
	}

	public WebElement getOrganizationButton() {
		return organizationButton;
	}

	public WebElement getContactsButton() {
		return contactsButton;
	}

	public WebElement getOpportunitiesButton() {
		return opportunitiesButton;
	}
	
	
}
