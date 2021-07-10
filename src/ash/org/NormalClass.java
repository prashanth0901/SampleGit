package ash.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\devap\\Documents\\Driver Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(10000);
		driver.manage().window().maximize();
		driver.get("https://twitter.com/i/flow/signup");
		Thread.sleep(10000);
		WebElement username = driver.findElement(By.name("name"));
		username.sendKeys("Prash");
		Thread.sleep(10000);
		driver.quit();
	}
	}
