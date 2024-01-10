package tests;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BasePage;

import utilities.Xls_DataProvider;
import pages.HomePage;
import pages.Loginpage;

@Listeners(ITListner.class)

public class LoginPageTest extends BasePage{
	
	
	HomePage hp;
	Loginpage lp;
	
	@BeforeMethod
	public void openApplication() throws MalformedURLException {

		openBrowser("Chrome");

		hp = new HomePage(driver);
		lp = new Loginpage(driver);
	}

	@Test(priority = '1', dataProvider = "testdata")
	public void LoginUser(String Email1, String Password1) {

		
		hp.clickonLogin();
		lp.LoginUser(Email1, Password1);
		

	}

	@DataProvider(name = "testdata")
	public Object[][] datasupplier() throws IOException {

		Object[][] input = Xls_DataProvider.getTestData("Sheet1");
		return input;
	}
	

}