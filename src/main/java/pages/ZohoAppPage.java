package pages;

import java.io.IOException;
import base.Page;
import pages.crm.CRMHomePage;

public class ZohoAppPage extends Page {
	
	
	public ZohoAppPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void goToChat() {
		
		click("chatlink_CSS");
	}
	
	public CRMHomePage goToCRM() throws IOException {
		
		click("crmlink_CSS");
		
		return new CRMHomePage();
	}
	
	public void goToSalesIQ() {
		click("alesiqlink_CSS");
	}

}
