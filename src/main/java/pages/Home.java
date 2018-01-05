package pages;

import wrappers.LeafTapsWrappers;

public class Home extends LeafTapsWrappers{
	
	public Home(){
		if(!verifyTitleContains("ServiceNow")){
			reportStep("This is NOT Home Page", "FAIL");	
		}
		switchDefault();
	}
	
	
	public Home EnterInFilter(){
		enterByXpath("//input[@id='filter']", "incident");
		return new Home();
	}
	public IncidentLists clickOpenUnassigned(){
		clickByLink("Open - Unassigned");
		return new IncidentLists();
	}
	public IncidentLists clickOpen(){
		clickByLink("Open");
		return new IncidentLists();
	}
	public EditIncident clickCreateNew(){
		clickByLink("Create New");
		return new EditIncident();
	}
	public IncidentLists clickResolved(){
		clickByLink("Resolved");
		return new IncidentLists();
	}
	
}