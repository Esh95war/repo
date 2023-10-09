package com.qsp.Organization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {

	@FindBy (css = "img[title='Create Organization...']")
	private WebElement createCustomerButton;
	
	public OrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getCreateCustomerButton() {
		return createCustomerButton;
	}
	
	
}
