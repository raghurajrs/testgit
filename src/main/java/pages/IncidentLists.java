package pages;

import wrappers.LeafTapsWrappers;

public class IncidentLists extends LeafTapsWrappers {
	public IncidentLists() {
		if(!verifyTitleContains("Incidents")){
		reportStep("This is NOT IncidentList Page", "FAIL");
	}
		switchDefault();
		switchFrame("gsft_main");
}
	public IncidentLists SelectNumber(){
		selectVisibileTextByXPath("//select[@class='form-control']", "Number");
		return new IncidentLists();
	}
	public IncidentLists EnterIncident(){
		enterByXpathKeysEnter("(//input[@class='form-control'])[1]","INC0010677");
		return new IncidentLists();
	}
	public EditIncident clickIncidentnum(){
		clickByXpath("//td[@class='vt']/a[1]");
		return new EditIncident();
	}
	public IncidentLists verifyIncidentnum(){
		verifyTextByXpath("//td[@class='vt']/a[1]", "INC0010677");
		return new IncidentLists();
	}
	public IncidentLists verifyIncidentassignee(String data){
		verifyTextByXpath("(//td[@class='vt']/a)[3]", data);
		return new IncidentLists();
	}
	public IncidentLists verifyStateInprogress(String data){
		verifyTextByXpath("(//td[@class='vt' and text()='In Progress'])[1]", data);
		return new IncidentLists();
	}
	public IncidentLists verifyStateResolved(String data){
		verifyTextByXpath("(//td[@class='vt' and text()='Resolved'])[1]", data);
		return new IncidentLists();
	}
	public IncidentLists verifyStateClosed(String data){
		verifyTextByXpath("(//td[@class='vt' and text()='Closed'])[1]", data);
		return new IncidentLists();
	}
	public IncidentLists verifyNoRecordsText(String data){
		verifyTextByXpath("//td[text()='No records to display']", data);
		return new IncidentLists();
	}
}
