package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram
{

	public static void main(String[] args)
	{
       ChromeDriver cd=new ChromeDriver();
       cd.get("https://www.instagram.com");
       String str=cd.getPageSource();
       
       if(str.contains("Sign up"))
       {
    	   System.out.println("pass");
       }
       else
       {
    	   System.out.println("fail");
       }
	}

}
