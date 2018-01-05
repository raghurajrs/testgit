package LeafTapPages;

import wrappers.LeafTapOpenTapsWrappers;

public class MergeLead extends LeafTapOpenTapsWrappers{
	public MergeLead(){
		if(!verifyTitleContains("Merge Leads")){
			reportStep("This is Not Merge Leads Page", "FAIL");
		}
		switchDefault();
	}
	public MergeLead clickFromLead(){
		clickByXpath("(//img[@alt='Lookup'])[1]");
		return new MergeLead();
	}
	public MergeLead clickToLead(){
		clickByXpath("(//img[@alt='Lookup'])[2]");
		return new MergeLead();
	}
	public ViewLead clickMerge() throws InterruptedException{
		clickByLinkNoSnap("Merge");
		Thread.sleep(2000);
		acceptAlert();
		return new ViewLead();
	}
}
