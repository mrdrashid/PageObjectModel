package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddBankCash {
	
	WebDriver driver;
	public AddBankCash(WebDriver driver){
			
			this.driver=driver;

	}
	@FindBy(how=How.XPATH,using="//text()[contains(.,'Bank & Cash')]/ancestor::a[1]")
	WebElement BankCash;
	@FindBy(how=How.XPATH,using="//a[text()='New Account']")
		WebElement NewAccount;
		
		@FindBy(how=How.ID,using="account")
		WebElement accounttitle;
		
		@FindBy(how=How.ID, using="description")
		WebElement description;
		
		@FindBy(how=How.ID, using="balance")
		WebElement balance;
		
		
		
		@FindBy(how=How.XPATH, using="//text()[contains(.,'Submit')]/ancestor::button[1]")
		WebElement submit;
		
		//@FindBy(how=How.XPATH, using="//a[text()='List Accounts']t")
		//WebElement listaccount;
		
		
		@FindBy(how=How.XPATH, using="//a[text()='Account Balances']")
		WebElement accountbalance;
		
		public void AddBankCash_demo(){
			
			BankCash.click();
			NewAccount.click();
			accounttitle.sendKeys("TechfiosBilling");
			description.sendKeys("Tuition Fees");
			balance.sendKeys("$1000");
			submit.click();
			//listaccount.click();
			accountbalance.click();
			
	}
		
}
