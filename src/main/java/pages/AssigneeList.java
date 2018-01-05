package pages;

import wrappers.LeafTapsWrappers;

public class AssigneeList extends LeafTapsWrappers{
	public AssigneeList(){
		if(!verifyTitleContains("ServiceNow")){
			reportStep("This is not Assignee List page","FAIL");
		}
		
	}
	public AssigneeList SelectName(){
		selectVisibileTextByXPath("//select[@class='form-control']", "Name");
		return new AssigneeList();
	}
	public AssigneeList EnterAssignee(String name){
		enterByXpathKeysEnter("(//input[@class='form-control'])[1]",name);
		return new AssigneeList();
	}
	public EditIncident clickFirstAssignee(){
		clickByXpath("(//a[@class='glide_ref_item_link'])[1]");
		switchToLastWindow();
		return new EditIncident();
	}

}
