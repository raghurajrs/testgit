package LeafTapPages;

import wrappers.LeafTapOpenTapsWrappers;

public class EditLead extends LeafTapOpenTapsWrappers{
	public EditLead(){
		if(!verifyTitleContains("opentaps")){
			reportStep("This is Not edit Lead page", "FAIL");
		}
		switchDefault();
	}
	public EditLead editFirstNameLocal(String fnl){
		enterById("updateLeadForm_firstNameLocal", fnl);
		return new EditLead();
	}
	public EditLead editCompanyName(String cn){
		enterById("updateLeadForm_companyName", cn);
		return new EditLead();
	}
	public ViewLead clickUpdate(){
		clickByXpath("//input[@name='submitButton' and @value='Update']");
		return new ViewLead();
	}
	
}
