package Basic_Autoamtion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Swag_Lbas {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver Driver;
		System.setProperty("webdriver.chromer.driver", "chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.saucedemo.com");
		Driver.getTitle();
		System.out.println(Driver.getTitle());
		
		//Driver.findElement(By.id("user-name")).click();						//click() is a method to click on any element
		Driver.findElement(By.id("user-name")).sendKeys("standard_user"); 		//SendKeys() is a method to type in a textbox
		
		Driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		Driver.findElement(By.id("login-button")).click();
		
		
		Driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		//Driver.findElement(By.partialLinkText("Fleece Jacket")).click();
		//Driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		
		
		WebElement sort_dropdown= Driver.findElement(By.className("product_sort_container"));
		
		sort_dropdown.click();
		Thread.sleep(3000);
		Select dropdown= new Select(sort_dropdown);
		dropdown.selectByValue("lohi");
	
		
		Driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		Driver.findElement(By.className("shopping_cart_link")).click();
		Driver.findElement(By.id("checkout")).click();
		
		
		Driver.findElement(By.name("firstName")).sendKeys("Robert");
		Driver.findElement(By.name("lastName")).sendKeys("Stewart");
		Driver.findElement(By.id("postal-code")).sendKeys("12345");
		Driver.findElement(By.id("continue")).click();
		
		Driver.findElement(By.id("finish")).isEnabled();
		System.out.println("Is Finish button enabled?"+		Driver.findElement(By.id("finish")).isEnabled());
		Driver.findElement(By.id("finish")).click();
		
		
		Thread.sleep(3000);
		Driver.close();
		
	}

}
