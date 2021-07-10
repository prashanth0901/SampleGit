package ash.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertss {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\devap\\\\Documents\\\\Driver Jars\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(5000);
		 driver.manage().window().maximize();
		 
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 
		 WebElement signin = driver.findElement(By.xpath("//input[@type='submit']"));
		 
		 signin.click();
		 
		 Thread.sleep(5000);
		 
		 //handling the alerts
		 
		 Alert A = driver.switchTo().alert();
		 
		 String text = A.getText();
		 System.out.println(text);
		 A.accept();
		 
		 Thread.sleep(5000);

		
		 driver.quit();
	}

}
