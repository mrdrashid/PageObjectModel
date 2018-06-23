package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.AddCrmPage;
import page.TechFiosLoginPage;
import page.TfHomePage;
import util.BrowserFactory;

public class TechFiosLoginCrmTest {
	@Test
	public void loginTest() throws IOException, InterruptedException {

		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=admin/");

		TechFiosLoginPage loginPage = PageFactory.initElements(driver, TechFiosLoginPage.class);

		loginPage.login_demo();
		 TfHomePage Homepage= PageFactory.initElements(driver, TfHomePage.class);
		 Homepage.CRM_Click();


		AddCrmPage crmPage = PageFactory.initElements(driver, AddCrmPage.class);
		crmPage.AddCrmPage_demo();

		System.out.println(driver.getTitle());

		driver.close();

		driver.quit();

	}
}



