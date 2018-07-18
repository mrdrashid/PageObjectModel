package page;

import static org.junit.Assert.assertTrue;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WeightWatchersLoginPage {
	WebDriver driver;

	public WeightWatchersLoginPage(WebDriver driver) {

		this.driver = driver;
	}

	//@FindBy(how = How.XPATH, using = "//h1[text()='Live it up']")
	//WebElement weightwatcher;
	
	//@FindBy(how = How.XPATH, using = "//img[@class='header_freestyle_logo freestyle-desktop']")
	//WebElement weightwatcher;
	

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Find a Meeting')]")
	WebElement findMeting;

	@FindBy(how = How.XPATH, using = "//input[@type='text'][@placeholder='City and state or ZIP code']")
	WebElement zipcode;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-default form-blue-pill__btn']")
	WebElement searchBox;

	// @FindBy(how = How.XPATH, using = "//div[text()='14 W 23RD ST 2ND FL']']")
	// WebElement location;

	@FindBy(how = How.XPATH, using = "//div[text()='NEW YORK, NY 10010']")
	WebElement location;

	@FindBy(how = How.XPATH, using = "//div[text()='0.49 mi.']")
	 WebElement distance1;

	@FindBy(how = How.XPATH, using = "//h2[text()='Hours of Operation']")
	WebElement schedule;

	@FindBy(how = How.XPATH, using = "//div[text()='Sunday']")
	WebElement Sunday;
	@FindBy(how = How.XPATH, using = "//div[text()='10:00 AM – 1:00 PM']")
	WebElement SundaySchedule;

	@FindBy(how = How.XPATH, using = "//div[text()='Monday']")
	WebElement Monday;
	@FindBy(how = How.XPATH, using = "//div[text()='7:45 AM – 9:15 AM']")
	WebElement MondaySchedule1;
	@FindBy(how = How.XPATH, using = "//div[text()='12:00 PM – 2:00 PM']")
	WebElement MondaySchedule2;
	@FindBy(how = How.XPATH, using = "//div[text()='5:30 PM – 7:00 PM']")
	WebElement MondaySchedule3;

	@FindBy(how = How.XPATH, using = "//div[text()='Tuesday']")
	WebElement Tuesday;
	@FindBy(how = How.XPATH, using = "//div[text()='8:00 AM – 2:00 PM']")
	WebElement TuesdaySchedule1;
	@FindBy(how = How.XPATH, using = "//div[text()='4:45 PM – 8:00 PM']")
	WebElement TuesdaySchedule2;

	@FindBy(how = How.XPATH, using = "//div[text()='Wednesday']")
	WebElement Wednesday;
	@FindBy(how = How.XPATH, using = "//div[text()='9:30 AM – 2:00 PM']")
	WebElement WednesdaySchedule1;
	@FindBy(how = How.XPATH, using = "//div[text()='5:00 PM – 8:00 PM']")
	WebElement WednesdaySchedule2;

	@FindBy(how = How.XPATH, using = "//div[text()='Thursday']")
	WebElement Thursday;
	@FindBy(how = How.XPATH, using = "//div[text()='7:45 AM – 10:30 AM']")
	WebElement ThursdaySchedule1;
	@FindBy(how = How.XPATH, using = "//div[text()='11:45 AM – 2:00 PM']")
	WebElement ThursdaySchedule2;
	@FindBy(how = How.XPATH, using = "//div[text()='4:45 PM – 8:00 PM']")
	WebElement ThursdaySchedule3;

	@FindBy(how = How.XPATH, using = "//div[text()='Friday']")
	WebElement Friday;
	@FindBy(how = How.XPATH, using = "//div[text()='7:45 AM – 9:30 AM']")
	WebElement FridaySchedule1;
	@FindBy(how = How.XPATH, using = "//div[text()='11:45 AM – 2:00 PM']")
	WebElement FridaySchedule2;
	@FindBy(how = How.XPATH, using = "//div[text()='2:30 PM – 4:30 PM']")
	WebElement FridaySchedule3;

	@FindBy(how = How.XPATH, using = "//div[text()='Saturday']")
	WebElement Saturday;
	@FindBy(how = How.XPATH, using = "//div[text()='8:00 AM – 1:00 PM']")
	WebElement SaturdaySchedule;

	//public void weightwatcherClick() {
		//eightwatcher.click();
	//}

	public void findMettingClick() {
		findMeting.click();
	}

	public void zipcode() {
		zipcode.sendKeys("10011");
	}

	public void searchBoxclick() {
		searchBox.submit();

	}

	public void verify_location() {
		location.click();
	}
	
	public void verify_Distance() {
		distance1.click();
	}

	/*
	 * public void Verify_distance() { distance1.click(); }
	 */
	public void Operation() {
		schedule.click();
	}

	public void verify_result() {
		String text = location.getText();
		System.out.println(text);
		//String distance=distance1.getText();
		//System.out.println(distance);
		location.click();
		//distance1.click();
		assertTrue(driver.getTitle().contains(text));
		System.out.println("displayed location name matches with the name of the first searched result that was clicked");

	}

	public void Hours_of_operation() {
		
		// getting current date time using calendar class
		
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_WEEK);

		DayOfWeek weekday = DayOfWeek.from(LocalDate.now());
		String day1 = weekday.toString();
		System.out.println(day1);
		
		switch (day) {
		case Calendar.SUNDAY:
			// Current day is Sunday
			System.out.println(SundaySchedule.getText());
			break;

		case Calendar.MONDAY:
			System.out.println(MondaySchedule1.getText());
			System.out.println(MondaySchedule2.getText());
			System.out.println(MondaySchedule3.getText());
			// Current day is Monday
			break;
		case Calendar.TUESDAY:
			System.out.println(TuesdaySchedule1.getText());
			System.out.println(TuesdaySchedule2.getText());
			break;
		// Current day is Tuesday

		case Calendar.WEDNESDAY:
			System.out.println(WednesdaySchedule1.getText());
			System.out.println(WednesdaySchedule2.getText());
			// Current day is Wednesday
			break;
		case Calendar.THURSDAY:
			System.out.println(ThursdaySchedule1.getText());
			System.out.println(ThursdaySchedule2.getText());
			System.out.println(ThursdaySchedule3.getText());
			break;
		// Current day is Thursday

		case Calendar.FRIDAY:
			System.out.println(FridaySchedule1.getText());
			System.out.println(FridaySchedule2.getText());
			System.out.println(FridaySchedule3.getText());
			break;
		// Current day is Friday

		case Calendar.SATURDAY:
			System.out.println(SaturdaySchedule.getText());
		}
		// Current day is Saturday

	}

	public static void current() {
		System.out.println("Today's date and time, the moment this test case was executed::");
		// getting current date and time using Date class
		DateFormat df = new SimpleDateFormat("MM/dd/yy HH:mm:ss");

		// getting current date time using calendar class

		Calendar calobj = Calendar.getInstance();
		System.out.println(df.format(calobj.getTime()));
	}

}
