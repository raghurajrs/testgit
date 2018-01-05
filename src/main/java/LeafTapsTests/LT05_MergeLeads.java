package LeafTapsTests;

import org.testng.annotations.Test;

import LeafTapPages.FindLead;
import LeafTapPages.Login;
import wrappers.LeafTapOpenTapsWrappers;

public class LT05_MergeLeads extends LeafTapOpenTapsWrappers{

	@Test(dataProvider = "fetchData")
	public void mergeLead(String username,String passwd,String fn)
	{
		new Login()
		.enterUsername(username)
		.enterPasswd(passwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLeads()
		.clickFromLead();
		switchToLastWindow();
		new FindLead()
		.enterFirstName1(fn)
		.getFirstLeadID()
		.clickFirstLeadNoSnap()
		.clickToLead();
		switchToLastWindow();
		try {
			new FindLead()
			.enterFirstName1(fn)
			.getSecondLeadID()
			.clickSecondLeadNoSnap()
			.clickMerge()
			.clickFindLeads()
			.enterLeadId1()
			.clickFindLeads();
			Thread.sleep(3000);
			new FindLead()
			.verifyNoRecordsFound();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
