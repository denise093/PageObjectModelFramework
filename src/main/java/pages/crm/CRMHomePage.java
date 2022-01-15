package pages.crm;

import java.io.IOException;

import org.openqa.selenium.By;

import base.Page;

public class CRMHomePage extends Page {
	
	public CRMHomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void verifyWelcomeText() {
		System.out.println(driver.findElement(By.cssSelector("#show-uName")).getText());
	}
	
	

}
