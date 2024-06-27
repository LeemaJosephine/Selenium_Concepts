package day25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SpiceJet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String expectedDay="09";
		String expectedMonth ="May 2024";
		
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//div[text()='Departure Date']")).click();
		
		
		while(true) {
			
			String actualMonth = driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'])[1]")).getText();
			if(expectedMonth.equals(actualMonth)) {
				break;
			} else {
				
				driver.findElement(By.xpath("//div[contains(@class,'css-1dbjc4n r-1loqt21 r-u8s1d r-11xbo3g r-1v2oles r-1otgn73')] ")).click();
				
			}
	
		}
		driver.findElement(By.xpath("(//div[text()='"+expectedDay+"'])[1]")).click();
		
		
	}

}
