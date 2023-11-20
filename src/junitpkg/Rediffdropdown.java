package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffdropdown 
{
ChromeDriver cd;

@Before
public void setUp()
{
	cd=new ChromeDriver();
	cd.get("https://register.rediff.com/register/register.php?FormName=user_details");
	
}
@Test
public void dropdowntest()
{
	WebElement day=cd.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
	Select daydetails=new Select(day);
	daydetails.selectByValue("08");
	WebElement month=cd.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
	Select monthdetails=new Select(month);
	monthdetails.selectByVisibleText("JUN");
	WebElement year=cd.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
	Select yeardetails=new Select(year);
	yeardetails.selectByValue("2001");
	
	

	List<WebElement> li = daydetails.getOptions();
	System.out.println("total count of day="+li.size());
	List<WebElement>ls=monthdetails.getOptions();
	System.out.println("total count of month="+ls.size());
	List<WebElement>lt=yeardetails.getOptions();
	System.out.println("year count="+lt.size());
	
}

}