package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectModel {
		
		public static WebElement element;
		
		public static WebElement txt_UserName(WebDriver driver)
		{
			element = driver.findElement(By.xpath("html/body/form/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input"));
			
			return element;
		}
		public static WebElement txt_Password(WebDriver driver)
		{
			element = driver.findElement(By.xpath("html/body/form/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input"));
			
			return element;
		}
		public static WebElement txt_ConfirmPassword(WebDriver driver)
		{
			element = driver.findElement(By.xpath("html/body/form/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[6]/td[4]/input"));
			
			return element;
			
		}
		public static WebElement dd_SecretQuestion(WebDriver driver)
		{
			element = driver.findElement(By.xpath("html/body/form/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[8]/td[2]/select"));
			
			return element;
			
		}
		public static WebElement txt_Answer(WebDriver driver)
		{
			element = driver.findElement(By.xpath("html/body/form/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[8]/td[4]/input"));
			
			return element;
			
		}

	}


