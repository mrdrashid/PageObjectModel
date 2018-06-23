package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddDashBoardPage {
	WebDriver driver;
	public AddDashBoardPage(WebDriver driver){
			
			this.driver=driver;

	}
	@FindBy(how=How.XPATH,using="//h2[contains(text(),'Dashboard')]")
	
	WebElement Dashboard;
	
		



public void AddDashboard_demo(){
	
	Dashboard.click();
	
}
}
	