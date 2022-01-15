package testcases;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.annotations.Test;

import base.Page;
import pages.ZohoAppPage;
import pages.cr.accounts.AccountsPage;
import pages.cr.accounts.CreateAccountPage;
import pages.crm.CRMHomePage;
import utilities.Utilities;

public class CreateAccountTest {

	@Test(dataProviderClass=Utilities.class, dataProvider="dp")
	public void createAccountTest(Hashtable<String,String> data) throws IOException {
		
		ZohoAppPage zp = new ZohoAppPage();
		CRMHomePage cp = zp.goToCRM();
		cp.verifyWelcomeText();
		
		AccountsPage ap = Page.menu.goToAccounts();
		CreateAccountPage cap = ap.goToCreateAccounts();
		
		cap.createAccount(data.get("accountname"));
	}
}
