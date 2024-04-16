package Test_MicrotechNA;

import java.io.IOException;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Selenium {
	public static void main(String[] args) throws Exception {
	        //Specify the path to your chrome driver
	        System.setProperty("webdriver.chrome.driver", "C:\\Java\\driver\\chromedriver.exe");
	        // Instantiate chrome driver object
	        
	        WebDriver driver = new ChromeDriver();
	        // Navigate to the testim website
	        driver.get("https://it.microtechlimited.com");
	        
	        //Use TakesScreenshot method to capture screenshot
	        TakesScreenshot screenshot = (TakesScreenshot)driver;
	        
	        //Saving the screenshot in desired location
	        File source = screenshot.getScreenshotAs(OutputType.FILE);
	        
	        //Path to the location to save screenshot
	        FileUtils.copyFile(source, new File("./Screenshot_Selenium/Screen.png"));
	        System.out.println("Screenshot is captured");
	        driver.quit();
	    }
}
