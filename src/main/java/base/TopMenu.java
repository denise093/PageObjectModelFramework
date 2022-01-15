package base;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import pages.cr.accounts.AccountsPage;

public class TopMenu {

	WebDriver driver;
	
	public TopMenu(WebDriver driver) {
		this.driver = driver;
	}
	public void goToHome() {
		
	}
	
	public void goToFeed() {
		
	}
	
	public void goToLeads() {
		
	}
	
	public AccountsPage goToAccounts() throws IOException {
		Page.click("accounts_CSS");
		
		return new AccountsPage();
	}
	
	public void goToContacts() {
		
	}
	
	public void signOut() {
		
	}
}
