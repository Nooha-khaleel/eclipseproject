package Testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Problem1
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	
	@Test
	public void test() throws Exception
	{
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobilephones",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		String firstWindow=driver.getWindowHandle();
		driver.getTitle().contains("Amazon.in:mobilephones");
		
		Set<String>allWindow=driver.getWindowHandles();
		for(String handle:allWindow)
		{
			if(!handle.equalsIgnoreCase(firstWindow))
			{
				driver.switchTo().window(handle);
				
			}	
	    } 
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		Thread.sleep(3000);//to stop execution for sometime
		driver.findElement(By.xpath("//*[@id='attach-view-cart-button-form']/span/span/input")).click();
	
	}
	
}
	
	
