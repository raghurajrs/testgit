package LeafTapPages;

import wrappers.LeafTapOpenTapsWrappers;

public class WelcomeHome extends LeafTapOpenTapsWrappers{
	public WelcomeHome(){
		if(!verifyTitle("Opentaps Open Source ERP + CRM")){
			reportStep("you are not in welcome Home page","FAIL");
		}
		switchDefault();
	}
	public MyHome clickCRMSFA(){
		clickByLink("CRM/SFA");
		return new MyHome();
	}
	

}
