package LeafTapPages;

import wrappers.LeafTapOpenTapsWrappers;

public class MyLeads extends LeafTapOpenTapsWrappers{
	public MyLeads(){
		if(!verifyTitleContains("My Leads")){
			reportStep("This is Not My Leads Page","FAIL");
		}
		switchDefault();
	}
	public MyHome clickLeads(){
		clickByLink("Leads");
		return new MyHome();
	}
	public CreateLead clickCreateLead(){
		clickByLink("Create Lead");
		return new CreateLead();
	}
	public FindLead clickFindLeads(){
		clickByLink("Find Leads");
		return new FindLead();
	}
	public MergeLead clickMergeLeads(){
		clickByLink("Merge Leads");
		return new MergeLead();
	}

}
