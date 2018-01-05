package pages;
import wrappers.LeafTapsWrappers;


public class EditIncident extends LeafTapsWrappers{
	
	public EditIncident() {
			if(!verifyTitleContains("ServiceNow")){
			reportStep("This is NOT EditIncident Page", "FAIL");
		}
			
			switchDefault();
			switchFrame("gsft_main");
	}

	public EditIncident getTextbyIDfrombox(){
	incidentno.incidentnum =	getTextByIdFromTextBox("incident.number");
		return new EditIncident();
	}
	public EditIncident enterCaller(String data){
		enterByIdKeysTab("sys_display.incident.caller_id", data );
		return new EditIncident();
	}	
	
	public EditIncident selectCategory(){
		selectVisibileTextById("incident.category", "Hardware");
		return new EditIncident();
	}
	
	public EditIncident selectSubCategory(){
		selectVisibileTextById("incident.subcategory", "Keyboard");
		return new EditIncident();
	}
	public EditIncident selectState(String data){
		selectVisibileTextById("incident.state", data);
		return new EditIncident();
	}
	
	public EditIncident enterShortDescrip(String data){
		enterById("incident.short_description", data);
		return new EditIncident();
		
	}
	
	public EditIncident assignIncident(String data){
		enterByIdKeysTab("sys_display.incident.assigned_to", data);
		return new EditIncident();
	}
	public AssigneeList clickAssignSearch(){
		clickByXpath("//a[@name='lookup.incident.assigned_to']");
		switchToLastWindowSkippingFirst();
		return new AssigneeList();
	}
	public IncidentLists clickSubmit(){
		clickById("sysverb_insert");
		return new IncidentLists();
	}
	public Home clickUpdate(){
		clickById("sysverb_update");
		return new Home();
	}
	public EditIncident clickUpdate(String shortdes,String alttext){
		clickByIdNoSnap("sysverb_update");
		
			String alerttxt = getAlertText();
			if(alerttxt.equals(alerttxt)){
				reportStep("The alert Text is matched with given Text.", "PASS");	
			}else reportStep("The alert Text is NOT matched with given Text.", "FAIL");
		
		return new EditIncident();
	}
	public EditIncident clickCloseInformation(){
		
		clickByXpathNoSnap("(//*[@class='tab_caption_text'])[3]");
		System.out.println("The closure information is clicked");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new EditIncident();
	}
	public EditIncident selectCloseCode(){
		selectVisibileTextById("incident.close_code", "Solved Remotely (Permanently)");
		return new EditIncident();
	}
	public EditIncident enterCloseNotes(String data){
		enterById("incident.close_notes", data);
		return new EditIncident();
	}
}

