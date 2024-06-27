package JAT17WD;

import java.io.IOException;
import java.time.Duration;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoItSample {

	public static Logger log = LogManager.getLogger(AutoItSample.class);
			
		public static void main(String[] args) throws IOException, InterruptedException {
		
		
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://altoconvertpdftojpg.com/");
		log.info("URL Launched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("browse")).click();
		log.info("button clicked");
		//Thread.sleep(3000);
		//Runtime.getRuntime().exec("C:\\Users\\Admin\\OneDrive\\Desktop\\JAT17WD\\AutoIT Script\\uploadfile.exe");
	}

}
