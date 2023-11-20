package junitpkg;
//using relative x path general syntax

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathprgm 
{
	ChromeDriver cd;
	@Before
	public void setUp()
	{
		cd=new ChromeDriver();
		cd.get("https://www.blazedemo.com/register");
	}
	@Test
	public void register()
	{
		cd.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("Nooha khaleel");
		cd.findElement(By.xpath("//input[@name=\"company\"]")).sendKeys("Infopark");
		cd.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("noohakhaleel@gmail.com");
		cd.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("nooha123");
		cd.findElement(By.xpath("//input[@name=\"password_confirmation\"]")).sendKeys("nooha123");
		cd.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	}

}
