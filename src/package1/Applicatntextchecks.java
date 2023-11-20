package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Applicatntextchecks 
{
//checks a text is present in an application or not 
	//eg.checks gmail is present in google page
	
	public static void main(String[] args)
	{
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.google.com");
        String str=cd.getPageSource();
        if(str.contains("Gmail"))
        {
        	System.out.println("present");
        	
        }
        else
        {
        	System.out.println("not present");
        }
        		
	}

}
