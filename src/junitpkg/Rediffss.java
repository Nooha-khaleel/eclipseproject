package junitpkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Rediffss 
{
ChromeDriver cd;
@Before
public void setUp()
{
	cd=new ChromeDriver();
	cd.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
@Test
public void test() throws Exception
{
	File src=((TakesScreenshot)cd).getScreenshotAs(OutputType.FILE);
	//to save the file in desktop or other folder
	//FileHandler.copy(src, new File("C:\\Users\\91730\\Desktop\\java//rediff.png"));
	//to save the file in a folder in the project
	FileHandler.copy(src, new File("./Screenshot/rediff.png"));
	
	
	WebElement button=cd.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
	File fil=button.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(fil, new File("./Screenshot/buttonscreenshot.png"));
}
}
