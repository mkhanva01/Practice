package Page_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Sign_up_page_PageFactory {
	
	WebDriver Driver;
	
//	@FindBy()	-- Locate Element
//	@FindBys()	-- This works as AND operator, to meet multiple criteria 
//	@FindAll()	-- This works as OR operator, If any of the criteria is met

	
	@FindBy(how= How.ID, using="email_create")
	WebElement EmailAddress;
	
	
	@FindBys({													//And Operator
		@FindBy(id="SubmitCreate"),
		@FindBy(xpath="//i[@class='icon-user left']")
	})
	WebElement CreateAccount;
	
	@FindBy(css="#id_gender1")
		WebElement Mr;
	@FindBy(css="#id_gender2")
		WebElement Mrs;
	
	@FindAll({													//OR Operator
		@FindBy(css="#customer_firstname"),
		@FindBy(css="#cus_las_nam")
	})
	WebElement FirstName;
	
	@FindBy(css="#customer_lastname")
	WebElement LastName;
	@FindBy(css="#passwd")
	WebElement PassWord;
	
	@FindBy(css="#days")
	WebElement Days;
	@FindBy(css="#months")
	WebElement Months;
	@FindBy(css="#years")
	WebElement Years;
	@FindBy(css="#newsletter")
	WebElement NewsLetter;
	@FindBy (xpath="//input[contains(@id, 'opt')]")
	WebElement SpecialOffers;
	@FindBy (xpath="//input[contains(@id, 'com')]")
	WebElement Company;
	@FindBy (css="#address1")
	WebElement Address;
	@FindBy (css="#city")
	WebElement City;
	@FindBy (css="#id_state")
	WebElement State;
	@FindBy (css="#postcode")
	WebElement ZipPostalCode;
	@FindBy (css="select[id$='ntry']")
	WebElement Country;
	@FindBy (css="#other")
	WebElement AdditionamInformation;
	@FindBy (css="#phone")
	WebElement HomePhone;
	@FindBy(css="#phone_mobile")
	WebElement MobilePhone;
	@FindBy (css="#alias")
	WebElement AssignAddress;
	
	public Sign_up_page_PageFactory(WebDriver Driver) {			//Integrating WebDriver with the class method
		this.Driver=Driver;										//Instantiating Constructor with this keyword
		PageFactory.initElements(Driver, this);
	}		
	public String createaccountpage() {
		return Driver.getTitle();
	}
	
	public void Email(String email) {
		EmailAddress.sendKeys(email);
	}
	
	public void Clickcreateaccount() {
	CreateAccount.click();
	}
	
	
	public void GenderMr() {
		Mr.click();
	}
	
	public void GenderMrs() {
		Mrs.click();
	}
	
	public void Fname(String fname) {
		FirstName.sendKeys(fname);
	}
	
	public void Lname(String lname) {
		LastName.sendKeys(lname);
	}
	
	public void Password(String passw) {
		PassWord.sendKeys(passw);
	}
	
	public void Day(int day) {
		WebElement Selectdays= Days;
		Select sinput= new Select(Selectdays);
		sinput.selectByIndex(day);
	}
	public void Months(int month) {
		WebElement Selectmonths= Months;
		Select sinput= new Select(Selectmonths);
		sinput.selectByIndex(month);
	}
	public void Years(String year) {
		WebElement Selectyears= Years;
		Select sinput= new Select(Selectyears);
		sinput.selectByValue(year);
	}
	public void Newsletterheck() { 
		NewsLetter.click();
		}
		
		public void Specialclick() {
			SpecialOffers.click();
		}
		
		public void Company(String company)  {
			Company.sendKeys(company);
		}
		
		public void Address(String address)  {
			Address.sendKeys(address);
		}
		
		public void City(String city)  {
			City.sendKeys(city);
		}
		
		public void State(String state) {
			WebElement Selectstate= State;
			Select sinput= new Select(Selectstate);
			sinput.selectByValue(state);
			}	
		
		public void ZipPostalCode(String zip) {
			ZipPostalCode.sendKeys(zip);
			}
		
		public void Country(String country) {
		WebElement Selectcountry= Country;
		Select sinput= new Select(Selectcountry);
		sinput.selectByValue(country);
		}
		
		public void AdditionalInformation(String additional) {
			AdditionamInformation.sendKeys(additional);
		}
		
		
		public void Homephone(String homephone) {
			HomePhone.sendKeys(homephone);
		}
		
		public void Mobilephone(String mobilephone) {
			MobilePhone.sendKeys(mobilephone);
		}
		
		public void Assignanaddress(String assignaddress) {
			AssignAddress.clear();
			AssignAddress.sendKeys(assignaddress);
		}
		
		public void Signuppage(String email, String fname, String lname, String passw, int day, int month, String year, String company,
				String address, String city, String state,  String zip, String country,  String additional,	
				String homephone, String mobilephone, String assignaddress
				) {
			this.Email(email);
			this.Clickcreateaccount();
			this.GenderMrs();
			this.Fname(fname);
			this.Lname(lname);
			this.Password(passw);
			this.Day(day);
			this.Months(month);
			this.Years(year);
			this.Newsletterheck();
			this.Specialclick();
			this.Company(company);
			this.Address(assignaddress);
			this.City(city);
			this.State(state);
			this.Country(country);
			this.AdditionalInformation(additional);
			this.Homephone(homephone);
			this.Mobilephone(mobilephone);
			this.Assignanaddress(assignaddress);
			
		}
	

	
	
}