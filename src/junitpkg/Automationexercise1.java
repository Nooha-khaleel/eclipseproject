package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationexercise1 
{
	ChromeDriver cd;
	
	@Before
	public void setUp()
	{
		cd=new ChromeDriver();
		cd.get("https://www.automationexercise.com/");
		cd.manage().window().maximize();
				
		
	}
	
	@Test
	public void test()
	{
		cd.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
		cd.findElement(By.xpath("//*[@id=\"accordian\"]/div[1]/div[1]/h4/a")).click();
		//to scrolldown
				JavascriptExecutor js = (JavascriptExecutor) cd;
				js.executeScript("window.scrollBy(0,250)", "");
		cd.findElement(By.xpath("//*[@id=\"Women\"]/div/ul/li[1]/a")).click();
		
		cd.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[2]/div/div[2]/ul/li/a/i")).click();
		//cd.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
		//cd.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button")).click();
		cd.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Nooha khaleel");
		cd.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("noohashihas@gmail.com");
		cd.findElement(By.xpath("//*[@id=\"review\"]")).sendKeys("Very nice ");
		cd.findElement(By.xpath("//*[@id=\"button-review\"]")).click();
	}

}
