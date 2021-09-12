package week2.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadTestCase {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Launch URL & enter UserId and Password

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		// clicking on CRM/SFA Link

		driver.findElement(By.linkText("CRM/SFA")).click();

		// Clicking on Leads Tab

		driver.findElement(By.linkText("Leads")).click();

		// Clicking oN Create Lead Tab

		driver.findElement(By.linkText("Create Lead")).click();

		// Create Lead Details

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("RBS");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Roger");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("McCormick");

		WebElement Source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceDd = new Select(Source);
		sourceDd.selectByIndex(3);

		WebElement marketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mcDd = new Select(marketingCampaign);
		mcDd.selectByIndex(2);

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Roger");

		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("McCormick");

		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");

		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("05/10/75");

		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr Roger McCormick");

		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");

		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("50000");

		WebElement preferredCurrency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select pc = new Select(preferredCurrency);
		pc.selectByVisibleText("GBP - British Pound");

		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industryDd = new Select(industry);
		industryDd.selectByVisibleText("Insurance");

		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownershipDd = new Select(ownership);
		ownershipDd.selectByIndex(1);

		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("71200");

		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("2255");

		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Flamingo");

		driver.findElement(By.id("createLeadForm_description")).sendKeys(
				"The Royal Bank of Scotland is a major retail and commercial bank in Scotland. It is one of the retail banking subsidiaries of NatWest Group, together with NatWest and Ulster Bank. ");

		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys(
				"Customer service: 1800 11 2224 ; Headquarters: Edinburgh, United Kingdom ; CEO: Alison Rose (1 Nov 2019–) ; Founded: 1727");

		// Contact Information

		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();

		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("44");

		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");

		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("0");

		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("4");

		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Roger McCormick");

		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("roger.mccormick@rbs.com");

		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://personal.rbs.co.uk");

		// Primary Address

		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Roger McCormick");

		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Roger");

		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("44/3 ORWELL TERRACE");

		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Dalry");

		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Edinburgh");

		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select countryDd = new Select(country);
		countryDd.selectByVisibleText("United Kingdom");

		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("EH11 2DT");

		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("EH11 2DT");

		// Click Lead Button

		// driver.findElement(By.name("submitButton")).click();

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		// Get Title of page
		String title = driver.getTitle();
		System.out.println("Title of the page is: " + title);

		// Get First Name
		WebElement firstName = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
		System.out.println("First Name is: " + firstName.getText());

		// Logout of the application
		driver.findElement(By.xpath("//img[@alt='opentaps CRM']")).click();
		driver.findElement(By.xpath("//input[@value='Logout']")).click();

	}

}

// http://www.leafground.com/
