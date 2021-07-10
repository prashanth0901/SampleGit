package ash.org;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\devap\\Documents\\Driver Jars\\chromedriver.exe ");
			
			
			WebDriver driver = new ChromeDriver();
			
			Thread.sleep(10000);
			
			driver.manage().window().maximize();	
			
			//launching URL
			driver.get("http://ironspider.ca/forms/dropdowns.htm");
			WebElement ILIKEMYCOFFEE = driver.findElement(By.xpath("//select[@name='coffee']"));
			Select s = new Select(ILIKEMYCOFFEE);
			// s.selectByIndex(0);
			// s.selectByValue("cream");
			// s.selectByVisibleText("test value from DOM");
			
			java.util.List<WebElement> options = s.getOptions();
		
			for (int i = 0; i <drpdwnlist.size() ; i++) {
				WebElement element = drpdwnlist.get(i);
				String name = element.getText();
				System.out.println(name);
	}
	}

	}
