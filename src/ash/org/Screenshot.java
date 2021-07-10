package ash.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {


	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\devap\\Documents\\Driver Jars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.get("https://www.jiomart.com/");
		
		Utils.CaptureScreenshot(driver, "imag.png");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='menu_section']")).click();
		
		Utils.CaptureScreenshot(driver, "imag1.png");
		
		
		driver.quit();
	}

}
