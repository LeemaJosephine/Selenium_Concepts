package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		// load the url
		
		driver.get("https://www.google.com/");
		
		// to maximize the browser
		
		driver.manage().window().maximize();
		
		//locate the element 
		
		//String title = driver.getTitle();
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Selenium browser driver");
		Thread.sleep(3000);
		element.clear();
		String tag=element.getTagName();
		System.out.println("Tag name: " +tag);
		String attrivalue = element.getAttribute("id");
		System.out.println("Sttribute value " + attrivalue);
		String css =element.getCssValue("background-color");
		System.out.println("Bg colour: " +css);
		System.out.println("Location: " + element.getLocation());
		
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
		
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
		
		
		
		WebElement ele = driver.findElement(By.xpath("//a[@aria-label=\"Gmail (opens a new tab)\"]"));
		System.out.println(ele.getText());
		
		
		
		
	}

}
