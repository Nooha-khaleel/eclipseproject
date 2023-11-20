package junitpkg;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responsecodepgm 
{
  String link="https://register.rediff.com/register/register.php?FormName=user_details";
  ChromeDriver cd;
  @Before
  public void setUp()
  {
	  cd=new ChromeDriver();
	  cd.get(link);
  }
  @Test
  public void test() throws Exception
  {
	  //to enable network connection
	 URL url=new URL(link);
	 HttpURLConnection con=(HttpURLConnection)url.openConnection();
	 con.connect();
	 System.out.println(con.getResponseCode());
	 
	 //to verify the responsecode is 200 or not
	 if(con.getResponseCode()==200)
	 {
		 System.out.println("valid----------"+link);
	 }
	 else
	 {
		 System.out.println("invalid-------"+link);
	 }
	  
  }
  		
}
