package ash.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\devap\\Documents\\Driver Jars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(5000);
		 driver.manage().window().maximize();
		 
		 driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		 
		 Thread.sleep(5000);
		 
		 List<WebElement> rows = driver.findElements(By.tagName("tr"));
		 int sizerows = rows.size();
		 
		 System.out.println("total rows"+sizerows);
		 
		 for (int i = 0; i <rows.size(); i++) {
			 WebElement tr = rows.get(i);
			 
			 //iterating data from table
			 
			 List<WebElement> data = driver.findElements(By.tagName("td"));
			 
			 for (int j = 0; j < data.size(); j++) {
				 WebElement td = data.get(j);
				 String text = td.getText();
				 
				 System.out.println(text);
				 
				
			}
			 
			
		}
		 
		 driver.quit();
	}

}
