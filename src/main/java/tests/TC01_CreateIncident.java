package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Login;
import wrappers.LeafTapsWrappers;

public class TC01_CreateIncident extends LeafTapsWrappers {
	@BeforeClass
	public void setvalues(){
		dataSheetName="TC001";
		browserName="chrome";
		testCaseName="CreateIncident";
		testDescription="Creating the Incident";
		authors="Raghu";
		category="Smoke";
	}
	
	@Test(dataProvider="fetchData")
	public void createIncident(String username, String pwd, String caller ,String shortdes,String alttext){
		
		new Login()
		.typeUserName(username)
		.typePassword(pwd)
		.clickLogin()
		.EnterInFilter()
		.clickCreateNew()
		.getTextbyIDfrombox()
		.enterCaller(caller)
		.selectCategory()
		.selectSubCategory()
		.enterShortDescrip(shortdes)
		.clickSubmit()
		.SelectNumber()
		.EnterIncident()
		.verifyIncidentnum();
		
		
		
	}
}
