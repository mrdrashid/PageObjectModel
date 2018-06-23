package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.Homepage;
import page.LoginPage;
import util.BrowserFactory;

public class PostTest {

	@Test
	public void loginTest() throws IOException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://demosite.center/wordpress/wp-login.php?loggedout=true");
					
			
	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
			
				
	loginPage.login_demo();
	
	Homepage home = PageFactory.initElements(driver, Homepage.class);

	home.publish();
	
	home.validatehomepage();	
	
	
	driver.close();

	driver.quit();






	}

}
