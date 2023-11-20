package Testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Handlemultipletabs 
{
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}

@Test
public void test()
{
	driver.get("https://demo.guru99.com/popup.php");
	String firstWindow=driver.getWindowHandle();
	System.out.println("First Window Title"+driver.getTitle());
	driver.findElement(By.xpath("/html/body/p/a")).click();
	
	Set<String>allWindow=driver.getWindowHandles();
	for(String handle:allWindow)
	{
		if(!handle.equalsIgnoreCase(firstWindow))
		{
			driver.switchTo().window(handle);
			
		    driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abcde");//this can be given r no given
			driver.close();//to close currently opened tab
		}
		driver.switchTo().window(firstWindow);
	}
	
}
}
