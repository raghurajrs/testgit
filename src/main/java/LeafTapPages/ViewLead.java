package LeafTapPages;

import wrappers.LeafTapOpenTapsWrappers;

public class ViewLead extends LeafTapOpenTapsWrappers{
	public ViewLead(){
		if(!verifyTitleContains("View Lead")){
			reportStep("you are not in View lead page","FAIL");
		}
		switchDefault();
	}
	public FindLead clickFindLeads(){
		clickByLink("Find Leads");
		return new FindLead();
	}	
	public EditLead clickEdit(){
		clickByLink("Edit");
		return new EditLead();
	}
	public DuplicateLead clickDuplicateLead(){
		clickByLink("Duplicate Lead");
		return new DuplicateLead();
	}
	public MyLeads clickDelete(){
		clickByLink("Delete");
		return new MyLeads();
	}
	public ViewLead verifyCompanyName(String cn){
		verifyTextById("viewLead_companyName_sp", cn);
		return new ViewLead();
	}
	public ViewLead verifyFirstName(String fn){
		verifyTextById("viewLead_firstName_sp", fn);
		return new ViewLead();
	}

	public ViewLead verifyLastName(String ln){
		verifyTextById("viewLead_lastName_sp", ln);
		return new ViewLead();
	}
	public ViewLead verifyFirstNameLocal(String fnl){
		verifyTextById("viewLead_firstNameLocal_sp", fnl);
		return new ViewLead();
	}
	public ViewLead verifyEmail(String email){
		verifyTextByXpath("//a[@class='linktext' and text()='raghu@gmail.com']", email);
		return new ViewLead();
	}


}
