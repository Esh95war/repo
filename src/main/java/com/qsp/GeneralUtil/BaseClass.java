package com.qsp.GeneralUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.qsp.HomePage.HomePage;
import com.qsp.LoginPage.LoginPage;
import com.qsp.Organization.CreateNewOrganisation;
import com.qsp.Organization.OrganizationPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	
	public ExcelUtils ex;
	public JavaUtil ja;
	public PropertyUtil pu;
	public WebDriverUtil wb;
	public LoginPage lp;
	public HomePage hp;
	public OrganizationPage op;
	public CreateNewOrganisation cno;
	
	@BeforeClass
	public void openApp()
	{
		pu=new PropertyUtil();
		wb=new WebDriverUtil();
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		wb.maximizeBrowser(driver);
		wb.implicitWait(driver, 10);
		wb.openApp(driver, pu.propertyFetch(Iconstant.vtigerPropertypath,"url"));
	}
	
	@BeforeMethod
	public void login()
	{
		pu=new PropertyUtil();
		lp=new LoginPage(driver);
		
		lp.getUsernameTextBox().sendKeys(pu.propertyFetch(Iconstant.vtigerPropertypath, "un"));
		lp.getPasswardTextBox().sendKeys(pu.propertyFetch(Iconstant.vtigerPropertypath, "pwd"));
		lp.getLoginButton().click();
	}
	
	@AfterMethod
	public void logout() throws Throwable
	{
		lp=new LoginPage(driver);
		hp=new HomePage(driver);
		wb=new WebDriverUtil();
		
		
		Thread.sleep(3000);
		wb.moveTheCrossor(driver, hp.getAdministratorHover());
		lp.getLogoutButton().click();
		
	}
	
	@AfterClass
	public void closeApp()
	{
		driver.close();
	}
}
