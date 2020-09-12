package Labworks.E2EProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pajeobjects.LandingPage;
import pajeobjects.LoginPage;

public class LoginPageTest extends base{

	public WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException{
		driver= initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void loginTest() throws IOException{
		
		WebDriverWait wait = new WebDriverWait(driver, 15);

		LandingPage l= new LandingPage(driver,wait);
		l.getLogin().click();
		LoginPage lo = new LoginPage(driver,wait);
		lo.emailID().sendKeys("abc");
		lo.password().sendKeys("abc");
		lo.login().click();
		Assert.assertTrue(true);
			
	}
	
	@AfterTest
	public void tearDown(){
		driver.close();
	}
}
