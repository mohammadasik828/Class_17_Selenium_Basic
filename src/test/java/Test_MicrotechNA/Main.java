package Test_MicrotechNA;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	public static void main(String[] args) throws InterruptedException, IOException {
		// Add WebDriverManager - downlaod chromedriver exe file
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver = new ChromeDriver();
		// go to WebSite
		driver.get("https://it.microtechlimited.com");
		// 1.By.partialLinkText() >>Click Login Menue
		driver.findElement(By.partialLinkText("LOG IN")).click();
		Thread.sleep(2000);
		// 2.By.name() >>Send Email id
		driver.findElement(By.name("mailuid")).sendKeys("testpilot@gmail.com");
		Thread.sleep(2000);
		// 3.By.name() >>Send Password
		driver.findElement(By.name("pwd")).sendKeys("1234");
		//4. By.name()>> Click Submit button
		driver.findElement(By.name("login-submit")).click();
		String text = driver.findElement(By.cssSelector("#divimg > div > h2:nth-child(1)")).getText();
		System.out.println("Text is " + text);
	
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(f, new File("./Screenshot_Selenium/Screen.png"));
	 
		 
		Thread.sleep(2000);
		
		
		driver.close();
//    By.id()
//    By.name()
//    By.tagName()
//    By.className()
//    By.linkText()
//    By.partialLinkText()
//    By.xpath()
//    By.cssSelector()
	}
}