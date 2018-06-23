package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCrmPage {
	WebDriver driver;
public AddCrmPage(WebDriver driver){
		
		this.driver=driver;

}
//username=Id= user_login

/*@FindBy(how=How.XPATH,using="//text()[contains(.,'CRM')]/ancestor::a[1]")
WebElement CRM;
@FindBy(how=How.XPATH,using="//a[text()='Add Contact']")
	WebElement AddContact;*/
	
	@FindBy(how=How.ID,using="account")
	WebElement FullName;
	
	@FindBy(how=How.ID, using="company")
	WebElement company;
	
	@FindBy(how=How.ID, using="email")
	WebElement email;
	
	@FindBy(how=How.ID, using="phone")
	WebElement phone;
	
	@FindBy(how=How.ID, using="address")
	WebElement address;
	
	@FindBy(how=How.ID, using="city")
	WebElement city;
	
	@FindBy(how=How.ID, using="state")
	WebElement state;
	
	@FindBy(how=How.ID, using="zip")
	WebElement zip;
	
	@FindBy(how=How.ID, using="submit")
	WebElement submit;
	
	
	
	
	
	
	public void AddCrmPage_demo(){
		
	//	CRM.click();
	//	AddContact.click();
		FullName.sendKeys("Mohammed Rashid");
		company.sendKeys("XYZ Company");
		email.sendKeys("mrashid@Techfiosgmail.com");
		phone.sendKeys("4692486055");
		address.sendKeys("123 Irving");
		city.sendKeys("Irving");
		state.sendKeys("Texas");
		zip.sendKeys("75062");
		submit.click();
		
}
}


