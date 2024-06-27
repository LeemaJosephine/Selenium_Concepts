package day25;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Scanner sc = new Scanner(System.in);
		String expMonth  = "May";
		int expDate=8;
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//div[text()='Departure Date']")).click();
		
		// (//div[text()='March '])[1]
		
		while(true) {
			
			// capture the month for validation
			String actualMonth = driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79']")).getText(); //FEb 2024
				
		if(expMonth.contains(actualMonth)) {  
			
			break;
		}
		else {
			
			// next arrow click
			driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1loqt21 r-u8s1d r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd r-eafdt9 r-1i6wzkk r-lrvibr r-184en5c']")).click();
			}
		}
		
		driver.findElement(By.xpath("(//div[text()='"+expDate+"'])[1]")).click();
		
		
	}

}
