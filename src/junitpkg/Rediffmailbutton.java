package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffmailbutton
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
 String button=cd.findElement(By.xpath("//input[@id='Register']")).getAttribute("value");
 System.out.println(button);
	if(button.equals("Create my account >>"))
    {
        System.out.println("Pass");
        
    }
    else
    {
       System.out.println("Failed");
        
    } 
}
}