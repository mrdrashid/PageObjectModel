package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.WeightWatchersLoginPage;
import util.BrowserFactory;


public class WeightWatchersLoginPageTest {


@Test
public void DashboardTest() throws IOException, InterruptedException {

	WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.weightwatchers.com/us/");

	WeightWatchersLoginPage LoginPage = PageFactory.initElements(driver,WeightWatchersLoginPage.class);
	LoginPage.weightwatcherClick();
	System.out.println(driver.getTitle());
	LoginPage.findMettingClick();
	System.out.println(driver.getTitle());
	LoginPage.zipcode();
	LoginPage.searchBoxclick();
	System.out.println(driver.getTitle());
	LoginPage.verify_location();
	LoginPage.verify_result();
	System.out.println(driver.getTitle());
	LoginPage.Operation();
	LoginPage.Hours_of_operation();
	 LoginPage.current();
	
	driver.close();
	driver.quit();

}
}