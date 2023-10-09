package com.qsp.Organization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrganisation {

	@FindBy (name = "accountname")
	private WebElement OrganisationNameTextField;
	
	@FindBy (css = "input[title='Save [Alt+S]']")
	private WebElement saveButton;
	
	@FindBy (name = "website")
	private WebElement websiteTextField;

	
	public CreateNewOrganisation(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getWebsiteTextField() {
		return websiteTextField;
	}

	
	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getOrganisationNameTextField() {
		return OrganisationNameTextField;
	}
	
	
}
