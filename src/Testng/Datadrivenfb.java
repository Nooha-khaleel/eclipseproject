package Testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadrivenfb 
{
ChromeDriver cd;

@BeforeTest
public void setup()
{
	cd=new ChromeDriver();
	cd.get("https://www.facebook.com");
}

@Test
public void test() throws Exception
{
	FileInputStream ob=new FileInputStream("C:\\Users\\91730\\Desktop\\datadriven.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(ob);
	XSSFSheet sh=wb.getSheet("Sheet1");
	int row=sh.getLastRowNum();
	for(int i=1;i<=row;i++)
	{
		String username=sh.getRow(i).getCell(0).getStringCellValue();
		System.out.println("username="+username);
		String password=sh.getRow(i).getCell(1).getStringCellValue();
		System.out.println("password="+password);
		
		cd.findElement(By.id("email")).clear();
		cd.findElement(By.name("pass")).clear();
		
		cd.findElement(By.id("email")).sendKeys(username);
		cd.findElement(By.name("pass")).sendKeys(password);
		cd.findElement(By.name("login")).click();
	}
}
}
