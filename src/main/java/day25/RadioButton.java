package day25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> radioOptions = driver.findElements(By.tagName("input"));
		
		for(WebElement ele : radioOptions) {
			
			String attribute = ele.getAttribute("id");
			
			if(attribute.equals("name")) {
				
				ele.sendKeys("Leema");
				
				Actions mouse = new Actions(driver);
				mouse.click(ele).perform();
				
				if(ele.isSelected()) {
					
					System.out.println("Impressive button is selected");
				} else {
					
					System.out.println("Impressive not selected");
				}
			}
			
		}
	}

}
