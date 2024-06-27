package day25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size = links.size();
		System.out.println("No.of links present in the page :" +size);
		
		for(WebElement link : links) {
			
			String text = link.getText();
			String href = link.getAttribute("href");
			System.out.println(href+ "->" +text);
			
		}
	}

}
