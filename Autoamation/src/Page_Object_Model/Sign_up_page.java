package Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class Sign_up_page {
WebDriver Driver;
	
	By EmailAddress= By.xpath("//input[@name='email_create']");
	By CreateAccount= By.xpath("//i[@class='icon-user left']");
	By Mr= By.xpath("//input[@id='id_gender1']");
	By Mrs= By.cssSelector("#id_gender2");							//Using CSS id
	By Firstname= By.cssSelector("input[id='customer_firstname']");
	By Lastname= By.cssSelector("input[id^='customer_la']");		//Using CSS Prefix- Starts with		^
	By Password= By.cssSelector("input[id*='assw']");				//Using CSS Substring- Available anywehre *
	By Days= By.cssSelector("#days");
	By Months= By.cssSelector("#months");
	By Years= By.cssSelector("#years");
	By NewsLetter= By.cssSelector("input[id$='sletter']");			//Using CSS Suffix- Ends with $
	By SpecialOffers= By.xpath("//input[contains(@id, 'opt')]"); 	//Using Xpath contains	
	By Company= By.xpath("//input[contains(@id, 'com')]");
	By Address= By.cssSelector("#address1");
	By City= By.cssSelector("#city");
	By State= By.cssSelector("select[id*='_state']");
	By ZipPostalCode= By.cssSelector("#postcode");
	By Country= By.cssSelector("select[id$='ntry']");
	By AdditionalInformation= By.cssSelector("#other");
	By Homephone= By.cssSelector("#phone");
	By MobilePhone= By.cssSelector("#phone_mobile");
	By AssignAddress= By.cssSelector("#alias");
	
	public Sign_up_page(WebDriver Driver) {
		this.Driver=Driver; 				//This is the class constructor
	}
		
		public String createaccountpage() {
			return Driver.getTitle();
		}
		
		public void Email(String email) {
			Driver.findElement(EmailAddress).sendKeys(email);
		}
		
		public void Clickcreateaccount() {
			Driver.findElement(CreateAccount).click();
		}
		
		
		public void GenderMr() {
			Driver.findElement(Mr).click();
		}
		
		public void GenderMrs() {
			Driver.findElement(Mrs).click();
		}
		
		public void Fname(String fname) {
			Driver.findElement(Firstname).sendKeys(fname);
		}
		
		public void Lname(String lname) {
		Driver.findElement(Lastname).sendKeys(lname);
		}
		
		public void Password(String passw) {
			Driver.findElement(Password).sendKeys(passw);
		}
		
		public void Day(int day) {
			WebElement Selectdays= Driver.findElement(Days);
			Select sinput= new Select(Selectdays);
			sinput.selectByIndex(day);
		}
		public void Months(int month) {
			WebElement Selectmonths= Driver.findElement(Months);
			Select sinput= new Select(Selectmonths);
			sinput.selectByIndex(month);
		}
		public void Years(String year) {
			WebElement Selectyears= Driver.findElement(Years);
			Select sinput= new Select(Selectyears);
			sinput.selectByValue(year);
		}
		public void Newsletterheck() { 
			Driver.findElement(NewsLetter).click();
			}
			
			public void Specialclick() {
				Driver.findElement(SpecialOffers).click();
			}
			
			public void Company(String company)  {
				Driver.findElement(Company).sendKeys(company);
			}
			
			public void Address(String address)  {
				Driver.findElement(Address).sendKeys(address);
			}
			
			public void City(String city)  {
				Driver.findElement(City).sendKeys(city);
			}
			
			public void State(String state) {
				WebElement Selectstate= Driver.findElement(State);
				Select sinput= new Select(Selectstate);
				sinput.selectByValue(state);
				}	
			
			public void ZipPostalCode(String zip) {
				Driver.findElement(ZipPostalCode).sendKeys(zip);
				}
			
			public void Country(String country) {
			WebElement Selectcountry= Driver.findElement(Country);
			Select sinput= new Select(Selectcountry);
			sinput.selectByValue(country);
			}
			
			public void AdditionalInformation(String additional) {
				Driver.findElement(AdditionalInformation).sendKeys(additional);
			}
			
			
			public void Homephone(String homephone) {
				Driver.findElement(Homephone).sendKeys(homephone);
			}
			
			public void Mobilephone(String mobilephone) {
				Driver.findElement(MobilePhone).sendKeys(mobilephone);
			}
			
			public void Assignanaddress(String assignaddress) {
				Driver.findElement(AssignAddress).clear();
				Driver.findElement(AssignAddress).sendKeys(assignaddress);
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
	
	
	

