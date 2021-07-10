package ash.org;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\devap\\Documents\\Driver Jars\\chromedriver.exe ");
		
		
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
		
		Thread.sleep(5000);

		 driver.get("https://www.facebook.com/");
		 
		 int count = 0;
		 
		 //to find of all links on my webpage
		 
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 
		 int size = links.size();
		
		 System.out.println("total links on my webpage="+size);
		 
		 for (WebElement x : links) {
			 
			 String linkurl = x.getAttribute("href");
			 
			 URL u = new URL(linkurl);
			 
			 u.openConnection();
			 
			 //type cast
			 
			 HttpURLConnection h= (HttpURLConnection)u.openConnection();
			 
			 int responseCode = h.getResponseCode();
			 
			 if (responseCode!=200) {
				 
				 System.out.println(linkurl);
				 
				 count++;
				
			}
			 }
		 System.out.println("total no of broken links="+count);
		 
		 driver.quit();
		 	
		 
		
	}
	
	
	

}
