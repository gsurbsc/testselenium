package keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import configproperties.Constant;
import excelread.ExcelRead;
import util.CaptureScreenshots;

public class Keywords {
	
	public static WebDriver driver;
	
	public static void openBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static void navigateUrl()
	{
		driver.get(Constant.Url);
		driver.manage().window().maximize();
	}
	
	public static void inputUsername() throws Exception
	{
		driver.findElement(By.name("txtUserLoginID")).sendKeys(ExcelRead.getCellData(3, 3));
	}
	
	public static void inputPassword() throws Exception
	{
		driver.findElement(By.name("txtPassword")).sendKeys(ExcelRead.getCellData(4, 3));
	}
	
	public static void inputConfirmPassword() throws Exception
	{
		driver.findElement(By.name("txtConfirmPassword")).sendKeys(ExcelRead.getCellData(5, 3));
	}
	
	public static void selectSecQuestion()
	{
		Select sel = new Select(driver.findElement(By.name("txtSecretQuestion")));
		sel.selectByIndex(7);
	}
	
	public static void inputSecAnswer() throws Exception 
	{
		driver.findElement(By.name("txtSecretAnswer")).sendKeys(ExcelRead.getCellData(7, 3));
		CaptureScreenshots.snapshots(driver, "Tnstc2");
	}

}
