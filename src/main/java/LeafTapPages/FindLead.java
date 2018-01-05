package LeafTapPages;

import wrappers.LeafTapOpenTapsWrappers;

public class FindLead extends LeafTapOpenTapsWrappers{
	public FindLead(){
		if(!verifyTitleContains("Find Leads")){
			reportStep("This is not Find Leads page ", "FAIL");
		}
		switchDefault();
	}
	public FindLead enterLeadId(String id){
		enterByXpath("//input[@name='id']", id);
		return new FindLead();
	}
	public FindLead enterLeadId1(){
		enterByXpath("//input[@name='id']", leadid1);
		return new FindLead();
	}
	public FindLead enterLeadId2(){
		enterByXpath("//input[@name='id']", leadid2);
		return new FindLead();
	}
	public FindLead enterFirstName3(String fn){
		enterByXpath("(//input[@name='firstName'])[3]", fn);
		return new FindLead();
	}
	public FindLead enterFirstName1(String fn){
		enterByXpath("//input[@name='firstName']", fn);
		return new FindLead();
	}
	public FindLead enterPhone(String phone){
		enterByName("phoneNumber", phone);
		return new FindLead();
	}
	public FindLead enterEmail(String email){
		enterByName("emailAddress", email);
		return new FindLead();
	}
	public FindLead clickPhone(){
		clickByLink("Phone");
		return new FindLead();
	}
	public FindLead clickEmail(){
		clickByLink("Email");
		return new FindLead();
	}
	public FindLead clickFindLeads(){
		clickByXpath("//button[text()='Find Leads']");
		return new FindLead();
	}
	public FindLead getFirstLeadID(){
		leadid1 = getTextByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		return new FindLead();
	}
	public FindLead getSecondLeadID(){
		leadid2 = getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]");
		return new FindLead();
	}
	
	public ViewLead clickFirstLead(){
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		return new ViewLead();
	}
	public MergeLead clickFirstLeadNoSnap(){
		clickByXpathNoSnap("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		switchToParentWindow();
		return new MergeLead();
	}
	public MergeLead clickSecondLeadNoSnap(){
		clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]");
		switchToParentWindow();
		return new MergeLead();
	}
	public FindLead verifyNoRecordsFound(){
		verifyTextByXpath("//div[text()='No records to display']", "No records to display");
		return new FindLead();
	}
}
