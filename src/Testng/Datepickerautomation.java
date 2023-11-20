package Testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepickerautomation 
{
WebDriver wd;

@BeforeTest
public void setup()
{
	wd=new ChromeDriver();
	wd.get("https://www.trivago.com/");
}

@Test
public void test()
{
	wd.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div/fieldset/button[1]/span/span[2]/span[2]")).click();
	datepicker("January 2024","1");
datepicker("March 2024","1");//chechout can be given 
}

private void datepicker(String expectedmnth, String expecteddate) 
{
	while(true)
	{
		String month=wd.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3")).getText();
		if(month.equals(expectedmnth))
		{
			System.out.println("month="+month);
			break;
		}
		else
		{
			wd.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]/span")).click();
			
		}
	}
	List<WebElement>alldates=wd.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
	for(WebElement datedetails:alldates)
	{
		String date=datedetails.getText();
		System.out.println("date1");
		if(date.equals(expecteddate))
		{
			System.out.println("date="+date);
			datedetails.click();
			break;
			
		}
	}
}
}
