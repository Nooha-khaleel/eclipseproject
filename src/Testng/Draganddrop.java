package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop
{
ChromeDriver cd;

@BeforeTest
public void setup()
{
	cd=new ChromeDriver();
	cd.get("https://demo.guru99.com/test/drag_drop.html");
	cd.manage().window().maximize();
	
}

@Test
public void test()
{
	JavascriptExecutor js = (JavascriptExecutor) cd;
	js.executeScript("window.scrollBy(0,250)", "");
	WebElement rupees=cd.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement amount=cd.findElement(By.xpath("//*[@id=\"shoppingCart4\"]/h3"));
	
	WebElement bank=cd.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	WebElement sales=cd.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
	WebElement rupees2=cd.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement acnt=cd.findElement(By.xpath("//*[@id=\"shoppingCart1\"]/h3"));
	
	WebElement acnt2=cd.findElement(By.xpath("//*[@id=\"shoppingCart3\"]/h3"));
	WebElement amount2=cd.findElement(By.xpath("//*[@id=\"shoppingCart4\"]/h3"));
	
	
	
	Actions ac=new Actions(cd);
	ac.dragAndDrop(rupees,amount);
	
	ac.dragAndDrop(bank,acnt);
	
	ac.dragAndDrop(sales, acnt2);
	ac.dragAndDrop(rupees2, amount2);
	ac.perform();

	}
}
