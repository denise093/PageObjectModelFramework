package testcases;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utilities.Utilities;

public class LoginTest extends BaseTest{
	
	@Test(dataProviderClass = Utilities.class, dataProvider="dp")
	public void loginTest(Hashtable<String,String> data) throws IOException {
		
		HomePage home = new HomePage();
		LoginPage lp = home.goToLogin();

		lp.doLogin(data.get("username"), data.get("password"));
		
	}

}
