package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automationexercise
{
ChromeDriver cd;
@Before
public void setUp()
{
	 cd=new ChromeDriver();
	cd.get("https://automationexercise.com/login");
}
@Test
public void signup()
{
	cd.findElement(By.xpath("//input[@data-qa=\"signup-name\"]")).sendKeys("Nooha khaleel");
	cd.findElement(By.xpath("//input[@data-qa=\"signup-email\"]")).sendKeys("noohashhas@gmail.com");
	cd.findElement(By.xpath("//button[@data-qa=\"signup-button\"]")).click();
	cd.findElement(By.xpath("//input[@id='id_gender2']")).click();
	cd.findElement(By.xpath("//input[@data-qa=\"password\"]")).sendKeys("Lazin@160824");
	
	WebElement day=cd.findElement(By.xpath("//select[@id=\"days\"]"));
	Select daydetails=new Select(day);
	daydetails.selectByValue("8");
	WebElement month=cd.findElement(By.xpath("//select[@id=\"months\"]"));
	Select monthdetails=new Select(month);
	monthdetails.selectByValue("6");
	WebElement year=cd.findElement(By.xpath("//select[@id=\"years\"]"));
	Select yeardetails=new Select(year);
	yeardetails.selectByValue("2001");
	
    cd.findElement(By.xpath("//input[@name=\"optin\"]")).click();
	
	cd.findElement(By.xpath("//input[@data-qa=\"first_name\"]")).sendKeys("Nooha");
	cd.findElement(By.xpath("//input[@data-qa=\"last_name\"]")).sendKeys("Khaleel");
	cd.findElement(By.xpath("//input[@data-qa=\"company\"]")).sendKeys("Luminartechnolab");
	cd.findElement(By.xpath("//input[@data-qa=\"address\"]")).sendKeys("Rab raaz Neerchal");
	cd.findElement(By.xpath("//input[@data-qa=\"address2\"]")).sendKeys("Kannur city");
	
	WebElement country=cd.findElement(By.xpath("//select[@id=\"country\"]"));
	Select countrydetails=new Select(country);
	countrydetails.selectByValue("India");
	
	cd.findElement(By.xpath("//input[@id=\"state\"]")).sendKeys("Kerala");
	cd.findElement(By.xpath("//input[@id=\"city\"]")).sendKeys("Kannur");
	cd.findElement(By.xpath("//input[@id=\"zipcode\"]")).sendKeys("670003");
	cd.findElement(By.xpath("//input[@id=\"mobile_number\"]")).sendKeys("7306166336");
	cd.findElement(By.xpath("//button[@data-qa=\"create-account\"]")).click();
	
	
	
}
}
