package ash.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesConcept {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\devap\\Documents\\Driver Jars\\chromedriver.exe ");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		 driver.get("http://demo.guru99.com/test/guru99home/");
		 
		 Thread.sleep(5000);
		 
		 List<WebElement> frames = driver.findElements(By.tagName("iframe"));

			System.out.println("total no of frames on my web page ="+frames.size());
			
			//switch to frame
			WebElement tube = driver.findElement(By.xpath("//iframe[@wmode='transparent']"));
			driver.switchTo().frame(tube);
			
			WebElement ytclick = driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']"));
			
			ytclick.click();
			
			Thread.sleep(5000);
			
			driver.switchTo().defaultContent();
	}

}
