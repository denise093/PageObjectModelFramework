package pages;

import java.io.IOException;



import base.Page;

public class LoginPage extends Page {
	

	public LoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public ZohoAppPage doLogin(String username, String password) throws IOException {
		
		type("email_CSS", username);
		
		click("signinbtn_CSS");
		
		type("password_CSS", password);
		
		click("signinbtn_CSS");
		
		return new ZohoAppPage();
		
	}
	
	public void goToSalesMarketing() {
		
	}
	

}
