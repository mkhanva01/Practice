package Basic_Autoamtion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver;
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");	


driver.findElement(By.xpath("//*[text()='Create new account']")).click();
Thread.sleep(3000);
driver.findElement(By.name("firstname")).sendKeys("Robert");
driver.findElement(By.name("lastename")).sendKeys("Stewart");
driver.findElement(By.name("reg_email__")).sendKeys("9918817741");
driver.findElement(By.id("password_step_input")).sendKeys("Pass@word1");




	}

}
