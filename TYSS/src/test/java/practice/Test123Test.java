package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Test123Test {
	
	@Test
	public void EbayTest()
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.ebay.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("reebok shoes");  // enter text
		
		driver.findElement(By.xpath("//input[@type='submit' and @value='Search']")).click();  // click on search button
		
		WebElement element=driver.findElement(By.xpath("//h3[text()='Reebok Zig Dynamica FY7054 Mens Black Synthetic Athletic Running Shoes']/../../div/div/span[@class='s-item__price']"));
		
		System.out.println(element.getText());
//		List<WebElement> allitem=driver.findElements(By.xpath("//div[@class='srp-river-results clearfix']"));
//		
//		int count=0;
//		
//		for(WebElement wb:allitem) {
//			
//			System.out.println(wb.getText());
//			count++;
//		}
//		System.out.println("Total no of item present is : "+ count);
		
	}
	
	

}
