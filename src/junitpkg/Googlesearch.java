package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch 
{
   ChromeDriver cd;
   @Before
   public void setUp()
   {
	   cd=new ChromeDriver();
	   cd.get("https://www.google.com");
   }
   @Test
   public void search()
   {
	   cd.findElement( By.name("q")).sendKeys("cricket",Keys.ENTER);//locate search field and press enter
	 //  cd.findElement(By.name("btnK")).click();
   }
}
