package Testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadpgm
{
ChromeDriver driver;

@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}

@Test
public void test() throws Exception 
{
	driver.get("https://www.ilovepdf.com/word_to_pdf");
	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
	fileUpload("\"C:\\Users\\91730\\Desktop\\datadriven.xlsx\"");//give path
}

private void fileUpload(String string) throws Exception 
{
	StringSelection strselect=new StringSelection(string);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselect, null);
	
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	

	
	
	
	
}


}
