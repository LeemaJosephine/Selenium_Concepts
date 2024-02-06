package day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch the browser
		
		WebDriver driver = new ChromeDriver();
		
		// Load the URL
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//WebElement ele = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		
		WebElement contactUs = driver.findElement(By.xpath("//a[text()=' Contact Us ']"));
		
		Actions mouse = new Actions(driver);
		//mouse.moveToElement(ele).perform();
		
		//mouse.moveToElement(contactUs).perform();
		//contactUs.click();
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();",contactUs);
	}

}
