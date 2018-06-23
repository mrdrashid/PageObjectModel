package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddProductServices {
	WebDriver driver;

	public AddProductServices(WebDriver driver) {

		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//*[@class='fa fa-cube'] ")
	WebElement ProductAndServices;
	
	
	@FindBy(how = How.XPATH, using = "//a[text()='Products']")
	WebElement Product;
	

	@FindBy(how = How.XPATH, using = "//text()[contains(.,'Add Product')]/ancestor::a[1]")
	WebElement Addproduct;

	@FindBy(how = How.ID, using = "name")
	WebElement name;

	@FindBy(how = How.ID, using = "sales_price")
	WebElement salesprice;

	@FindBy(how = How.ID, using = "item_number")
	WebElement itemnumber;

	@FindBy(how = How.ID, using = "description")
	WebElement description;

	@FindBy(how = How.ID, using = "submit")
	WebElement submit;

	public void AddProductServices_demo() {

		ProductAndServices.click();
		Product.click();
		Addproduct.click();
		name.sendKeys("Laptop");
		salesprice.sendKeys("$1000");
		itemnumber.sendKeys("9155");
		description.sendKeys("These Producrs are really good");
		submit.click();

	}
}
