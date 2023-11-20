package Testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Bookingdatepicker
{
	WebDriver wd;

	@BeforeTest
	public void setup()
	{
		wd=new ChromeDriver();
		wd.get("https://www.booking.com/index.en-gb.html?aid=2311236;label=en-in-booking-desktop-kEw5QkiIqgsRHeKSBikkSwS652796016141:pl:ta:p1:p2:ac:ap:neg:fi:tikwd-334108049:lp9040212:li:dec:dm;ws=&gad_source=1&gclid=Cj0KCQjwqP2pBhDMARIsAJQ0Czpz7DvJOLdTSxEbu6VrRYoFxWsZOplvu9oMRyHirtk2QkDMF0UPSrwaAkBqEALw_wcB");
		wd.navigate().refresh();
	}
	@Test
	public void test()
	{
		wd.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div/button[1]/span")).click();
		datepicker("November 2023","1");
	datepicker("January 2024","11");
	}
	private void datepicker(String expectedmonth, String expecteddate)
	{
		while(true)
		{
			String month=wd.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[2]/h3")).getText();
			if(month.equals(expectedmonth))
			{
				break;
			}
			else
			{
				wd.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button/span/span/svg/path"));
				
			}
		}
		List<WebElement>alldates=wd.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[2]/table/tbody/tr/td/span"));
		for(WebElement dateelement:alldates)
		{
			String date=dateelement.getText();
			if(date.equals(expecteddate))
			{
				dateelement.click();
				break;
			}
		}
	}
}
