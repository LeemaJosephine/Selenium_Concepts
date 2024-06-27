package day25;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chittograph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[1]")).click();
		
//		List<WebElement> security_name = driver.findElements(By.xpath("(//table)[2]//tr[1]//th"));
//		
//		for(WebElement names: security_name) {
//			
//			String name = names.getText();
//			System.out.println(name);
//		}
//		
		List<WebElement> row_count = driver.findElements(By.xpath("(//table)[2]//tr"));
		int row_cot = row_count.size();
		System.out.println("row count: " +row_cot);
		
		// Sort 
		Set<String> sort = new TreeSet<>();
		for(int i=1;i<=row_cot;i++) {
			try {
			String text = driver.findElement(By.xpath("(//table)[2]//tr["+i+"]//td[3]")).getText();
			sort.add(text);
			} catch(Exception e) {
				
				System.out.println("Exception occured");
			}
			
			
		}
		
		for(String txt : sort) {
			
			System.out.println(txt);
		}
		
		
		
	}

}
