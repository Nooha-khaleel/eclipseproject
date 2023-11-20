package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbxpath 
{
ChromeDriver cd;
@Before
public void setUp()
{
	cd=new ChromeDriver();
	cd.get("https://www.facebook.com");
}
@Test
public void login()
{
	cd.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("pqr@gmail.com");
}


}
