package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public static void main(String[] args) {
		
		// Launch the Chrome browser and load the google Url then search for something
		
		// Set up the driver and launch the browser
		// 4.6.0 below
		
		// WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// load the url
		
		driver.get("https://www.google.com/");
		
		// to maximize the browser
		
		driver.manage().window().maximize();
		
		//locate the element 
		
		driver.findElement(By.name("q")).sendKeys("Selenium browser driver",Keys.ENTER);
		
		// to close the browser
		
		driver.close();
		
		
		
	}

}
