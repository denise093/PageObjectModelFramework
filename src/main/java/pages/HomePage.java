package pages;

import java.io.IOException;

import org.openqa.selenium.By;


import base.Page;


public class HomePage extends Page{
	

	public HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void goToSupport() {
		driver.findElement(By.cssSelector(".zh-support")).click();
	}
	
	public void goToSignUp() {
		driver.findElement(By.cssSelector(".zh-signup")).click();
	}
	
	public LoginPage goToLogin() throws IOException {
		click("loginLink_CSS");
		
		return new LoginPage();
	}
	
	public void goToZohoEdu() {
		
	}
	
	public void goToLearnMore() {
		
	}
	
	public void validateFooterLinks() {
		
	}
	
	
	
}
