package Testng;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterisatn 
{
	@Parameters("n")
	@Test
	public void test(String n)
	{
		System.out.println(n);
	}
}
