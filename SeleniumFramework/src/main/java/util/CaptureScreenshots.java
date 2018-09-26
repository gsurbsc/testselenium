package util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshots {
	
	public static void snapshots(WebDriver driver, String screenshotname)
	{
		try {
			TakesScreenshot ts = (TakesScreenshot)driver; 
			
			File scrfile = ts.getScreenshotAs(OutputType.FILE);
			
			Calendar cal = Calendar.getInstance();
			
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
			
			File file = new File(System.getProperty("user.dir")+"//screenshots//"+screenshotname+"_"+formatter.format(cal.getTime())+".jpg");
			
			FileHandler.copy(scrfile, file );
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
}