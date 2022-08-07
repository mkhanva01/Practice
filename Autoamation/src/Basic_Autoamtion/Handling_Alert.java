package Basic_Autoamtion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handling_Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver Driver;
		System.setProperty("webdriver.gecko.driver", "D:\\Downloads\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		Driver = new FirefoxDriver();
		Driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		Driver.getTitle();
		System.out.println(Driver.getTitle());
		
		//Setting up the window Dimension using Selenium Native rule
		//Dimension Dm = new Dimension (550, 350);
		//Driver.manage().window().setSize(Dm);
		
		
		//Setting up the window Dimension using JavaScript
		JavascriptExecutor JS = (JavascriptExecutor) Driver;			//Using JavascriptExectuor
		JS.executeScript("window.resizeTo(1560,1260);");
		
		
		
		JavascriptExecutor name = (JavascriptExecutor) Driver;
		name.executeScript("document.getElementById('name').value='Shein'");
		
		
		
		Driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		
		WebDriverWait wait = new WebDriverWait (Driver, 5);
		wait.until(ExpectedConditions.alertIsPresent());
		
		Thread.sleep(3000);
		//Driver.switchTo().alert().accept();
		//Driver.switchTo().alert().dismiss();
		Driver.switchTo().alert().getText();
		
		System.out.println("Text from Alert		"+ Driver.switchTo().alert().getText());
		
		
		
	}

}
