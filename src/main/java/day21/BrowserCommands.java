package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch the browser
		WebDriver driver = new ChromeDriver();
		
		// Load the URL
		
		driver.get("https://www.google.com/");
		
		// to get the title of the page
		
		String title = driver.getTitle();
		
		System.out.println("Page Title: " +title);
		
		// to get the current url
		
		String url = driver.getCurrentUrl();
		
		System.out.println("Page URL: " +url);
		
		// to get the page source
		
		String pagesource = driver.getPageSource();
		
		System.out.println("Page source :" +pagesource.length());
		
		
	}

}
