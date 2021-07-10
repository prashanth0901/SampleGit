package ash.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionss {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\devap\\Documents\\Driver Jars\\chromedriver.exe ");
		
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(10000);
		
		driver.manage().window().maximize();
		 driver.get("http://demo.guru99.com/test/drag_drop.html");
		 
		 Thread.sleep(5000);
		 
		 WebElement SourceBank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		 
		 WebElement DesAccount = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		 
		 //objection declaration for action class
		 
		 Actions acc =new Actions(driver);
		 
         acc.dragAndDrop(SourceBank, DesAccount).perform();
		 Thread.sleep(5000);
		 
		 driver.quit();
		 
	

}
}
