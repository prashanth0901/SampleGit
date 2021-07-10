package ash.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXPath {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\devap\\Documents\\Driver Jars\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		Thread.sleep(5000);
		
		WebElement username = driver.findElement(By.xpath("//input[@class='_2hvTZ pexuQ zyHYP']"));
			
		username.sendKeys("prashanth");
		
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		

		
	}

}
