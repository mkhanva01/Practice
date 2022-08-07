package Test_Model;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_Object_Model.Sign_In_page;
import Page_Object_Model.Sign_up_page;

public class Page_Model_Signup_Test {

	WebDriver Driver;
	
	Sign_In_page X;
	Sign_up_page Y;
	
	@BeforeTest
	public void Setup() {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	Driver = new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Driver.get("http://automationpractice.com/index.php");
	X= new Sign_In_page(Driver);
	Y= new Sign_up_page(Driver);
}
	@Test ()
	public void OpenloginPage() throws InterruptedException {
		String MainPageitle = X.MainPageitle();
		Assert.assertTrue(MainPageitle.contains("My Store"));
		System.out.println(MainPageitle);
		X.OpenLoginPage();
		Thread.sleep(3000);
	}
	
	
	@Test (priority=0)
	public void SignUppage() {
		Y.Signuppage("ryanfirm123@yahoo.com", "Ryan", "Firm", "RF123", 2, 2, "1982", "MPJ Tech", "1122 woodlawn", "chester", "3", "11458", "21", "Nothing additional", "3571234567", "2578945612", "221B Baker St, London");
		}
	
	@AfterTest()
	public void FinalMethod() throws InterruptedException {
		
		File SS= ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(SS, new File("C:\\ESD\\AutomationPracticeFrom.mp3"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Driver.findElement(By.id("submitAccount")).click();
		Thread.sleep(2000);

		Driver.quit();

	}
	
	
	
	
}