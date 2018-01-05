package LeafTapsTests;

import org.testng.annotations.Test;

import LeafTapPages.Login;
import wrappers.LeafTapOpenTapsWrappers;

public class LT04_DuplicateLead extends LeafTapOpenTapsWrappers{

	@Test(dataProvider = "fetchData")
	public void duplicateLead(String username,String passwd,String email)
	{
		new Login()
		.enterUsername(username)
		.enterPasswd(passwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.clickEmail()
		.enterEmail(email)
		.clickFindLeads()
		.getFirstLeadID()
		.clickFirstLead()
		.clickDuplicateLead()
		.clickCreateLead()
		.verifyEmail(email);
		
	}
}
