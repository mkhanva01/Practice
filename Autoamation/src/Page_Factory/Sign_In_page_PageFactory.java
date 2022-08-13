package Page_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_In_page_PageFactory {
	
	WebDriver Driver;
	
	@FindBy(tagName="title")
	WebElement title;
	
	@FindBy (className="login")
	WebElement Login;
	
	
	public Sign_In_page_PageFactory(WebDriver Driver) {			//Integrating WebDriver with the class method
		this.Driver=Driver;										//Instantiating Constructor with this keyword
		PageFactory.initElements(Driver, this);
	}		
	
	public String MainPageitle() {								//Method created
		return Driver.getTitle();
	}
	
	public void Login() {
		Login.click();
	}
	
	public String LoginpageTitle() {
		return Driver.getTitle();					//Defining data type as return
	}
	
	
	public void OpenLoginPage() {										//Created a method with all the available method being invoked inside 
		this.MainPageitle();
		System.out.println("What is the MainPageTitle?	"+ Driver.getTitle());
		this.Login();
		this.LoginpageTitle();
		System.out.println("What is the LoginPageTitle?	"+ Driver.getTitle());
//		this.VerifyingSignupForm();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
