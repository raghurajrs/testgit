package LeafTapsTests;

import org.testng.annotations.Test;

import LeafTapPages.Login;
import wrappers.LeafTapOpenTapsWrappers;

public class LT02_EditLead extends LeafTapOpenTapsWrappers{

	@Test(dataProvider = "fetchData")
	public void editLead(String username,String passwd,String fn,String fnl)
	{
		new Login()
		.enterUsername(username)
		.enterPasswd(passwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.enterFirstName3(fn)
		.clickFindLeads()
		.getFirstLeadID()
		.clickFirstLead()
		.clickEdit()
		.editFirstNameLocal(fnl)
		.clickUpdate()
		.verifyFirstNameLocal(fnl);
	}
}
