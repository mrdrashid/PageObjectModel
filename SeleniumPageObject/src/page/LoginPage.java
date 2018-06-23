package page;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		
		this.driver=driver;
	}
	// username=Id= user_login
	@FindBy(how=How.ID,using="user_login")
	WebElement username;
	
	@FindBy(how=How.ID,using="user_pass")
	WebElement password;
	
	@FindBy(how=How.ID, using="wp-submit")
	WebElement submit_button;
	
	
	
	
	public void login_demo(){
		
		username.sendKeys("admin");
		password.sendKeys("demo123");
		submit_button.click();
	}
	
    
}
