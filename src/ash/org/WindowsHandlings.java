package ash.org;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlings {

	public static void main(String[] args) throws InterruptedException {
		
         System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\devap\\\\Documents\\\\Driver Jars\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 
		 driver.get("http://demo.guru99.com/popup.php");
		 Thread.sleep(5000);
		
		 WebElement clickhere = driver.findElement(By.xpath("//a[@target='_blank']"));
		 clickhere.click();
		 
		 String pwindw = driver.getWindowHandle();
		 
		 System.out.println("parent window ID="+pwindw);
		 
		 Set<String> allwindws = driver.getWindowHandles();
		 
		 System.out.println(allwindws);
		 
		for (String x : allwindws) {
			if (!pwindw.equals(x)) {
				driver.switchTo().window(x);
				
			}
		}
		
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		
		submit.click();
		
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		
		
		driver.quit();
	}

}
