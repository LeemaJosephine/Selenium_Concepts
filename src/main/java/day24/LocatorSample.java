package day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorSample {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Mobile");
		
		driver.findElement(By.tagName("input")).sendKeys("mobile");
		
		//GrandParent to Grandchild 
		//driver.findElement(By.xpath("(//input[@id='nav-search-submit-button']/preceding::input)[5]")).sendKeys("mobile");
		//String text = driver.findElement(By.id("twotabsearchtextbox")).getAttribute("color");
//		driver.findElement(By.xpath("(//input[@id='twotabsearchtextbox']/following::input)[1]")).click();
//		
		//String text = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/preceding-sibling::label")).getAttribute("for");
		//System.out.println(text);
		
		
		
		
		
		// driver.findElement(By.id("name")).sendKeys("Leena");  // by id
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("Leema"); // by xpath 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
