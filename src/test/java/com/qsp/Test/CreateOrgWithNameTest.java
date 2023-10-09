package com.qsp.Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.qsp.GeneralUtil.BaseClass;
import com.qsp.GeneralUtil.ExcelUtils;
import com.qsp.GeneralUtil.JavaUtil;
import com.qsp.HomePage.HomePage;
import com.qsp.Organization.CreateNewOrganisation;
import com.qsp.Organization.OrganizationPage;

public class CreateOrgWithNameTest extends BaseClass {

	@Test
	public void tc() throws Throwable
	{
		hp=new HomePage(driver);
		op=new OrganizationPage(driver);
		cno=new CreateNewOrganisation(driver);
		ja=new JavaUtil();
		ex=new ExcelUtils();
		
		hp.getOrganizationButton().click();
		op.getCreateCustomerButton().click();
		Thread.sleep(3000);
		cno.getOrganisationNameTextField().sendKeys("Tiger");
		cno.getSaveButton().click();
			
	}
}
