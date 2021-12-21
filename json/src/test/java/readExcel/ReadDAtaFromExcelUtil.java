package readExcel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dataDrivenTesting.ExcelUtility;

public class ReadDAtaFromExcelUtil {
	
	@Test
	public void readDataFromExcel() throws IOException {
		ExcelUtility eutil=new ExcelUtility();
		String Url = eutil.readDataFromExcel("Sheet1", 1, 0);
		String un = eutil.readDataFromExcel("Sheet1", 1, 1);
		String pwd = eutil.readDataFromExcel("Sheet1", 1, 2);
		//System.out.println(Url);
		//System.out.println(un);
		//System.out.println(pwd);
		WebDriver driver=new ChromeDriver();
		driver.get(Url);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
		driver.findElement(By.id("submitButton")).click();			
	}

}
