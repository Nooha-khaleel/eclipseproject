package junitpkg;

import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

//using relative x path parent to child method
public class Reddiffmail 
{
	ChromeDriver cd;

@Before
public void setUp()
{
	cd=new ChromeDriver();
	cd.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
@Test
public void test()
{
	//to verify logo
	boolean logo=cd.findElement(By.xpath("//img[@title=\"Rediff.com\"]")). isDisplayed();
	if(logo)
	{
		System.out.println("logo is present");
	}
	else
	{
		System.out.println("logo is not present");
	}
}
}

	

	
		
	
    


//@Test
//public void register()
//{
	// cd.findElement(By.xpath("//\"[@id='tblcrtac']/tbody/tr[3]/td[3]/input[1]")).sendKeys("nooha
	// khaleel");
//}
//}
