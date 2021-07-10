package ash.org;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {
	public static void main(String[] args) throws InterruptedException, IOException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\devap\\Documents\\Driver Jars\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://www.jio.com/");
		
		Thread.sleep(5000);
		
		//WebElement myjio = driver.findElement(By.xpath("(//img[@class='img-fluid card-img-top'])[1]"));

		WebElement input = driver.findElement(By.xpath("//input[@type='number']"));

       Thread.sleep(5000);
		//typecasting
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		//j.executeScript("arguments[0].scrollIntoView(true)", myjio);
		


		Thread.sleep(5000);

		j.executeScript("arguments[0].setAttribute('value', '9876543210')", input);
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
