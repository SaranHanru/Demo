package readJson;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dataDrivenTesting.ReadDataFromJson;

public class ReadDataFromJsonUtility {
	
	@Test
	public void loginUsingJson() throws IOException, ParseException {
	ReadDataFromJson jf=new ReadDataFromJson();
	String url=jf.readFromJsonFile("Url");
	String un = jf.readFromJsonFile("Username");
	String pwd = jf.readFromJsonFile("Pwd");
	String bwr = jf.readFromJsonFile("browser");
	
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
	driver.findElement(By.id("submitButton")).click();
	}
}
