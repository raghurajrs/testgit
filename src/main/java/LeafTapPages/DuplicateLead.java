package LeafTapPages;

import wrappers.LeafTapOpenTapsWrappers;

public class DuplicateLead extends LeafTapOpenTapsWrappers{
	public DuplicateLead(){
		if(!verifyTitleContains("Duplicate Lead")){
			reportStep("This is NOT Duplicate lead Page", "FAIL");
		}
		switchDefault();
	}
	public ViewLead clickCreateLead(){
		clickByXpath("//input[@name='submitButton' and @value='Create Lead']");
		return new ViewLead();
	}

}
