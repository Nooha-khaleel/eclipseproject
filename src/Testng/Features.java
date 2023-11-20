package Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Features
{
@BeforeTest
public void setUp()
{
	System.out.println("launch browser");
}	
@BeforeMethod
public void urlloading()
{
	System.out.println("launch url");
}
//to set priority for test
@Test(priority=0)
public void test1()
{
	System.out.println("print test1");
}
@Test(priority=1)
public void test2()
{
	System.out.println("print test2");
}
//to skip a test
@Test(enabled=false)
public void test3()
{
	System.out.println("print test3");
}
//to run a test multiple times
@Test(invocationCount =2)
public void test4()
{
	System.out.println("print test4");
}
//when a test depends on another test
@Test
public void test5()
{
	System.out.println("print test5");
}
//here test 6 runs after test 5 because test 6 depends on test 5
@Test(dependsOnMethods= {"test5"})
public void test6()
{
	System.out.println("print test6");
}

@AfterMethod
public void after()
{
	System.out.println("print aftermethod");
}
@AfterTest
public void aftrtest()
{
	System.out.println("close browser");
}
}

