package ash.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver getdriver() {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\devap\\Documents\\Driver Jars\\chromedriver.exe ");
		
		return driver = new ChromeDriver();
				}
	
	//url launch
	
	public static void geturl(String url) {
		driver.get(url);	
	}
	
	//insert data
	
	public static void insertdata(WebElement element, String text) {
		element.sendKeys(text);
}
	
	
	//click
	
	public static void uclick(WebElement element) {
		element.click();
		
	}
	
	//quit
	public static void uquit() {
		driver.quit();
		
		
	}

}
