package ash.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utils {
	
	public static void CaptureScreenshot (WebDriver driver, String filename) throws IOException {
		
        TakesScreenshot sc = (TakesScreenshot) driver;
		
		File source = sc.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\devap\\Desktop\\"+filename+"");
		
		FileUtils.copyFile(source, destination);

	}

}
