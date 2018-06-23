package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

//import page.LoginPage;
import page.TechFiosLoginPage;
import page.TfHomePage;
import util.BrowserFactory;

public class TfDashboardTest {
	@Test
	public void DashboardTest() throws IOException, InterruptedException {

		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=admin/");

		TechFiosLoginPage LoginPage = PageFactory.initElements(driver, TechFiosLoginPage.class);

		LoginPage.login_demo();

		TfHomePage DashboardPage = PageFactory.initElements(driver, TfHomePage.class);
		DashboardPage.Validate_User();
		DashboardPage.Validate_IncomeExpense_Graph();
		DashboardPage.Validate_NetworthAndExpenseBalance();
		DashboardPage.Validate_LatestIncome_LatestExpense();
		driver.close();
		driver.quit();

	}
}