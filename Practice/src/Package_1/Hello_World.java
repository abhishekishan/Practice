package Package_1;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Hello_World
{
	@Test
	public void test()
	{
		System.out.println("Hello Selenium");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
}