package Basic_Autoamtion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic_Auth {
	
	public static void main(String[] args) {
	WebDriver Driver;
	System.setProperty("webdriver.gecko.driver", "D:\\Downloads\\geckodriver-v0.31.0-win32\\geckodriver.exe");
	Driver = new FirefoxDriver();
	Driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}
	
}

	
	

