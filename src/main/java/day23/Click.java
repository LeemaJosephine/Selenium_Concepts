package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			driver.manage().window().maximize();
			
			WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
			WebElement doublClic = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
			
			Actions mouse = new Actions(driver);
			
			// mouse.contextClick(rightClick).perform();  // right click;
			
			mouse.doubleClick(doublClic).perform();
			
			
	}

}
