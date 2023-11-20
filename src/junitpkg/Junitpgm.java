package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitpgm 
{
  ChromeDriver cd;
  @Before
  public void setUp()
  {
	  cd=new ChromeDriver();
	  cd.get("https://www.google.com");
  }
  @Test
  public void test1()
  {
	  String actualtitle=cd.getTitle();
	  System.out.println(actualtitle);
	  
  }
 @Test
 public void test2()
 {
	 String str=cd.getPageSource() ;
	 if(str.contains("english"))
	 {
		 System.out.println("pass");
	 }
	 else
	 {
		 System.out.println("fail");
	 }
 }
 @After
 public void tearDown()
 {
	 cd.quit();
 }
 
 
  
}
