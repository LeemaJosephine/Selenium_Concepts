package day25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> checkOptions = driver.findElements(By.xpath("//label[@class='custom-control-label']"));
		
		for(WebElement ele: checkOptions) {
			
			String attribute = ele.getText();
			
			System.out.println(attribute);
			if(attribute.equals("Sports")) {
				
				Actions mouse = new Actions(driver);
				mouse.moveToElement(ele).click().perform();
				
				Thread.sleep(4000);
				
				mouse.click(ele).perform();
				if(ele.isSelected()) {
					System.out.println("Sports selected");
				}
				
				else {
					System.out.println("Not selected");
				}
			}
		}
	}

}
