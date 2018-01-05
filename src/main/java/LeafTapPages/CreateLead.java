package LeafTapPages;

import wrappers.LeafTapOpenTapsWrappers;

public class CreateLead extends LeafTapOpenTapsWrappers{
	public CreateLead(){
		 if(!verifyTitleContains("Create Lead")){
			 reportStep("you are not in Create lead page","FAIL");
		 }
		 switchDefault();
	}
	public CreateLead enterCompanyName(String cn){
		enterById("createLeadForm_companyName", cn);
		return new CreateLead();
	}
	public CreateLead enterFirstName(String fn){
		enterById("createLeadForm_firstName", fn);
		return new CreateLead();
	}
	public CreateLead enterLastName(String ln){
		enterById("createLeadForm_lastName", ln);
		return new CreateLead();
	}
	public CreateLead enterCountryCode(String countrycode){
		enterById("createLeadForm_primaryPhoneCountryCode", countrycode);
		return new CreateLead();
	}
	public CreateLead enterPhoneNum(String phone){
		enterById("createLeadForm_primaryPhoneNumber", phone);
		return new CreateLead();
	}
	public CreateLead enterEmailId(String email){
		enterById("createLeadForm_primaryEmail", email);
		return new CreateLead();
	}
	public ViewLead clickCreateLead(){
		clickByName("submitButton");
		return new ViewLead();
	}
	
}
