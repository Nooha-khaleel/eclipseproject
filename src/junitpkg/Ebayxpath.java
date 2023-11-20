package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebayxpath 
{
ChromeDriver cd;
@Before
public void setUp()
{
	cd=new ChromeDriver();
	cd.get("https://www.ebay.com");
}
@Test
public void search()
{
	cd.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Mobiles",Keys.ENTER);
	cd.findElement(By.xpath("//input[@id='gh-btn']")).click();
	cd.findElement(By.xpath("//*[@id='s0-53-17-6-3-4[0]-3-2-1-list']/li[2]/div/a")).click();
	cd.findElement(By.xpath("//*[@id='x-refine__group__0']/ul/li/ul/li[1]/a")).click();
}
}
