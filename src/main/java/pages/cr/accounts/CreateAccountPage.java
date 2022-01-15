package pages.cr.accounts;

import java.io.IOException;
import base.Page;

public class CreateAccountPage extends Page{

	
	public CreateAccountPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreateAccountPage createAccount(String accountName ) throws IOException {
		
		type("accountname_CSS", accountName);
		return new CreateAccountPage();
	}
}
