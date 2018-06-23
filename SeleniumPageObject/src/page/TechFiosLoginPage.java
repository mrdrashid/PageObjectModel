package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechFiosLoginPage {
WebDriver driver;
	
	public TechFiosLoginPage(WebDriver driver){
		
		this.driver=driver;
	}
	// username=Id= user_login
	@FindBy(how=How.ID,using="username")
	WebElement username;
	
	@FindBy(how=How.ID,using="password")
	WebElement password;
	
	@FindBy(how=How.NAME, using="login")
	//WebElement submit;
	WebElement submit;
	
	
	public void login_demo() throws InterruptedException{
		
		username.sendKeys("techfiosdemo@gmail.com");
		password.sendKeys("abc123");
		Thread.sleep(3000);
		submit.click();
	}
	
    
}


