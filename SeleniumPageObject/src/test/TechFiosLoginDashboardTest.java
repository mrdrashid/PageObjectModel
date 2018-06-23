package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.AddDashBoardPage;
import page.AddProductServices;
import page.TechFiosLoginPage;
import util.BrowserFactory;

public class TechFiosLoginDashboardTest {
	
	@Test
	public void loginTest() throws IOException, InterruptedException {

		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=admin/");

		TechFiosLoginPage loginPage = PageFactory.initElements(driver, TechFiosLoginPage.class);

		loginPage.login_demo();

		AddDashBoardPage DashBoardPage = PageFactory.initElements(driver, AddDashBoardPage.class);
		DashBoardPage.AddDashboard_demo();

		System.out.println(driver.getTitle());

		//driver.close();

		//driver.quit();

	}
}


