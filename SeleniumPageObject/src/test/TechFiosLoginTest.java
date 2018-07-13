package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.AddBankCash;
import page.AddCrmPage;
import page.AddProductServices;
//import page.LoginPage;
import page.TechFiosLoginPage;
import util.BrowserFactory;


public class TechFiosLoginTest {

	@Test
	public void loginTest() throws IOException, InterruptedException {

		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=admin/");

		TechFiosLoginPage loginPage = PageFactory.initElements(driver, TechFiosLoginPage.class);

		loginPage.login_demo();

		AddCrmPage crmPage = PageFactory.initElements(driver, AddCrmPage.class);
		crmPage.AddCrmPage_demo();
		
		Thread.sleep(3000);

		AddBankCash bankCash = PageFactory.initElements(driver, AddBankCash.class);
		bankCash.AddBankCash_demo();
		
		Thread.sleep(3000);
		
		AddProductServices productServices = PageFactory.initElements(driver, AddProductServices.class);
		productServices.AddProductServices_demo();
		
		System.out.println(driver.getTitle());

		driver.close();

		driver.quit();

	}
}
