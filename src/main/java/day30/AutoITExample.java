package day30;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITExample {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://altoconvertpdftojpg.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("browse")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Admin\\OneDrive\\Desktop\\JAT15WD\\AutoITScript\\firstScript.exe");
	}

}
