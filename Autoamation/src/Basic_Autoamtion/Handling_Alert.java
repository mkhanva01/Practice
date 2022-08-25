package Basic_Autoamtion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		//Driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
		//Get: Doesn't maintain any history and cookies so no way to go forward, back, refresh.
		//Navigate: It keeps history and cookies which allows it to go forward, back, refresh
		
		
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
		
//		JavascriptExecutor scroll = (JavascriptExecutor) Driver;		Scroll Down
//		scroll.executeScript("window.scrollBy(-500, 0)");
		
		WebElement Mousehover= Driver.findElement(By.id("mousehover"));
		JavascriptExecutor scroll = (JavascriptExecutor) Driver;	 	//Scrolling in to a specific element
		scroll.executeScript("arguments[0].scrollIntoView();", Mousehover);
		
		
		
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
