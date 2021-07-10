package ash.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingFirst {
	
	public static void main(String[] args) throws InterruptedException {
		
		//to set the properties for the drivers
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\devap\\Documents\\Driver Jars\\chromedriver.exe");
		
		//initialize webDriver
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(10000);
		
		//to maximize the window
		
		driver.manage().window().maximize();
		
		//Launching url
		
		driver.get("https://twitter.com/i/flow/signup");
		
		Thread.sleep(10000);
		
		WebElement username = driver.findElement(By.name("name"));
		username.sendKeys("Prash");
		
		Thread.sleep(10000);

		//killing the driver
		
		driver.quit();
		
		
	}
}
