package Package_1;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Hello_World
{
	@Test
	public void test()
	{
		System.out.println("Hello Selenium world");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
		
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class Selenium");
	}
}