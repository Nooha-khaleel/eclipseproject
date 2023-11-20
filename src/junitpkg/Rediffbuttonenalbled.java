package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffbuttonenalbled 
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
	boolean check=cd.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).isEnabled();
	if (check)
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
}
}
