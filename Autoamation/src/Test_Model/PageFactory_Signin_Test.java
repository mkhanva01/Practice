package Test_Model;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_Factory.Sign_In_page_PageFactory;
import Page_Object_Model.Sign_In_page;

public class PageFactory_Signin_Test {

	WebDriver Driver;
	Sign_In_page_PageFactory Y;
	
			
	@BeforeTest
	public void Setup() {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	Driver = new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Driver.get("http://automationpractice.com/index.php");
	Y= new Sign_In_page_PageFactory(Driver);
}
	@Test
	public void OpenSignInPage() {
		Y.OpenLoginPage();
		

	}
}
