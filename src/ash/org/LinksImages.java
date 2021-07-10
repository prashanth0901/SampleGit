package ash.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksImages {

	public static void main(String[] args) throws InterruptedException {
		
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\devap\\Documents\\Driver Jars\\chromedriver.exe ");
		
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(10000);
		
		driver.manage().window().maximize();
		 driver.get("https://www.myvi.in/");
		 
		 Thread.sleep(5000);
		 
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 int linkscount = links.size();
		 System.out.println("total links present="+linkscount);
		 
		 for (WebElement x : links) {
			 
			 String linkvalue = x.getAttribute("href");
			 
			 System.out.println(linkvalue);
			
		}
		 
		 
		 List<WebElement> images = driver.findElements(By.tagName("img"));
		 int imagescount = images.size();
		 
		 System.out.println("total images present="+imagescount);
		 
           for (WebElement x : images) {
        	   
        	   String imagesvalue = x.getAttribute("src");
        	   System.out.println(imagesvalue);
			
		}
		 
		 driver.quit();
		 
		 
		 
		 
		 
		 
		 
	}

	}
