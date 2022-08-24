package Basic_Autoamtion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actions_Class {
	
	/*
	Java Access Modifier~~
	Public: Accessible from any classes or any packages
	Private: Accessible only from the same class
	Protected: Accessible from the classes under same package and sublcass
	Default: Accessible by the classes of the same package */

	WebDriver Driver;
	
	@BeforeTest
	public void Setup() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Driver.get("https://demoqa.com/droppable/");
		Driver.getTitle();
		System.out.println("Title of the Page:	" +Driver.getTitle());
	}
	
	@Test (priority=0, enabled=false)
	public void DragAndDrop() {
		
		WebElement From= Driver.findElement(By.cssSelector("div#draggable"));
		WebElement To= Driver.findElement(By.cssSelector("div#droppables"));
		
		Actions builder= new Actions (Driver);
		
		builder.clickAndHold(From).moveToElement(To).release(To).build().perform();
		
		String textTo= To.getText();
		if (textTo.equals("Dropped!")) {
			System.out.println("Passed: Element is dropped on target as expected");}
		else {
			System.out.println("Failed: Element couldn't be dropped to the target as expected");
		}
		}
	
	@Test(priority=1, dependsOnMethods= {"DragAndDrop"}, enabled=false)
	public void Keys() {
		Driver = new ChromeDriver();
		Driver.get("https://www.facebook.com/");
		WebElement Email= Driver.findElement(By.id("email"));
		
		
		Actions builder= new Actions (Driver);
		Action seriesofActions= builder
		.moveToElement(Email)
		.click()
		.keyDown(Email, Keys.SHIFT)
		.sendKeys(Email, "jondoe52")
		.keyUp(Email, Keys.SHIFT)
		.doubleClick()
		.build();
		
		seriesofActions.perform();
		}
		
	
	@Test
	public void UpperCase() {
		Driver = new ChromeDriver();
		Driver.get("https://www.facebook.com/");
		WebElement Email= Driver.findElement(By.id("email"));
		Email.sendKeys(Keys.chord(Keys.SHIFT, "eric johnson", Keys.CONTROL, "a"), Keys.DELETE);
		
		
	}
}

	
	

