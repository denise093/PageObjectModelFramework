package pages.cr.accounts;

import java.io.IOException;
import base.Page;


public class AccountsPage extends Page{
	
	
	public AccountsPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreateAccountPage goToCreateAccounts() throws IOException {
		click("createaccountsbtn_CSS");
		
		return new CreateAccountPage();
	}

	public void goToImportAccounts() {
		click("importaccountsbtn_CSS");
	}
}
