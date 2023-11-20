package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediffcopypaste 
{
ChromeDriver cd;

@BeforeTest
public void setup()
{
	cd=new ChromeDriver();
	cd.get("https://register.rediff.com/register/register.php?FormName=user_details");
}

@Test
public void test()
	{
		WebElement flname=cd.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		WebElement rediffid=cd.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		flname.sendKeys("nooha");
		Actions ac=new Actions(cd);
		ac.keyDown(flname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		ac.keyDown(flname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		ac.keyDown(rediffid,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		ac.perform();
	}
}

