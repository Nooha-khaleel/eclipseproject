package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage 
{
WebDriver driver;

//creating repository
By fbemail=By.id("email");
By fbpassword=By.id("pass");
By login=By.name("login");


public Fbloginpage(WebDriver driver)
{
	this.driver=driver;
}

public void setValues(String email,String password)
{
	driver.findElement(fbemail).sendKeys(email);
	driver.findElement(fbpassword).sendKeys(password);
}

public void login()
{
	driver.findElement(login).click();
}
}
