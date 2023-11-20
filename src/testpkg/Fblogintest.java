package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fbcreatepage;
import pagepkg.Fbloginpage;

public class Fblogintest 
{
WebDriver driver;

@BeforeTest
public void setup() 
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
@Test
public void test() throws Exception 
{
	Fbloginpage lp=new Fbloginpage(driver);
	lp.setValues("pqr@gmail.com", "pqr123");
	lp.login();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(3000);
	
}

@Test
public void test2() 
{
	Fbcreatepage cp=new Fbcreatepage(driver);
	cp.createpage();
	cp.getstarted();
	
}


}
