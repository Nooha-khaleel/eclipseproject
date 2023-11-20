package Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Grouping 
{
@BeforeTest
public void beforetest()
{
	System.out.println("print beforetest");
}
@BeforeMethod
public void beforemethod()
{
	System.out.println("print beforemethod");
}
@Test(groups= {"smoke","sanity"})
public void test1()
{
	System.out.println("test1");
}
@Test(groups= {"regression","sanity"})
public void test2()
{
	System.out.println("test2");
}
@Test(groups= {"smoke"})
public void test3()
{
	System.out.println("test3");
}
@Test(groups= {"sanity"})
public void test4()
{
	System.out.println("test4");
}
@AfterMethod
public void aftermethod()
{
	System.out.println("print aftermethod");
}
@AfterTest
public void aftertest()
{
	System.out.println("print aftertest");
}

}
