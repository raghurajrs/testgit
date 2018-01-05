package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.EditIncident;
import pages.Login;
import wrappers.LeafTapsWrappers;

public class TC03_ResolveIncident extends LeafTapsWrappers {
	@BeforeClass
	public void setvalues(){
		dataSheetName="TC003";
		browserName="chrome";
		testCaseName="ResolveIncident";
		testDescription="Resolve the Incident";
		authors="Raghu";
		category="Sanity";
	}
	
	@Test(dataProvider="fetchData")
	public void assignIncident(String username, String pwd, String state ,String assignee,String shortdes,String alttext,String CloseNotes){
		 
		new Login()
		.typeUserName(username)
		.typePassword(pwd)
		.clickLogin()
		.EnterInFilter()
		.clickOpen()
		.SelectNumber()
		.EnterIncident()
		.clickIncidentnum()
		.selectState(state);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 new EditIncident()
		.clickAssignSearch()
		.SelectName()
		.EnterAssignee(assignee)
		.clickFirstAssignee()
		.enterShortDescrip(shortdes)
		.clickCloseInformation()
		.selectCloseCode()
		.enterCloseNotes(CloseNotes)
		.clickUpdate()
		.EnterInFilter()
		.clickOpen()
		.SelectNumber()
		.EnterIncident()
		.verifyIncidentassignee(assignee)
		.verifyStateResolved(state);
		
		
	}

}
