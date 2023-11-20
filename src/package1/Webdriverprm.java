package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverprm
{

	public static void main(String[] args)
	{
        
		//chromedriver
		//edgedriver
		//firefoxdriver
		
		//to load google
		ChromeDriver cd=new ChromeDriver();//to launch chromebrowser
		cd.get("https://www.google.com");//to launch application or url
		//check title 
		String actualtitle=cd.getTitle();//to get title for an application
		String expectedtitle="google";
		if( actualtitle.equalsIgnoreCase(expectedtitle))
        {
       	System.out.println("pass");
        }
		else
		{
			System.out.println("fail");
		}
			
	}

}
