package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);  // By index
		
		WebElement ele = driver.findElement(By.id("draggable"));
		
		System.out.println("Location before drag " + ele.getLocation());
		
		Actions mouse = new Actions(driver);
		mouse.dragAndDropBy(ele, 50,50).perform();
	
		
		System.out.println("Location after drag " +ele.getLocation());
	}

}
