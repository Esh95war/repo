package com.qsp.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy (name="user_name")
	private WebElement usernameTextBox;
	
	@FindBy (name="user_password")
	private WebElement passwardTextBox;
	
	@FindBy (id="submitButton")
	private WebElement loginButton;
	
	@FindBy (xpath = "//a[text()='Sign Out']")
	private WebElement logoutButton;

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getUsernameTextBox() {
		return usernameTextBox;
	}

	public WebElement getPasswardTextBox() {
		return passwardTextBox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
}
