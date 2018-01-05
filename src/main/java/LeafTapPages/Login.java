package LeafTapPages;

import wrappers.LeafTapOpenTapsWrappers;

public class Login extends LeafTapOpenTapsWrappers{
	public Login (){
		if(!verifyTitleContains("Opentaps")){
			reportStep("you are not in Login page","FAIL");
		}
		switchDefault();
	}

	public Login enterUsername(String data){
		enterById("username", data);
		return new Login();
	}
	
	public Login enterPasswd(String data){
		enterById("password", data);
		return new Login();
	}
	public WelcomeHome clickLogin(){
		clickByClassName("decorativeSubmit");
		return new WelcomeHome();
	}
}
