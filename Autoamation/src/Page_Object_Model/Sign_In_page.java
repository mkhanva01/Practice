package Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Sign_In_page {

	WebDriver Driver;
	
	By PageTitle= By.tagName("title");
	By Login= By.className("login");
	By CreateaccountForm= By.cssSelector("#create-account_form");
			
	public Sign_In_page(WebDriver Driver) {			//Integrating WebDriver with the class method
		this.Driver=Driver;							//Instantiating Constructor with this keyword
	}	
	
	
	public String MainPageitle() {					//Method created
		return Driver.getTitle();
	}
	
	public void Login() {
		Driver.findElement(Login).click();
	}
	
	public String LoginpageTitle() {
		return Driver.getTitle();					//Defining data type as return
	}
	
	public void VerifyingSignupForm() {
		String actualForm= Driver.findElement(CreateaccountForm).getAttribute("id");
		String expectedForm= "create-account_form";
		Assert.assertEquals(actualForm, expectedForm);					//Boolean assertion as checkpoint
		System.out.println("What is the form id?	"+ actualForm);
	}
	
	
	public void OpenLoginPage() {										//Created a method with all the available method being invoked inside 
		this.MainPageitle();
		System.out.println("What is the MainPageTitle?	"+ Driver.getTitle());
		this.Login();
		this.LoginpageTitle();
		System.out.println("What is the LoginPageTitle?	"+ Driver.getTitle());
		this.VerifyingSignupForm();
	}
	
	
	
	
}
