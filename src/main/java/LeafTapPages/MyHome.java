package LeafTapPages;

import wrappers.LeafTapOpenTapsWrappers;

public class MyHome extends LeafTapOpenTapsWrappers {
	public MyHome(){
		if(!verifyTitleContains("My Home")){
			reportStep("you are not in MyHome page","FAIL");
		}
		switchDefault();
	}
	public MyLeads clickLeads(){
		clickByLink("Leads");
		return new MyLeads();
	}
	public CreateLead clickCreateLead(){
		clickByLink("Create Lead");
		return new CreateLead();
	}
	/*public FindLead clickCreateAccount(){
		clickByLink("Create Account");
		return new FindLead();
	}
	public MergeLead clickCreateContact(){
		clickByLink("Create Contact");
		return new MergeLead();
	}*/
	
}
