package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Login;
import wrappers.LeafTapsWrappers;

public class TC02_AssignIncident extends LeafTapsWrappers {
	@BeforeClass
	public void setvalues(){
		dataSheetName="TC002";
		browserName="chrome";
		testCaseName="AssignIncident";
		testDescription="Assigning the Incident";
		authors="Raghu";
		category="Smoke";
	}
	
	@Test(dataProvider="fetchData")
	public void assignIncident(String username, String pwd, String state ,String assignee){
		 
		new Login()
		.typeUserName(username)
		.typePassword(pwd)
		.clickLogin()
		.EnterInFilter()
		.clickOpenUnassigned()
		.SelectNumber()
		.EnterIncident()
		.clickIncidentnum()
		.selectState(state)
		.assignIncident(assignee)
		.clickUpdate()
		.EnterInFilter()
		.clickOpen()
		.SelectNumber()
		.EnterIncident()
		.verifyIncidentassignee(assignee)
		.verifyStateInprogress(state);
		
		
		
	}
}
