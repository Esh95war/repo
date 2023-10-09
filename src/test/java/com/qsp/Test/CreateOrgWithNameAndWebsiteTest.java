package com.qsp.Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qsp.GeneralUtil.BaseClass;
import com.qsp.GeneralUtil.ExcelUtils;
import com.qsp.GeneralUtil.Iconstant;
import com.qsp.GeneralUtil.JavaUtil;
import com.qsp.HomePage.HomePage;
import com.qsp.Organization.CreateNewOrganisation;
import com.qsp.Organization.OrganizationPage;

@Listeners(com.qsp.GeneralUtil.Listner.class)

public class CreateOrgWithNameAndWebsiteTest extends BaseClass {

	@Test
	public void tc3()
	{
		hp=new HomePage(driver);
		op=new OrganizationPage(driver);
		cno=new CreateNewOrganisation(driver);
		ja=new JavaUtil();
		ex=new ExcelUtils();
		
		hp.getOrganizationButton().click();
		op.getCreateCustomerButton().click();
		cno.getOrganisationNameTextField().sendKeys(ex.fetchSingleData(Iconstant.Excelpath,"Sheet1",1, 3)+ja.generateNumber(1000));
		cno.getWebsiteTextField().sendKeys(ex.fetchSingleData(Iconstant.Excelpath, "Sheet1", 4, 4));
		cno.getSaveButton().click();

		
	}
	@Test(groups = "smoke")
	public void m1()
	{
		System.out.println("test");
	}
}
