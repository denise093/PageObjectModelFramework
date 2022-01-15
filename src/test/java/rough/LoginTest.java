package rough;


import java.io.IOException;

import base.Page;
import pages.HomePage;
import pages.LoginPage;
import pages.ZohoAppPage;
import pages.cr.accounts.AccountsPage;
import pages.cr.accounts.CreateAccountPage;
import pages.crm.CRMHomePage;

public class LoginTest {
	
	
	public static void main(String[] args) throws IOException {
		
	

	HomePage home = new HomePage();
	LoginPage lp = home.goToLogin();

	ZohoAppPage zp = lp.doLogin("denise.bumbacea@gmail.com", "Maimutele1!");
		
	CRMHomePage cp = zp.goToCRM();
	cp.verifyWelcomeText();
	
	AccountsPage ap =Page.menu.goToAccounts();
	CreateAccountPage cap = ap.goToCreateAccounts();
	
	cap.createAccount("Denise");
	
	}
}
