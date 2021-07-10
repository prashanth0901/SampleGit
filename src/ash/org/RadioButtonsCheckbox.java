package ash.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsCheckbox {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\devap\\Documents\\Driver Jars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
		
		Thread.sleep(5000);
		
		//radio buttons
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
		
		for (int i = 1; i < radio.size(); i++) {
			js.executeScript("arguments[0].click()", radio.get(i));
			
			Thread.sleep(10000);
			
		}
	
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}

}
