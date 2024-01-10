package tests;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BasePage;
import pages.HomePage;



@Listeners(ITListner.class)

public class HomePageTest extends BasePage{
	
	HomePage hp;
	
	
	
	@BeforeClass
	public void OpenApp() throws MalformedURLException {

		openBrowser("Chrome");
		hp = new HomePage(driver);
	}

	@Test(priority = '1')
	public void clickOnRegisterPage() throws InterruptedException {

		
		
		Thread.sleep(2000);
		hp.clickonRegister();
		Thread.sleep(2000);

	}

	@Test(priority = '2')
	public void clickOnLogin() throws InterruptedException {

		
		Thread.sleep(2000);
		hp.clickonLogin();
		Thread.sleep(2000);

	}

	@AfterClass
	public void CloseApp() {

		driver.quit();
	}
	
	

}