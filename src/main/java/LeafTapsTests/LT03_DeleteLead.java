package LeafTapsTests;

import org.testng.annotations.Test;

import LeafTapPages.Login;
import wrappers.LeafTapOpenTapsWrappers;

public class LT03_DeleteLead extends LeafTapOpenTapsWrappers{

	@Test(dataProvider = "fetchData")
	public void deleteLead(String username,String passwd,String phone)
	{
		new Login()
		.enterUsername(username)
		.enterPasswd(passwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.clickPhone()
		.enterPhone(phone)
		.clickFindLeads()
		.getFirstLeadID()
		.clickFirstLead()
		.clickDelete()
		.clickFindLeads()
		.enterLeadId1()
		.clickFindLeads()
		.verifyNoRecordsFound();
		
	}
}
