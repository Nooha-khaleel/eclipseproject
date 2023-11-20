package Testng;
//to send values using xml file named testngfb
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebooklogin 
{
	ChromeDriver cd;
   @BeforeTest
   public void setup()
   {
	    cd=new ChromeDriver();
	   
   }

   @BeforeMethod
   public void url()
   {
	  // ChromeDriver cd=new ChromeDriver();
	   cd.get("https://www.facebook.com/");
   }
   @Parameters({"u","p"})
   @Test
   public void test(String u,String p)
   {
	   cd.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(u);
	   cd.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(p);
	   cd.findElement(By.xpath("//*[@id=\"u_0_5_Ho\"]")).click();
	   
   }
}

