package Basic_Autoamtion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver Driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.get("https://www.google.com/");
		
	}

}
