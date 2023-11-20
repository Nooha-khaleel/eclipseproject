package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin 
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
	cd.findElement(By.id("email")).sendKeys("nooha@gmail.com");//to locate and send values to email field
	cd.findElement(By.name("pass")).sendKeys("abc123");//to locate and send values to password field
	cd.findElement(By.name("login")).click();
}
@After
public void tearDown()
{
	cd.quit();
}
}
