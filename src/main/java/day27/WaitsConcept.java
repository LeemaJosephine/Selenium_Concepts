package day27;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.sukgu.Shadow;

public class WaitsConcept {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));  // page to load
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // implicit wait --> webelement to load
		
		// wait for alert
		
//		driver.findElement(By.id("alert")).click();
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		wait.until(ExpectedConditions.alertIsPresent());
//		
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		
		// textToBePresentInElement
		
//		driver.findElement(By.id("populate-text")).click();
//		
//		WebElement textToBeVisible = driver.findElement(By.className("target-text"));
//		
//		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait1.until(ExpectedConditions.textToBePresentInElement(textToBeVisible, "Selenium Webdriver"));
//		
//		System.out.println(textToBeVisible.getText());
		
//		driver.findElement(By.id("display-other-button")).click();
//		
//		WebElement enable = driver.findElement(By.id("hidden"));
//		
//		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait1.until(ExpectedConditions.visibilityOf(enable));
//		
//		System.out.println(enable.getText());
		
		driver.findElement(By.id("enable-button")).click();
		WebElement button = driver.findElement(By.id("disable"));
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(button));
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(200));
		
		wait.until(ExpectedConditions.elementToBeClickable(button));

		button.click();
		
		System.out.println(button.getText());
		
		// To take screemshot
		
		TakesScreenshot screenshot = ((TakesScreenshot) driver);
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\EclipseClass\\ExcelFileOperation\\snap\\Screenshot1.png");
		FileUtils.copyFile(source, dest);
		
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(10);
		shadow.findElementByXPath(" ");
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
