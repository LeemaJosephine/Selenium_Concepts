package day16;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// launch the browser
		WebDriver driver = new ChromeDriver();
		
		// load the url
		driver.get("https://demo.guru99.com/test/ajax.html");
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// maximize the browser.
		driver.manage().window().maximize();
		
		List<WebElement> ele =driver.findElements(By.name("name"));
		System.out.println("Size of the list: " +ele.size());
		
		for(int i =0;i<ele.size();i++) {
			
			System.out.println("Radio options available: " + ele.get(i).getAttribute("id"));
			
		}
		
		
		
		
	}

}
