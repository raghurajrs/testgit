package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Login;
import wrappers.LeafTapsWrappers;

public class TC01_Login extends LeafTapsWrappers{
	
	@BeforeClass
	public void setvalues(){
		dataSheetName="TC001";
		browserName="chrome";
		testCaseName="Login";
		testDescription="Login to leaftaps";
		authors="Babu";
		category="Smoke";
	}
	
	@Test(dataProvider="fetchData")
	public void loginLogout(String username, String pwd){
		
		new Login()
		.typeUserName(username)
		.typePassword(pwd)
		.clickLogin();
		
		
		
	}

}
