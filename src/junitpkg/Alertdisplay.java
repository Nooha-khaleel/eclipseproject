package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdisplay 
{
	ChromeDriver cd;
@Before
public void setUp()
{
		cd=new ChromeDriver();
		cd.get("file:///C:/Users/91730/Desktop/java/alert.html");
	
}
@Test
public void display()
{
	cd.findElement(By.xpath("//input[@type='button']")).click();
	Alert a=cd.switchTo().alert();
	String alerttext=a.getText();
	System.out.println(alerttext);
	a.accept();
	
	cd.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Nooha");
	cd.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Khaleel");
	//cd.findElement(By.xpath("//input[@type='submit']")).click();
	
}
}
