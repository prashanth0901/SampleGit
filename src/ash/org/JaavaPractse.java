package ash.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.ExecuteScript;

public class JaavaPractse extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver1 = BaseClass.getdriver();
		driver.manage().window().maximize();
		geturl("https://twitter.com/login");
		
		  WebElement username =driver.findElement(By.xpath("(//div[@dir='auto'])[1]")); 
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].setAttribute('value', '987654' )", username);
		  
		  
		 
		
		//insertdata(username, "Prash");
		
		Thread.sleep(5000);
		WebElement login = driver.findElement(By.xpath("(//div[@dir='auto'])[5]"));
		uclick(login);
		
		Thread.sleep(5000);

		uquit();
	}

}
