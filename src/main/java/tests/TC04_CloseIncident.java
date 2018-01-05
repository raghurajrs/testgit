package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.EditIncident;
import pages.Home;
import pages.Login;
import wrappers.LeafTapsWrappers;

public class TC04_CloseIncident extends LeafTapsWrappers {
	@BeforeClass
	public void setvalues(){
		dataSheetName="TC004";
		browserName="chrome";
		testCaseName="CloseIncident";
		testDescription="Close the Incident";
		authors="Raghu";
		category="Sanity";
	}
	
	@Test(dataProvider="fetchData")
	public void assignIncident(String username, String pwd, String state ,String shortdes,String alttext,String norecord){
		 
		new Login()
		.typeUserName(username)
		.typePassword(pwd)
		.clickLogin()
		.EnterInFilter()
		.clickOpen()
		.SelectNumber()
		.EnterIncident()
		.clickIncidentnum()
		.selectState(state)
		.enterShortDescrip("")
		.clickUpdate("",alttext)
		.enterShortDescrip(shortdes)
		.clickUpdate()
		.EnterInFilter()
		.clickOpen()
		.SelectNumber()
		.EnterIncident()
		.verifyNoRecordsText(norecord);
		
		
		
	}

}
