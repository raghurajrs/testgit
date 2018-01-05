package LeafTapsTests;

import org.testng.annotations.Test;

import LeafTapPages.Login;
import wrappers.LeafTapOpenTapsWrappers;

public class LT01_CreateLead extends LeafTapOpenTapsWrappers{

	@Test(dataProvider = "fetchData")
	public void createLead(String username,String passwd,String cn,String fn,String ln,String countrycode,String phone,String email)
	{
		new Login()
		.enterUsername(username)
		.enterPasswd(passwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(cn)
		.enterFirstName(fn)
		.enterLastName(ln)
		.enterCountryCode(countrycode)
		.enterEmailId(email)
		.enterPhoneNum(phone)
		.clickCreateLead()
		.verifyFirstName(fn);
	}
}
