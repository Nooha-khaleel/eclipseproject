package junitpkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplelink 
{
	ChromeDriver cd;
	@Before
	public void setUp()
	{
	    cd=new ChromeDriver();
		cd.get("https://automationexercise.com/login");
		
	}
	@Test
	public void test()
	{
		List <WebElement>li=cd.findElements(By.tagName("a"));
		for(WebElement link:li)
		{
			String linkdetails= link.getAttribute("href");
		    verifylink(linkdetails);
		}
	}
	
	private void verifylink(String link)
	{
		try
		{
			URL u=new URL(link);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("response code is 200"+link);
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("response code is 404"+link);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
	 
	
		
	
}
