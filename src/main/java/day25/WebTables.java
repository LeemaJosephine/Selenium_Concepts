package day25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		
		
		// get the rows
		
		List<WebElement> rowCount = driver.findElements(By.xpath("(//table)[1]//tr"));
		System.out.println("No.of rows: " + rowCount.size());
		
		int row_size = rowCount.size();
		
		// column count
		
		List<WebElement> columnCount = driver.findElements(By.xpath("(//table)[1]//th"));
		System.out.println("No.of columns: " +columnCount.size());
		
		int col_size= columnCount.size();
		
		String text = driver.findElement(By.xpath("(((//table)[1]//tr)[2]//td)[1]")).getText();
		System.out.println(text);
		
		String percentage = driver.findElement(By.xpath("(//table)[1]//tr["+row_size+"]//td["+col_size+"]")).getText();
		System.out.println(percentage);
		
		
	}

}
