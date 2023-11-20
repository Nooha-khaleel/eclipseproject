package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Justdialpopups 
{
  WebDriver driver;
  @BeforeTest
  public void setup()
  {
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("--disable-notifications");
	  driver=new ChromeDriver(co);
	  driver.manage().window().maximize();
  }
  
  @Test
  public void test()
  {
	  driver.get("https://www.justdial.com");
  }
}
