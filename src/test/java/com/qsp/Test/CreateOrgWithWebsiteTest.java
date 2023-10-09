package com.qsp.Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.qsp.GeneralUtil.BaseClass;
import com.qsp.GeneralUtil.ExcelUtils;
import com.qsp.GeneralUtil.Iconstant;
import com.qsp.GeneralUtil.JavaUtil;
import com.qsp.HomePage.HomePage;
import com.qsp.Organization.CreateNewOrganisation;
import com.qsp.Organization.OrganizationPage;

public class CreateOrgWithWebsiteTest extends BaseClass {

	@Test
	public void tc2()
	{
		hp=new HomePage(driver);
		op=new OrganizationPage(driver);
		cno=new CreateNewOrganisation(driver);
		ja=new JavaUtil();
		ex=new ExcelUtils();
		
		hp.getOrganizationButton().click();
		op.getCreateCustomerButton().click();
		cno.getOrganisationNameTextField().sendKeys(ex.fetchSingleData(Iconstant.Excelpath,"Sheet1",1, 3)+ja.generateNumber(1000));
	}
}
