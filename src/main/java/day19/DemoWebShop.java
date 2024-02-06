package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoWebShop {

	public static void main(String[] args) {
		
		// Launch the browser
		
		WebDriver driver = new EdgeDriver();
		
		//pass the URL
		
		//driver.get("https://demowebshop.tricentis.com/");
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL:" + currentUrl);
		
		//maximize the window
		
		
		driver.manage().window().maximize();
		
		// click login
		
		driver.findElement(By.className("ico-login")).click();
		//driver.findElement(By.partialLinkText("Log")).click();
		
		// enter email 
		
		String expectedText ="leema03@gmail.com";
		driver.findElement(By.id("Email")).sendKeys(expectedText);
		
		
		// enter password
		
		driver.findElement(By.id("Password")).sendKeys("Leema.123");
		
		// Page title
		
		String Pagetitle = driver.getTitle();
		System.out.println("Title of the page before Login: " +Pagetitle);
		
		// click login button
		
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		
		// validate the login
		
		String actualText = driver.findElement(By.className("account")).getText();
		
		if(expectedText.equals(actualText)) {
			
			System.out.println("Logged in sucessful");
			
		} else {
			
			System.out.println("Logged in unsucessful");
		}
		
		           
		// browser navigation
		
		String actualTitle= driver.getTitle();
		
		System.out.println("Page title after login : " +actualTitle);  // DEmo Web Shop
		
		driver.navigate().back();
		
		String titleafterback = driver.getTitle();
		
		System.out.println("Page title after back: " +titleafterback);
		
		if(titleafterback.equals("Demo Web Shop. Login")) {
			
			System.out.println("Page navigated backward");
		}
		
		driver.navigate().refresh();
		
	
		
		
		
		
		
	}

}
