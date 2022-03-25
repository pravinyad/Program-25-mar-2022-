package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Test124Test {
	
	
	@Test
	public void Search_allTestv()
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("virat");
		
		List<WebElement> allitem=driver.findElements(By.xpath("(//div[@class='OBMEnb'])/ul/li"));
		int count=0;
		for(WebElement wb:allitem)
		{
			System.out.println(wb.getText());
			count++;
		}
		System.out.println(count);
		
		
	}

}
