package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TfHomePage {
	WebDriver driver;

	public TfHomePage(WebDriver driver) {

		this.driver = driver;

	}
	// username=Id= user_login

	@FindBy(how = How.XPATH, using = "//text()[contains(.,'CRM')]/ancestor::a[1]")
	WebElement CRM;
	@FindBy(how = How.XPATH, using = "//a[text()='Add Contact']")
	WebElement AddContact;

	@FindBy(how = How.XPATH, using = "//span[text()='Welcome TechFios Tester']")
	WebElement Welcome;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Income Today')]")
	WebElement Incometoday;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Expense Today')]")
	WebElement Expensetoday;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Income This Month')]")
	WebElement Incomethismonth;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Expense This Month')]")
	WebElement Expensethismonth;

	@FindBy(how = How.XPATH, using = "//*[@class=' c3-event-rect c3-event-rect-7']")
	WebElement IncomeExpenseGraph;

	@FindBy(how = How.XPATH, using = "//h5[text()='Net Worth & Account Balances']")
	WebElement NetworthAccountBalance;

	@FindBy(how = How.XPATH, using = "//h5[text()='Income vs Expense - June 2018']")
	WebElement IncomeVsExpense;

	@FindBy(how = How.XPATH, using = "//h5[text()='Latest Income']")
	WebElement Latestincome;

	// @FindBy(how = How.XPATH, using = "//h5[text()='Latest Expense']]")
	@FindBy(how = How.XPATH, using = "//text()[contains(.,'Latest Expense')]/ancestor::div[1]")
	WebElement Latestexpense;

	public void CRM_Click() {

		CRM.click();
		AddContact.click();

	}

	public void Validate_User() {

		if (Welcome.isDisplayed()) {
			System.out.println("Login into home page");
		}
	}

	public void Validate_IncomeExpense_Graph() {

		if (Incometoday.isDisplayed() && (Expensetoday.isDisplayed()) && (Incomethismonth.isDisplayed())) {
			System.out.println("Incometoday, Expense today, Income this month, and Expense this month displayed successfully");
		}
	}

	public void Validate_NetworthAndExpenseBalance() {
		if (Expensethismonth.isDisplayed() && (IncomeExpenseGraph.isDisplayed())) {
			System.out.println("Expense this month and Graph of income and expense displayed successfully");

		}

		if (NetworthAccountBalance.isDisplayed() && (IncomeVsExpense.isDisplayed())) {
			System.out.println("Networth Account Balance and Income VS Expense displayed successfully");

		}

	}

	public void Validate_LatestIncome_LatestExpense() {
		if (Latestincome.isDisplayed() && (IncomeVsExpense.isDisplayed())) {
			System.out.println("Latest Income and latest expense displayed successfully");

		}

	}

}
