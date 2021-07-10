package ash.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waitss {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\devap\\\\Documents\\\\Driver Jars\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		Thread.sleep(5000);
		//implicit wait
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	
	

}
